grammar antlr;

start
    : block  EOF
    ;

block
    : assignment block*
    | ifBlock    block*
    ;

expression
   :
   |   var op=(PLUS | MINUS) var
   |   var
   ;

var
    : INT
    | STRING
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
    : VARNAME EQUAL expression
    | VARNAME SPACE EQUAL expression
    | VARNAME SPACE EQUAL SPACE expression
    | VARNAME  EQUAL SPACE expression

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


//other string example
//STRING : ('a' .. 'z' | 'A' .. 'Z' | '\u0100' .. '\u017E')+ ;
WS     : [\r\n]+ -> skip ;
IF     : 'if';
ELSE   : 'else';
ELIF   :  'elif';
OPEN   : '(';
CLOSE  : ')';
VARNAME: [a-zA-Z_] [a-zA-Z_0-9]*;
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

