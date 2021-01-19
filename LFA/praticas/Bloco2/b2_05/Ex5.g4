grammar Ex5;

program: 
		stat* EOF
		;

stat:	
		expr? NEWLINE			#StatExpr
		|assignment? NEWLINE 	#StatAssign
		;

assignment: ID '=' expr;
		
expr:	op=('+'|'-') expr					#ExprUnary
		|expr op=('*'|'/'|'%') expr			#ExprMultDivMod
		|expr op=('+'|'-') expr				#ExprAddSub	
		|Int								#ExprNum
		|'(' expr ')'						#ExprParent
		|ID 								#ExprVariable
		;
		
ID:	[a-zA-Z]+;
Int: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t\r\n-]+ -> skip;	
