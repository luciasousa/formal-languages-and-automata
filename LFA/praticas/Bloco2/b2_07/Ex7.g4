grammar Ex7;
program: stat* EOF;
stat: expr? NEWLINE
    | assignment NEWLINE ;
assignment : ID '=' expr ;

expr:
    unaryOp=('+'|'-') expr #ExprUnary
    | e1=expr op=('*'|'/'|'%') e2=expr #ExprMultDivMod
    | e1=expr op=('+'|'-') e2=expr #ExprAddSub
    | Integer #ExprInteger
    | '(' expr ')' #ExprParent
    | ID #ExprID;

ID: [_a-zA-Z]+;
Integer: [0-9]+;
NEWLINE: '\r'? '\n' ;
WS: [ \t]+ -> skip ;
COMMENT: '#'.*? '\n' -> skip;
