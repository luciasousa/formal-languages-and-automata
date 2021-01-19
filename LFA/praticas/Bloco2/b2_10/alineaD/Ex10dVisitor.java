// Generated from Ex10d.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Ex10dParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Ex10dVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Ex10dParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(Ex10dParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex10dParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(Ex10dParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex10dParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib(Ex10dParser.AtribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intercepcao}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntercepcao(Ex10dParser.IntercepcaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenteses}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenteses(Ex10dParser.ParentesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code diferenca}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferenca(Ex10dParser.DiferencaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Ex10dParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unicoGrupo}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicoGrupo(Ex10dParser.UnicoGrupoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uniao}
	 * labeled alternative in {@link Ex10dParser#conjunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniao(Ex10dParser.UniaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ex10dParser#grupo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrupo(Ex10dParser.GrupoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seqLetras}
	 * labeled alternative in {@link Ex10dParser#sequencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqLetras(Ex10dParser.SeqLetrasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seqInt}
	 * labeled alternative in {@link Ex10dParser#sequencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqInt(Ex10dParser.SeqIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntSingleElem}
	 * labeled alternative in {@link Ex10dParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntSingleElem(Ex10dParser.IntSingleElemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntSeveralElem}
	 * labeled alternative in {@link Ex10dParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntSeveralElem(Ex10dParser.IntSeveralElemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetraSeveralElem}
	 * labeled alternative in {@link Ex10dParser#letra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetraSeveralElem(Ex10dParser.LetraSeveralElemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetraSingleElem}
	 * labeled alternative in {@link Ex10dParser#letra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetraSingleElem(Ex10dParser.LetraSingleElemContext ctx);
}