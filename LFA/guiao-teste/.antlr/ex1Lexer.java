// Generated from /home/lucia/Desktop/Uni/Ano2/semestre2/LFA/guiao-teste/ex1.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ex1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, String=9, 
		WS=10, Comment=11, Error=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ID", "String", 
		"WS", "Comment", "Error"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'print'", "':'", "'input'", "'('", "')'", "'+'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ID", "String", "WS", 
		"Comment", "Error"
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


	public ex1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ex1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\t\64\n\t\f\t\16\t\67"+
		"\13\t\3\n\3\n\7\n;\n\n\f\n\16\n>\13\n\3\n\3\n\3\13\6\13C\n\13\r\13\16"+
		"\13D\3\13\3\13\3\f\3\f\3\f\3\f\7\fM\n\f\f\f\16\fP\13\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\4<N\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\3\2\5\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2Z\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33"+
		"\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3"+
		"\2\2\2\21\61\3\2\2\2\238\3\2\2\2\25B\3\2\2\2\27H\3\2\2\2\31U\3\2\2\2\33"+
		"\34\7r\2\2\34\35\7t\2\2\35\36\7k\2\2\36\37\7p\2\2\37 \7v\2\2 \4\3\2\2"+
		"\2!\"\7<\2\2\"\6\3\2\2\2#$\7k\2\2$%\7p\2\2%&\7r\2\2&\'\7w\2\2\'(\7v\2"+
		"\2(\b\3\2\2\2)*\7*\2\2*\n\3\2\2\2+,\7+\2\2,\f\3\2\2\2-.\7-\2\2.\16\3\2"+
		"\2\2/\60\7\61\2\2\60\20\3\2\2\2\61\65\t\2\2\2\62\64\t\3\2\2\63\62\3\2"+
		"\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\22\3\2\2\2\67\65\3\2"+
		"\2\28<\7$\2\29;\13\2\2\2:9\3\2\2\2;>\3\2\2\2<=\3\2\2\2<:\3\2\2\2=?\3\2"+
		"\2\2><\3\2\2\2?@\7$\2\2@\24\3\2\2\2AC\t\4\2\2BA\3\2\2\2CD\3\2\2\2DB\3"+
		"\2\2\2DE\3\2\2\2EF\3\2\2\2FG\b\13\2\2G\26\3\2\2\2HI\7\61\2\2IJ\7\61\2"+
		"\2JN\3\2\2\2KM\13\2\2\2LK\3\2\2\2MP\3\2\2\2NO\3\2\2\2NL\3\2\2\2OQ\3\2"+
		"\2\2PN\3\2\2\2QR\7\f\2\2RS\3\2\2\2ST\b\f\2\2T\30\3\2\2\2UV\13\2\2\2V\32"+
		"\3\2\2\2\7\2\65<DN\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}