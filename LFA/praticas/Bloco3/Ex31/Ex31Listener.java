// Generated from Ex31.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex31Parser}.
 */
public interface Ex31Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex31Parser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(Ex31Parser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex31Parser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(Ex31Parser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex31Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(Ex31Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex31Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(Ex31Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex31Parser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(Ex31Parser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex31Parser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(Ex31Parser.FieldContext ctx);
}