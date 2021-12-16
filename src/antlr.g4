grammar antlr;

start
    : block  EOF
    ;

block
    : assignment block*
    | ifBlock block*
    | print block*
    | whileBlock block*
    | forBlock block*
    | expression block*
    ;

mathExpr
    :   conditon=(PLUS | MINUS | MULT | DIVIDE | PLUSEQUAL | MINUSEQUAL | MULTEQUAl | DIVIDEEQUAL | MOD) var
    |   ezSpace conditon=(PLUS | MINUS | MULT | DIVIDE | PLUSEQUAL | MINUSEQUAL | MULTEQUAl | DIVIDEEQUAL | MOD) var
    |   conditon=(PLUS | MINUS | MULT | DIVIDE | PLUSEQUAL | MINUSEQUAL | MULTEQUAl | DIVIDEEQUAL | MOD) ezSpace var
    |   ezSpace conditon=(PLUS | MINUS | MULT | DIVIDE | PLUSEQUAL | MINUSEQUAL | MULTEQUAl | DIVIDEEQUAL | MOD) ezSpace var
    |   mathExpr mathExpr
    ;

plusExpr
    : ezSpace PLUS ezSpace
    | ezSpace PLUS
    | PLUS ezSpace
    | PLUS
    ;


conditionExpression
    :    conditionExpression conditionExpression
    |    ezSpace condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) ezSpace var
    |    condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) ezSpace var
    |    ezSpace condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL)  var
    |    condition=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO | EQUALEQUAL) var
    ;





expression
   :   var mathExpr
   |   var mathExpr conditionExpression
   |   var conditionExpression mathExpr
   |   var conditon=(LESSTHAN | LESSTHANEQUALTO | GREATERTHAN | GREATERTHANEQUALTO) var
   |   var
   |   expression ezSpace AND ezSpace expression
   //
   //WITH SPACES
   //
   //
   | var conditionExpression
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
    : INT
    | MINUS INT
    | STRING
    | VARNAME
    | intCast
    | strCast
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
    : IF ezSpace expression_block * (ezTab ELIF expression_block) * (ezTab ELSE COL statement_block)?
    | IF expression_block * (ezTab ELIF expression_block) * (ezTab ELSE COL statement_block)?
    | IF expression_block * (ELIF expression_block) * (ELSE COL statement_block)?
    ;
expression_block
    : ezSpace expression COL statement_block
    | OPEN expression CLOSE COL statement_block
    ;
statement_block
    : ezTab expression statement_block
    | ezTab ifBlock statement_block
    | ezTab assignment statement_block
    | ezTab whileBlock statement_block
    | ezTab print statement_block
    | ezTab forBlock statement_block
    | ezTab BREAK statement_block
    | block*
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

forBlock
    : FOR ezSpace var ezSpace IN ezSpace RANGE rangeStatement COL statement_block
    ;
rangeStatement
    : OPEN ezSpace var ezSpace CLOSE
    | OPEN var ezSpace CLOSE
    | OPEN ezSpace var CLOSE
    | OPEN var CLOSE
    | OPEN var COMMA rangeExp CLOSE
    | OPEN ezSpace var COMMA rangeExp CLOSE
    ;
rangeExp
    : ezSpace var
    | var
    | ezSpace var mathExpr
    ;

intCast
    : INTCAST OPEN var CLOSE
    | INTCAST OPEN ezSpace var ezSpace CLOSE
    | INTCAST OPEN ezSpace var  CLOSE
    | INTCAST OPEN var ezSpace CLOSE
    | INTCAST OPEN var mathExpr CLOSE
    | INTCAST OPEN ezSpace var mathExpr ezSpace CLOSE
    | INTCAST OPEN ezSpace var mathExpr  CLOSE
    | INTCAST OPEN var mathExpr ezSpace CLOSE
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

INTCAST: 'int';
COMMA: ',';
RANGE: 'range';
STR : 'str';
WHILE : 'while';
FOR : 'for';
IN : 'in';
PRINT : 'print';
SPACE : ' ';
TAB : '    ';
BREAK : 'break';

MINUSEQUAL: '-=';
PLUSEQUAL: '+=';
MULTEQUAl: '*=';
DIVIDEEQUAL: '/=';

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
MOD : '%';


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




