grammar Ex10d;

main:   stat* EOF;

stat:   atrib | conjunto;

atrib:  variavel=UpperCase '=' conjunto;

conjunto:   exp1=conjunto '+' exp2=conjunto         #uniao
            |exp1=conjunto '&' exp2=conjunto        #intercepcao
            |exp1=conjunto '\\' exp2=conjunto       #diferenca
            |'(' conjunto ')'                       #parenteses
            |grupo                                  #unicoGrupo
            |variavel = UpperCase                   #variable
            ;

grupo:      '{' sequencia '}';
sequencia:  letra                                   #seqLetras
            |num                                    #seqInt
            ;
UpperCase:  [A-Z]+;
LowerCase:  [a-z]+;
Integer:    [-]?[+]?[0-9]+;
num:        number=Integer                          #IntSingleElem
            |num ',' number=Integer                 #IntSeveralElem
            ;
letra:      letter=LowerCase                        #LetraSingleElem
            |letra ',' letter = LowerCase           #LetraSeveralElem
            ;

IGNORE:     [ \n\t\r]+ -> skip;
COMMENT:    '--' .*? '\n' -> skip;
