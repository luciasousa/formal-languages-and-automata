// Generated from Ex8.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex8Parser}.
 */
public interface Ex8Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex8Parser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(Ex8Parser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex8Parser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(Ex8Parser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex8Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Ex8Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex8Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Ex8Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Ex8Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Ex8Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex8Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(Ex8Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex8Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(Ex8Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FracNumber}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFracNumber(Ex8Parser.FracNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FracNumber}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFracNumber(Ex8Parser.FracNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FracDenNum}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFracDenNum(Ex8Parser.FracDenNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FracDenNum}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFracDenNum(Ex8Parser.FracDenNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPrecedence2}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPrecedence2(Ex8Parser.ExprPrecedence2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPrecedence2}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPrecedence2(Ex8Parser.ExprPrecedence2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPrecedence1}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPrecedence1(Ex8Parser.ExprPrecedence1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPrecedence1}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPrecedence1(Ex8Parser.ExprPrecedence1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(Ex8Parser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(Ex8Parser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesis(Ex8Parser.ExprParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesis(Ex8Parser.ExprParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAssignment(Ex8Parser.ExprAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAssignment(Ex8Parser.ExprAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(Ex8Parser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(Ex8Parser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(Ex8Parser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(Ex8Parser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex8Parser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(Ex8Parser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Ex8Parser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(Ex8Parser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Ex8Parser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(Ex8Parser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Ex8Parser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(Ex8Parser.Op2Context ctx);
}