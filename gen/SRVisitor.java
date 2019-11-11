// Generated from C:/Users/jhons/IdeaProjects/translator/grammar\SR.g4 by ANTLR 4.7.2
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
}