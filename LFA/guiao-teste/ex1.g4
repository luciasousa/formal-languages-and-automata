grammar ex1;

main: program*EOF;

program:  print				#StatPrint
		| assignment		#StatAssig
		;
		
print: 'print' expr;			
assignment: ID ':' expr;

expr:  'input' '('expr ')'	    		#ExprInput
	 | expr '+' expr					#ExprConcat
	 | '(' expr '/' expr '/' expr ')'	#ExprSubst
	 | String							#ExprString
	 | ID								#ExprID
	 ;							

ID: [a-zA-Z][a-zA-Z0-9]*;
String: '"'.*?'"';
WS: [ \t\r\n]+ -> skip;  
Comment: '//'.*?'\n' -> skip;
Error: .;