// Generated from Ex10d.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Ex10dParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		UpperCase=10, LowerCase=11, Integer=12, IGNORE=13, COMMENT=14;
	public static final int
		RULE_main = 0, RULE_stat = 1, RULE_atrib = 2, RULE_conjunto = 3, RULE_grupo = 4, 
		RULE_sequencia = 5, RULE_num = 6, RULE_letra = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "stat", "atrib", "conjunto", "grupo", "sequencia", "num", "letra"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'&'", "'\\'", "'('", "')'", "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "UpperCase", 
			"LowerCase", "Integer", "IGNORE", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Ex10d.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Ex10dParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Ex10dParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << UpperCase))) != 0)) {
				{
				{
				setState(16);
				stat();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				atrib();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				conjunto(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribContext extends ParserRuleContext {
		public Token variavel;
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public TerminalNode UpperCase() { return getToken(Ex10dParser.UpperCase, 0); }
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitAtrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitAtrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((AtribContext)_localctx).variavel = match(UpperCase);
			setState(29);
			match(T__0);
			setState(30);
			conjunto(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjuntoContext extends ParserRuleContext {
		public ConjuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto; }
	 
		public ConjuntoContext() { }
		public void copyFrom(ConjuntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntercepcaoContext extends ConjuntoContext {
		public ConjuntoContext exp1;
		public ConjuntoContext exp2;
		public List<ConjuntoContext> conjunto() {
			return getRuleContexts(ConjuntoContext.class);
		}
		public ConjuntoContext conjunto(int i) {
			return getRuleContext(ConjuntoContext.class,i);
		}
		public IntercepcaoContext(ConjuntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterIntercepcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitIntercepcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitIntercepcao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentesesContext extends ConjuntoContext {
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public ParentesesContext(ConjuntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterParenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitParenteses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitParenteses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DiferencaContext extends ConjuntoContext {
		public ConjuntoContext exp1;
		public ConjuntoContext exp2;
		public List<ConjuntoContext> conjunto() {
			return getRuleContexts(ConjuntoContext.class);
		}
		public ConjuntoContext conjunto(int i) {
			return getRuleContext(ConjuntoContext.class,i);
		}
		public DiferencaContext(ConjuntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterDiferenca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitDiferenca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitDiferenca(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ConjuntoContext {
		public Token variavel;
		public TerminalNode UpperCase() { return getToken(Ex10dParser.UpperCase, 0); }
		public VariableContext(ConjuntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnicoGrupoContext extends ConjuntoContext {
		public GrupoContext grupo() {
			return getRuleContext(GrupoContext.class,0);
		}
		public UnicoGrupoContext(ConjuntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterUnicoGrupo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitUnicoGrupo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitUnicoGrupo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UniaoContext extends ConjuntoContext {
		public ConjuntoContext exp1;
		public ConjuntoContext exp2;
		public List<ConjuntoContext> conjunto() {
			return getRuleContexts(ConjuntoContext.class);
		}
		public ConjuntoContext conjunto(int i) {
			return getRuleContext(ConjuntoContext.class,i);
		}
		public UniaoContext(ConjuntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterUniao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitUniao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitUniao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjuntoContext conjunto() throws RecognitionException {
		return conjunto(0);
	}

	private ConjuntoContext conjunto(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConjuntoContext _localctx = new ConjuntoContext(_ctx, _parentState);
		ConjuntoContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_conjunto, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new ParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(33);
				match(T__4);
				setState(34);
				conjunto(0);
				setState(35);
				match(T__5);
				}
				break;
			case T__6:
				{
				_localctx = new UnicoGrupoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				grupo();
				}
				break;
			case UpperCase:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				((VariableContext)_localctx).variavel = match(UpperCase);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(50);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new UniaoContext(new ConjuntoContext(_parentctx, _parentState));
						((UniaoContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_conjunto);
						setState(41);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(42);
						match(T__1);
						setState(43);
						((UniaoContext)_localctx).exp2 = conjunto(7);
						}
						break;
					case 2:
						{
						_localctx = new IntercepcaoContext(new ConjuntoContext(_parentctx, _parentState));
						((IntercepcaoContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_conjunto);
						setState(44);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(45);
						match(T__2);
						setState(46);
						((IntercepcaoContext)_localctx).exp2 = conjunto(6);
						}
						break;
					case 3:
						{
						_localctx = new DiferencaContext(new ConjuntoContext(_parentctx, _parentState));
						((DiferencaContext)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_conjunto);
						setState(47);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(48);
						match(T__3);
						setState(49);
						((DiferencaContext)_localctx).exp2 = conjunto(5);
						}
						break;
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GrupoContext extends ParserRuleContext {
		public SequenciaContext sequencia() {
			return getRuleContext(SequenciaContext.class,0);
		}
		public GrupoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grupo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterGrupo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitGrupo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitGrupo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrupoContext grupo() throws RecognitionException {
		GrupoContext _localctx = new GrupoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_grupo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__6);
			setState(56);
			sequencia();
			setState(57);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenciaContext extends ParserRuleContext {
		public SequenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequencia; }
	 
		public SequenciaContext() { }
		public void copyFrom(SequenciaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SeqIntContext extends SequenciaContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public SeqIntContext(SequenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterSeqInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitSeqInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitSeqInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqLetrasContext extends SequenciaContext {
		public LetraContext letra() {
			return getRuleContext(LetraContext.class,0);
		}
		public SeqLetrasContext(SequenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterSeqLetras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitSeqLetras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitSeqLetras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenciaContext sequencia() throws RecognitionException {
		SequenciaContext _localctx = new SequenciaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sequencia);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LowerCase:
				_localctx = new SeqLetrasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				letra(0);
				}
				break;
			case Integer:
				_localctx = new SeqIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				num(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	 
		public NumContext() { }
		public void copyFrom(NumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntSingleElemContext extends NumContext {
		public Token number;
		public TerminalNode Integer() { return getToken(Ex10dParser.Integer, 0); }
		public IntSingleElemContext(NumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterIntSingleElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitIntSingleElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitIntSingleElem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntSeveralElemContext extends NumContext {
		public Token number;
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode Integer() { return getToken(Ex10dParser.Integer, 0); }
		public IntSeveralElemContext(NumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterIntSeveralElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitIntSeveralElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitIntSeveralElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		return num(0);
	}

	private NumContext num(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumContext _localctx = new NumContext(_ctx, _parentState);
		NumContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_num, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IntSingleElemContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(64);
			((IntSingleElemContext)_localctx).number = match(Integer);
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IntSeveralElemContext(new NumContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_num);
					setState(66);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(67);
					match(T__8);
					setState(68);
					((IntSeveralElemContext)_localctx).number = match(Integer);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LetraContext extends ParserRuleContext {
		public LetraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letra; }
	 
		public LetraContext() { }
		public void copyFrom(LetraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetraSeveralElemContext extends LetraContext {
		public Token letter;
		public LetraContext letra() {
			return getRuleContext(LetraContext.class,0);
		}
		public TerminalNode LowerCase() { return getToken(Ex10dParser.LowerCase, 0); }
		public LetraSeveralElemContext(LetraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterLetraSeveralElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitLetraSeveralElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitLetraSeveralElem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetraSingleElemContext extends LetraContext {
		public Token letter;
		public TerminalNode LowerCase() { return getToken(Ex10dParser.LowerCase, 0); }
		public LetraSingleElemContext(LetraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).enterLetraSingleElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ex10dListener ) ((Ex10dListener)listener).exitLetraSingleElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ex10dVisitor ) return ((Ex10dVisitor<? extends T>)visitor).visitLetraSingleElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetraContext letra() throws RecognitionException {
		return letra(0);
	}

	private LetraContext letra(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LetraContext _localctx = new LetraContext(_ctx, _parentState);
		LetraContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_letra, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LetraSingleElemContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(75);
			((LetraSingleElemContext)_localctx).letter = match(LowerCase);
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LetraSeveralElemContext(new LetraContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_letra);
					setState(77);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(78);
					match(T__8);
					setState(79);
					((LetraSeveralElemContext)_localctx).letter = match(LowerCase);
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return conjunto_sempred((ConjuntoContext)_localctx, predIndex);
		case 6:
			return num_sempred((NumContext)_localctx, predIndex);
		case 7:
			return letra_sempred((LetraContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conjunto_sempred(ConjuntoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean num_sempred(NumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean letra_sempred(LetraContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20X\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\2\3\2\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5*\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\65\n\5"+
		"\f\5\16\58\13\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7@\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bH\n\b\f\b\16\bK\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tS\n\t\f\t\16\tV"+
		"\13\t\3\t\2\5\b\16\20\n\2\4\6\b\n\f\16\20\2\2\2Y\2\25\3\2\2\2\4\34\3\2"+
		"\2\2\6\36\3\2\2\2\b)\3\2\2\2\n9\3\2\2\2\f?\3\2\2\2\16A\3\2\2\2\20L\3\2"+
		"\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2"+
		"\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32\35\5\6"+
		"\4\2\33\35\5\b\5\2\34\32\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36\37\7\f"+
		"\2\2\37 \7\3\2\2 !\5\b\5\2!\7\3\2\2\2\"#\b\5\1\2#$\7\7\2\2$%\5\b\5\2%"+
		"&\7\b\2\2&*\3\2\2\2\'*\5\n\6\2(*\7\f\2\2)\"\3\2\2\2)\'\3\2\2\2)(\3\2\2"+
		"\2*\66\3\2\2\2+,\f\b\2\2,-\7\4\2\2-\65\5\b\5\t./\f\7\2\2/\60\7\5\2\2\60"+
		"\65\5\b\5\b\61\62\f\6\2\2\62\63\7\6\2\2\63\65\5\b\5\7\64+\3\2\2\2\64."+
		"\3\2\2\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\t\3"+
		"\2\2\28\66\3\2\2\29:\7\t\2\2:;\5\f\7\2;<\7\n\2\2<\13\3\2\2\2=@\5\20\t"+
		"\2>@\5\16\b\2?=\3\2\2\2?>\3\2\2\2@\r\3\2\2\2AB\b\b\1\2BC\7\16\2\2CI\3"+
		"\2\2\2DE\f\3\2\2EF\7\13\2\2FH\7\16\2\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2I"+
		"J\3\2\2\2J\17\3\2\2\2KI\3\2\2\2LM\b\t\1\2MN\7\r\2\2NT\3\2\2\2OP\f\3\2"+
		"\2PQ\7\13\2\2QS\7\r\2\2RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\21\3"+
		"\2\2\2VT\3\2\2\2\n\25\34)\64\66?IT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}