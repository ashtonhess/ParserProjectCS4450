grammar antlr;

start
    : block  EOF
    ;

block
    : expression
    ;

expression
   :
   |   ifBlock
   |   INT
   |   STRING
   |   expression (PLUS | MINUS) expression
   |
   |
   ;
ifBlock
    : IF expression_block (ELIF expression_block) * (ELSE COL statement_block)?
    ;
expression_block
    : SPACE expression COL statement_block
    | OPEN expression CLOSE COL statement_block
    ;
statement_block
    :
    | TAB expression statement_block
    | TAB expression block
    ;
assignment
    :VARIABLE EQUAL expression
    ;
TAB : '    ';
SPACE : ' ';
EQUAL  : '=';
PLUS   :  '+';
MINUS  :  '-';
COL    : ':';
NOT    : '!';
INT    :  '0'..'9'+;
STRING : '"' (~["\r\n] | '""')* '"';
VARIABLE: [a-zA-Z_] [a-zA-Z_0-9]*;
//other string example
//('a' .. 'z' | 'A' .. 'Z' | '\u0100' .. '\u017E')+ ;
WS     : [\r\n]+ -> skip ;
IF     : 'if'+;
ELSE   : 'else';
ELIF   :  'elif';
OPEN   : '(';
CLOSE  : ')';
COMMENT: '#' ~[\r\n]* -> skip;

//conditional statements
LESSTHAN: '<';
//less than eq, just combine <=
GREATERTHAN: '>';
//greater than eq, just combine <=
//eq eq, combine two =
//not eq, combine ! and =
LESSTHANEQUALTO: '<=';
GREATERTHANEQUALTO: '>=';

