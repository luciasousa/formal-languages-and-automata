grammar MyGrammar;

main: stat* EOF;

stat:  print
     | assignment
     ;

print: 'print'':' expr;
assignment: expr '->' ID;

expr:   <assoc=right> expr ('^') expr       #ExprPow
      | expr op=('*'|':') expr              #ExprMultDiv
      | expr op=('+'|'-') expr              #ExprAddSub
      | 'reduce' expr                       #ExprRed
      | NUM'/'NUM                           #ExprFrac
      | ID                                  #ExprID
      | NUM                                 #ExprNum
      ;

//Fraction: NUM'/'NUM;
ID: [a-z]+;
NUM: [0-9]+;
WS: [ \t\r\n]+ -> skip;
Comment: '//'.*? '\n' -> skip;
ERROR: .;
