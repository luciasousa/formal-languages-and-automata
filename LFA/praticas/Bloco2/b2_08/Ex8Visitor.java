// Generated from Ex8.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Ex8Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Ex8Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Ex8Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(Ex8Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex8Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(Ex8Parser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex8Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Ex8Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex8Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Ex8Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FracNumber}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFracNumber(Ex8Parser.FracNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FracDenNum}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFracDenNum(Ex8Parser.FracDenNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPrecedence2}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrecedence2(Ex8Parser.ExprPrecedence2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPrecedence1}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrecedence1(Ex8Parser.ExprPrecedence1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(Ex8Parser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesis(Ex8Parser.ExprParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssignment(Ex8Parser.ExprAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(Ex8Parser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link Ex8Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReduce(Ex8Parser.ExprReduceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex8Parser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(Ex8Parser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Ex8Parser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(Ex8Parser.Op2Context ctx);
}