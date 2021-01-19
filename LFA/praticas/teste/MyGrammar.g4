grammar MyGrammar;

main: program* EOF;

program:  print
        | assignment;

print: 'print' expr;
assignment: ID ':' expr;

expr:   'input''('expr')'           #ExprInput
      | expr '+' expr               #ExprConcatenate
      | '('expr'/'expr'/'expr')'    #ExprReplace
      | String                      #ExprString
      | ID                          #ExprID
      ;

String: '"'.*?'"';
ID: [a-zA-Z0-9]+;
Comment: '//'.*?'\n' -> skip;
WS: [ \t\r\n] -> skip;
Error: .;