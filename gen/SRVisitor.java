// Generated from C:/Users/Laura/IdeaProjects/translator/grammar\SR.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SRParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(SRParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#resourceStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceStmt(SRParser.ResourceStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(SRParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#importDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDecl(SRParser.ImportDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(SRParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(SRParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(SRParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SRParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(SRParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SRParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(SRParser.SimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SRParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#expressionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(SRParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(SRParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(SRParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#faStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaStmt(SRParser.FaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#faClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaClause(SRParser.FaClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#faClauseTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaClauseTo(SRParser.FaClauseToContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(SRParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(SRParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(SRParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(SRParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#procedureStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStmt(SRParser.ProcedureStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(SRParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#opStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpStmt(SRParser.OpStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(SRParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SRParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(SRParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(SRParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#varSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpec(SRParser.VarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(SRParser.Type_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(SRParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#typeLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLit(SRParser.TypeLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(SRParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(SRParser.ArrayLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#sliceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceType(SRParser.SliceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(SRParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SRParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(SRParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#conversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversion(SRParser.ConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(SRParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SRParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#basicLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicLit(SRParser.BasicLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#functionLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLit(SRParser.FunctionLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(SRParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(SRParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(SRParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(SRParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(SRParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#parameterDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDecl(SRParser.ParameterDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdent(SRParser.QualifiedIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#methodExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodExpr(SRParser.MethodExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#receiverType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverType(SRParser.ReceiverTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(SRParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(SRParser.SliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#typeAssertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssertion(SRParser.TypeAssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(SRParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#expr_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_rel(SRParser.Expr_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#expr_asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_asig(SRParser.Expr_asigContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#expr_suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_suma(SRParser.Expr_sumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#expr_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_mult(SRParser.Expr_multContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(SRParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(SRParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(SRParser.EosContext ctx);
}