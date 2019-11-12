grammar SR;

sourceFile          : ((resource | importDecl | declaration | statementList) eos)*;
resource            : RESOURCE IDENTIFIER ( parameters )? sourceFile END IDENTIFIER*;
importDecl          : IMPORT IDENTIFIER (COMA IDENTIFIER)*;
functionDecl        : FUNC IDENTIFIER (signature block?);
methodDecl          : FUNC receiver IDENTIFIER (signature block?);
receiver            : parameters;
block               : statementList?;
statementList       : (statement eos)+;
statement           : declaration
                    | simpleStmt
                    | returnStmt
                    | ifStmt
                    | faStmt
                    | writeStmt
                    | readStmt
                    | procedureStmt
                    | opStmt;
simpleStmt          : expressionStmt | assignment; //| emptyStmt;
assignment          : expression OP_ASIG expression;
expressionStmt      : expression;
returnStmt          : RETURN expressionList?;
//ifStmt              : IF expression (LOGICAL expression)* EJECUTA block (ELSE (ifStmt | EJECUTA block))? endif;
ifStmt              : IF expression EJECUTA block (ELSE (ifStmt | EJECUTA block))* FI;
faStmt              : FA faClause (COMA faClause)* EJECUTA block AF;
faClause            : simpleStmt? TO expression?;
writeStmt           : WRITE arguments;
readStmt            : READ arguments;
procedureStmt       : PROCEDURE IDENTIFIER parameters (RETURN varSpec)*  statementList END IDENTIFIER*;
opStmt              : OP (varSpec | (IDENTIFIER parameters)) (RETURN varSpec)*;
declaration         : constDecl | varDecl;
constDecl           : CONST IDENTIFIER ((DOS_PUNTOS type_ (OP_ASIG expression)?) | OP_ASIG expression); //just one identifier
varDecl             : VAR varSpec ;
varSpec             : identifierList (slice? DOS_PUNTOS type_ (OP_ASIG expression)? | OP_ASIG expression (COMA varSpec)*);
type_               : typeName | typeLit;
typeName            : IDENTIFIER | qualifiedIdent | IDENTIFIER arrayType;  //second not necessary
typeLit             : arrayType | sliceType | functionType;
arrayType           : LLAV_IZQ arrayLength LLAV_DER;
arrayLength         : expression;
sliceType           : LLAV_IZQ LLAV_DER type_;
identifierList      : IDENTIFIER (COMA IDENTIFIER)*;
expression          : primaryExpr
                    | expr_rel
                    //| exprOr
                    //| unaryExpr
                    //| expression (OP_MULT ) expression
                    //| expression ('+' | '-' | '|' | '^') expression
                    //| expression ('=' | '!=' | '<' | '<=' | '>' | '>=') expression
                    //| expression '&&' expression
                    | expression ('or'|'|'|'and'|'&') expression
                    ;
primaryExpr         : operand
                    | conversion
                    | primaryExpr ( PUNTO IDENTIFIER | index | slice | typeAssertion | arguments );
//unaryExpr           : primaryExpr| (OP_SUMA | OP_MULT) expression;
conversion          : type_ PAR_IZQ expression COMA? PAR_DER;
operand             : literal | IDENTIFIER | methodExpr | PAR_IZQ expression PAR_DER;
literal             : basicLit | functionLit; // | compositeLit ;
basicLit            : NULL_LIT | NUM_INT | STRING_LIT | NUM_DOUBLE;
functionLit         : FUNC signature block;
functionType        : FUNC signature;
arguments           : PAR_IZQ ((expressionList | type_ (COMA expressionList)?) ELLIPSIS? COMA?)? PAR_DER;
signature           : parameters result | parameters;
result              : parameters | type_;
parameters          : PAR_IZQ (parameterDecl (COMA parameterDecl)* COMA?)? PAR_DER ;
parameterDecl       : identifierList? DOS_PUNTOS? type_ ;
//operandName        : IDENTIFIER | qualifiedIdent;
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
eos
    : ';'
    | EOF
    | {lineTerminatorAhead()}?
    | {checkPreviousTokenText("}")}?
    ;

//lexer

// Keywords

RESOURCE            : 'resource';
CONST               : 'const';
FUNC                : 'func';
CASE                : 'case';
ELSE                : 'else';
SWITCH              : 'switch';
IF                  : 'if';
FI                  : 'fi';
TYPE                : 'type';
CONTINUE            : 'continue';
FA                  : 'fa';
AF                  : 'af';
IMPORT              : 'import';
RETURN              : 'return' | 'returns';
VAR                 : 'var';
END                 : 'end';
TO                  : 'to';
WRITE               : 'write' | 'writes';
READ                : 'read';
PROCEDURE           : 'procedure' | 'proc';
OP                  : 'op';

NULL_LIT            : 'null';

IDENTIFIER          : [a-zA-Z_][a-zA-Z0-9_]*;
NUM_INT             : [0-9]+;
NUM_DOUBLE          : [0-9]+ '.' [0-9]+;
STRING_LIT          : '"' ~'"'* '"';
LOGICAL             : 'or' | 'and';

// Punctuation

PUNTO               : '.';
PAR_IZQ             : '(';
PAR_DER             : ')';
LLAV_IZQ            : '[';
LLAV_DER            : ']';
DOS_PUNTOS          : ':';
COMA                : ',';
ELLIPSIS            : '...';
EJECUTA             : '->';
OP_SUMA             : '+' | '-';
OP_MULT             : '*' | '/' | '%';
OP_ASIG             : ':=' | '+:=' | '-:=' | '*:=' | '/:=' | '=';
OP_REL              : '<' | '>' | '<=' | '>=';
OP_LOG              : 'and' | '&' | '|';
WS                  : [ \t\r\n]+ -> skip;
COMMENT             : '#' ~[\r\n]* -> skip;

