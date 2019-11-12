// Generated from C:/Users/Laura/IdeaProjects/translator/grammar\SR.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SRParser}.
 */
public interface SRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SRParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(SRParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(SRParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(SRParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(SRParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(SRParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(SRParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void enterImportSpec(SRParser.ImportSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void exitImportSpec(SRParser.ImportSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#importPath}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(SRParser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#importPath}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(SRParser.ImportPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(SRParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(SRParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(SRParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(SRParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(SRParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(SRParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SRParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SRParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(SRParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(SRParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SRParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SRParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(SRParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(SRParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SRParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SRParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(SRParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(SRParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(SRParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(SRParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(SRParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(SRParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#faStmt}.
	 * @param ctx the parse tree
	 */
	void enterFaStmt(SRParser.FaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#faStmt}.
	 * @param ctx the parse tree
	 */
	void exitFaStmt(SRParser.FaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#faClause}.
	 * @param ctx the parse tree
	 */
	void enterFaClause(SRParser.FaClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#faClause}.
	 * @param ctx the parse tree
	 */
	void exitFaClause(SRParser.FaClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SRParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SRParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(SRParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(SRParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(SRParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(SRParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void enterVarSpec(SRParser.VarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void exitVarSpec(SRParser.VarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(SRParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(SRParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(SRParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(SRParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#typeLit}.
	 * @param ctx the parse tree
	 */
	void enterTypeLit(SRParser.TypeLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#typeLit}.
	 * @param ctx the parse tree
	 */
	void exitTypeLit(SRParser.TypeLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(SRParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(SRParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(SRParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(SRParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#sliceType}.
	 * @param ctx the parse tree
	 */
	void enterSliceType(SRParser.SliceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#sliceType}.
	 * @param ctx the parse tree
	 */
	void exitSliceType(SRParser.SliceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SRParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SRParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SRParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SRParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(SRParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(SRParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#conversion}.
	 * @param ctx the parse tree
	 */
	void enterConversion(SRParser.ConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#conversion}.
	 * @param ctx the parse tree
	 */
	void exitConversion(SRParser.ConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(SRParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(SRParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SRParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SRParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void enterBasicLit(SRParser.BasicLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void exitBasicLit(SRParser.BasicLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#functionLit}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLit(SRParser.FunctionLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#functionLit}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLit(SRParser.FunctionLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(SRParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(SRParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(SRParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(SRParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(SRParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(SRParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(SRParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(SRParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterDecl(SRParser.ParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterDecl(SRParser.ParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdent(SRParser.QualifiedIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdent(SRParser.QualifiedIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpr(SRParser.MethodExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpr(SRParser.MethodExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void enterReceiverType(SRParser.ReceiverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void exitReceiverType(SRParser.ReceiverTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(SRParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(SRParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(SRParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(SRParser.SliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssertion(SRParser.TypeAssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssertion(SRParser.TypeAssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(SRParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(SRParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#expr_rel}.
	 * @param ctx the parse tree
	 */
	void enterExpr_rel(SRParser.Expr_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#expr_rel}.
	 * @param ctx the parse tree
	 */
	void exitExpr_rel(SRParser.Expr_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#expr_asig}.
	 * @param ctx the parse tree
	 */
	void enterExpr_asig(SRParser.Expr_asigContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#expr_asig}.
	 * @param ctx the parse tree
	 */
	void exitExpr_asig(SRParser.Expr_asigContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#expr_suma}.
	 * @param ctx the parse tree
	 */
	void enterExpr_suma(SRParser.Expr_sumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#expr_suma}.
	 * @param ctx the parse tree
	 */
	void exitExpr_suma(SRParser.Expr_sumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(SRParser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(SRParser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(SRParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(SRParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(SRParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(SRParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(SRParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(SRParser.EosContext ctx);
}