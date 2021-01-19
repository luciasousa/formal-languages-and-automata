// Generated from Ex10b.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex10bParser}.
 */
public interface Ex10bListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex10bParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Ex10bParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10bParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Ex10bParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10bParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Ex10bParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10bParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Ex10bParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10bParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Ex10bParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10bParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Ex10bParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprJoin}
	 * labeled alternative in {@link Ex10bParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprJoin(Ex10bParser.ExprJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprJoin}
	 * labeled alternative in {@link Ex10bParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprJoin(Ex10bParser.ExprJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link Ex10bParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesis(Ex10bParser.ExprParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link Ex10bParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesis(Ex10bParser.ExprParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link Ex10bParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(Ex10bParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link Ex10bParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(Ex10bParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link Ex10bParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(Ex10bParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link Ex10bParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(Ex10bParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSet}
	 * labeled alternative in {@link Ex10bParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSet(Ex10bParser.ExprSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSet}
	 * labeled alternative in {@link Ex10bParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSet(Ex10bParser.ExprSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprExcept}
	 * labeled alternative in {@link Ex10bParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprExcept(Ex10bParser.ExprExceptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprExcept}
	 * labeled alternative in {@link Ex10bParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprExcept(Ex10bParser.ExprExceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10bParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(Ex10bParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10bParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(Ex10bParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10bParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(Ex10bParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10bParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(Ex10bParser.ItemContext ctx);
}