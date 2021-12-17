// Generated from /Users/ashtonhess/Desktop/DesktopL2/DesktopL3/College/Year 3/Semester 5/CS4450 - Principles of Programming Languages/newParserProject/src/antlr.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class antlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTCAST=1, COMMA=2, RANGE=3, STR=4, WHILE=5, FOR=6, IN=7, PRINT=8, SPACE=9, 
		TAB=10, BREAK=11, MINUSEQUAL=12, PLUSEQUAL=13, MULTEQUAl=14, DIVIDEEQUAL=15, 
		EQUALEQUAL=16, NOTEQUAL=17, EQUAL=18, PLUS=19, MINUS=20, MULT=21, DIVIDE=22, 
		COL=23, NOT=24, INT=25, STRING=26, MOD=27, WS=28, IF=29, ELSE=30, ELIF=31, 
		OPEN=32, CLOSE=33, OR=34, AND=35, VARNAME=36, COMMENT=37, LESSTHAN=38, 
		GREATERTHAN=39, LESSTHANEQUALTO=40, GREATERTHANEQUALTO=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INTCAST", "COMMA", "RANGE", "STR", "WHILE", "FOR", "IN", "PRINT", "SPACE", 
			"TAB", "BREAK", "MINUSEQUAL", "PLUSEQUAL", "MULTEQUAl", "DIVIDEEQUAL", 
			"EQUALEQUAL", "NOTEQUAL", "EQUAL", "PLUS", "MINUS", "MULT", "DIVIDE", 
			"COL", "NOT", "INT", "STRING", "MOD", "WS", "IF", "ELSE", "ELIF", "OPEN", 
			"CLOSE", "OR", "AND", "VARNAME", "COMMENT", "LESSTHAN", "GREATERTHAN", 
			"LESSTHANEQUALTO", "GREATERTHANEQUALTO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "','", "'range'", "'str'", "'while'", "'for'", "'in'", 
			"'print'", "' '", "'    '", "'break'", "'-='", "'+='", "'*='", "'/='", 
			"'=='", "'!='", "'='", "'+'", "'-'", "'*'", "'/'", "':'", "'!'", null, 
			null, "'%'", null, "'if'", "'else'", "'elif'", "'('", "')'", "'or'", 
			"'and'", null, null, "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTCAST", "COMMA", "RANGE", "STR", "WHILE", "FOR", "IN", "PRINT", 
			"SPACE", "TAB", "BREAK", "MINUSEQUAL", "PLUSEQUAL", "MULTEQUAl", "DIVIDEEQUAL", 
			"EQUALEQUAL", "NOTEQUAL", "EQUAL", "PLUS", "MINUS", "MULT", "DIVIDE", 
			"COL", "NOT", "INT", "STRING", "MOD", "WS", "IF", "ELSE", "ELIF", "OPEN", 
			"CLOSE", "OR", "AND", "VARNAME", "COMMENT", "LESSTHAN", "GREATERTHAN", 
			"LESSTHANEQUALTO", "GREATERTHANEQUALTO"
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


	public antlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "antlr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u00f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\6\32\u00a7\n\32\r\32\16\32\u00a8\3\33\3\33\3\33\3\33\7\33\u00af\n\33"+
		"\f\33\16\33\u00b2\13\33\3\33\3\33\3\34\3\34\3\35\6\35\u00b9\n\35\r\35"+
		"\16\35\u00ba\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\7%\u00d9\n%\f%\16%\u00dc"+
		"\13%\3&\3&\7&\u00e0\n&\f&\16&\u00e3\13&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3"+
		"*\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\6\5\2\f\f\17\17$$\4\2\f\f"+
		"\17\17\5\2C\\aac|\6\2\62;C\\aac|\2\u00f5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5Y\3\2\2\2\7[\3\2\2"+
		"\2\ta\3\2\2\2\13e\3\2\2\2\rk\3\2\2\2\17o\3\2\2\2\21r\3\2\2\2\23x\3\2\2"+
		"\2\25z\3\2\2\2\27\177\3\2\2\2\31\u0085\3\2\2\2\33\u0088\3\2\2\2\35\u008b"+
		"\3\2\2\2\37\u008e\3\2\2\2!\u0091\3\2\2\2#\u0094\3\2\2\2%\u0097\3\2\2\2"+
		"\'\u0099\3\2\2\2)\u009b\3\2\2\2+\u009d\3\2\2\2-\u009f\3\2\2\2/\u00a1\3"+
		"\2\2\2\61\u00a3\3\2\2\2\63\u00a6\3\2\2\2\65\u00aa\3\2\2\2\67\u00b5\3\2"+
		"\2\29\u00b8\3\2\2\2;\u00be\3\2\2\2=\u00c1\3\2\2\2?\u00c6\3\2\2\2A\u00cb"+
		"\3\2\2\2C\u00cd\3\2\2\2E\u00cf\3\2\2\2G\u00d2\3\2\2\2I\u00d6\3\2\2\2K"+
		"\u00dd\3\2\2\2M\u00e6\3\2\2\2O\u00e8\3\2\2\2Q\u00ea\3\2\2\2S\u00ed\3\2"+
		"\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2X\4\3\2\2\2YZ\7.\2\2Z\6\3\2\2\2[\\\7t\2"+
		"\2\\]\7c\2\2]^\7p\2\2^_\7i\2\2_`\7g\2\2`\b\3\2\2\2ab\7u\2\2bc\7v\2\2c"+
		"d\7t\2\2d\n\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7k\2\2hi\7n\2\2ij\7g\2\2j\f\3"+
		"\2\2\2kl\7h\2\2lm\7q\2\2mn\7t\2\2n\16\3\2\2\2op\7k\2\2pq\7p\2\2q\20\3"+
		"\2\2\2rs\7r\2\2st\7t\2\2tu\7k\2\2uv\7p\2\2vw\7v\2\2w\22\3\2\2\2xy\7\""+
		"\2\2y\24\3\2\2\2z{\7\"\2\2{|\7\"\2\2|}\7\"\2\2}~\7\"\2\2~\26\3\2\2\2\177"+
		"\u0080\7d\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7c\2\2"+
		"\u0083\u0084\7m\2\2\u0084\30\3\2\2\2\u0085\u0086\7/\2\2\u0086\u0087\7"+
		"?\2\2\u0087\32\3\2\2\2\u0088\u0089\7-\2\2\u0089\u008a\7?\2\2\u008a\34"+
		"\3\2\2\2\u008b\u008c\7,\2\2\u008c\u008d\7?\2\2\u008d\36\3\2\2\2\u008e"+
		"\u008f\7\61\2\2\u008f\u0090\7?\2\2\u0090 \3\2\2\2\u0091\u0092\7?\2\2\u0092"+
		"\u0093\7?\2\2\u0093\"\3\2\2\2\u0094\u0095\7#\2\2\u0095\u0096\7?\2\2\u0096"+
		"$\3\2\2\2\u0097\u0098\7?\2\2\u0098&\3\2\2\2\u0099\u009a\7-\2\2\u009a("+
		"\3\2\2\2\u009b\u009c\7/\2\2\u009c*\3\2\2\2\u009d\u009e\7,\2\2\u009e,\3"+
		"\2\2\2\u009f\u00a0\7\61\2\2\u00a0.\3\2\2\2\u00a1\u00a2\7<\2\2\u00a2\60"+
		"\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4\62\3\2\2\2\u00a5\u00a7\4\62;\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\64\3\2\2\2\u00aa\u00b0\7$\2\2\u00ab\u00af\n\2\2\2\u00ac\u00ad"+
		"\7$\2\2\u00ad\u00af\7$\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7$\2\2\u00b4\66\3\2\2\2\u00b5\u00b6"+
		"\7\'\2\2\u00b68\3\2\2\2\u00b7\u00b9\t\3\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\b\35\2\2\u00bd:\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0"+
		"\7h\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4"+
		"\7u\2\2\u00c4\u00c5\7g\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8"+
		"\7n\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7h\2\2\u00ca@\3\2\2\2\u00cb\u00cc"+
		"\7*\2\2\u00ccB\3\2\2\2\u00cd\u00ce\7+\2\2\u00ceD\3\2\2\2\u00cf\u00d0\7"+
		"q\2\2\u00d0\u00d1\7t\2\2\u00d1F\3\2\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4\u00d5\7f\2\2\u00d5H\3\2\2\2\u00d6\u00da\t\4\2\2\u00d7\u00d9"+
		"\t\5\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00dbJ\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e1\7%\2\2\u00de"+
		"\u00e0\n\3\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e5\b&\2\2\u00e5L\3\2\2\2\u00e6\u00e7\7>\2\2\u00e7N\3\2\2\2\u00e8\u00e9"+
		"\7@\2\2\u00e9P\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec\7?\2\2\u00ecR\3"+
		"\2\2\2\u00ed\u00ee\7@\2\2\u00ee\u00ef\7?\2\2\u00efT\3\2\2\2\t\2\u00a8"+
		"\u00ae\u00b0\u00ba\u00da\u00e1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}