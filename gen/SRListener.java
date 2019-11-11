// Generated from C:/Users/jhons/IdeaProjects/translator/grammar\SR.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SRParser}.
 */
public interface SRListener extends ParseTreeListener {
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