grammar antlr;

start  :
     expression  EOF
  ;

expression
   :
   |   IF expression
   |   INT SPACE expression
   |   STRING SPACE equal
   |   //WS expression
   |   expression (PLUS | MINUS) expression
   |
   |
   ;
ifBlock
    :
    | SPACE OPEN expression CLOSE
    | OPEN CLOSE
    ;
elseBlock
    :
    |
    ;
equal
    :
    | Equal expression
    ;


SPACE : ' ';
EQUAL  : '=';
PLUS   :  '+';
MINUS  :  '-';
INT    :  '0'..'9'+;
STRING : '"' (~["\r\n] | '""')* '"';
//other string example
//('a' .. 'z' | 'A' .. 'Z' | '\u0100' .. '\u017E')+ ;
WS     : [ \t\r\n]+ -> skip ;
IF     : 'if'+;
ELSE   : 'else';
OPEN   : '(';
CLOSE  : ')';
COMMENT: '#' ~[\r\n]* -> skip;



