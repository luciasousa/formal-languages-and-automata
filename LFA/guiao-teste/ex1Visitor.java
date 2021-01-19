// Generated from ex1.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ex1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ex1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ex1Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ex1Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link ex1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatPrint(ex1Parser.StatPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatAssig}
	 * labeled alternative in {@link ex1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssig(ex1Parser.StatAssigContext ctx);
	/**
	 * Visit a parse tree produced by {@link ex1Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ex1Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ex1Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ex1Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConcat(ex1Parser.ExprConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSubst}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubst(ex1Parser.ExprSubstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(ex1Parser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInput(ex1Parser.ExprInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(ex1Parser.ExprIDContext ctx);
}