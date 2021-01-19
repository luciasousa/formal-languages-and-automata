// Generated from MyGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, NUM=11, WS=12, Comment=13, ERROR=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ID", "NUM", "WS", "Comment", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "':'", "'->'", "'^'", "'*'", "'+'", "'-'", "'reduce'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "NUM", 
			"WS", "Comment", "ERROR"
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


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\6\13=\n\13\r\13\16\13>\3\f\6\fB\n\f\r\f\16\fC\3\r\6"+
		"\rG\n\r\r\r\16\rH\3\r\3\r\3\16\3\16\3\16\3\16\7\16Q\n\16\f\16\16\16T\13"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3R\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\5\3\2c|\3\2\62;\5\2\13\f"+
		"\17\17\"\"\2^\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5%\3\2"+
		"\2\2\7\'\3\2\2\2\t*\3\2\2\2\13,\3\2\2\2\r.\3\2\2\2\17\60\3\2\2\2\21\62"+
		"\3\2\2\2\239\3\2\2\2\25<\3\2\2\2\27A\3\2\2\2\31F\3\2\2\2\33L\3\2\2\2\35"+
		"Y\3\2\2\2\37 \7r\2\2 !\7t\2\2!\"\7k\2\2\"#\7p\2\2#$\7v\2\2$\4\3\2\2\2"+
		"%&\7<\2\2&\6\3\2\2\2\'(\7/\2\2()\7@\2\2)\b\3\2\2\2*+\7`\2\2+\n\3\2\2\2"+
		",-\7,\2\2-\f\3\2\2\2./\7-\2\2/\16\3\2\2\2\60\61\7/\2\2\61\20\3\2\2\2\62"+
		"\63\7t\2\2\63\64\7g\2\2\64\65\7f\2\2\65\66\7w\2\2\66\67\7e\2\2\678\7g"+
		"\2\28\22\3\2\2\29:\7\61\2\2:\24\3\2\2\2;=\t\2\2\2<;\3\2\2\2=>\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?\26\3\2\2\2@B\t\3\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2"+
		"\2CD\3\2\2\2D\30\3\2\2\2EG\t\4\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2"+
		"\2\2IJ\3\2\2\2JK\b\r\2\2K\32\3\2\2\2LM\7\61\2\2MN\7\61\2\2NR\3\2\2\2O"+
		"Q\13\2\2\2PO\3\2\2\2QT\3\2\2\2RS\3\2\2\2RP\3\2\2\2SU\3\2\2\2TR\3\2\2\2"+
		"UV\7\f\2\2VW\3\2\2\2WX\b\16\2\2X\34\3\2\2\2YZ\13\2\2\2Z\36\3\2\2\2\7\2"+
		">CHR\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}