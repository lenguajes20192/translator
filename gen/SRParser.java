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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, RESOURCE=6, CONST=7, FUNC=8, CASE=9, 
		ELSE=10, SWITCH=11, IF=12, FI=13, TYPE=14, CONTINUE=15, FA=16, AF=17, 
		IMPORT=18, RETURN=19, VAR=20, END=21, TO=22, WRITE=23, READ=24, PROCEDURE=25, 
		OP=26, NULL_LIT=27, IDENTIFIER=28, NUM_INT=29, NUM_DOUBLE=30, STRING_LIT=31, 
		LOGICAL=32, PUNTO=33, PAR_IZQ=34, PAR_DER=35, LLAV_IZQ=36, LLAV_DER=37, 
		DOS_PUNTOS=38, COMA=39, ELLIPSIS=40, EJECUTA=41, OP_SUMA=42, OP_MULT=43, 
		OP_ASIG=44, OP_REL=45, OP_LOG=46, WS=47, COMMENT=48;
	public static final int
		RULE_sourceFile = 0, RULE_resourceStmt = 1, RULE_resource = 2, RULE_importDecl = 3, 
		RULE_functionDecl = 4, RULE_methodDecl = 5, RULE_receiver = 6, RULE_block = 7, 
		RULE_statementList = 8, RULE_statement = 9, RULE_simpleStmt = 10, RULE_assignment = 11, 
		RULE_expressionStmt = 12, RULE_returnStmt = 13, RULE_ifStmt = 14, RULE_faStmt = 15, 
		RULE_faClause = 16, RULE_faClauseTo = 17, RULE_writeStmt = 18, RULE_write = 19, 
		RULE_readStmt = 20, RULE_read = 21, RULE_procedureStmt = 22, RULE_procedure = 23, 
		RULE_opStmt = 24, RULE_op = 25, RULE_declaration = 26, RULE_constDecl = 27, 
		RULE_varDecl = 28, RULE_varSpec = 29, RULE_type_ = 30, RULE_typeName = 31, 
		RULE_typeLit = 32, RULE_arrayType = 33, RULE_arrayLength = 34, RULE_sliceType = 35, 
		RULE_identifierList = 36, RULE_expression = 37, RULE_primaryExpr = 38, 
		RULE_conversion = 39, RULE_operand = 40, RULE_literal = 41, RULE_basicLit = 42, 
		RULE_functionLit = 43, RULE_functionType = 44, RULE_arguments = 45, RULE_signature = 46, 
		RULE_result = 47, RULE_parameters = 48, RULE_parameterDecl = 49, RULE_qualifiedIdent = 50, 
		RULE_methodExpr = 51, RULE_receiverType = 52, RULE_index = 53, RULE_slice = 54, 
		RULE_typeAssertion = 55, RULE_expressionList = 56, RULE_expr_rel = 57, 
		RULE_expr_asig = 58, RULE_expr_suma = 59, RULE_expr_mult = 60, RULE_termino = 61, 
		RULE_valor = 62, RULE_eos = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "resourceStmt", "resource", "importDecl", "functionDecl", 
			"methodDecl", "receiver", "block", "statementList", "statement", "simpleStmt", 
			"assignment", "expressionStmt", "returnStmt", "ifStmt", "faStmt", "faClause", 
			"faClauseTo", "writeStmt", "write", "readStmt", "read", "procedureStmt", 
			"procedure", "opStmt", "op", "declaration", "constDecl", "varDecl", "varSpec", 
			"type_", "typeName", "typeLit", "arrayType", "arrayLength", "sliceType", 
			"identifierList", "expression", "primaryExpr", "conversion", "operand", 
			"literal", "basicLit", "functionLit", "functionType", "arguments", "signature", 
			"result", "parameters", "parameterDecl", "qualifiedIdent", "methodExpr", 
			"receiverType", "index", "slice", "typeAssertion", "expressionList", 
			"expr_rel", "expr_asig", "expr_suma", "expr_mult", "termino", "valor", 
			"eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'or'", "'|'", "'and'", "'&'", "';'", "'resource'", "'const'", 
			"'func'", "'case'", "'else'", "'switch'", "'if'", "'fi'", "'type'", "'continue'", 
			"'fa'", "'af'", "'import'", null, "'var'", "'end'", "'to'", null, "'read'", 
			null, "'op'", "'null'", null, null, null, null, null, "'.'", "'('", "')'", 
			"'['", "']'", "':'", "','", "'...'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "RESOURCE", "CONST", "FUNC", "CASE", 
			"ELSE", "SWITCH", "IF", "FI", "TYPE", "CONTINUE", "FA", "AF", "IMPORT", 
			"RETURN", "VAR", "END", "TO", "WRITE", "READ", "PROCEDURE", "OP", "NULL_LIT", 
			"IDENTIFIER", "NUM_INT", "NUM_DOUBLE", "STRING_LIT", "LOGICAL", "PUNTO", 
			"PAR_IZQ", "PAR_DER", "LLAV_IZQ", "LLAV_DER", "DOS_PUNTOS", "COMA", "ELLIPSIS", 
			"EJECUTA", "OP_SUMA", "OP_MULT", "OP_ASIG", "OP_REL", "OP_LOG", "WS", 
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

	public static class SourceFileContext extends ParserRuleContext {
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<ResourceStmtContext> resourceStmt() {
			return getRuleContexts(ResourceStmtContext.class);
		}
		public ResourceStmtContext resourceStmt(int i) {
			return getRuleContext(ResourceStmtContext.class,i);
		}
		public List<ImportDeclContext> importDecl() {
			return getRuleContexts(ImportDeclContext.class);
		}
		public ImportDeclContext importDecl(int i) {
			return getRuleContext(ImportDeclContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSourceFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSourceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESOURCE) | (1L << CONST) | (1L << FUNC) | (1L << IF) | (1L << FA) | (1L << IMPORT) | (1L << RETURN) | (1L << VAR) | (1L << WRITE) | (1L << READ) | (1L << PROCEDURE) | (1L << OP) | (1L << NULL_LIT) | (1L << IDENTIFIER) | (1L << NUM_INT) | (1L << NUM_DOUBLE) | (1L << STRING_LIT) | (1L << PAR_IZQ) | (1L << LLAV_IZQ))) != 0)) {
				{
				{
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(128);
					resourceStmt();
					}
					break;
				case 2:
					{
					setState(129);
					importDecl();
					}
					break;
				case 3:
					{
					setState(130);
					declaration();
					}
					break;
				case 4:
					{
					setState(131);
					statementList();
					}
					break;
				}
				setState(134);
				eos();
				}
				}
				setState(140);
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

	public static class ResourceStmtContext extends ParserRuleContext {
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SRParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SRParser.IDENTIFIER, i);
		}
		public SourceFileContext sourceFile() {
			return getRuleContext(SourceFileContext.class,0);
		}
		public TerminalNode END() { return getToken(SRParser.END, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResourceStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterResourceStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitResourceStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitResourceStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceStmtContext resourceStmt() throws RecognitionException {
		ResourceStmtContext _localctx = new ResourceStmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_resourceStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			resource();
			setState(142);
			match(IDENTIFIER);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(143);
				parameters();
				}
				break;
			}
			setState(146);
			sourceFile();
			setState(147);
			match(END);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					match(IDENTIFIER);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode RESOURCE() { return getToken(SRParser.RESOURCE, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(RESOURCE);
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

	public static class ImportDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(SRParser.IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SRParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SRParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMA() { return getTokens(SRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SRParser.COMA, i);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitImportDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitImportDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IMPORT);
			setState(157);
			match(IDENTIFIER);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					match(COMA);
					setState(159);
					match(IDENTIFIER);
					}
					} 
				}
				setState(164);
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
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(SRParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SRParser.IDENTIFIER, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(FUNC);
			setState(166);
			match(IDENTIFIER);
			{
			setState(167);
			signature();
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(168);
				block();
				}
				break;
			}
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

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(SRParser.FUNC, 0); }
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SRParser.IDENTIFIER, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(FUNC);
			setState(172);
			receiver();
			setState(173);
			match(IDENTIFIER);
			{
			setState(174);
			signature();
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(175);
				block();
				}
				break;
			}
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

	public static class ReceiverContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			parameters();
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

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(180);
				statementList();
				}
				break;
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(183);
					statement();
					setState(184);
					eos();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public FaStmtContext faStmt() {
			return getRuleContext(FaStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public ProcedureStmtContext procedureStmt() {
			return getRuleContext(ProcedureStmtContext.class,0);
		}
		public OpStmtContext opStmt() {
			return getRuleContext(OpStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				declaration();
				}
				break;
			case FUNC:
			case NULL_LIT:
			case IDENTIFIER:
			case NUM_INT:
			case NUM_DOUBLE:
			case STRING_LIT:
			case PAR_IZQ:
			case LLAV_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				simpleStmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				returnStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				ifStmt();
				}
				break;
			case FA:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				faStmt();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				writeStmt();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				readStmt();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				procedureStmt();
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 9);
				{
				setState(198);
				opStmt();
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

	public static class SimpleStmtContext extends ParserRuleContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSimpleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSimpleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleStmt);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				expressionStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				assignment();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_ASIG() { return getToken(SRParser.OP_ASIG, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			expression(0);
			setState(206);
			match(OP_ASIG);
			setState(207);
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

	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExpressionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExpressionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SRParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(RETURN);
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(212);
				expressionList();
				}
				break;
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SRParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> EJECUTA() { return getTokens(SRParser.EJECUTA); }
		public TerminalNode EJECUTA(int i) {
			return getToken(SRParser.EJECUTA, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode FI() { return getToken(SRParser.FI, 0); }
		public List<TerminalNode> ELSE() { return getTokens(SRParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(SRParser.ELSE, i);
		}
		public List<IfStmtContext> ifStmt() {
			return getRuleContexts(IfStmtContext.class);
		}
		public IfStmtContext ifStmt(int i) {
			return getRuleContext(IfStmtContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IF);
			setState(216);
			expression(0);
			setState(217);
			match(EJECUTA);
			setState(218);
			block();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(219);
				match(ELSE);
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(220);
					ifStmt();
					}
					break;
				case EJECUTA:
					{
					setState(221);
					match(EJECUTA);
					setState(222);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(FI);
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

	public static class FaStmtContext extends ParserRuleContext {
		public TerminalNode FA() { return getToken(SRParser.FA, 0); }
		public List<FaClauseContext> faClause() {
			return getRuleContexts(FaClauseContext.class);
		}
		public FaClauseContext faClause(int i) {
			return getRuleContext(FaClauseContext.class,i);
		}
		public TerminalNode EJECUTA() { return getToken(SRParser.EJECUTA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode AF() { return getToken(SRParser.AF, 0); }
		public List<TerminalNode> COMA() { return getTokens(SRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SRParser.COMA, i);
		}
		public FaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterFaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitFaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitFaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaStmtContext faStmt() throws RecognitionException {
		FaStmtContext _localctx = new FaStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_faStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(FA);
			setState(233);
			faClause();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(234);
				match(COMA);
				setState(235);
				faClause();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(EJECUTA);
			setState(242);
			block();
			setState(243);
			match(AF);
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

	public static class FaClauseContext extends ParserRuleContext {
		public FaClauseToContext faClauseTo() {
			return getRuleContext(FaClauseToContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public FaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterFaClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitFaClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitFaClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaClauseContext faClause() throws RecognitionException {
		FaClauseContext _localctx = new FaClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_faClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << NULL_LIT) | (1L << IDENTIFIER) | (1L << NUM_INT) | (1L << NUM_DOUBLE) | (1L << STRING_LIT) | (1L << PAR_IZQ) | (1L << LLAV_IZQ))) != 0)) {
				{
				setState(245);
				simpleStmt();
				}
			}

			setState(248);
			faClauseTo();
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

	public static class FaClauseToContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(SRParser.TO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FaClauseToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faClauseTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterFaClauseTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitFaClauseTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitFaClauseTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaClauseToContext faClauseTo() throws RecognitionException {
		FaClauseToContext _localctx = new FaClauseToContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_faClauseTo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(TO);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << NULL_LIT) | (1L << IDENTIFIER) | (1L << NUM_INT) | (1L << NUM_DOUBLE) | (1L << STRING_LIT) | (1L << PAR_IZQ) | (1L << LLAV_IZQ))) != 0)) {
				{
				setState(251);
				expression(0);
				}
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

	public static class WriteStmtContext extends ParserRuleContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			write();
			setState(255);
			arguments();
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(SRParser.WRITE, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(WRITE);
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

	public static class ReadStmtContext extends ParserRuleContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_readStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			read();
			setState(260);
			arguments();
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(SRParser.READ, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(READ);
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

	public static class ProcedureStmtContext extends ParserRuleContext {
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SRParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SRParser.IDENTIFIER, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END() { return getToken(SRParser.END, 0); }
		public List<TerminalNode> RETURN() { return getTokens(SRParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(SRParser.RETURN, i);
		}
		public List<VarSpecContext> varSpec() {
			return getRuleContexts(VarSpecContext.class);
		}
		public VarSpecContext varSpec(int i) {
			return getRuleContext(VarSpecContext.class,i);
		}
		public ProcedureStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterProcedureStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitProcedureStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitProcedureStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureStmtContext procedureStmt() throws RecognitionException {
		ProcedureStmtContext _localctx = new ProcedureStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_procedureStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			procedure();
			setState(265);
			match(IDENTIFIER);
			setState(266);
			parameters();
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					match(RETURN);
					setState(268);
					varSpec();
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(274);
			statementList();
			setState(275);
			match(END);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					match(IDENTIFIER);
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(SRParser.PROCEDURE, 0); }
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(PROCEDURE);
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

	public static class OpStmtContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public List<VarSpecContext> varSpec() {
			return getRuleContexts(VarSpecContext.class);
		}
		public VarSpecContext varSpec(int i) {
			return getRuleContext(VarSpecContext.class,i);
		}
		public List<TerminalNode> RETURN() { return getTokens(SRParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(SRParser.RETURN, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(SRParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public OpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterOpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitOpStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitOpStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpStmtContext opStmt() throws RecognitionException {
		OpStmtContext _localctx = new OpStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			op();
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(285);
				varSpec();
				}
				break;
			case 2:
				{
				{
				setState(286);
				match(IDENTIFIER);
				setState(287);
				parameters();
				}
				}
				break;
			}
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					match(RETURN);
					setState(291);
					varSpec();
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(SRParser.OP, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(OP);
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
		enterRule(_localctx, 52, RULE_declaration);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				constDecl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
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
		enterRule(_localctx, 54, RULE_constDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(CONST);
			setState(304);
			match(IDENTIFIER);
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOS_PUNTOS:
				{
				{
				setState(305);
				match(DOS_PUNTOS);
				setState(306);
				type_();
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(307);
					match(OP_ASIG);
					setState(308);
					expression(0);
					}
					break;
				}
				}
				}
				break;
			case OP_ASIG:
				{
				setState(311);
				match(OP_ASIG);
				setState(312);
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
		enterRule(_localctx, 56, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(VAR);
			setState(316);
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
		enterRule(_localctx, 58, RULE_varSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			identifierList();
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLAV_IZQ:
			case DOS_PUNTOS:
				{
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LLAV_IZQ) {
					{
					setState(319);
					slice();
					}
				}

				setState(322);
				match(DOS_PUNTOS);
				setState(323);
				type_();
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(324);
					match(OP_ASIG);
					setState(325);
					expression(0);
					}
					break;
				}
				}
				break;
			case OP_ASIG:
				{
				setState(328);
				match(OP_ASIG);
				setState(329);
				expression(0);
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(330);
						match(COMA);
						setState(331);
						varSpec();
						}
						} 
					}
					setState(336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 60, RULE_type_);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				typeName();
				}
				break;
			case FUNC:
			case LLAV_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				typeLit();
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
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
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
		enterRule(_localctx, 62, RULE_typeName);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				qualifiedIdent();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(IDENTIFIER);
				setState(346);
				arrayType();
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
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
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
		enterRule(_localctx, 64, RULE_typeLit);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				sliceType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				functionType();
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
		enterRule(_localctx, 66, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(LLAV_IZQ);
			setState(355);
			arrayLength();
			setState(356);
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
		enterRule(_localctx, 68, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
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
		enterRule(_localctx, 70, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(LLAV_IZQ);
			setState(361);
			match(LLAV_DER);
			setState(362);
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
		enterRule(_localctx, 72, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(IDENTIFIER);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(365);
				match(COMA);
				setState(366);
				match(IDENTIFIER);
				}
				}
				setState(371);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(373);
				primaryExpr(0);
				}
				break;
			case 2:
				{
				setState(374);
				expr_rel(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(377);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(378);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(379);
					expression(2);
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(386);
				operand();
				}
				break;
			case 2:
				{
				setState(387);
				conversion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(390);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(397);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(391);
						match(PUNTO);
						setState(392);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(393);
						index();
						}
						break;
					case 3:
						{
						setState(394);
						slice();
						}
						break;
					case 4:
						{
						setState(395);
						typeAssertion();
						}
						break;
					case 5:
						{
						setState(396);
						arguments();
						}
						break;
					}
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 78, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			type_();
			setState(405);
			match(PAR_IZQ);
			setState(406);
			expression(0);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(407);
				match(COMA);
				}
			}

			setState(410);
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
		enterRule(_localctx, 80, RULE_operand);
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				methodExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				match(PAR_IZQ);
				setState(416);
				expression(0);
				setState(417);
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
		public FunctionLitContext functionLit() {
			return getRuleContext(FunctionLitContext.class,0);
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
		enterRule(_localctx, 82, RULE_literal);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL_LIT:
			case NUM_INT:
			case NUM_DOUBLE:
			case STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				basicLit();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				functionLit();
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
		enterRule(_localctx, 84, RULE_basicLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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

	public static class FunctionLitContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(SRParser.FUNC, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterFunctionLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitFunctionLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitFunctionLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLitContext functionLit() throws RecognitionException {
		FunctionLitContext _localctx = new FunctionLitContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(FUNC);
			setState(428);
			signature();
			setState(429);
			block();
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(SRParser.FUNC, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(FUNC);
			setState(432);
			signature();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode PAR_IZQ() { return getToken(SRParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(SRParser.PAR_DER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(SRParser.ELLIPSIS, 0); }
		public List<TerminalNode> COMA() { return getTokens(SRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SRParser.COMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(PAR_IZQ);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << NULL_LIT) | (1L << IDENTIFIER) | (1L << NUM_INT) | (1L << NUM_DOUBLE) | (1L << STRING_LIT) | (1L << PAR_IZQ) | (1L << LLAV_IZQ))) != 0)) {
				{
				setState(441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(435);
					expressionList();
					}
					break;
				case 2:
					{
					setState(436);
					type_();
					setState(439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(437);
						match(COMA);
						setState(438);
						expressionList();
						}
						break;
					}
					}
					break;
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELLIPSIS) {
					{
					setState(443);
					match(ELLIPSIS);
					}
				}

				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(446);
					match(COMA);
					}
				}

				}
			}

			setState(451);
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

	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_signature);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				parameters();
				setState(454);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				parameters();
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

	public static class ResultContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_result);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				parameters();
				}
				break;
			case FUNC:
			case IDENTIFIER:
			case LLAV_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				type_();
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode PAR_IZQ() { return getToken(SRParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(SRParser.PAR_DER, 0); }
		public List<ParameterDeclContext> parameterDecl() {
			return getRuleContexts(ParameterDeclContext.class);
		}
		public ParameterDeclContext parameterDecl(int i) {
			return getRuleContext(ParameterDeclContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(SRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SRParser.COMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(PAR_IZQ);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << IDENTIFIER) | (1L << LLAV_IZQ) | (1L << DOS_PUNTOS))) != 0)) {
				{
				setState(464);
				parameterDecl();
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(465);
						match(COMA);
						setState(466);
						parameterDecl();
						}
						} 
					}
					setState(471);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(472);
					match(COMA);
					}
				}

				}
			}

			setState(477);
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

	public static class ParameterDeclContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(SRParser.DOS_PUNTOS, 0); }
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitParameterDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitParameterDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_parameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(479);
				identifierList();
				}
				break;
			}
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOS_PUNTOS) {
				{
				setState(482);
				match(DOS_PUNTOS);
				}
			}

			setState(485);
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
		enterRule(_localctx, 100, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(IDENTIFIER);
			setState(488);
			match(PUNTO);
			setState(489);
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
		enterRule(_localctx, 102, RULE_methodExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			receiverType();
			setState(492);
			match(PUNTO);
			setState(493);
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
		enterRule(_localctx, 104, RULE_receiverType);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				typeName();
				}
				break;
			case PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(PAR_IZQ);
				setState(499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(497);
					typeName();
					}
					break;
				case 2:
					{
					setState(498);
					receiverType();
					}
					break;
				}
				setState(501);
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
		enterRule(_localctx, 106, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(LLAV_IZQ);
			setState(506);
			expression(0);
			setState(507);
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
		enterRule(_localctx, 108, RULE_slice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(LLAV_IZQ);
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << NULL_LIT) | (1L << IDENTIFIER) | (1L << NUM_INT) | (1L << NUM_DOUBLE) | (1L << STRING_LIT) | (1L << PAR_IZQ) | (1L << LLAV_IZQ))) != 0)) {
					{
					setState(510);
					expression(0);
					}
				}

				setState(513);
				match(DOS_PUNTOS);
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << NULL_LIT) | (1L << IDENTIFIER) | (1L << NUM_INT) | (1L << NUM_DOUBLE) | (1L << STRING_LIT) | (1L << PAR_IZQ) | (1L << LLAV_IZQ))) != 0)) {
					{
					setState(514);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << NULL_LIT) | (1L << IDENTIFIER) | (1L << NUM_INT) | (1L << NUM_DOUBLE) | (1L << STRING_LIT) | (1L << PAR_IZQ) | (1L << LLAV_IZQ))) != 0)) {
					{
					setState(517);
					expression(0);
					}
				}

				setState(520);
				match(DOS_PUNTOS);
				setState(521);
				expression(0);
				setState(522);
				match(DOS_PUNTOS);
				setState(523);
				expression(0);
				}
				break;
			}
			setState(527);
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
		enterRule(_localctx, 110, RULE_typeAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(PUNTO);
			setState(530);
			match(PAR_IZQ);
			setState(531);
			type_();
			setState(532);
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
		enterRule(_localctx, 112, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			expression(0);
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(535);
					match(COMA);
					setState(536);
					expression(0);
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expr_rel, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(543);
			expr_asig(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_relContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_rel);
					setState(545);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(546);
					match(OP_REL);
					setState(547);
					expr_asig(0);
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_expr_asig, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(554);
			expr_suma(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_asigContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_asig);
					setState(556);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(557);
					match(OP_ASIG);
					setState(558);
					expr_suma(0);
					}
					} 
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_expr_suma, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(565);
			expr_mult(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_sumaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_suma);
					setState(567);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(568);
					match(OP_SUMA);
					setState(569);
					expr_mult(0);
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_expr_mult, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(576);
			termino();
			}
			_ctx.stop = _input.LT(-1);
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_multContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_mult);
					setState(578);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(579);
					match(OP_MULT);
					setState(580);
					termino();
					}
					} 
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
		enterRule(_localctx, 122, RULE_termino);
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case NUM_INT:
			case NUM_DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				valor();
				}
				break;
			case PAR_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(PAR_IZQ);
				setState(588);
				expr_rel(0);
				setState(589);
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SRParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 124, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUM_INT) | (1L << NUM_DOUBLE))) != 0)) ) {
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

	public static class EosContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SRParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_eos);
		try {
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(598);
				if (!(checkPreviousTokenText(""))) throw new FailedPredicateException(this, "checkPreviousTokenText(\"\")");
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 37:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 38:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		case 57:
			return expr_rel_sempred((Expr_relContext)_localctx, predIndex);
		case 58:
			return expr_asig_sempred((Expr_asigContext)_localctx, predIndex);
		case 59:
			return expr_suma_sempred((Expr_sumaContext)_localctx, predIndex);
		case 60:
			return expr_mult_sempred((Expr_multContext)_localctx, predIndex);
		case 63:
			return eos_sempred((EosContext)_localctx, predIndex);
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
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return lineTerminatorAhead();
		case 7:
			return checkPreviousTokenText("");
		}
		return true;
	}

	private boolean lineTerminatorAhead() {
		// Get the token ahead of the current index.
		int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;

		if (possibleIndexEosToken == -1)
		{
			return true;
		}

		Token ahead = _input.get(possibleIndexEosToken);
		if (ahead.getChannel() != Lexer.HIDDEN) {
			// We're only interested in tokens on the HIDDEN channel.
			return false;
		}

		if (ahead.getType() == SRLexer.WS) {
			// There is definitely a line terminator ahead.
			return true;
		}

		if (ahead.getType() == SRLexer.WS) {
			// Get the token ahead of the current whitespaces.
			possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 2;
			ahead = _input.get(possibleIndexEosToken);
		}

		// Get the token's text and type.
		String text = ahead.getText();
		int type = ahead.getType();

		// Check if the token is, or contains a line terminator.
		return (type == SRLexer.COMMENT && (text.contains("\r") || text.contains("\n"))) ||
				(type == SRLexer.WS);
	}

	private boolean checkPreviousTokenText(String text)
	{
		BufferedTokenStream stream = (BufferedTokenStream)_input;
		String prevTokenText = stream.LT(1).getText();

		if (prevTokenText == null)
			return false;

		return prevTokenText.equals(text);
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u025c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\5\2\u0087\n\2\3\2\3\2\7\2\u008b"+
		"\n\2\f\2\16\2\u008e\13\2\3\3\3\3\3\3\5\3\u0093\n\3\3\3\3\3\3\3\7\3\u0098"+
		"\n\3\f\3\16\3\u009b\13\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00a3\n\5\f\5\16"+
		"\5\u00a6\13\5\3\6\3\6\3\6\3\6\5\6\u00ac\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00b3"+
		"\n\7\3\b\3\b\3\t\5\t\u00b8\n\t\3\n\3\n\3\n\6\n\u00bd\n\n\r\n\16\n\u00be"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ca\n\13\3\f\3\f"+
		"\5\f\u00ce\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u00d8\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e2\n\20\7\20\u00e4\n\20\f"+
		"\20\16\20\u00e7\13\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00ef\n\21\f"+
		"\21\16\21\u00f2\13\21\3\21\3\21\3\21\3\21\3\22\5\22\u00f9\n\22\3\22\3"+
		"\22\3\23\3\23\5\23\u00ff\n\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u0110\n\30\f\30\16\30\u0113\13"+
		"\30\3\30\3\30\3\30\7\30\u0118\n\30\f\30\16\30\u011b\13\30\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\5\32\u0123\n\32\3\32\3\32\7\32\u0127\n\32\f\32\16\32"+
		"\u012a\13\32\3\33\3\33\3\34\3\34\5\34\u0130\n\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u0138\n\35\3\35\3\35\5\35\u013c\n\35\3\36\3\36\3\36\3\37"+
		"\3\37\5\37\u0143\n\37\3\37\3\37\3\37\3\37\5\37\u0149\n\37\3\37\3\37\3"+
		"\37\3\37\7\37\u014f\n\37\f\37\16\37\u0152\13\37\5\37\u0154\n\37\3 \3 "+
		"\5 \u0158\n \3!\3!\3!\3!\5!\u015e\n!\3\"\3\"\3\"\5\"\u0163\n\"\3#\3#\3"+
		"#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\7&\u0172\n&\f&\16&\u0175\13&\3\'\3\'\3"+
		"\'\5\'\u017a\n\'\3\'\3\'\3\'\7\'\u017f\n\'\f\'\16\'\u0182\13\'\3(\3(\3"+
		"(\5(\u0187\n(\3(\3(\3(\3(\3(\3(\3(\5(\u0190\n(\7(\u0192\n(\f(\16(\u0195"+
		"\13(\3)\3)\3)\3)\5)\u019b\n)\3)\3)\3*\3*\3*\3*\3*\3*\3*\5*\u01a6\n*\3"+
		"+\3+\5+\u01aa\n+\3,\3,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\5/\u01ba\n"+
		"/\5/\u01bc\n/\3/\5/\u01bf\n/\3/\5/\u01c2\n/\5/\u01c4\n/\3/\3/\3\60\3\60"+
		"\3\60\3\60\5\60\u01cc\n\60\3\61\3\61\5\61\u01d0\n\61\3\62\3\62\3\62\3"+
		"\62\7\62\u01d6\n\62\f\62\16\62\u01d9\13\62\3\62\5\62\u01dc\n\62\5\62\u01de"+
		"\n\62\3\62\3\62\3\63\5\63\u01e3\n\63\3\63\5\63\u01e6\n\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u01f6"+
		"\n\66\3\66\3\66\5\66\u01fa\n\66\3\67\3\67\3\67\3\67\38\38\58\u0202\n8"+
		"\38\38\58\u0206\n8\38\58\u0209\n8\38\38\38\38\38\58\u0210\n8\38\38\39"+
		"\39\39\39\39\3:\3:\3:\7:\u021c\n:\f:\16:\u021f\13:\3;\3;\3;\3;\3;\3;\7"+
		";\u0227\n;\f;\16;\u022a\13;\3<\3<\3<\3<\3<\3<\7<\u0232\n<\f<\16<\u0235"+
		"\13<\3=\3=\3=\3=\3=\3=\7=\u023d\n=\f=\16=\u0240\13=\3>\3>\3>\3>\3>\3>"+
		"\7>\u0248\n>\f>\16>\u024b\13>\3?\3?\3?\3?\3?\5?\u0252\n?\3@\3@\3A\3A\3"+
		"A\3A\5A\u025a\nA\3A\2\bLNtvxzB\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\2\5\3"+
		"\2\3\6\4\2\35\35\37!\3\2\36 \2\u026e\2\u008c\3\2\2\2\4\u008f\3\2\2\2\6"+
		"\u009c\3\2\2\2\b\u009e\3\2\2\2\n\u00a7\3\2\2\2\f\u00ad\3\2\2\2\16\u00b4"+
		"\3\2\2\2\20\u00b7\3\2\2\2\22\u00bc\3\2\2\2\24\u00c9\3\2\2\2\26\u00cd\3"+
		"\2\2\2\30\u00cf\3\2\2\2\32\u00d3\3\2\2\2\34\u00d5\3\2\2\2\36\u00d9\3\2"+
		"\2\2 \u00ea\3\2\2\2\"\u00f8\3\2\2\2$\u00fc\3\2\2\2&\u0100\3\2\2\2(\u0103"+
		"\3\2\2\2*\u0105\3\2\2\2,\u0108\3\2\2\2.\u010a\3\2\2\2\60\u011c\3\2\2\2"+
		"\62\u011e\3\2\2\2\64\u012b\3\2\2\2\66\u012f\3\2\2\28\u0131\3\2\2\2:\u013d"+
		"\3\2\2\2<\u0140\3\2\2\2>\u0157\3\2\2\2@\u015d\3\2\2\2B\u0162\3\2\2\2D"+
		"\u0164\3\2\2\2F\u0168\3\2\2\2H\u016a\3\2\2\2J\u016e\3\2\2\2L\u0179\3\2"+
		"\2\2N\u0186\3\2\2\2P\u0196\3\2\2\2R\u01a5\3\2\2\2T\u01a9\3\2\2\2V\u01ab"+
		"\3\2\2\2X\u01ad\3\2\2\2Z\u01b1\3\2\2\2\\\u01b4\3\2\2\2^\u01cb\3\2\2\2"+
		"`\u01cf\3\2\2\2b\u01d1\3\2\2\2d\u01e2\3\2\2\2f\u01e9\3\2\2\2h\u01ed\3"+
		"\2\2\2j\u01f9\3\2\2\2l\u01fb\3\2\2\2n\u01ff\3\2\2\2p\u0213\3\2\2\2r\u0218"+
		"\3\2\2\2t\u0220\3\2\2\2v\u022b\3\2\2\2x\u0236\3\2\2\2z\u0241\3\2\2\2|"+
		"\u0251\3\2\2\2~\u0253\3\2\2\2\u0080\u0259\3\2\2\2\u0082\u0087\5\4\3\2"+
		"\u0083\u0087\5\b\5\2\u0084\u0087\5\66\34\2\u0085\u0087\5\22\n\2\u0086"+
		"\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5\u0080A\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0086\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\3\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\5\6\4\2\u0090\u0092"+
		"\7\36\2\2\u0091\u0093\5b\62\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0095\5\2\2\2\u0095\u0099\7\27\2\2\u0096\u0098"+
		"\7\36\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\5\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7"+
		"\b\2\2\u009d\7\3\2\2\2\u009e\u009f\7\24\2\2\u009f\u00a4\7\36\2\2\u00a0"+
		"\u00a1\7)\2\2\u00a1\u00a3\7\36\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\t\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a8\7\n\2\2\u00a8\u00a9\7\36\2\2\u00a9\u00ab\5^\60\2"+
		"\u00aa\u00ac\5\20\t\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\13"+
		"\3\2\2\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\5\16\b\2\u00af\u00b0\7\36\2\2"+
		"\u00b0\u00b2\5^\60\2\u00b1\u00b3\5\20\t\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\r\3\2\2\2\u00b4\u00b5\5b\62\2\u00b5\17\3\2\2\2\u00b6\u00b8"+
		"\5\22\n\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\21\3\2\2\2\u00b9"+
		"\u00ba\5\24\13\2\u00ba\u00bb\5\u0080A\2\u00bb\u00bd\3\2\2\2\u00bc\u00b9"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\23\3\2\2\2\u00c0\u00ca\5\66\34\2\u00c1\u00ca\5\26\f\2\u00c2\u00ca\5\34"+
		"\17\2\u00c3\u00ca\5\36\20\2\u00c4\u00ca\5 \21\2\u00c5\u00ca\5&\24\2\u00c6"+
		"\u00ca\5*\26\2\u00c7\u00ca\5.\30\2\u00c8\u00ca\5\62\32\2\u00c9\u00c0\3"+
		"\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c2\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9"+
		"\u00c4\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00c8\3\2\2\2\u00ca\25\3\2\2\2\u00cb\u00ce\5\32\16\2\u00cc"+
		"\u00ce\5\30\r\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\27\3\2\2"+
		"\2\u00cf\u00d0\5L\'\2\u00d0\u00d1\7.\2\2\u00d1\u00d2\5L\'\2\u00d2\31\3"+
		"\2\2\2\u00d3\u00d4\5L\'\2\u00d4\33\3\2\2\2\u00d5\u00d7\7\25\2\2\u00d6"+
		"\u00d8\5r:\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\35\3\2\2\2"+
		"\u00d9\u00da\7\16\2\2\u00da\u00db\5L\'\2\u00db\u00dc\7+\2\2\u00dc\u00e5"+
		"\5\20\t\2\u00dd\u00e1\7\f\2\2\u00de\u00e2\5\36\20\2\u00df\u00e0\7+\2\2"+
		"\u00e0\u00e2\5\20\t\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4"+
		"\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\17"+
		"\2\2\u00e9\37\3\2\2\2\u00ea\u00eb\7\22\2\2\u00eb\u00f0\5\"\22\2\u00ec"+
		"\u00ed\7)\2\2\u00ed\u00ef\5\"\22\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4\u00f5\5\20\t\2\u00f5\u00f6\7\23"+
		"\2\2\u00f6!\3\2\2\2\u00f7\u00f9\5\26\f\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\5$\23\2\u00fb#\3\2\2\2\u00fc"+
		"\u00fe\7\30\2\2\u00fd\u00ff\5L\'\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff%\3\2\2\2\u0100\u0101\5(\25\2\u0101\u0102\5\\/\2\u0102\'\3\2"+
		"\2\2\u0103\u0104\7\31\2\2\u0104)\3\2\2\2\u0105\u0106\5,\27\2\u0106\u0107"+
		"\5\\/\2\u0107+\3\2\2\2\u0108\u0109\7\32\2\2\u0109-\3\2\2\2\u010a\u010b"+
		"\5\60\31\2\u010b\u010c\7\36\2\2\u010c\u0111\5b\62\2\u010d\u010e\7\25\2"+
		"\2\u010e\u0110\5<\37\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0115\5\22\n\2\u0115\u0119\7\27\2\2\u0116\u0118\7\36\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"/\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\33\2\2\u011d\61\3\2\2\2\u011e"+
		"\u0122\5\64\33\2\u011f\u0123\5<\37\2\u0120\u0121\7\36\2\2\u0121\u0123"+
		"\5b\62\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0128\3\2\2\2\u0124"+
		"\u0125\7\25\2\2\u0125\u0127\5<\37\2\u0126\u0124\3\2\2\2\u0127\u012a\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\63\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012c\7\34\2\2\u012c\65\3\2\2\2\u012d\u0130\58\35"+
		"\2\u012e\u0130\5:\36\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\67"+
		"\3\2\2\2\u0131\u0132\7\t\2\2\u0132\u013b\7\36\2\2\u0133\u0134\7(\2\2\u0134"+
		"\u0137\5> \2\u0135\u0136\7.\2\2\u0136\u0138\5L\'\2\u0137\u0135\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0138\u013c\3\2\2\2\u0139\u013a\7.\2\2\u013a\u013c"+
		"\5L\'\2\u013b\u0133\3\2\2\2\u013b\u0139\3\2\2\2\u013c9\3\2\2\2\u013d\u013e"+
		"\7\26\2\2\u013e\u013f\5<\37\2\u013f;\3\2\2\2\u0140\u0153\5J&\2\u0141\u0143"+
		"\5n8\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\7(\2\2\u0145\u0148\5> \2\u0146\u0147\7.\2\2\u0147\u0149\5L\'\2"+
		"\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0154\3\2\2\2\u014a\u014b"+
		"\7.\2\2\u014b\u0150\5L\'\2\u014c\u014d\7)\2\2\u014d\u014f\5<\37\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0142\3\2\2\2\u0153"+
		"\u014a\3\2\2\2\u0154=\3\2\2\2\u0155\u0158\5@!\2\u0156\u0158\5B\"\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158?\3\2\2\2\u0159\u015e\7\36\2\2"+
		"\u015a\u015e\5f\64\2\u015b\u015c\7\36\2\2\u015c\u015e\5D#\2\u015d\u0159"+
		"\3\2\2\2\u015d\u015a\3\2\2\2\u015d\u015b\3\2\2\2\u015eA\3\2\2\2\u015f"+
		"\u0163\5D#\2\u0160\u0163\5H%\2\u0161\u0163\5Z.\2\u0162\u015f\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163C\3\2\2\2\u0164\u0165\7&\2\2\u0165"+
		"\u0166\5F$\2\u0166\u0167\7\'\2\2\u0167E\3\2\2\2\u0168\u0169\5L\'\2\u0169"+
		"G\3\2\2\2\u016a\u016b\7&\2\2\u016b\u016c\7\'\2\2\u016c\u016d\5> \2\u016d"+
		"I\3\2\2\2\u016e\u0173\7\36\2\2\u016f\u0170\7)\2\2\u0170\u0172\7\36\2\2"+
		"\u0171\u016f\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174K\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\b\'\1\2\u0177"+
		"\u017a\5N(\2\u0178\u017a\5t;\2\u0179\u0176\3\2\2\2\u0179\u0178\3\2\2\2"+
		"\u017a\u0180\3\2\2\2\u017b\u017c\f\3\2\2\u017c\u017d\t\2\2\2\u017d\u017f"+
		"\5L\'\4\u017e\u017b\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181M\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\b(\1\2\u0184"+
		"\u0187\5R*\2\u0185\u0187\5P)\2\u0186\u0183\3\2\2\2\u0186\u0185\3\2\2\2"+
		"\u0187\u0193\3\2\2\2\u0188\u018f\f\3\2\2\u0189\u018a\7#\2\2\u018a\u0190"+
		"\7\36\2\2\u018b\u0190\5l\67\2\u018c\u0190\5n8\2\u018d\u0190\5p9\2\u018e"+
		"\u0190\5\\/\2\u018f\u0189\3\2\2\2\u018f\u018b\3\2\2\2\u018f\u018c\3\2"+
		"\2\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0192\3\2\2\2\u0191"+
		"\u0188\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194O\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\5> \2\u0197\u0198"+
		"\7$\2\2\u0198\u019a\5L\'\2\u0199\u019b\7)\2\2\u019a\u0199\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\7%\2\2\u019dQ\3\2\2\2\u019e"+
		"\u01a6\5T+\2\u019f\u01a6\7\36\2\2\u01a0\u01a6\5h\65\2\u01a1\u01a2\7$\2"+
		"\2\u01a2\u01a3\5L\'\2\u01a3\u01a4\7%\2\2\u01a4\u01a6\3\2\2\2\u01a5\u019e"+
		"\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a6"+
		"S\3\2\2\2\u01a7\u01aa\5V,\2\u01a8\u01aa\5X-\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01aaU\3\2\2\2\u01ab\u01ac\t\3\2\2\u01acW\3\2\2\2\u01ad"+
		"\u01ae\7\n\2\2\u01ae\u01af\5^\60\2\u01af\u01b0\5\20\t\2\u01b0Y\3\2\2\2"+
		"\u01b1\u01b2\7\n\2\2\u01b2\u01b3\5^\60\2\u01b3[\3\2\2\2\u01b4\u01c3\7"+
		"$\2\2\u01b5\u01bc\5r:\2\u01b6\u01b9\5> \2\u01b7\u01b8\7)\2\2\u01b8\u01ba"+
		"\5r:\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb"+
		"\u01b5\3\2\2\2\u01bb\u01b6\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bf\7*"+
		"\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0"+
		"\u01c2\7)\2\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2"+
		"\2\2\u01c3\u01bb\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c6\7%\2\2\u01c6]\3\2\2\2\u01c7\u01c8\5b\62\2\u01c8\u01c9\5`\61\2\u01c9"+
		"\u01cc\3\2\2\2\u01ca\u01cc\5b\62\2\u01cb\u01c7\3\2\2\2\u01cb\u01ca\3\2"+
		"\2\2\u01cc_\3\2\2\2\u01cd\u01d0\5b\62\2\u01ce\u01d0\5> \2\u01cf\u01cd"+
		"\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0a\3\2\2\2\u01d1\u01dd\7$\2\2\u01d2\u01d7"+
		"\5d\63\2\u01d3\u01d4\7)\2\2\u01d4\u01d6\5d\63\2\u01d5\u01d3\3\2\2\2\u01d6"+
		"\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01db\3\2"+
		"\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dc\7)\2\2\u01db\u01da\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d2\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\7%\2\2\u01e0c\3\2\2\2\u01e1\u01e3"+
		"\5J&\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4"+
		"\u01e6\7(\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2"+
		"\2\2\u01e7\u01e8\5> \2\u01e8e\3\2\2\2\u01e9\u01ea\7\36\2\2\u01ea\u01eb"+
		"\7#\2\2\u01eb\u01ec\7\36\2\2\u01ecg\3\2\2\2\u01ed\u01ee\5j\66\2\u01ee"+
		"\u01ef\7#\2\2\u01ef\u01f0\7\36\2\2\u01f0i\3\2\2\2\u01f1\u01fa\5@!\2\u01f2"+
		"\u01f5\7$\2\2\u01f3\u01f6\5@!\2\u01f4\u01f6\5j\66\2\u01f5\u01f3\3\2\2"+
		"\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\7%\2\2\u01f8\u01fa"+
		"\3\2\2\2\u01f9\u01f1\3\2\2\2\u01f9\u01f2\3\2\2\2\u01fak\3\2\2\2\u01fb"+
		"\u01fc\7&\2\2\u01fc\u01fd\5L\'\2\u01fd\u01fe\7\'\2\2\u01fem\3\2\2\2\u01ff"+
		"\u020f\7&\2\2\u0200\u0202\5L\'\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2"+
		"\2\u0202\u0203\3\2\2\2\u0203\u0205\7(\2\2\u0204\u0206\5L\'\2\u0205\u0204"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0210\3\2\2\2\u0207\u0209\5L\'\2\u0208"+
		"\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\7("+
		"\2\2\u020b\u020c\5L\'\2\u020c\u020d\7(\2\2\u020d\u020e\5L\'\2\u020e\u0210"+
		"\3\2\2\2\u020f\u0201\3\2\2\2\u020f\u0208\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0212\7\'\2\2\u0212o\3\2\2\2\u0213\u0214\7#\2\2\u0214\u0215\7$\2\2\u0215"+
		"\u0216\5> \2\u0216\u0217\7%\2\2\u0217q\3\2\2\2\u0218\u021d\5L\'\2\u0219"+
		"\u021a\7)\2\2\u021a\u021c\5L\'\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2"+
		"\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021es\3\2\2\2\u021f\u021d"+
		"\3\2\2\2\u0220\u0221\b;\1\2\u0221\u0222\5v<\2\u0222\u0228\3\2\2\2\u0223"+
		"\u0224\f\4\2\2\u0224\u0225\7/\2\2\u0225\u0227\5v<\2\u0226\u0223\3\2\2"+
		"\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229u"+
		"\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c\b<\1\2\u022c\u022d\5x=\2\u022d"+
		"\u0233\3\2\2\2\u022e\u022f\f\4\2\2\u022f\u0230\7.\2\2\u0230\u0232\5x="+
		"\2\u0231\u022e\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234w\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237\b=\1\2\u0237\u0238"+
		"\5z>\2\u0238\u023e\3\2\2\2\u0239\u023a\f\4\2\2\u023a\u023b\7,\2\2\u023b"+
		"\u023d\5z>\2\u023c\u0239\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2"+
		"\2\u023e\u023f\3\2\2\2\u023fy\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0242"+
		"\b>\1\2\u0242\u0243\5|?\2\u0243\u0249\3\2\2\2\u0244\u0245\f\4\2\2\u0245"+
		"\u0246\7-\2\2\u0246\u0248\5|?\2\u0247\u0244\3\2\2\2\u0248\u024b\3\2\2"+
		"\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a{\3\2\2\2\u024b\u0249"+
		"\3\2\2\2\u024c\u0252\5~@\2\u024d\u024e\7$\2\2\u024e\u024f\5t;\2\u024f"+
		"\u0250\7%\2\2\u0250\u0252\3\2\2\2\u0251\u024c\3\2\2\2\u0251\u024d\3\2"+
		"\2\2\u0252}\3\2\2\2\u0253\u0254\t\4\2\2\u0254\177\3\2\2\2\u0255\u025a"+
		"\7\7\2\2\u0256\u025a\7\2\2\3\u0257\u025a\6A\b\2\u0258\u025a\6A\t\2\u0259"+
		"\u0255\3\2\2\2\u0259\u0256\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u0258\3\2"+
		"\2\2\u025a\u0081\3\2\2\2C\u0086\u008c\u0092\u0099\u00a4\u00ab\u00b2\u00b7"+
		"\u00be\u00c9\u00cd\u00d7\u00e1\u00e5\u00f0\u00f8\u00fe\u0111\u0119\u0122"+
		"\u0128\u012f\u0137\u013b\u0142\u0148\u0150\u0153\u0157\u015d\u0162\u0173"+
		"\u0179\u0180\u0186\u018f\u0193\u019a\u01a5\u01a9\u01b9\u01bb\u01be\u01c1"+
		"\u01c3\u01cb\u01cf\u01d7\u01db\u01dd\u01e2\u01e5\u01f5\u01f9\u0201\u0205"+
		"\u0208\u020f\u021d\u0228\u0233\u023e\u0249\u0251\u0259";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}