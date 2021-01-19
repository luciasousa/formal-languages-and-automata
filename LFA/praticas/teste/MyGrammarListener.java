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
	 * Enter a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyGrammarParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by the {@code ExprReplace}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReplace(MyGrammarParser.ExprReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReplace}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReplace(MyGrammarParser.ExprReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(MyGrammarParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(MyGrammarParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprConcatenate}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprConcatenate(MyGrammarParser.ExprConcatenateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprConcatenate}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprConcatenate(MyGrammarParser.ExprConcatenateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInput(MyGrammarParser.ExprInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInput(MyGrammarParser.ExprInputContext ctx);
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