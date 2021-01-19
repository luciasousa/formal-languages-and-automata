// Generated from Ex10c.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex10cParser}.
 */
public interface Ex10cListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex10cParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(Ex10cParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10cParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(Ex10cParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10cParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Ex10cParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10cParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Ex10cParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10cParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(Ex10cParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10cParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(Ex10cParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intercepcao}
	 * labeled alternative in {@link Ex10cParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterIntercepcao(Ex10cParser.IntercepcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intercepcao}
	 * labeled alternative in {@link Ex10cParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitIntercepcao(Ex10cParser.IntercepcaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenteses}
	 * labeled alternative in {@link Ex10cParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterParenteses(Ex10cParser.ParentesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenteses}
	 * labeled alternative in {@link Ex10cParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitParenteses(Ex10cParser.ParentesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code diferenca}
	 * labeled alternative in {@link Ex10cParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterDiferenca(Ex10cParser.DiferencaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code diferenca}
	 * labeled alternative in {@link Ex10cParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitDiferenca(Ex10cParser.DiferencaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Ex10cParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Ex10cParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Ex10cParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Ex10cParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unicoGrupo}
	 * labeled alternative in {@link Ex10cParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterUnicoGrupo(Ex10cParser.UnicoGrupoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unicoGrupo}
	 * labeled alternative in {@link Ex10cParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitUnicoGrupo(Ex10cParser.UnicoGrupoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniao}
	 * labeled alternative in {@link Ex10cParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterUniao(Ex10cParser.UniaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniao}
	 * labeled alternative in {@link Ex10cParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitUniao(Ex10cParser.UniaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex10cParser#grupo}.
	 * @param ctx the parse tree
	 */
	void enterGrupo(Ex10cParser.GrupoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex10cParser#grupo}.
	 * @param ctx the parse tree
	 */
	void exitGrupo(Ex10cParser.GrupoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seqLetras}
	 * labeled alternative in {@link Ex10cParser#sequencia}.
	 * @param ctx the parse tree
	 */
	void enterSeqLetras(Ex10cParser.SeqLetrasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seqLetras}
	 * labeled alternative in {@link Ex10cParser#sequencia}.
	 * @param ctx the parse tree
	 */
	void exitSeqLetras(Ex10cParser.SeqLetrasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seqInt}
	 * labeled alternative in {@link Ex10cParser#sequencia}.
	 * @param ctx the parse tree
	 */
	void enterSeqInt(Ex10cParser.SeqIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seqInt}
	 * labeled alternative in {@link Ex10cParser#sequencia}.
	 * @param ctx the parse tree
	 */
	void exitSeqInt(Ex10cParser.SeqIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntSingleElem}
	 * labeled alternative in {@link Ex10cParser#num}.
	 * @param ctx the parse tree
	 */
	void enterIntSingleElem(Ex10cParser.IntSingleElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntSingleElem}
	 * labeled alternative in {@link Ex10cParser#num}.
	 * @param ctx the parse tree
	 */
	void exitIntSingleElem(Ex10cParser.IntSingleElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntSeveralElem}
	 * labeled alternative in {@link Ex10cParser#num}.
	 * @param ctx the parse tree
	 */
	void enterIntSeveralElem(Ex10cParser.IntSeveralElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntSeveralElem}
	 * labeled alternative in {@link Ex10cParser#num}.
	 * @param ctx the parse tree
	 */
	void exitIntSeveralElem(Ex10cParser.IntSeveralElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetraSeveralElem}
	 * labeled alternative in {@link Ex10cParser#letra}.
	 * @param ctx the parse tree
	 */
	void enterLetraSeveralElem(Ex10cParser.LetraSeveralElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetraSeveralElem}
	 * labeled alternative in {@link Ex10cParser#letra}.
	 * @param ctx the parse tree
	 */
	void exitLetraSeveralElem(Ex10cParser.LetraSeveralElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetraSingleElem}
	 * labeled alternative in {@link Ex10cParser#letra}.
	 * @param ctx the parse tree
	 */
	void enterLetraSingleElem(Ex10cParser.LetraSingleElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetraSingleElem}
	 * labeled alternative in {@link Ex10cParser#letra}.
	 * @param ctx the parse tree
	 */
	void exitLetraSingleElem(Ex10cParser.LetraSingleElemContext ctx);
}