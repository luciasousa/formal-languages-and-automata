// Generated from Ex9.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex9Parser}.
 */
public interface Ex9Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex9Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Ex9Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex9Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Ex9Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex9Parser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(Ex9Parser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex9Parser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(Ex9Parser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex9Parser#options}.
	 * @param ctx the parse tree
	 */
	void enterOptions(Ex9Parser.OptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex9Parser#options}.
	 * @param ctx the parse tree
	 */
	void exitOptions(Ex9Parser.OptionsContext ctx);
}