// Generated from C:/Users/Laura/IdeaProjects/translator/grammar\SR.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SRLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, RESOURCE=2, CONST=3, FUNC=4, CASE=5, ELSE=6, SWITCH=7, IF=8, FI=9, 
		TYPE=10, CONTINUE=11, FA=12, AF=13, IMPORT=14, RETURN=15, VAR=16, END=17, 
		TO=18, NULL_LIT=19, IDENTIFIER=20, NUM_INT=21, NUM_DOUBLE=22, STRING_LIT=23, 
		LOGICAL=24, PUNTO=25, PAR_IZQ=26, PAR_DER=27, LLAV_IZQ=28, LLAV_DER=29, 
		DOS_PUNTOS=30, COMA=31, ELLIPSIS=32, EJECUTA=33, OP_SUMA=34, OP_MULT=35, 
		OP_ASIG=36, OP_REL=37, WS=38, COMMENT=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "RESOURCE", "CONST", "FUNC", "CASE", "ELSE", "SWITCH", "IF", 
			"FI", "TYPE", "CONTINUE", "FA", "AF", "IMPORT", "RETURN", "VAR", "END", 
			"TO", "NULL_LIT", "IDENTIFIER", "NUM_INT", "NUM_DOUBLE", "STRING_LIT", 
			"LOGICAL", "PUNTO", "PAR_IZQ", "PAR_DER", "LLAV_IZQ", "LLAV_DER", "DOS_PUNTOS", 
			"COMA", "ELLIPSIS", "EJECUTA", "OP_SUMA", "OP_MULT", "OP_ASIG", "OP_REL", 
			"WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'resource'", "'const'", "'func'", "'case'", "'else'", "'switch'", 
			"'if'", "'fi'", "'type'", "'continue'", "'fa'", "'af'", "'import'", "'return'", 
			"'var'", "'end'", "'to'", "'null'", null, null, null, null, null, "'.'", 
			"'('", "')'", "'['", "']'", "':'", "','", "'...'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "RESOURCE", "CONST", "FUNC", "CASE", "ELSE", "SWITCH", "IF", 
			"FI", "TYPE", "CONTINUE", "FA", "AF", "IMPORT", "RETURN", "VAR", "END", 
			"TO", "NULL_LIT", "IDENTIFIER", "NUM_INT", "NUM_DOUBLE", "STRING_LIT", 
			"LOGICAL", "PUNTO", "PAR_IZQ", "PAR_DER", "LLAV_IZQ", "LLAV_DER", "DOS_PUNTOS", 
			"COMA", "ELLIPSIS", "EJECUTA", "OP_SUMA", "OP_MULT", "OP_ASIG", "OP_REL", 
			"WS", "COMMENT"
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


	public SRLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SR.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0117\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u00b3"+
		"\n\25\f\25\16\25\u00b6\13\25\3\26\6\26\u00b9\n\26\r\26\16\26\u00ba\3\27"+
		"\6\27\u00be\n\27\r\27\16\27\u00bf\3\27\3\27\6\27\u00c4\n\27\r\27\16\27"+
		"\u00c5\3\30\3\30\7\30\u00ca\n\30\f\30\16\30\u00cd\13\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u00d6\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00ff\n%\3&\3&\3&\3&\3&\5"+
		"&\u0106\n&\3\'\6\'\u0109\n\'\r\'\16\'\u010a\3\'\3\'\3(\3(\7(\u0111\n("+
		"\f(\16(\u0114\13(\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\13\5\2C\\aac|"+
		"\6\2\62;C\\aac|\3\2\62;\3\2$$\4\2--//\5\2\'\',,\61\61\4\2>>@@\5\2\13\f"+
		"\17\17\"\"\4\2\f\f\17\17\2\u0124\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7\\\3\2\2\2\tb\3\2\2\2\13g\3\2\2\2\rl\3"+
		"\2\2\2\17q\3\2\2\2\21x\3\2\2\2\23{\3\2\2\2\25~\3\2\2\2\27\u0083\3\2\2"+
		"\2\31\u008c\3\2\2\2\33\u008f\3\2\2\2\35\u0092\3\2\2\2\37\u0099\3\2\2\2"+
		"!\u00a0\3\2\2\2#\u00a4\3\2\2\2%\u00a8\3\2\2\2\'\u00ab\3\2\2\2)\u00b0\3"+
		"\2\2\2+\u00b8\3\2\2\2-\u00bd\3\2\2\2/\u00c7\3\2\2\2\61\u00d5\3\2\2\2\63"+
		"\u00d7\3\2\2\2\65\u00d9\3\2\2\2\67\u00db\3\2\2\29\u00dd\3\2\2\2;\u00df"+
		"\3\2\2\2=\u00e1\3\2\2\2?\u00e3\3\2\2\2A\u00e5\3\2\2\2C\u00e9\3\2\2\2E"+
		"\u00ec\3\2\2\2G\u00ee\3\2\2\2I\u00fe\3\2\2\2K\u0105\3\2\2\2M\u0108\3\2"+
		"\2\2O\u010e\3\2\2\2QR\7=\2\2R\4\3\2\2\2ST\7t\2\2TU\7g\2\2UV\7u\2\2VW\7"+
		"q\2\2WX\7w\2\2XY\7t\2\2YZ\7e\2\2Z[\7g\2\2[\6\3\2\2\2\\]\7e\2\2]^\7q\2"+
		"\2^_\7p\2\2_`\7u\2\2`a\7v\2\2a\b\3\2\2\2bc\7h\2\2cd\7w\2\2de\7p\2\2ef"+
		"\7e\2\2f\n\3\2\2\2gh\7e\2\2hi\7c\2\2ij\7u\2\2jk\7g\2\2k\f\3\2\2\2lm\7"+
		"g\2\2mn\7n\2\2no\7u\2\2op\7g\2\2p\16\3\2\2\2qr\7u\2\2rs\7y\2\2st\7k\2"+
		"\2tu\7v\2\2uv\7e\2\2vw\7j\2\2w\20\3\2\2\2xy\7k\2\2yz\7h\2\2z\22\3\2\2"+
		"\2{|\7h\2\2|}\7k\2\2}\24\3\2\2\2~\177\7v\2\2\177\u0080\7{\2\2\u0080\u0081"+
		"\7r\2\2\u0081\u0082\7g\2\2\u0082\26\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085"+
		"\7q\2\2\u0085\u0086\7p\2\2\u0086\u0087\7v\2\2\u0087\u0088\7k\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7w\2\2\u008a\u008b\7g\2\2\u008b\30\3\2\2\2\u008c"+
		"\u008d\7h\2\2\u008d\u008e\7c\2\2\u008e\32\3\2\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u0091\7h\2\2\u0091\34\3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094\7o\2\2\u0094"+
		"\u0095\7r\2\2\u0095\u0096\7q\2\2\u0096\u0097\7t\2\2\u0097\u0098\7v\2\2"+
		"\u0098\36\3\2\2\2\u0099\u009a\7t\2\2\u009a\u009b\7g\2\2\u009b\u009c\7"+
		"v\2\2\u009c\u009d\7w\2\2\u009d\u009e\7t\2\2\u009e\u009f\7p\2\2\u009f "+
		"\3\2\2\2\u00a0\u00a1\7x\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\"\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7f\2\2\u00a7"+
		"$\3\2\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7q\2\2\u00aa&\3\2\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7n\2\2\u00af"+
		"(\3\2\2\2\u00b0\u00b4\t\2\2\2\u00b1\u00b3\t\3\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5*\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\t\4\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb,\3\2\2\2"+
		"\u00bc\u00be\t\4\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\7\60\2\2"+
		"\u00c2\u00c4\t\4\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6.\3\2\2\2\u00c7\u00cb\7$\2\2\u00c8\u00ca"+
		"\n\5\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7$"+
		"\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d6\7t\2\2\u00d2\u00d3"+
		"\7c\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d6\7f\2\2\u00d5\u00d0\3\2\2\2\u00d5"+
		"\u00d2\3\2\2\2\u00d6\62\3\2\2\2\u00d7\u00d8\7\60\2\2\u00d8\64\3\2\2\2"+
		"\u00d9\u00da\7*\2\2\u00da\66\3\2\2\2\u00db\u00dc\7+\2\2\u00dc8\3\2\2\2"+
		"\u00dd\u00de\7]\2\2\u00de:\3\2\2\2\u00df\u00e0\7_\2\2\u00e0<\3\2\2\2\u00e1"+
		"\u00e2\7<\2\2\u00e2>\3\2\2\2\u00e3\u00e4\7.\2\2\u00e4@\3\2\2\2\u00e5\u00e6"+
		"\7\60\2\2\u00e6\u00e7\7\60\2\2\u00e7\u00e8\7\60\2\2\u00e8B\3\2\2\2\u00e9"+
		"\u00ea\7/\2\2\u00ea\u00eb\7@\2\2\u00ebD\3\2\2\2\u00ec\u00ed\t\6\2\2\u00ed"+
		"F\3\2\2\2\u00ee\u00ef\t\7\2\2\u00efH\3\2\2\2\u00f0\u00f1\7<\2\2\u00f1"+
		"\u00ff\7?\2\2\u00f2\u00f3\7-\2\2\u00f3\u00f4\7<\2\2\u00f4\u00ff\7?\2\2"+
		"\u00f5\u00f6\7/\2\2\u00f6\u00f7\7<\2\2\u00f7\u00ff\7?\2\2\u00f8\u00f9"+
		"\7,\2\2\u00f9\u00fa\7<\2\2\u00fa\u00ff\7?\2\2\u00fb\u00fc\7\61\2\2\u00fc"+
		"\u00fd\7<\2\2\u00fd\u00ff\7?\2\2\u00fe\u00f0\3\2\2\2\u00fe\u00f2\3\2\2"+
		"\2\u00fe\u00f5\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ffJ"+
		"\3\2\2\2\u0100\u0106\t\b\2\2\u0101\u0102\7>\2\2\u0102\u0106\7?\2\2\u0103"+
		"\u0104\7@\2\2\u0104\u0106\7?\2\2\u0105\u0100\3\2\2\2\u0105\u0101\3\2\2"+
		"\2\u0105\u0103\3\2\2\2\u0106L\3\2\2\2\u0107\u0109\t\t\2\2\u0108\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\b\'\2\2\u010dN\3\2\2\2\u010e\u0112\7%\2\2\u010f"+
		"\u0111\n\n\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\b(\2\2\u0116P\3\2\2\2\r\2\u00b4\u00ba\u00bf\u00c5\u00cb\u00d5\u00fe"+
		"\u0105\u010a\u0112\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}