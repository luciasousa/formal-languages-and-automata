grammar Ex8;

main: stat* EOF;

stat: (print | assignment) ';';

assignment: expr '->' ID;

print: 'print' expr;

expr: 	op2 expr 								#ExprUnary
		| expr op1 expr			 				#ExprPrecedence1
		| expr op2 expr 						#ExprPrecedence2
		| 'read' '"' prompt=.* '"' 				#ExprAssignment
		| ID 									#ExprID
		| Number 								#FracNumber
		| '(' expr ')' 							#ExprParenthesis
		| 'reduce' expr 						#ExprReduce
		| '('? Number '/' Number ')'? 			#FracDenNum;


op1: '*' | ':' | '^';
op2: '+' | '-';
ID: [a-zA-Z_]+;
Number: [-]?[0-9]+;
WS: [ \t\r\n]+ -> skip;
COMMENT: '//'.*? '\n' -> skip;
