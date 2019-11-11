grammar SR;

declaration         : constDecl | varDecl;
constDecl           : CONST IDENTIFIER ((DOS_PUNTOS type_ (OP_ASIG expression)?) | OP_ASIG expression); //just one identifier
varDecl             : VAR varSpec;
varSpec             : identifierList (slice? DOS_PUNTOS type_ (OP_ASIG expression)? | OP_ASIG expression (COMA varSpec)*);
type_               : typeName | typeLit | PAR_IZQ type_ PAR_DER;
typeName            : IDENTIFIER | qualifiedIdent;  //second not necessary
typeLit             : arrayType | sliceType; //| functionType;
arrayType           : LLAV_IZQ arrayLength LLAV_DER;
arrayLength         : expression;
sliceType           : LLAV_IZQ LLAV_DER type_;
identifierList      : IDENTIFIER (COMA IDENTIFIER)*;
expression          : primaryExpr
                    | expr_rel
                    //| unaryExpr
                    | expression (OP_MULT ) expression
                    //| expression ('+' | '-' | '|' | '^') expression
                    //| expression ('==' | '!=' | '<' | '<=' | '>' | '>=') expression
                    //| expression '&&' expression
                    //| expression '||' expression
                    ;
primaryExpr         : operand
                    | conversion
                    | primaryExpr ( PUNTO IDENTIFIER | index | slice | typeAssertion );
//unaryExpr           : primaryExpr| (OP_SUMA | OP_MULT) expression;
conversion          : type_ PAR_IZQ expression COMA? PAR_DER;
operand             : literal | IDENTIFIER | methodExpr | PAR_IZQ expression PAR_DER;
literal             : basicLit; // | compositeLit | functionLit;
basicLit            : NULL_LIT | NUM_INT | STRING_LIT | NUM_DOUBLE;
//operandName         : IDENTIFIER | qualifiedIdent;
qualifiedIdent      : IDENTIFIER PUNTO IDENTIFIER;
methodExpr          : receiverType PUNTO IDENTIFIER ;
receiverType        : typeName | PAR_IZQ ( typeName | receiverType) PAR_DER ;  // PAR_IZQ ('*' typeName
index               : LLAV_IZQ expression LLAV_DER;
slice               : LLAV_IZQ (expression? DOS_PUNTOS expression? | expression? DOS_PUNTOS expression DOS_PUNTOS expression) LLAV_DER;
typeAssertion       : PUNTO PAR_IZQ type_ PAR_DER;
//arguments           : PAR_IZQ ((expressionList | type_ (COMA expressionList)?) ELLIPSIS? COMA?)? PAR_DER; //no lo sé rick
expressionList      : expression (COMA expression)*;
expr_rel            : expr_rel OP_REL expr_asig | expr_asig;
expr_asig           : expr_asig OP_ASIG expr_suma | expr_suma;
expr_suma           : expr_suma OP_SUMA expr_mult | expr_mult;
expr_mult           : expr_mult OP_MULT termino | termino;
termino             : valor | PAR_IZQ expr_rel PAR_DER | IDENTIFIER;
valor               : NUM_INT | NUM_DOUBLE;


//lexer

// Keywords

CONST               : 'const';
BREAK               : 'break';
DEFAULT             : 'default';
FUNC                : 'func';
CASE                : 'case';
MAP                 : 'map';
ELSE                : 'else';
PACKAGE             : 'package';
SWITCH              : 'switch';
IF                  : 'if';
RANGE               : 'range';
TYPE                : 'type';
CONTINUE            : 'continue';
FA                  : 'fa';
IMPORT              : 'import';
RETURN              : 'return';
VAR                 : 'var';

NULL_LIT            : 'null';

IDENTIFIER          : [a-zA-Z_][a-zA-Z0-9_]*;
NUM_INT             : [0-9]+;
NUM_DOUBLE          : [0-9]+ '.' [0-9]+;
STRING_LIT      : '"' ~'"'* '"';

// Punctuation

PUNTO               : '.';
PAR_IZQ             : '(';
PAR_DER             : ')';
LLAV_IZQ            : '[';
LLAV_DER            : ']';
DOS_PUNTOS          : ':';
COMA                : ',';
ELLIPSIS            : '...';
OP_SUMA             : '+' | '-';
OP_MULT             : '*' | '/' | '%';
OP_ASIG             : ':=' | '+:=' | '-:=' | '*:=' | '/:=';
OP_REL              : '<' | '>' | '<=' | '>=';
WS                  : [ \t\r\n]+ -> skip;
COMMENT             : '#' ~[\r\n]* -> skip;

