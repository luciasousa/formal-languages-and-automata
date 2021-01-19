// Generated from Ex4.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex4Parser}.
 */
public interface Ex4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex4Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Ex4Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex4Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Ex4Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex4Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(Ex4Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex4Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(Ex4Parser.LineContext ctx);
}