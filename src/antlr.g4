grammar antlr;

start
    : block  EOF
    ;

block
    : assignment block*
    | ifBlock    block*
    | whileBlock block*
    ;

expression
   :
   |  //NEXT: ADD SUPPORT FOR and, or -AHess
   //
   |   var op=(PLUS | MINUS | MULT | DIVIDE) var
   |   var
   |   var conditon=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO) var
   //
   //WITH SPACES
   |   VARNAME SPACE condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO) SPACE VARNAME
   |   var SPACE condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO) SPACE VARNAME
   |   VARNAME SPACE condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO) SPACE var
   //WITHOUT SPACES
   |   VARNAME condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO) VARNAME
   |   var condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO) VARNAME
   |   VARNAME condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO) var
   ;

var
    :
    | INT
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

//condition_block
//    :
//    | SPACE expression LESSTHAN expression
//    ;

whileBlock
    : WHILE SPACE expression
    ;

WHILE : 'while';

TAB : '    ';
SPACE : ' ';
EQUAL  : '=';
PLUS   :  '+';
MINUS  :  '-';
MULT    : '*';
DIVIDE  : '/';
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

