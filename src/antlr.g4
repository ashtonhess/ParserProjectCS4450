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
   |
   //
   |   var op=(PLUS | MINUS | MULT | DIVIDE) var
   |   var
   |   var conditon=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO) var
   //
   //WITH SPACES
   |   VARNAME SPACE condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) SPACE VARNAME
   |   var SPACE condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) SPACE VARNAME
   |   VARNAME SPACE condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) SPACE var
   //WITHOUT SPACES
   |   VARNAME condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) VARNAME
   |   var condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) VARNAME
   |   VARNAME condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) var
   //
   |   var condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) var
   |   var SPACE condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) SPACE var
   //
   //
   //
   | expression SPACE OR SPACE expression
   | expression OR expression
   | expression SPACE AND SPACE expression
   | expression AND expression
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
    | ezTab expression statement_block
    | ezTab expression block
    | ezTab block
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
    : WHILE SPACE expression COL statement_block
    | WHILE expression_block
    ;

ezTab
    :  TAB
    |  ezTab ezTab
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
GREATERTHAN: '>';
LESSTHANEQUALTO: '<=';
GREATERTHANEQUALTO: '>=';
EQUALEQUAL: '==';

OR: ' or ';
AND: ' and ';

