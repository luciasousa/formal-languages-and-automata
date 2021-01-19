grammar Ex4;

program : 
	line* EOF ;

line:
	Num '-' Word '\n';

Num: [0-9]+ ;
Word: [a-zA-Z]+ ;
WS: [ \t\r\n-]+ -> skip;
