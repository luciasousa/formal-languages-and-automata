// Generated from ex1.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ex1Parser}.
 */
public interface ex1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ex1Parser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ex1Parser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ex1Parser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ex1Parser.MainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link ex1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterStatPrint(ex1Parser.StatPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link ex1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitStatPrint(ex1Parser.StatPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssig}
	 * labeled alternative in {@link ex1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterStatAssig(ex1Parser.StatAssigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssig}
	 * labeled alternative in {@link ex1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitStatAssig(ex1Parser.StatAssigContext ctx);
	/**
	 * Enter a parse tree produced by {@link ex1Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ex1Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ex1Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ex1Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ex1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ex1Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ex1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ex1Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprConcat(ex1Parser.ExprConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprConcat(ex1Parser.ExprConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSubst}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubst(ex1Parser.ExprSubstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSubst}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubst(ex1Parser.ExprSubstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(ex1Parser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(ex1Parser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInput(ex1Parser.ExprInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInput(ex1Parser.ExprInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(ex1Parser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link ex1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(ex1Parser.ExprIDContext ctx);
}