// Generated from Ex10a.g4 by ANTLR 4.8

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex10aParser}.
 */
public interface Ex10aListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex10aParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Ex10aParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10aParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Ex10aParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10aParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Ex10aParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10aParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Ex10aParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10aParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Ex10aParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10aParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Ex10aParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10aParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Ex10aParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10aParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Ex10aParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10aParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(Ex10aParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10aParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(Ex10aParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10aParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(Ex10aParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10aParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(Ex10aParser.ItemContext ctx);
}