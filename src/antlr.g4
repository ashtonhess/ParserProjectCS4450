grammar antlr;

start  :
     expression  EOF
  ;

expression
   :
   |   INT
   |   STRING
   |   expression (PLUS | MINUS) expression
   ;
ifBlock
    :
    |
    ;
elseBlock
    :
    |
    ;

PLUS   :  '+';
MINUS  :  '-';
INT    :  '0'..'9'+;
STRING : ('a' .. 'z' | 'A' .. 'Z' | '\u0100' .. '\u017E')+ ;
WS     : [ \t\r\n]+ -> skip ;
IF     : 'if';
ELSE   : 'else';
OPEN   : '(';
CLOSE  : ')';



