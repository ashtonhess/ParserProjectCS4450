grammar antlr;

start
    : block  EOF
    ;

block
    : assignment block*
    | ifBlock    block*
    | print block*
    | whileBlock block*
    ;

mathExpr
    :   var conditon=(PLUS | MINUS | MULT | DIVIDE) var
    |   var ezSpace conditon=(PLUS | MINUS | MULT | DIVIDE) var
    |   var conditon=(PLUS | MINUS | MULT | DIVIDE) ezSpace var
    |   var ezSpace conditon=(PLUS | MINUS | MULT | DIVIDE) ezSpace var
    ;

plusExpr
    : ezSpace PLUS ezSpace
    | ezSpace PLUS
    | PLUS ezSpace
    | PLUS
    ;





expression
   :   mathExpr
   |   var conditon=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO) var
   |   var
   |   expression ezSpace AND ezSpace expression
   //
   //WITH SPACES
   |   var ezSpace condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) ezSpace var
   |   var condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) ezSpace var
   |   var ezSpace condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL)  var
   //WITHOUT SPACES
   |   var condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) var
   //
   //
   //
   //
   // or expressions
   | expression ezSpace OR ezSpace expression
   | expression  OR ezSpace expression
   | expression ezSpace OR expression
   | expression OR expression
   // and expressions
   | expression ezSpace AND ezSpace expression
   | expression AND ezSpace expression
   | expression ezSpace AND expression
   | expression AND expression
   ;

var
    :
    | INT
    | STRING
    | VARNAME
    ;

print
    : PRINT OPEN printExpr CLOSE
    | PRINT OPEN ezSpace printExpr CLOSE
    | PRINT OPEN printExpr ezSpace CLOSE
    | PRINT OPEN ezSpace printExpr ezSpace CLOSE
    ;

printExpr
    : var plusExpr printExpr
    | strCast plusExpr printExpr
    | strCast
    | var
    ;
ifBlock
    : IF expression_block * (ELIF expression_block) * (ELSE COL statement_block)?
    ;
expression_block
    : ezSpace expression COL statement_block
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
    | VARNAME ezSpace EQUAL expression
    | VARNAME ezSpace EQUAL ezSpace expression
    | VARNAME  EQUAL ezSpace expression
    ;

strCast
    : STR OPEN var CLOSE
    | STR OPEN ezSpace var ezSpace CLOSE
    | STR OPEN ezSpace var  CLOSE
    | STR OPEN var ezSpace CLOSE
    ;

//condition_block
//    :
//    | SPACE expression LESSTHAN expression
//    ;

whileBlock
    : WHILE ezSpace expression COL statement_block
    | WHILE expression_block
    ;


//NOTE: ezTab
//NOT SURE IF THIS SHOULD BE USED. MIGHT BREAK RULES OF PYTHON TABS.
//CHECK -AH
ezTab
    :  TAB
    |  ezTab ezTab
    ;
ezSpace
    : SPACE
    | TAB
    | ezSpace ezSpace
    ;


STR : 'str';
WHILE : 'while';
FOR : 'for';
PRINT : 'print';
SPACE : ' ';
TAB : '    ';

EQUALEQUAL: '==';
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
OR: 'or';
AND: 'and';
VARNAME: [a-zA-Z_] [a-zA-Z_0-9]*;
COMMENT: '#' ~[\r\n]* -> skip;



//conditional statements
LESSTHAN: '<';
GREATERTHAN: '>';
LESSTHANEQUALTO: '<=';
GREATERTHANEQUALTO: '>=';




