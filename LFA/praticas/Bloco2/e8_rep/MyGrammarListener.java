// Generated from MyGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(MyGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(MyGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MyGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MyGrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFrac}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFrac(MyGrammarParser.ExprFracContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFrac}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFrac(MyGrammarParser.ExprFracContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(MyGrammarParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(MyGrammarParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPow(MyGrammarParser.ExprPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPow(MyGrammarParser.ExprPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNum(MyGrammarParser.ExprNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNum(MyGrammarParser.ExprNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(MyGrammarParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(MyGrammarParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRed}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRed(MyGrammarParser.ExprRedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRed}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRed(MyGrammarParser.ExprRedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(MyGrammarParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(MyGrammarParser.ExprIDContext ctx);
}