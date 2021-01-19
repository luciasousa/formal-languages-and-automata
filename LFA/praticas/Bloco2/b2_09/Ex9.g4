grammar Ex9;

program: question* EOF;

question: ID ('.' ID)* '(' Text ')' '{' options+ '}' ;

options: Text ':' Points ';' ;

ID: [a-zA-Z]+[0-9]*;
Text: '"' (~'"' | '\\"')*  '"' ;
Points: [0-9]+;

WS: [ \t\r\n]+ -> skip;
COMMENT: '//'.*? '\n' -> skip;
