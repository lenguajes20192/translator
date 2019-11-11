// Generated from C:/Users/Laura/IdeaProjects/translator/grammar\SR.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SRParser}.
 */
public interface SRListener extends ParseTreeListener {
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
}