// Generated from /home/lucia/Desktop/Uni/Ano2/semestre2/LFA/praticas/Bloco2/b2_10/alineaA/Ex10a.g4 by ANTLR 4.7.1

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Ex10aParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, Word=11, Number=12, COMMENT=13, WS=14;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_assignment = 2, RULE_expr = 3, RULE_set = 4, 
		RULE_item = 5;
	public static final String[] ruleNames = {
		"program", "stat", "assignment", "expr", "set", "item"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'+'", "'\\'", "'&'", "'('", "')'", "'{'", "','", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "Word", 
		"Number", "COMMENT", "WS"
	};
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
	public String getGrammarFileName() { return "Ex10a.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    HashMap<String, Set<String>> vars = new HashMap<>();
	    Set<String> list;

	public Ex10aParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Ex10aParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << ID))) != 0)) {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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
		public AssignmentContext a;
		public ExprContext expr;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
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
				setState(20);
				((StatContext)_localctx).a = assignment();

				                System.out.println(((StatContext)_localctx).a.s);
				            
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				((StatContext)_localctx).expr = expr(0);

				                System.out.println(((StatContext)_localctx).expr.s);
				            
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

	public static class AssignmentContext extends ParserRuleContext {
		public Set s;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(Ex10aParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(29);
			match(T__0);
			setState(30);
			((AssignmentContext)_localctx).expr = expr(0);

			                vars.put(((AssignmentContext)_localctx).ID.getText(),((AssignmentContext)_localctx).expr.s);
			                _localctx.s = ((AssignmentContext)_localctx).expr.s;
			            
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

	public static class ExprContext extends ParserRuleContext {
		public Set s;
		public ExprContext e1;
		public SetContext set;
		public Token ID;
		public ExprContext expr;
		public ExprContext e2;
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode ID() { return getToken(Ex10aParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(34);
				((ExprContext)_localctx).set = set();

				                _localctx.s = ((ExprContext)_localctx).set.s;
				            
				}
				break;
			case ID:
				{
				setState(37);
				((ExprContext)_localctx).ID = match(ID);

				                _localctx.s = vars.get(((ExprContext)_localctx).ID.getText());
				            
				}
				break;
			case T__4:
				{
				setState(39);
				match(T__4);
				setState(40);
				((ExprContext)_localctx).expr = expr(0);
				setState(41);
				match(T__5);

				                _localctx.s = ((ExprContext)_localctx).expr.s;
				            
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(61);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(46);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(47);
						match(T__1);
						setState(48);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(5);

						                          Set<String> s1 = ((ExprContext)_localctx).e1.s;
						                          Set<String> s2 = ((ExprContext)_localctx).e2.s;
						                          s1.addAll(s2);
						                          _localctx.s = s1;
						                      
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(52);
						match(T__2);
						setState(53);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(4);

						                          Set<String> s1 = ((ExprContext)_localctx).e1.s;
						                          Set<String> s2 = ((ExprContext)_localctx).e2.s;
						                          s1.removeAll(s2);
						                          _localctx.s = s1;
						                      
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(57);
						match(T__3);
						setState(58);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(3);

						                          Set<String> s1 = ((ExprContext)_localctx).e1.s;
						                          Set<String> s2 = ((ExprContext)_localctx).e2.s;
						                          s1.retainAll(s2);
						                          _localctx.s = s1;
						                      
						}
						break;
					}
					} 
				}
				setState(65);
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

	public static class SetContext extends ParserRuleContext {
		public Set s;
		public ItemContext item;
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__6);
			setState(67);
			((SetContext)_localctx).item = item();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(68);
				match(T__7);
				setState(69);
				((SetContext)_localctx).item = item();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__8);

			                list = new HashSet();
			                Set<String> set = new HashSet();
			                for (String s : ((SetContext)_localctx).item.s) {
			                set.add(s);
			                }
			                _localctx.s = set;
			            
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

	public static class ItemContext extends ParserRuleContext {
		public Set<String> s;
		public Token i;
		public TerminalNode Word() { return getToken(Ex10aParser.Word, 0); }
		public TerminalNode Number() { return getToken(Ex10aParser.Number, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((ItemContext)_localctx).i = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Number) ) {
				((ItemContext)_localctx).i = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			                if(list == null){
			                    list = new HashSet();
			                }
			                list.add((((ItemContext)_localctx).i!=null?((ItemContext)_localctx).i.getText():null));
			                _localctx.s = list;
			            
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5/\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13\5\3\6\3\6\3\6"+
		"\3\6\7\6I\n\6\f\6\16\6L\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\2\3\b\b\2\4\6"+
		"\b\n\f\2\3\3\2\r\16\2U\2\21\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b.\3\2\2"+
		"\2\nD\3\2\2\2\fP\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21"+
		"\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25\7\2\2\3\25"+
		"\3\3\2\2\2\26\27\5\6\4\2\27\30\b\3\1\2\30\35\3\2\2\2\31\32\5\b\5\2\32"+
		"\33\b\3\1\2\33\35\3\2\2\2\34\26\3\2\2\2\34\31\3\2\2\2\35\5\3\2\2\2\36"+
		"\37\7\f\2\2\37 \7\3\2\2 !\5\b\5\2!\"\b\4\1\2\"\7\3\2\2\2#$\b\5\1\2$%\5"+
		"\n\6\2%&\b\5\1\2&/\3\2\2\2\'(\7\f\2\2(/\b\5\1\2)*\7\7\2\2*+\5\b\5\2+,"+
		"\7\b\2\2,-\b\5\1\2-/\3\2\2\2.#\3\2\2\2.\'\3\2\2\2.)\3\2\2\2/A\3\2\2\2"+
		"\60\61\f\6\2\2\61\62\7\4\2\2\62\63\5\b\5\7\63\64\b\5\1\2\64@\3\2\2\2\65"+
		"\66\f\5\2\2\66\67\7\5\2\2\678\5\b\5\689\b\5\1\29@\3\2\2\2:;\f\4\2\2;<"+
		"\7\6\2\2<=\5\b\5\5=>\b\5\1\2>@\3\2\2\2?\60\3\2\2\2?\65\3\2\2\2?:\3\2\2"+
		"\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2\2CA\3\2\2\2DE\7\t\2\2EJ\5\f"+
		"\7\2FG\7\n\2\2GI\5\f\7\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2"+
		"\2\2LJ\3\2\2\2MN\7\13\2\2NO\b\6\1\2O\13\3\2\2\2PQ\t\2\2\2QR\b\7\1\2R\r"+
		"\3\2\2\2\b\21\34.?AJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}