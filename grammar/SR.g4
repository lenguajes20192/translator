grammar SR;

expr_rel : expr_rel OP_REL expr_asig | expr_asig;
expr_asig : expr_asig OP_ASIG expr_suma | expr_suma;
expr_suma :  expr_suma OP_SUMA expr_mult | expr_mult;
expr_mult : expr_mult OP_MULT termino | termino;
termino : valor | PAR_IZQ expr_rel PAR_DER | ID;

valor : NUM_INT | NUM_DOUBLE;

PAR_IZQ : '(';
PAR_DER : ')';
OP_SUMA : '+' | '-';
OP_MULT : '*' | '/' | '%';
OP_ASIG : ':=' | '+:=' | '-:=' | '*:=' | '/:=';
OP_REL : '<' | '>' | '<=' | '>=';

ID : [a-zA-Z_][a-zA-Z0-9_]*;
NUM_INT : [0-9]+;
NUM_DOUBLE : [0-9]+ '.' [0-9]+;
WS : [\t\r\n]+ -> skip;
COMMENT : '#' ~[\r\n]* -> skip;
