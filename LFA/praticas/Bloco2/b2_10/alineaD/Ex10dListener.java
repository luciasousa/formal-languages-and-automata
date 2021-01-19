// Generated from Ex10d.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex10dParser}.
 */
public interface Ex10dListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex10dParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(Ex10dParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10dParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(Ex10dParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10dParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Ex10dParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10dParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Ex10dParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10dParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(Ex10dParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10dParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(Ex10dParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intercepcao}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterIntercepcao(Ex10dParser.IntercepcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intercepcao}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitIntercepcao(Ex10dParser.IntercepcaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenteses}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterParenteses(Ex10dParser.ParentesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenteses}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitParenteses(Ex10dParser.ParentesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code diferenca}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterDiferenca(Ex10dParser.DiferencaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code diferenca}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitDiferenca(Ex10dParser.DiferencaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Ex10dParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Ex10dParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unicoGrupo}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterUnicoGrupo(Ex10dParser.UnicoGrupoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unicoGrupo}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitUnicoGrupo(Ex10dParser.UnicoGrupoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniao}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterUniao(Ex10dParser.UniaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniao}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitUniao(Ex10dParser.UniaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10dParser#grupo}.
	 * @param ctx the parse tree
	 */
	void enterGrupo(Ex10dParser.GrupoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10dParser#grupo}.
	 * @param ctx the parse tree
	 */
	void exitGrupo(Ex10dParser.GrupoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seqLetras}
	 * labeled alternative in {@link Ex10dParser#sequencia}.
	 * @param ctx the parse tree
	 */
	void enterSeqLetras(Ex10dParser.SeqLetrasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seqLetras}
	 * labeled alternative in {@link Ex10dParser#sequencia}.
	 * @param ctx the parse tree
	 */
	void exitSeqLetras(Ex10dParser.SeqLetrasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seqInt}
	 * labeled alternative in {@link Ex10dParser#sequencia}.
	 * @param ctx the parse tree
	 */
	void enterSeqInt(Ex10dParser.SeqIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seqInt}
	 * labeled alternative in {@link Ex10dParser#sequencia}.
	 * @param ctx the parse tree
	 */
	void exitSeqInt(Ex10dParser.SeqIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntSingleElem}
	 * labeled alternative in {@link Ex10dParser#num}.
	 * @param ctx the parse tree
	 */
	void enterIntSingleElem(Ex10dParser.IntSingleElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntSingleElem}
	 * labeled alternative in {@link Ex10dParser#num}.
	 * @param ctx the parse tree
	 */
	void exitIntSingleElem(Ex10dParser.IntSingleElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntSeveralElem}
	 * labeled alternative in {@link Ex10dParser#num}.
	 * @param ctx the parse tree
	 */
	void enterIntSeveralElem(Ex10dParser.IntSeveralElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntSeveralElem}
	 * labeled alternative in {@link Ex10dParser#num}.
	 * @param ctx the parse tree
	 */
	void exitIntSeveralElem(Ex10dParser.IntSeveralElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetraSeveralElem}
	 * labeled alternative in {@link Ex10dParser#letra}.
	 * @param ctx the parse tree
	 */
	void enterLetraSeveralElem(Ex10dParser.LetraSeveralElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetraSeveralElem}
	 * labeled alternative in {@link Ex10dParser#letra}.
	 * @param ctx the parse tree
	 */
	void exitLetraSeveralElem(Ex10dParser.LetraSeveralElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetraSingleElem}
	 * labeled alternative in {@link Ex10dParser#letra}.
	 * @param ctx the parse tree
	 */
	void enterLetraSingleElem(Ex10dParser.LetraSingleElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetraSingleElem}
	 * labeled alternative in {@link Ex10dParser#letra}.
	 * @param ctx the parse tree
	 */
	void exitLetraSingleElem(Ex10dParser.LetraSingleElemContext ctx);
}