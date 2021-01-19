grammar Ex31;

file:	line line* EOF;

line:	field (SEP field)* '\r'? '\n';

field:	TEXT | STRING | ;

SEP: ',';

STRING: [\t]* '"' .*? '"' [\t]*;

TEXT: ~[,"\r\n]~[,\r\n]*;

WS: [ \t\r\n]+ -> skip;
COMMENT: '//'.*? '\n' -> skip;
