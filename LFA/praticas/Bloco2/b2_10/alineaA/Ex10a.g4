grammar Ex10a;
@header{
    import java.util.*;
}
@members{
    HashMap<String, Set<String>> vars = new HashMap<>();
    Set<String> list;
}
program:    stat* EOF;

stat:       a=assignment{
                System.out.println($a.s);
            }
            |expr{
                System.out.println($expr.s);
            };

assignment  returns[Set s]: ID '=' expr{
                vars.put($ID.getText(),$expr.s);
                _localctx.s = $expr.s;
            };

expr        returns [Set s]: set{
                _localctx.s = $set.s;
            }
            |ID{
                _localctx.s = vars.get($ID.getText());
            }
            |e1=expr '+' e2=expr{
                Set<String> s1 = $e1.s;
                Set<String> s2 = $e2.s;
                s1.addAll(s2);
                _localctx.s = s1;
            }
            |e1=expr '\\' e2=expr{
                Set<String> s1 = $e1.s;
                Set<String> s2 = $e2.s;
                s1.removeAll(s2);
                _localctx.s = s1;
            }
            |e1=expr '&' e2=expr{
                Set<String> s1 = $e1.s;
                Set<String> s2 = $e2.s;
                s1.retainAll(s2);
                _localctx.s = s1;
            }
            |'(' expr ')'{
                _localctx.s = $expr.s;
            };

set         returns[Set s]: '{' item (',' item)* '}'{
                list = new HashSet();
                Set<String> set = new HashSet();
                for (String s : $item.s) {
                set.add(s);
                }
                _localctx.s = set;
            };

item        returns[Set<String> s] @init{}: i=(Word|Number){
                if(list == null){
                    list = new HashSet();
                }
                list.add($i.text);
                _localctx.s = list;
            };
ID: [A-Z]+;
Word: [a-z]+;
Number: [+-]?[0-9]+;
COMMENT: '--' .*? '\n' -> skip;
WS: [ \t\n\r]+ -> skip;