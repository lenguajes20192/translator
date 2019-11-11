// Generated from C:/Users/jhons/IdeaProjects/translator/grammar\SR.g4 by ANTLR 4.7.2
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
		PAR_IZQ=1, PAR_DER=2, OP_SUMA=3, OP_MULT=4, OP_ASIG=5, OP_REL=6, ID=7, 
		NUM_INT=8, NUM_DOUBLE=9, WS=10, COMMENT=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PAR_IZQ", "PAR_DER", "OP_SUMA", "OP_MULT", "OP_ASIG", "OP_REL", "ID", 
			"NUM_INT", "NUM_DOUBLE", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAR_IZQ", "PAR_DER", "OP_SUMA", "OP_MULT", "OP_ASIG", "OP_REL", 
			"ID", "NUM_INT", "NUM_DOUBLE", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\60\n\6\3\7\3\7\3\7\3\7\3\7\5\7\67\n"+
		"\7\3\b\3\b\7\b;\n\b\f\b\16\b>\13\b\3\t\6\tA\n\t\r\t\16\tB\3\n\6\nF\n\n"+
		"\r\n\16\nG\3\n\3\n\6\nL\n\n\r\n\16\nM\3\13\6\13Q\n\13\r\13\16\13R\3\13"+
		"\3\13\3\f\3\f\7\fY\n\f\f\f\16\f\\\13\f\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\n\4\2--//\5\2\'\',,\61\61\4\2>>@"+
		"@\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\13\f\17\17\4\2\f\f\17\17\2j\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3"+
		"\31\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13/\3\2\2\2\r\66\3"+
		"\2\2\2\178\3\2\2\2\21@\3\2\2\2\23E\3\2\2\2\25P\3\2\2\2\27V\3\2\2\2\31"+
		"\32\7*\2\2\32\4\3\2\2\2\33\34\7+\2\2\34\6\3\2\2\2\35\36\t\2\2\2\36\b\3"+
		"\2\2\2\37 \t\3\2\2 \n\3\2\2\2!\"\7<\2\2\"\60\7?\2\2#$\7-\2\2$%\7<\2\2"+
		"%\60\7?\2\2&\'\7/\2\2\'(\7<\2\2(\60\7?\2\2)*\7,\2\2*+\7<\2\2+\60\7?\2"+
		"\2,-\7\61\2\2-.\7<\2\2.\60\7?\2\2/!\3\2\2\2/#\3\2\2\2/&\3\2\2\2/)\3\2"+
		"\2\2/,\3\2\2\2\60\f\3\2\2\2\61\67\t\4\2\2\62\63\7>\2\2\63\67\7?\2\2\64"+
		"\65\7@\2\2\65\67\7?\2\2\66\61\3\2\2\2\66\62\3\2\2\2\66\64\3\2\2\2\67\16"+
		"\3\2\2\28<\t\5\2\29;\t\6\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2="+
		"\20\3\2\2\2><\3\2\2\2?A\t\7\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2C\22\3\2\2\2DF\t\7\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2"+
		"\2\2IK\7\60\2\2JL\t\7\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\24"+
		"\3\2\2\2OQ\t\b\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2T"+
		"U\b\13\2\2U\26\3\2\2\2VZ\7%\2\2WY\n\t\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2"+
		"\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\b\f\2\2^\30\3\2\2\2\13\2/\66<BGMR"+
		"Z\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}