// Generated from C:/Users/Laura/IdeaProjects/translator/grammar\SR.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONST=1, BREAK=2, DEFAULT=3, FUNC=4, CASE=5, MAP=6, ELSE=7, PACKAGE=8, 
		SWITCH=9, IF=10, RANGE=11, TYPE=12, CONTINUE=13, FA=14, IMPORT=15, RETURN=16, 
		VAR=17, NULL_LIT=18, IDENTIFIER=19, NUM_INT=20, NUM_DOUBLE=21, STRING_LIT=22, 
		PUNTO=23, PAR_IZQ=24, PAR_DER=25, LLAV_IZQ=26, LLAV_DER=27, DOS_PUNTOS=28, 
		COMA=29, ELLIPSIS=30, OP_SUMA=31, OP_MULT=32, OP_ASIG=33, OP_REL=34, WS=35, 
		COMMENT=36;
	public static final int
		RULE_declaration = 0, RULE_constDecl = 1, RULE_varDecl = 2, RULE_varSpec = 3, 
		RULE_type_ = 4, RULE_typeName = 5, RULE_typeLit = 6, RULE_arrayType = 7, 
		RULE_arrayLength = 8, RULE_sliceType = 9, RULE_identifierList = 10, RULE_expression = 11, 
		RULE_primaryExpr = 12, RULE_conversion = 13, RULE_operand = 14, RULE_literal = 15, 
		RULE_basicLit = 16, RULE_qualifiedIdent = 17, RULE_methodExpr = 18, RULE_receiverType = 19, 
		RULE_index = 20, RULE_slice = 21, RULE_typeAssertion = 22, RULE_expressionList = 23, 
		RULE_expr_rel = 24, RULE_expr_asig = 25, RULE_expr_suma = 26, RULE_expr_mult = 27, 
		RULE_termino = 28, RULE_valor = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"declaration", "constDecl", "varDecl", "varSpec", "type_", "typeName", 
			"typeLit", "arrayType", "arrayLength", "sliceType", "identifierList", 
			"expression", "primaryExpr", "conversion", "operand", "literal", "basicLit", 
			"qualifiedIdent", "methodExpr", "receiverType", "index", "slice", "typeAssertion", 
			"expressionList", "expr_rel", "expr_asig", "expr_suma", "expr_mult", 
			"termino", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'break'", "'default'", "'func'", "'case'", "'map'", 
			"'else'", "'package'", "'switch'", "'if'", "'range'", "'type'", "'continue'", 
			"'fa'", "'import'", "'return'", "'var'", "'null'", null, null, null, 
			null, "'.'", "'('", "')'", "'['", "']'", "':'", "','", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONST", "BREAK", "DEFAULT", "FUNC", "CASE", "MAP", "ELSE", "PACKAGE", 
			"SWITCH", "IF", "RANGE", "TYPE", "CONTINUE", "FA", "IMPORT", "RETURN", 
			"VAR", "NULL_LIT", "IDENTIFIER", "NUM_INT", "NUM_DOUBLE", "STRING_LIT", 
			"PUNTO", "PAR_IZQ", "PAR_DER", "LLAV_IZQ", "LLAV_DER", "DOS_PUNTOS", 
			"COMA", "ELLIPSIS", "OP_SUMA", "OP_MULT", "OP_ASIG", "OP_REL", "WS", 
			"COMMENT"
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
	public String getGrammarFileName() { return "SR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DeclarationContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_declaration);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				constDecl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				varDecl();
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SRParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SRParser.IDENTIFIER, 0); }
		public TerminalNode OP_ASIG() { return getToken(SRParser.OP_ASIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(SRParser.DOS_PUNTOS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(CONST);
			setState(65);
			match(IDENTIFIER);
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOS_PUNTOS:
				{
				{
				setState(66);
				match(DOS_PUNTOS);
				setState(67);
				type_();
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASIG) {
					{
					setState(68);
					match(OP_ASIG);
					setState(69);
					expression(0);
					}
				}

				}
				}
				break;
			case OP_ASIG:
				{
				setState(72);
				match(OP_ASIG);
				setState(73);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SRParser.VAR, 0); }
		public VarSpecContext varSpec() {
			return getRuleContext(VarSpecContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(VAR);
			setState(77);
			varSpec();
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

	public static class VarSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(SRParser.DOS_PUNTOS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode OP_ASIG() { return getToken(SRParser.OP_ASIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SliceContext slice() {
			return getRuleContext(SliceContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(SRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SRParser.COMA, i);
		}
		public List<VarSpecContext> varSpec() {
			return getRuleContexts(VarSpecContext.class);
		}
		public VarSpecContext varSpec(int i) {
			return getRuleContext(VarSpecContext.class,i);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitVarSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitVarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			identifierList();
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLAV_IZQ:
			case DOS_PUNTOS:
				{
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LLAV_IZQ) {
					{
					setState(80);
					slice();
					}
				}

				setState(83);
				match(DOS_PUNTOS);
				setState(84);
				type_();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASIG) {
					{
					setState(85);
					match(OP_ASIG);
					setState(86);
					expression(0);
					}
				}

				}
				break;
			case OP_ASIG:
				{
				setState(89);
				match(OP_ASIG);
				setState(90);
				expression(0);
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(91);
						match(COMA);
						setState(92);
						varSpec();
						}
						} 
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Type_Context extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(SRParser.PAR_IZQ, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(SRParser.PAR_DER, 0); }
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				typeName();
				}
				break;
			case LLAV_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				typeLit();
				}
				break;
			case PAR_IZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(PAR_IZQ);
				setState(103);
				type_();
				setState(104);
				match(PAR_DER);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SRParser.IDENTIFIER, 0); }
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeName);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				qualifiedIdent();
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

	public static class TypeLitContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public TypeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterTypeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitTypeLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitTypeLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeLit);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				sliceType();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode LLAV_IZQ() { return getToken(SRParser.LLAV_IZQ, 0); }
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public TerminalNode LLAV_DER() { return getToken(SRParser.LLAV_DER, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(LLAV_IZQ);
			setState(117);
			arrayLength();
			setState(118);
			match(LLAV_DER);
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

	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitArrayLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitArrayLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			expression(0);
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

	public static class SliceTypeContext extends ParserRuleContext {
		public TerminalNode LLAV_IZQ() { return getToken(SRParser.LLAV_IZQ, 0); }
		public TerminalNode LLAV_DER() { return getToken(SRParser.LLAV_DER, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSliceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSliceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSliceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LLAV_IZQ);
			setState(123);
			match(LLAV_DER);
			setState(124);
			type_();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SRParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SRParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMA() { return getTokens(SRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SRParser.COMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IDENTIFIER);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(127);
				match(COMA);
				setState(128);
				match(IDENTIFIER);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public Expr_relContext expr_rel() {
			return getRuleContext(Expr_relContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_MULT() { return getToken(SRParser.OP_MULT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(135);
				primaryExpr(0);
				}
				break;
			case 2:
				{
				setState(136);
				expr_rel(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(139);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(140);
					match(OP_MULT);
					}
					setState(141);
					expression(2);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(SRParser.PUNTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SRParser.IDENTIFIER, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public SliceContext slice() {
			return getRuleContext(SliceContext.class,0);
		}
		public TypeAssertionContext typeAssertion() {
			return getRuleContext(TypeAssertionContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(148);
				operand();
				}
				break;
			case 2:
				{
				setState(149);
				conversion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(152);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(153);
						match(PUNTO);
						setState(154);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(155);
						index();
						}
						break;
					case 3:
						{
						setState(156);
						slice();
						}
						break;
					case 4:
						{
						setState(157);
						typeAssertion();
						}
						break;
					}
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ConversionContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(SRParser.PAR_IZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(SRParser.PAR_DER, 0); }
		public TerminalNode COMA() { return getToken(SRParser.COMA, 0); }
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitConversion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			type_();
			setState(166);
			match(PAR_IZQ);
			setState(167);
			expression(0);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(168);
				match(COMA);
				}
			}

			setState(171);
			match(PAR_DER);
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

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SRParser.IDENTIFIER, 0); }
		public MethodExprContext methodExpr() {
			return getRuleContext(MethodExprContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(SRParser.PAR_IZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(SRParser.PAR_DER, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operand);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				methodExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(PAR_IZQ);
				setState(177);
				expression(0);
				setState(178);
				match(PAR_DER);
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

	public static class LiteralContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			basicLit();
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

	public static class BasicLitContext extends ParserRuleContext {
		public TerminalNode NULL_LIT() { return getToken(SRParser.NULL_LIT, 0); }
		public TerminalNode NUM_INT() { return getToken(SRParser.NUM_INT, 0); }
		public TerminalNode STRING_LIT() { return getToken(SRParser.STRING_LIT, 0); }
		public TerminalNode NUM_DOUBLE() { return getToken(SRParser.NUM_DOUBLE, 0); }
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBasicLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBasicLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBasicLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_basicLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL_LIT) | (1L << NUM_INT) | (1L << NUM_DOUBLE) | (1L << STRING_LIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class QualifiedIdentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SRParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SRParser.IDENTIFIER, i);
		}
		public TerminalNode PUNTO() { return getToken(SRParser.PUNTO, 0); }
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterQualifiedIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitQualifiedIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitQualifiedIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(IDENTIFIER);
			setState(187);
			match(PUNTO);
			setState(188);
			match(IDENTIFIER);
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

	public static class MethodExprContext extends ParserRuleContext {
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(SRParser.PUNTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SRParser.IDENTIFIER, 0); }
		public MethodExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterMethodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitMethodExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitMethodExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodExprContext methodExpr() throws RecognitionException {
		MethodExprContext _localctx = new MethodExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			receiverType();
			setState(191);
			match(PUNTO);
			setState(192);
			match(IDENTIFIER);
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

	public static class ReceiverTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(SRParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(SRParser.PAR_DER, 0); }
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public ReceiverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterReceiverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitReceiverType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitReceiverType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverTypeContext receiverType() throws RecognitionException {
		ReceiverTypeContext _localctx = new ReceiverTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_receiverType);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				typeName();
				}
				break;
			case PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(PAR_IZQ);
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(196);
					typeName();
					}
					break;
				case 2:
					{
					setState(197);
					receiverType();
					}
					break;
				}
				setState(200);
				match(PAR_DER);
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode LLAV_IZQ() { return getToken(SRParser.LLAV_IZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAV_DER() { return getToken(SRParser.LLAV_DER, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LLAV_IZQ);
			setState(205);
			expression(0);
			setState(206);
			match(LLAV_DER);
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

	public static class SliceContext extends ParserRuleContext {
		public TerminalNode LLAV_IZQ() { return getToken(SRParser.LLAV_IZQ, 0); }
		public TerminalNode LLAV_DER() { return getToken(SRParser.LLAV_DER, 0); }
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(SRParser.DOS_PUNTOS); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(SRParser.DOS_PUNTOS, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSlice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_slice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(LLAV_IZQ);
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL_LIT) | (1L << IDENTIFIER) | (1L << NUM_INT) | (1L << NUM_DOUBLE) | (1L << STRING_LIT) | (1L << PAR_IZQ) | (1L << LLAV_IZQ))) != 0)) {
					{
					setState(209);
					expression(0);
					}
				}

				setState(212);
				match(DOS_PUNTOS);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL_LIT) | (1L << IDENTIFIER) | (1L << NUM_INT) | (1L << NUM_DOUBLE) | (1L << STRING_LIT) | (1L << PAR_IZQ) | (1L << LLAV_IZQ))) != 0)) {
					{
					setState(213);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL_LIT) | (1L << IDENTIFIER) | (1L << NUM_INT) | (1L << NUM_DOUBLE) | (1L << STRING_LIT) | (1L << PAR_IZQ) | (1L << LLAV_IZQ))) != 0)) {
					{
					setState(216);
					expression(0);
					}
				}

				setState(219);
				match(DOS_PUNTOS);
				setState(220);
				expression(0);
				setState(221);
				match(DOS_PUNTOS);
				setState(222);
				expression(0);
				}
				break;
			}
			setState(226);
			match(LLAV_DER);
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

	public static class TypeAssertionContext extends ParserRuleContext {
		public TerminalNode PUNTO() { return getToken(SRParser.PUNTO, 0); }
		public TerminalNode PAR_IZQ() { return getToken(SRParser.PAR_IZQ, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(SRParser.PAR_DER, 0); }
		public TypeAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterTypeAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitTypeAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitTypeAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAssertionContext typeAssertion() throws RecognitionException {
		TypeAssertionContext _localctx = new TypeAssertionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(PUNTO);
			setState(229);
			match(PAR_IZQ);
			setState(230);
			type_();
			setState(231);
			match(PAR_DER);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(SRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SRParser.COMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			expression(0);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(234);
				match(COMA);
				setState(235);
				expression(0);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Expr_relContext extends ParserRuleContext {
		public Expr_asigContext expr_asig() {
			return getRuleContext(Expr_asigContext.class,0);
		}
		public Expr_relContext expr_rel() {
			return getRuleContext(Expr_relContext.class,0);
		}
		public TerminalNode OP_REL() { return getToken(SRParser.OP_REL, 0); }
		public Expr_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExpr_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExpr_rel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExpr_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_relContext expr_rel() throws RecognitionException {
		return expr_rel(0);
	}

	private Expr_relContext expr_rel(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_relContext _localctx = new Expr_relContext(_ctx, _parentState);
		Expr_relContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr_rel, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(242);
			expr_asig(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_relContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_rel);
					setState(244);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(245);
					match(OP_REL);
					setState(246);
					expr_asig(0);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class Expr_asigContext extends ParserRuleContext {
		public Expr_sumaContext expr_suma() {
			return getRuleContext(Expr_sumaContext.class,0);
		}
		public Expr_asigContext expr_asig() {
			return getRuleContext(Expr_asigContext.class,0);
		}
		public TerminalNode OP_ASIG() { return getToken(SRParser.OP_ASIG, 0); }
		public Expr_asigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExpr_asig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExpr_asig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExpr_asig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_asigContext expr_asig() throws RecognitionException {
		return expr_asig(0);
	}

	private Expr_asigContext expr_asig(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_asigContext _localctx = new Expr_asigContext(_ctx, _parentState);
		Expr_asigContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr_asig, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(253);
			expr_suma(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_asigContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_asig);
					setState(255);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(256);
					match(OP_ASIG);
					setState(257);
					expr_suma(0);
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class Expr_sumaContext extends ParserRuleContext {
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_sumaContext expr_suma() {
			return getRuleContext(Expr_sumaContext.class,0);
		}
		public TerminalNode OP_SUMA() { return getToken(SRParser.OP_SUMA, 0); }
		public Expr_sumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExpr_suma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExpr_suma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExpr_suma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_sumaContext expr_suma() throws RecognitionException {
		return expr_suma(0);
	}

	private Expr_sumaContext expr_suma(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_sumaContext _localctx = new Expr_sumaContext(_ctx, _parentState);
		Expr_sumaContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr_suma, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(264);
			expr_mult(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_sumaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_suma);
					setState(266);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(267);
					match(OP_SUMA);
					setState(268);
					expr_mult(0);
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class Expr_multContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public TerminalNode OP_MULT() { return getToken(SRParser.OP_MULT, 0); }
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExpr_mult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExpr_mult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		return expr_mult(0);
	}

	private Expr_multContext expr_mult(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_multContext _localctx = new Expr_multContext(_ctx, _parentState);
		Expr_multContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr_mult, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(275);
			termino();
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_multContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_mult);
					setState(277);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(278);
					match(OP_MULT);
					setState(279);
					termino();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class TerminoContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(SRParser.PAR_IZQ, 0); }
		public Expr_relContext expr_rel() {
			return getRuleContext(Expr_relContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(SRParser.PAR_DER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SRParser.IDENTIFIER, 0); }
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_termino);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				valor();
				}
				break;
			case PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(PAR_IZQ);
				setState(287);
				expr_rel(0);
				setState(288);
				match(PAR_DER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(IDENTIFIER);
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(SRParser.NUM_INT, 0); }
		public TerminalNode NUM_DOUBLE() { return getToken(SRParser.NUM_DOUBLE, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !(_la==NUM_INT || _la==NUM_DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 12:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		case 24:
			return expr_rel_sempred((Expr_relContext)_localctx, predIndex);
		case 25:
			return expr_asig_sempred((Expr_asigContext)_localctx, predIndex);
		case 26:
			return expr_suma_sempred((Expr_sumaContext)_localctx, predIndex);
		case 27:
			return expr_mult_sempred((Expr_multContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_rel_sempred(Expr_relContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_asig_sempred(Expr_asigContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_suma_sempred(Expr_sumaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_mult_sempred(Expr_multContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u012a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\5"+
		"\2A\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4"+
		"\3\5\3\5\5\5T\n\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\5\3\5\7\5`\n\5\f"+
		"\5\16\5c\13\5\5\5e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\5\7q\n"+
		"\7\3\b\3\b\5\bu\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\7\f\u0084\n\f\f\f\16\f\u0087\13\f\3\r\3\r\3\r\5\r\u008c\n\r\3\r"+
		"\3\r\3\r\7\r\u0091\n\r\f\r\16\r\u0094\13\r\3\16\3\16\3\16\5\16\u0099\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a1\n\16\7\16\u00a3\n\16\f\16"+
		"\16\16\u00a6\13\16\3\17\3\17\3\17\3\17\5\17\u00ac\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b7\n\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00c9\n\25"+
		"\3\25\3\25\5\25\u00cd\n\25\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00d5\n"+
		"\27\3\27\3\27\5\27\u00d9\n\27\3\27\5\27\u00dc\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u00e3\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\7\31\u00ef\n\31\f\31\16\31\u00f2\13\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u00fa\n\32\f\32\16\32\u00fd\13\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u0105\n\33\f\33\16\33\u0108\13\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u0110\n\34\f\34\16\34\u0113\13\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u011b\n\35\f\35\16\35\u011e\13\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0126\n\36\3\37\3\37\3\37\2\b\30\32\62\64\668 \2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\4\4\2\24\24\26\30\3\2"+
		"\26\27\2\u012f\2@\3\2\2\2\4B\3\2\2\2\6N\3\2\2\2\bQ\3\2\2\2\nl\3\2\2\2"+
		"\fp\3\2\2\2\16t\3\2\2\2\20v\3\2\2\2\22z\3\2\2\2\24|\3\2\2\2\26\u0080\3"+
		"\2\2\2\30\u008b\3\2\2\2\32\u0098\3\2\2\2\34\u00a7\3\2\2\2\36\u00b6\3\2"+
		"\2\2 \u00b8\3\2\2\2\"\u00ba\3\2\2\2$\u00bc\3\2\2\2&\u00c0\3\2\2\2(\u00cc"+
		"\3\2\2\2*\u00ce\3\2\2\2,\u00d2\3\2\2\2.\u00e6\3\2\2\2\60\u00eb\3\2\2\2"+
		"\62\u00f3\3\2\2\2\64\u00fe\3\2\2\2\66\u0109\3\2\2\28\u0114\3\2\2\2:\u0125"+
		"\3\2\2\2<\u0127\3\2\2\2>A\5\4\3\2?A\5\6\4\2@>\3\2\2\2@?\3\2\2\2A\3\3\2"+
		"\2\2BC\7\3\2\2CL\7\25\2\2DE\7\36\2\2EH\5\n\6\2FG\7#\2\2GI\5\30\r\2HF\3"+
		"\2\2\2HI\3\2\2\2IM\3\2\2\2JK\7#\2\2KM\5\30\r\2LD\3\2\2\2LJ\3\2\2\2M\5"+
		"\3\2\2\2NO\7\23\2\2OP\5\b\5\2P\7\3\2\2\2Qd\5\26\f\2RT\5,\27\2SR\3\2\2"+
		"\2ST\3\2\2\2TU\3\2\2\2UV\7\36\2\2VY\5\n\6\2WX\7#\2\2XZ\5\30\r\2YW\3\2"+
		"\2\2YZ\3\2\2\2Ze\3\2\2\2[\\\7#\2\2\\a\5\30\r\2]^\7\37\2\2^`\5\b\5\2_]"+
		"\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2dS\3\2\2\2d"+
		"[\3\2\2\2e\t\3\2\2\2fm\5\f\7\2gm\5\16\b\2hi\7\32\2\2ij\5\n\6\2jk\7\33"+
		"\2\2km\3\2\2\2lf\3\2\2\2lg\3\2\2\2lh\3\2\2\2m\13\3\2\2\2nq\7\25\2\2oq"+
		"\5$\23\2pn\3\2\2\2po\3\2\2\2q\r\3\2\2\2ru\5\20\t\2su\5\24\13\2tr\3\2\2"+
		"\2ts\3\2\2\2u\17\3\2\2\2vw\7\34\2\2wx\5\22\n\2xy\7\35\2\2y\21\3\2\2\2"+
		"z{\5\30\r\2{\23\3\2\2\2|}\7\34\2\2}~\7\35\2\2~\177\5\n\6\2\177\25\3\2"+
		"\2\2\u0080\u0085\7\25\2\2\u0081\u0082\7\37\2\2\u0082\u0084\7\25\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\27\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\r\1\2\u0089\u008c"+
		"\5\32\16\2\u008a\u008c\5\62\32\2\u008b\u0088\3\2\2\2\u008b\u008a\3\2\2"+
		"\2\u008c\u0092\3\2\2\2\u008d\u008e\f\3\2\2\u008e\u008f\7\"\2\2\u008f\u0091"+
		"\5\30\r\4\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\31\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096"+
		"\b\16\1\2\u0096\u0099\5\36\20\2\u0097\u0099\5\34\17\2\u0098\u0095\3\2"+
		"\2\2\u0098\u0097\3\2\2\2\u0099\u00a4\3\2\2\2\u009a\u00a0\f\3\2\2\u009b"+
		"\u009c\7\31\2\2\u009c\u00a1\7\25\2\2\u009d\u00a1\5*\26\2\u009e\u00a1\5"+
		",\27\2\u009f\u00a1\5.\30\2\u00a0\u009b\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009a\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\33\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\5\n\6\2\u00a8\u00a9\7\32\2"+
		"\2\u00a9\u00ab\5\30\r\2\u00aa\u00ac\7\37\2\2\u00ab\u00aa\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\33\2\2\u00ae\35\3\2\2"+
		"\2\u00af\u00b7\5 \21\2\u00b0\u00b7\7\25\2\2\u00b1\u00b7\5&\24\2\u00b2"+
		"\u00b3\7\32\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5\7\33\2\2\u00b5\u00b7"+
		"\3\2\2\2\u00b6\u00af\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6"+
		"\u00b2\3\2\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\5\"\22\2\u00b9!\3\2\2\2\u00ba"+
		"\u00bb\t\2\2\2\u00bb#\3\2\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00be\7\31\2"+
		"\2\u00be\u00bf\7\25\2\2\u00bf%\3\2\2\2\u00c0\u00c1\5(\25\2\u00c1\u00c2"+
		"\7\31\2\2\u00c2\u00c3\7\25\2\2\u00c3\'\3\2\2\2\u00c4\u00cd\5\f\7\2\u00c5"+
		"\u00c8\7\32\2\2\u00c6\u00c9\5\f\7\2\u00c7\u00c9\5(\25\2\u00c8\u00c6\3"+
		"\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\33\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c5\3\2\2\2\u00cd)\3\2\2\2"+
		"\u00ce\u00cf\7\34\2\2\u00cf\u00d0\5\30\r\2\u00d0\u00d1\7\35\2\2\u00d1"+
		"+\3\2\2\2\u00d2\u00e2\7\34\2\2\u00d3\u00d5\5\30\r\2\u00d4\u00d3\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7\36\2\2\u00d7"+
		"\u00d9\5\30\r\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00e3\3"+
		"\2\2\2\u00da\u00dc\5\30\r\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\7\36\2\2\u00de\u00df\5\30\r\2\u00df\u00e0\7"+
		"\36\2\2\u00e0\u00e1\5\30\r\2\u00e1\u00e3\3\2\2\2\u00e2\u00d4\3\2\2\2\u00e2"+
		"\u00db\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\35\2\2\u00e5-\3\2\2\2"+
		"\u00e6\u00e7\7\31\2\2\u00e7\u00e8\7\32\2\2\u00e8\u00e9\5\n\6\2\u00e9\u00ea"+
		"\7\33\2\2\u00ea/\3\2\2\2\u00eb\u00f0\5\30\r\2\u00ec\u00ed\7\37\2\2\u00ed"+
		"\u00ef\5\30\r\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3"+
		"\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\61\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\b\32\1\2\u00f4\u00f5\5\64\33\2\u00f5\u00fb\3\2\2\2\u00f6\u00f7"+
		"\f\4\2\2\u00f7\u00f8\7$\2\2\u00f8\u00fa\5\64\33\2\u00f9\u00f6\3\2\2\2"+
		"\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\63"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\b\33\1\2\u00ff\u0100\5\66\34"+
		"\2\u0100\u0106\3\2\2\2\u0101\u0102\f\4\2\2\u0102\u0103\7#\2\2\u0103\u0105"+
		"\5\66\34\2\u0104\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0107\65\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a"+
		"\b\34\1\2\u010a\u010b\58\35\2\u010b\u0111\3\2\2\2\u010c\u010d\f\4\2\2"+
		"\u010d\u010e\7!\2\2\u010e\u0110\58\35\2\u010f\u010c\3\2\2\2\u0110\u0113"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\67\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0115\b\35\1\2\u0115\u0116\5:\36\2\u0116\u011c\3"+
		"\2\2\2\u0117\u0118\f\4\2\2\u0118\u0119\7\"\2\2\u0119\u011b\5:\36\2\u011a"+
		"\u0117\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d9\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0126\5<\37\2\u0120\u0121"+
		"\7\32\2\2\u0121\u0122\5\62\32\2\u0122\u0123\7\33\2\2\u0123\u0126\3\2\2"+
		"\2\u0124\u0126\7\25\2\2\u0125\u011f\3\2\2\2\u0125\u0120\3\2\2\2\u0125"+
		"\u0124\3\2\2\2\u0126;\3\2\2\2\u0127\u0128\t\3\2\2\u0128=\3\2\2\2 @HLS"+
		"Yadlpt\u0085\u008b\u0092\u0098\u00a0\u00a4\u00ab\u00b6\u00c8\u00cc\u00d4"+
		"\u00d8\u00db\u00e2\u00f0\u00fb\u0106\u0111\u011c\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}