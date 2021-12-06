grammar antlr;

start  :
     expression  EOF
  ;

expression
   :
   |   ifBlock
   |   INT expression
   |   expression (PLUS | MINUS) expression
   |
   |
   ;
ifBlock
    : IF expression_block (ELSE IF expression_block) * (ELSE statement_block)?
    ;
expression_block
    : expression COL statement_block
    ;
statement_block
    : OPEN expression_block CLOSE
    | expression
    ;


SPACE : ' ';
EQUAL  : '=';
PLUS   :  '+';
MINUS  :  '-';
COL    : ':';
NOT    : '!';
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



