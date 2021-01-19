// Generated from Ex7.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex7Parser}.
 */
public interface Ex7Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex7Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Ex7Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex7Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Ex7Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex7Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Ex7Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex7Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Ex7Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex7Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Ex7Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex7Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Ex7Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Ex7Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(Ex7Parser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Ex7Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(Ex7Parser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Ex7Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(Ex7Parser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Ex7Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(Ex7Parser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link Ex7Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(Ex7Parser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link Ex7Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(Ex7Parser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link Ex7Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(Ex7Parser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link Ex7Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(Ex7Parser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link Ex7Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(Ex7Parser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link Ex7Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(Ex7Parser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link Ex7Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(Ex7Parser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link Ex7Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(Ex7Parser.ExprMultDivModContext ctx);
}