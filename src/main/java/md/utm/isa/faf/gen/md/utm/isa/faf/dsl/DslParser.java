// Generated from D:/EGOR/Projects/FinSL/FinSL/src/main/java/md/utm/isa/faf/dsl\DslParser.g4 by ANTLR 4.9.2
package md.utm.isa.faf.gen.md.utm.isa.faf.dsl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			ASSERT=1, BOOLEAN=2, BREAK=3, BYTE=4, CASE=5, CATCH=6, CLASS=7, CONST=8,
			CONTINUE=9, DEFAULT=10, DO=11, DOUBLE=12, ELSE=13, ENUM=14, EXTENDS=15,
			FOR=16, FUNCTION=17, IF=18, IS=19, IMPLEMENTS=20, INTERFACE=21, NEW=22,
			OF=23, ON=24, PRIVATE=25, PUBLIC=26, RETURN=27, SHORT=28, SUPER=29, SWITCH=30,
			THIS=31, THROW=32, THROWS=33, TRY=34, TYPE=35, WHILE=36, BALANCE_SHEET=37,
			INCOME_STATEMENT=38, ASSETS=39, LIABILITIES=40, EQUITY=41, CASH=42, EXPENSES=43,
			INVENTORY=44, ACCOUNTS=45, LONG_TERM=46, OTHERS=47, CAPITAL=48, RETAINED=49,
			IMPORT_FN=50, EXPORT_FN=51, PRINT=52, CALC_TAX=53, SRL=54, INDIVIDUAL=55,
			LET=56, IDENTIFIER=57, DECIMAL_LITERAL=58, HEX_LITERAL=59, OCT_LITERAL=60,
			BINARY_LITERAL=61, FLOAT_LITERAL=62, HEX_FLOAT_LITERAL=63, BOOL_LITERAL=64,
			STRING_LITERAL=65, TEXT_BLOCK=66, NULL_LITERAL=67, LPAREN=68, RPAREN=69,
			LBRACE=70, RBRACE=71, LBRACK=72, RBRACK=73, SEMI=74, COMMA=75, DOT=76,
			ASSIGN=77, GT=78, LT=79, BANG=80, QUESTION=81, COLON=82, EQUAL=83, LE=84,
			GE=85, NOTEQUAL=86, AND=87, OR=88, INC=89, DEC=90, ADD=91, SUB=92, MUL=93,
			DIV=94, MOD=95, EXP=96, ADD_ASSIGN=97, SUB_ASSIGN=98, MUL_ASSIGN=99, DIV_ASSIGN=100,
			AND_ASSIGN=101, OR_ASSIGN=102, MOD_ASSIGN=103, EXP_ASSIGN=104, WS=105,
			COMMENT=106, LINE_COMMENT=107, UNEXPECTED_CHAR=108;
	public static final int
			RULE_program = 0, RULE_declaration = 1, RULE_classDecl = 2, RULE_funDecl = 3,
			RULE_varDecl = 4, RULE_finDecl = 5, RULE_balanceSheet = 6, RULE_incomeState = 7,
			RULE_bal_assets = 8, RULE_bal_liab = 9, RULE_bal_equity = 10, RULE_asset_ex = 11,
			RULE_liab_ex = 12, RULE_equity_ex = 13, RULE_statement = 14, RULE_exprStmt = 15,
			RULE_forStmt = 16, RULE_ifStmt = 17, RULE_returnStmt = 18, RULE_whileStmt = 19,
			RULE_block = 20, RULE_expression = 21, RULE_assignment = 22, RULE_logic_or = 23,
			RULE_logic_and = 24, RULE_equality = 25, RULE_comparison = 26, RULE_term = 27,
			RULE_factor = 28, RULE_unary = 29, RULE_call = 30, RULE_primary = 31,
			RULE_function = 32, RULE_parameters = 33, RULE_arguments = 34, RULE_bal_sheet_assets = 35,
			RULE_bal_sheet_liab = 36, RULE_bal_sheet_equity = 37, RULE_entities = 38,
			RULE_main_functions = 39;
	private static String[] makeRuleNames() {
		return new String[] {
				"program", "declaration", "classDecl", "funDecl", "varDecl", "finDecl",
				"balanceSheet", "incomeState", "bal_assets", "bal_liab", "bal_equity",
				"asset_ex", "liab_ex", "equity_ex", "statement", "exprStmt", "forStmt",
				"ifStmt", "returnStmt", "whileStmt", "block", "expression", "assignment",
				"logic_or", "logic_and", "equality", "comparison", "term", "factor",
				"unary", "call", "primary", "function", "parameters", "arguments", "bal_sheet_assets",
				"bal_sheet_liab", "bal_sheet_equity", "entities", "main_functions"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'",
				"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'",
				"'else'", "'enum'", "'extends'", "'for'", "'function'", "'if'", "'is'",
				"'implements'", "'interface'", "'new'", "'of'", "'on'", "'private'",
				"'public'", "'return'", "'short'", "'super'", "'switch'", "'this'", "'throw'",
				"'throws'", "'try'", "'type'", "'while'", "'balance sheet'", "'income statement'",
				"'assets'", "'liabilities'", "'equity'", "'cash'", "'expenses'", "'inventory'",
				"'accounts'", "'long term'", "'others'", "'capital'", "'retained'", "'import'",
				"'export'", "'print'", "'calcTax'", "'SRL'", "'Individual'", "'let'",
				null, null, null, null, null, null, null, null, null, null, "'null'",
				"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='",
				"'>'", "'<'", "'!'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", null,
				null, "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'+='",
				"'-='", "'*='", "'/='", "'&='", "'|='", "'%='", "'**='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CLASS",
				"CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS",
				"FOR", "FUNCTION", "IF", "IS", "IMPLEMENTS", "INTERFACE", "NEW", "OF",
				"ON", "PRIVATE", "PUBLIC", "RETURN", "SHORT", "SUPER", "SWITCH", "THIS",
				"THROW", "THROWS", "TRY", "TYPE", "WHILE", "BALANCE_SHEET", "INCOME_STATEMENT",
				"ASSETS", "LIABILITIES", "EQUITY", "CASH", "EXPENSES", "INVENTORY", "ACCOUNTS",
				"LONG_TERM", "OTHERS", "CAPITAL", "RETAINED", "IMPORT_FN", "EXPORT_FN",
				"PRINT", "CALC_TAX", "SRL", "INDIVIDUAL", "LET", "IDENTIFIER", "DECIMAL_LITERAL",
				"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL",
				"BOOL_LITERAL", "STRING_LITERAL", "TEXT_BLOCK", "NULL_LITERAL", "LPAREN",
				"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT",
				"ASSIGN", "GT", "LT", "BANG", "QUESTION", "COLON", "EQUAL", "LE", "GE",
				"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD",
				"EXP", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN",
				"OR_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "WS", "COMMENT", "LINE_COMMENT",
				"UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "DslParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DslParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FOR) | (1L << FUNCTION) | (1L << IF) | (1L << RETURN) | (1L << SUPER) | (1L << THIS) | (1L << WHILE) | (1L << BALANCE_SHEET) | (1L << INCOME_STATEMENT) | (1L << IMPORT_FN) | (1L << EXPORT_FN) | (1L << PRINT) | (1L << CALC_TAX) | (1L << LET) | (1L << IDENTIFIER) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (BANG - 64)) | (1L << (SUB - 64)))) != 0)) {
					{
						{
							setState(80);
							declaration();
						}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
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

	public static class DeclarationContext extends ParserRuleContext {
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public FunDeclContext funDecl() {
			return getRuleContext(FunDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FinDeclContext finDecl() {
			return getRuleContext(FinDeclContext.class,0);
		}
		public BalanceSheetContext balanceSheet() {
			return getRuleContext(BalanceSheetContext.class,0);
		}
		public IncomeStateContext incomeState() {
			return getRuleContext(IncomeStateContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(88);
					classDecl();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(89);
					funDecl();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(90);
					varDecl();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(91);
					statement();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(92);
					finDecl();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(93);
					balanceSheet();
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(94);
					incomeState();
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

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DslParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(DslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DslParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(DslParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DslParser.RBRACE, 0); }
		public TerminalNode LT() { return getToken(DslParser.LT, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(97);
				match(CLASS);
				setState(98);
				match(IDENTIFIER);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(99);
						match(LT);
						setState(100);
						match(IDENTIFIER);
					}
				}

				setState(103);
				match(LBRACE);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
						{
							setState(104);
							function();
						}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(RBRACE);
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

	public static class FunDeclContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(DslParser.FUNCTION, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterFunDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitFunDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitFunDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDeclContext funDecl() throws RecognitionException {
		FunDeclContext _localctx = new FunDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(112);
				match(FUNCTION);
				setState(113);
				function();
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
		public TerminalNode LET() { return getToken(DslParser.LET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DslParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(DslParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(DslParser.OF, 0); }
		public TerminalNode TYPE() { return getToken(DslParser.TYPE, 0); }
		public EntitiesContext entities() {
			return getRuleContext(EntitiesContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(115);
				match(LET);
				setState(116);
				match(IDENTIFIER);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
						setState(117);
						match(ASSIGN);
						setState(118);
						expression();
					}
				}

				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF) {
					{
						setState(121);
						match(OF);
						setState(122);
						match(TYPE);
						setState(123);
						entities();
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

	public static class FinDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DslParser.IDENTIFIER, 0); }
		public TerminalNode OF() { return getToken(DslParser.OF, 0); }
		public EntitiesContext entities() {
			return getRuleContext(EntitiesContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(DslParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DslParser.RBRACE, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FinDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterFinDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitFinDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitFinDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinDeclContext finDecl() throws RecognitionException {
		FinDeclContext _localctx = new FinDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_finDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(126);
				match(IDENTIFIER);
				setState(127);
				match(OF);
				setState(128);
				entities();
				setState(129);
				match(LBRACE);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
						{
							setState(130);
							function();
						}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(RBRACE);
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

	public static class BalanceSheetContext extends ParserRuleContext {
		public TerminalNode BALANCE_SHEET() { return getToken(DslParser.BALANCE_SHEET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(DslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DslParser.IDENTIFIER, i);
		}
		public TerminalNode FOR() { return getToken(DslParser.FOR, 0); }
		public TerminalNode LBRACE() { return getToken(DslParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DslParser.RBRACE, 0); }
		public List<Bal_equityContext> bal_equity() {
			return getRuleContexts(Bal_equityContext.class);
		}
		public Bal_equityContext bal_equity(int i) {
			return getRuleContext(Bal_equityContext.class,i);
		}
		public List<Bal_assetsContext> bal_assets() {
			return getRuleContexts(Bal_assetsContext.class);
		}
		public Bal_assetsContext bal_assets(int i) {
			return getRuleContext(Bal_assetsContext.class,i);
		}
		public List<Bal_liabContext> bal_liab() {
			return getRuleContexts(Bal_liabContext.class);
		}
		public Bal_liabContext bal_liab(int i) {
			return getRuleContext(Bal_liabContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public BalanceSheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanceSheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterBalanceSheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitBalanceSheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitBalanceSheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalanceSheetContext balanceSheet() throws RecognitionException {
		BalanceSheetContext _localctx = new BalanceSheetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_balanceSheet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(138);
				match(BALANCE_SHEET);
				setState(139);
				match(IDENTIFIER);
				setState(140);
				match(FOR);
				setState(141);
				match(IDENTIFIER);
				setState(142);
				match(LBRACE);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSETS) | (1L << LIABILITIES) | (1L << EQUITY))) != 0)) {
					{
						setState(146);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case EQUITY:
							{
								setState(143);
								bal_equity();
							}
							break;
							case ASSETS:
							{
								setState(144);
								bal_assets();
							}
							break;
							case LIABILITIES:
							{
								setState(145);
								bal_liab();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(151);
								statement();
							}
						}
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
						{
							setState(157);
							function();
						}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				match(RBRACE);
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

	public static class IncomeStateContext extends ParserRuleContext {
		public TerminalNode INCOME_STATEMENT() { return getToken(DslParser.INCOME_STATEMENT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(DslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DslParser.IDENTIFIER, i);
		}
		public TerminalNode FOR() { return getToken(DslParser.FOR, 0); }
		public TerminalNode LBRACE() { return getToken(DslParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DslParser.RBRACE, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public IncomeStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incomeState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterIncomeState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitIncomeState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitIncomeState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncomeStateContext incomeState() throws RecognitionException {
		IncomeStateContext _localctx = new IncomeStateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_incomeState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(165);
				match(INCOME_STATEMENT);
				setState(166);
				match(IDENTIFIER);
				setState(167);
				match(FOR);
				setState(168);
				match(IDENTIFIER);
				setState(169);
				match(LBRACE);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
						{
							setState(170);
							function();
						}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(RBRACE);
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

	public static class Bal_assetsContext extends ParserRuleContext {
		public TerminalNode ASSETS() { return getToken(DslParser.ASSETS, 0); }
		public TerminalNode LBRACE() { return getToken(DslParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DslParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DslParser.IDENTIFIER, 0); }
		public List<Asset_exContext> asset_ex() {
			return getRuleContexts(Asset_exContext.class);
		}
		public Asset_exContext asset_ex(int i) {
			return getRuleContext(Asset_exContext.class,i);
		}
		public Bal_assetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bal_assets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterBal_assets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitBal_assets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitBal_assets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bal_assetsContext bal_assets() throws RecognitionException {
		Bal_assetsContext _localctx = new Bal_assetsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bal_assets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(178);
				match(ASSETS);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
						setState(179);
						match(IDENTIFIER);
					}
				}

				setState(182);
				match(LBRACE);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(183);
							asset_ex();
						}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASH) | (1L << EXPENSES) | (1L << INVENTORY) | (1L << ACCOUNTS) | (1L << LONG_TERM))) != 0) );
				setState(188);
				match(RBRACE);
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

	public static class Bal_liabContext extends ParserRuleContext {
		public TerminalNode LIABILITIES() { return getToken(DslParser.LIABILITIES, 0); }
		public TerminalNode LBRACE() { return getToken(DslParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DslParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DslParser.IDENTIFIER, 0); }
		public List<Liab_exContext> liab_ex() {
			return getRuleContexts(Liab_exContext.class);
		}
		public Liab_exContext liab_ex(int i) {
			return getRuleContext(Liab_exContext.class,i);
		}
		public Bal_liabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bal_liab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterBal_liab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitBal_liab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitBal_liab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bal_liabContext bal_liab() throws RecognitionException {
		Bal_liabContext _localctx = new Bal_liabContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bal_liab);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(190);
				match(LIABILITIES);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
						setState(191);
						match(IDENTIFIER);
					}
				}

				setState(194);
				match(LBRACE);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(195);
							liab_ex();
						}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCOUNTS) | (1L << LONG_TERM) | (1L << OTHERS))) != 0) );
				setState(200);
				match(RBRACE);
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

	public static class Bal_equityContext extends ParserRuleContext {
		public TerminalNode EQUITY() { return getToken(DslParser.EQUITY, 0); }
		public TerminalNode LBRACE() { return getToken(DslParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DslParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DslParser.IDENTIFIER, 0); }
		public List<Equity_exContext> equity_ex() {
			return getRuleContexts(Equity_exContext.class);
		}
		public Equity_exContext equity_ex(int i) {
			return getRuleContext(Equity_exContext.class,i);
		}
		public Bal_equityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bal_equity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterBal_equity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitBal_equity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitBal_equity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bal_equityContext bal_equity() throws RecognitionException {
		Bal_equityContext _localctx = new Bal_equityContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bal_equity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(202);
				match(EQUITY);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
						setState(203);
						match(IDENTIFIER);
					}
				}

				setState(206);
				match(LBRACE);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(207);
							equity_ex();
						}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CAPITAL || _la==RETAINED );
				setState(212);
				match(RBRACE);
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

	public static class Asset_exContext extends ParserRuleContext {
		public Bal_sheet_assetsContext bal_sheet_assets() {
			return getRuleContext(Bal_sheet_assetsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DslParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Asset_exContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asset_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterAsset_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitAsset_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitAsset_ex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asset_exContext asset_ex() throws RecognitionException {
		Asset_exContext _localctx = new Asset_exContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asset_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(214);
				bal_sheet_assets();
				setState(215);
				match(ASSIGN);
				setState(216);
				expression();
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

	public static class Liab_exContext extends ParserRuleContext {
		public Bal_sheet_liabContext bal_sheet_liab() {
			return getRuleContext(Bal_sheet_liabContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DslParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Liab_exContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liab_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterLiab_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitLiab_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitLiab_ex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Liab_exContext liab_ex() throws RecognitionException {
		Liab_exContext _localctx = new Liab_exContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_liab_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(218);
				bal_sheet_liab();
				setState(219);
				match(ASSIGN);
				setState(220);
				expression();
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

	public static class Equity_exContext extends ParserRuleContext {
		public Bal_sheet_equityContext bal_sheet_equity() {
			return getRuleContext(Bal_sheet_equityContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DslParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Equity_exContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equity_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterEquity_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitEquity_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitEquity_ex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equity_exContext equity_ex() throws RecognitionException {
		Equity_exContext _localctx = new Equity_exContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equity_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(222);
				bal_sheet_equity();
				setState(223);
				match(ASSIGN);
				setState(224);
				expression();
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
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case SUPER:
				case THIS:
				case IMPORT_FN:
				case EXPORT_FN:
				case PRINT:
				case CALC_TAX:
				case IDENTIFIER:
				case DECIMAL_LITERAL:
				case FLOAT_LITERAL:
				case BOOL_LITERAL:
				case STRING_LITERAL:
				case NULL_LITERAL:
				case LPAREN:
				case BANG:
				case SUB:
					enterOuterAlt(_localctx, 1);
				{
					setState(226);
					exprStmt();
				}
				break;
				case FOR:
					enterOuterAlt(_localctx, 2);
				{
					setState(227);
					forStmt();
				}
				break;
				case IF:
					enterOuterAlt(_localctx, 3);
				{
					setState(228);
					ifStmt();
				}
				break;
				case RETURN:
					enterOuterAlt(_localctx, 4);
				{
					setState(229);
					returnStmt();
				}
				break;
				case WHILE:
					enterOuterAlt(_localctx, 5);
				{
					setState(230);
					whileStmt();
				}
				break;
				case LBRACE:
					enterOuterAlt(_localctx, 6);
				{
					setState(231);
					block();
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

	public static class ExprStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(234);
				expression();
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

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DslParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(DslParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(DslParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DslParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(DslParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(236);
				match(FOR);
				setState(237);
				match(LPAREN);
				setState(241);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LET:
					{
						setState(238);
						varDecl();
					}
					break;
					case SUPER:
					case THIS:
					case IMPORT_FN:
					case EXPORT_FN:
					case PRINT:
					case CALC_TAX:
					case IDENTIFIER:
					case DECIMAL_LITERAL:
					case FLOAT_LITERAL:
					case BOOL_LITERAL:
					case STRING_LITERAL:
					case NULL_LITERAL:
					case LPAREN:
					case BANG:
					case SUB:
					{
						setState(239);
						exprStmt();
					}
					break;
					case SEMI:
					{
						setState(240);
						match(SEMI);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (SUPER - 29)) | (1L << (THIS - 29)) | (1L << (IMPORT_FN - 29)) | (1L << (EXPORT_FN - 29)) | (1L << (PRINT - 29)) | (1L << (CALC_TAX - 29)) | (1L << (IDENTIFIER - 29)) | (1L << (DECIMAL_LITERAL - 29)) | (1L << (FLOAT_LITERAL - 29)) | (1L << (BOOL_LITERAL - 29)) | (1L << (STRING_LITERAL - 29)) | (1L << (NULL_LITERAL - 29)) | (1L << (LPAREN - 29)) | (1L << (BANG - 29)) | (1L << (SUB - 29)))) != 0)) {
					{
						setState(243);
						expression();
					}
				}

				setState(246);
				match(SEMI);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (SUPER - 29)) | (1L << (THIS - 29)) | (1L << (IMPORT_FN - 29)) | (1L << (EXPORT_FN - 29)) | (1L << (PRINT - 29)) | (1L << (CALC_TAX - 29)) | (1L << (IDENTIFIER - 29)) | (1L << (DECIMAL_LITERAL - 29)) | (1L << (FLOAT_LITERAL - 29)) | (1L << (BOOL_LITERAL - 29)) | (1L << (STRING_LITERAL - 29)) | (1L << (NULL_LITERAL - 29)) | (1L << (LPAREN - 29)) | (1L << (BANG - 29)) | (1L << (SUB - 29)))) != 0)) {
					{
						setState(247);
						expression();
					}
				}

				setState(250);
				match(RPAREN);
				setState(251);
				statement();
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
		public TerminalNode IF() { return getToken(DslParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(DslParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DslParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DslParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(253);
				match(IF);
				setState(254);
				match(LPAREN);
				setState(255);
				expression();
				setState(256);
				match(RPAREN);
				setState(257);
				statement();
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
					{
						setState(258);
						match(ELSE);
						setState(259);
						statement();
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DslParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(DslParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(262);
				match(RETURN);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (SUPER - 29)) | (1L << (THIS - 29)) | (1L << (IMPORT_FN - 29)) | (1L << (EXPORT_FN - 29)) | (1L << (PRINT - 29)) | (1L << (CALC_TAX - 29)) | (1L << (IDENTIFIER - 29)) | (1L << (DECIMAL_LITERAL - 29)) | (1L << (FLOAT_LITERAL - 29)) | (1L << (BOOL_LITERAL - 29)) | (1L << (STRING_LITERAL - 29)) | (1L << (NULL_LITERAL - 29)) | (1L << (LPAREN - 29)) | (1L << (BANG - 29)) | (1L << (SUB - 29)))) != 0)) {
					{
						setState(263);
						expression();
					}
				}

				setState(266);
				match(SEMI);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DslParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(DslParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DslParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(268);
				match(WHILE);
				setState(269);
				match(LPAREN);
				setState(270);
				expression();
				setState(271);
				match(RPAREN);
				setState(272);
				statement();
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
		public TerminalNode LBRACE() { return getToken(DslParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DslParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(274);
				match(LBRACE);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FOR) | (1L << FUNCTION) | (1L << IF) | (1L << RETURN) | (1L << SUPER) | (1L << THIS) | (1L << WHILE) | (1L << BALANCE_SHEET) | (1L << INCOME_STATEMENT) | (1L << IMPORT_FN) | (1L << EXPORT_FN) | (1L << PRINT) | (1L << CALC_TAX) | (1L << LET) | (1L << IDENTIFIER) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (BANG - 64)) | (1L << (SUB - 64)))) != 0)) {
					{
						{
							setState(275);
							declaration();
						}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(281);
				match(RBRACE);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(DslParser.SEMI, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(283);
				assignment();
				setState(284);
				match(SEMI);
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
		public TerminalNode IDENTIFIER() { return getToken(DslParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(DslParser.ASSIGN, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DslParser.DOT, 0); }
		public Logic_orContext logic_or() {
			return getRuleContext(Logic_orContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
						{
							setState(286);
							call();
							setState(287);
							match(DOT);
						}
						break;
					}
					setState(291);
					match(IDENTIFIER);
					setState(292);
					match(ASSIGN);
					setState(293);
					assignment();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(294);
					logic_or();
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

	public static class Logic_orContext extends ParserRuleContext {
		public List<Logic_andContext> logic_and() {
			return getRuleContexts(Logic_andContext.class);
		}
		public Logic_andContext logic_and(int i) {
			return getRuleContext(Logic_andContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(DslParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(DslParser.OR, i);
		}
		public Logic_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterLogic_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitLogic_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitLogic_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_orContext logic_or() throws RecognitionException {
		Logic_orContext _localctx = new Logic_orContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logic_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(297);
				logic_and();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
						{
							setState(298);
							match(OR);
							setState(299);
							logic_and();
						}
					}
					setState(304);
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

	public static class Logic_andContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(DslParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(DslParser.AND, i);
		}
		public Logic_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterLogic_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitLogic_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitLogic_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_andContext logic_and() throws RecognitionException {
		Logic_andContext _localctx = new Logic_andContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logic_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(305);
				equality();
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
						{
							setState(306);
							match(AND);
							setState(307);
							equality();
						}
					}
					setState(312);
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

	public static class EqualityContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(DslParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(DslParser.NOTEQUAL, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(DslParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(DslParser.EQUAL, i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(313);
				comparison();
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EQUAL || _la==NOTEQUAL) {
					{
						{
							setState(314);
							_la = _input.LA(1);
							if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(315);
							comparison();
						}
					}
					setState(320);
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(DslParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(DslParser.GT, i);
		}
		public List<TerminalNode> GE() { return getTokens(DslParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(DslParser.GE, i);
		}
		public List<TerminalNode> LT() { return getTokens(DslParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(DslParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(DslParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(DslParser.LE, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(321);
				term();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (GT - 78)) | (1L << (LT - 78)) | (1L << (LE - 78)) | (1L << (GE - 78)))) != 0)) {
					{
						{
							setState(322);
							_la = _input.LA(1);
							if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (GT - 78)) | (1L << (LT - 78)) | (1L << (LE - 78)) | (1L << (GE - 78)))) != 0)) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(323);
							term();
						}
					}
					setState(328);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> SUB() { return getTokens(DslParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(DslParser.SUB, i);
		}
		public List<TerminalNode> ADD() { return getTokens(DslParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(DslParser.ADD, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(329);
				factor();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD || _la==SUB) {
					{
						{
							setState(330);
							_la = _input.LA(1);
							if ( !(_la==ADD || _la==SUB) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(331);
							factor();
						}
					}
					setState(336);
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

	public static class FactorContext extends ParserRuleContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> DIV() { return getTokens(DslParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(DslParser.DIV, i);
		}
		public List<TerminalNode> MUL() { return getTokens(DslParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(DslParser.MUL, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(337);
				unary();
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MUL || _la==DIV) {
					{
						{
							setState(338);
							_la = _input.LA(1);
							if ( !(_la==MUL || _la==DIV) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(339);
							unary();
						}
					}
					setState(344);
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

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode BANG() { return getToken(DslParser.BANG, 0); }
		public TerminalNode SUB() { return getToken(DslParser.SUB, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unary);
		int _la;
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BANG:
				case SUB:
					enterOuterAlt(_localctx, 1);
				{
					setState(345);
					_la = _input.LA(1);
					if ( !(_la==BANG || _la==SUB) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(346);
					unary();
				}
				break;
				case SUPER:
				case THIS:
				case IMPORT_FN:
				case EXPORT_FN:
				case PRINT:
				case CALC_TAX:
				case IDENTIFIER:
				case DECIMAL_LITERAL:
				case FLOAT_LITERAL:
				case BOOL_LITERAL:
				case STRING_LITERAL:
				case NULL_LITERAL:
				case LPAREN:
					enterOuterAlt(_localctx, 2);
				{
					setState(347);
					call();
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

	public static class CallContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Main_functionsContext main_functions() {
			return getRuleContext(Main_functionsContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DslParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DslParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DslParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DslParser.RPAREN, i);
		}
		public List<TerminalNode> DOT() { return getTokens(DslParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DslParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(DslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DslParser.IDENTIFIER, i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_call);
		int _la;
		try {
			int _alt;
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case SUPER:
				case THIS:
				case IDENTIFIER:
				case DECIMAL_LITERAL:
				case FLOAT_LITERAL:
				case BOOL_LITERAL:
				case STRING_LITERAL:
				case NULL_LITERAL:
				case LPAREN:
					enterOuterAlt(_localctx, 1);
				{
					setState(350);
					primary();
				}
				break;
				case IMPORT_FN:
				case EXPORT_FN:
				case PRINT:
				case CALC_TAX:
					enterOuterAlt(_localctx, 2);
				{
					setState(351);
					main_functions();
					setState(361);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
								setState(359);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
									case LPAREN:
									{
										setState(352);
										match(LPAREN);
										setState(354);
										_errHandler.sync(this);
										_la = _input.LA(1);
										if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (SUPER - 29)) | (1L << (THIS - 29)) | (1L << (IMPORT_FN - 29)) | (1L << (EXPORT_FN - 29)) | (1L << (PRINT - 29)) | (1L << (CALC_TAX - 29)) | (1L << (IDENTIFIER - 29)) | (1L << (DECIMAL_LITERAL - 29)) | (1L << (FLOAT_LITERAL - 29)) | (1L << (BOOL_LITERAL - 29)) | (1L << (STRING_LITERAL - 29)) | (1L << (NULL_LITERAL - 29)) | (1L << (LPAREN - 29)) | (1L << (BANG - 29)) | (1L << (SUB - 29)))) != 0)) {
											{
												setState(353);
												arguments();
											}
										}

										setState(356);
										match(RPAREN);
									}
									break;
									case DOT:
									{
										setState(357);
										match(DOT);
										setState(358);
										match(IDENTIFIER);
									}
									break;
									default:
										throw new NoViableAltException(this);
								}
							}
						}
						setState(363);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
					}
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DslParser.IDENTIFIER, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(DslParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(DslParser.NULL_LITERAL, 0); }
		public TerminalNode THIS() { return getToken(DslParser.THIS, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(DslParser.DECIMAL_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(DslParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DslParser.STRING_LITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(DslParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DslParser.RPAREN, 0); }
		public TerminalNode SUPER() { return getToken(DslParser.SUPER, 0); }
		public TerminalNode DOT() { return getToken(DslParser.DOT, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primary);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(366);
					match(IDENTIFIER);
				}
				break;
				case BOOL_LITERAL:
					enterOuterAlt(_localctx, 2);
				{
					setState(367);
					match(BOOL_LITERAL);
				}
				break;
				case NULL_LITERAL:
					enterOuterAlt(_localctx, 3);
				{
					setState(368);
					match(NULL_LITERAL);
				}
				break;
				case THIS:
					enterOuterAlt(_localctx, 4);
				{
					setState(369);
					match(THIS);
				}
				break;
				case DECIMAL_LITERAL:
					enterOuterAlt(_localctx, 5);
				{
					setState(370);
					match(DECIMAL_LITERAL);
				}
				break;
				case FLOAT_LITERAL:
					enterOuterAlt(_localctx, 6);
				{
					setState(371);
					match(FLOAT_LITERAL);
				}
				break;
				case STRING_LITERAL:
					enterOuterAlt(_localctx, 7);
				{
					setState(372);
					match(STRING_LITERAL);
				}
				break;
				case LPAREN:
					enterOuterAlt(_localctx, 8);
				{
					setState(373);
					match(LPAREN);
					setState(374);
					expression();
					setState(375);
					match(RPAREN);
				}
				break;
				case SUPER:
					enterOuterAlt(_localctx, 9);
				{
					setState(377);
					match(SUPER);
					setState(378);
					match(DOT);
					setState(379);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DslParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(DslParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DslParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(382);
				match(IDENTIFIER);
				setState(383);
				match(LPAREN);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
						setState(384);
						parameters();
					}
				}

				setState(387);
				match(RPAREN);
				setState(388);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DslParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DslParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(390);
				match(IDENTIFIER);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(391);
							match(COMMA);
							setState(392);
							match(IDENTIFIER);
						}
					}
					setState(397);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DslParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(398);
				assignment();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(399);
							match(COMMA);
							setState(400);
							assignment();
						}
					}
					setState(405);
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

	public static class Bal_sheet_assetsContext extends ParserRuleContext {
		public TerminalNode CASH() { return getToken(DslParser.CASH, 0); }
		public TerminalNode EXPENSES() { return getToken(DslParser.EXPENSES, 0); }
		public TerminalNode INVENTORY() { return getToken(DslParser.INVENTORY, 0); }
		public TerminalNode ACCOUNTS() { return getToken(DslParser.ACCOUNTS, 0); }
		public TerminalNode LONG_TERM() { return getToken(DslParser.LONG_TERM, 0); }
		public Bal_sheet_assetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bal_sheet_assets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterBal_sheet_assets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitBal_sheet_assets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitBal_sheet_assets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bal_sheet_assetsContext bal_sheet_assets() throws RecognitionException {
		Bal_sheet_assetsContext _localctx = new Bal_sheet_assetsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bal_sheet_assets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(406);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASH) | (1L << EXPENSES) | (1L << INVENTORY) | (1L << ACCOUNTS) | (1L << LONG_TERM))) != 0)) ) {
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

	public static class Bal_sheet_liabContext extends ParserRuleContext {
		public TerminalNode ACCOUNTS() { return getToken(DslParser.ACCOUNTS, 0); }
		public TerminalNode OTHERS() { return getToken(DslParser.OTHERS, 0); }
		public TerminalNode LONG_TERM() { return getToken(DslParser.LONG_TERM, 0); }
		public Bal_sheet_liabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bal_sheet_liab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterBal_sheet_liab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitBal_sheet_liab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitBal_sheet_liab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bal_sheet_liabContext bal_sheet_liab() throws RecognitionException {
		Bal_sheet_liabContext _localctx = new Bal_sheet_liabContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_bal_sheet_liab);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(408);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCOUNTS) | (1L << LONG_TERM) | (1L << OTHERS))) != 0)) ) {
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

	public static class Bal_sheet_equityContext extends ParserRuleContext {
		public TerminalNode CAPITAL() { return getToken(DslParser.CAPITAL, 0); }
		public TerminalNode RETAINED() { return getToken(DslParser.RETAINED, 0); }
		public Bal_sheet_equityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bal_sheet_equity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterBal_sheet_equity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitBal_sheet_equity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitBal_sheet_equity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bal_sheet_equityContext bal_sheet_equity() throws RecognitionException {
		Bal_sheet_equityContext _localctx = new Bal_sheet_equityContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_bal_sheet_equity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(410);
				_la = _input.LA(1);
				if ( !(_la==CAPITAL || _la==RETAINED) ) {
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

	public static class EntitiesContext extends ParserRuleContext {
		public TerminalNode SRL() { return getToken(DslParser.SRL, 0); }
		public TerminalNode INDIVIDUAL() { return getToken(DslParser.INDIVIDUAL, 0); }
		public EntitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterEntities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitEntities(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitEntities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntitiesContext entities() throws RecognitionException {
		EntitiesContext _localctx = new EntitiesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_entities);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(412);
				_la = _input.LA(1);
				if ( !(_la==SRL || _la==INDIVIDUAL) ) {
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

	public static class Main_functionsContext extends ParserRuleContext {
		public TerminalNode IMPORT_FN() { return getToken(DslParser.IMPORT_FN, 0); }
		public TerminalNode EXPORT_FN() { return getToken(DslParser.EXPORT_FN, 0); }
		public TerminalNode PRINT() { return getToken(DslParser.PRINT, 0); }
		public TerminalNode CALC_TAX() { return getToken(DslParser.CALC_TAX, 0); }
		public Main_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).enterMain_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslParserListener ) ((DslParserListener)listener).exitMain_functions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslParserVisitor ) return ((DslParserVisitor<? extends T>)visitor).visitMain_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_functionsContext main_functions() throws RecognitionException {
		Main_functionsContext _localctx = new Main_functionsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_main_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(414);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT_FN) | (1L << EXPORT_FN) | (1L << PRINT) | (1L << CALC_TAX))) != 0)) ) {
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

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u01a3\4\2\t\2\4"+
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\7\2T\n\2\f"+
					"\2\16\2W\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3b\n\3\3\4\3\4\3\4"+
					"\3\4\5\4h\n\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\4\3\4\3\5\3\5\3\5\3\6"+
					"\3\6\3\6\3\6\5\6z\n\6\3\6\3\6\3\6\5\6\177\n\6\3\7\3\7\3\7\3\7\3\7\7\7"+
					"\u0086\n\7\f\7\16\7\u0089\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
					"\7\b\u0095\n\b\f\b\16\b\u0098\13\b\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13"+
					"\b\3\b\7\b\u00a1\n\b\f\b\16\b\u00a4\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
					"\t\7\t\u00ae\n\t\f\t\16\t\u00b1\13\t\3\t\3\t\3\n\3\n\5\n\u00b7\n\n\3\n"+
					"\3\n\6\n\u00bb\n\n\r\n\16\n\u00bc\3\n\3\n\3\13\3\13\5\13\u00c3\n\13\3"+
					"\13\3\13\6\13\u00c7\n\13\r\13\16\13\u00c8\3\13\3\13\3\f\3\f\5\f\u00cf"+
					"\n\f\3\f\3\f\6\f\u00d3\n\f\r\f\16\f\u00d4\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
					"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
					"\u00eb\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00f4\n\22\3\22\5"+
					"\22\u00f7\n\22\3\22\3\22\5\22\u00fb\n\22\3\22\3\22\3\22\3\23\3\23\3\23"+
					"\3\23\3\23\3\23\3\23\5\23\u0107\n\23\3\24\3\24\5\24\u010b\n\24\3\24\3"+
					"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u0117\n\26\f\26\16\26"+
					"\u011a\13\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0124\n\30\3"+
					"\30\3\30\3\30\3\30\5\30\u012a\n\30\3\31\3\31\3\31\7\31\u012f\n\31\f\31"+
					"\16\31\u0132\13\31\3\32\3\32\3\32\7\32\u0137\n\32\f\32\16\32\u013a\13"+
					"\32\3\33\3\33\3\33\7\33\u013f\n\33\f\33\16\33\u0142\13\33\3\34\3\34\3"+
					"\34\7\34\u0147\n\34\f\34\16\34\u014a\13\34\3\35\3\35\3\35\7\35\u014f\n"+
					"\35\f\35\16\35\u0152\13\35\3\36\3\36\3\36\7\36\u0157\n\36\f\36\16\36\u015a"+
					"\13\36\3\37\3\37\3\37\5\37\u015f\n\37\3 \3 \3 \3 \5 \u0165\n \3 \3 \3"+
					" \7 \u016a\n \f \16 \u016d\13 \5 \u016f\n \3!\3!\3!\3!\3!\3!\3!\3!\3!"+
					"\3!\3!\3!\3!\3!\5!\u017f\n!\3\"\3\"\3\"\5\"\u0184\n\"\3\"\3\"\3\"\3#\3"+
					"#\3#\7#\u018c\n#\f#\16#\u018f\13#\3$\3$\3$\7$\u0194\n$\f$\16$\u0197\13"+
					"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\2\2*\2\4\6\b\n\f\16\20\22\24\26\30"+
					"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\f\4\2UUXX\4\2PQVW\3\2]^"+
					"\3\2_`\4\2RR^^\3\2,\60\3\2/\61\3\2\62\63\3\289\3\2\64\67\2\u01b6\2U\3"+
					"\2\2\2\4a\3\2\2\2\6c\3\2\2\2\br\3\2\2\2\nu\3\2\2\2\f\u0080\3\2\2\2\16"+
					"\u008c\3\2\2\2\20\u00a7\3\2\2\2\22\u00b4\3\2\2\2\24\u00c0\3\2\2\2\26\u00cc"+
					"\3\2\2\2\30\u00d8\3\2\2\2\32\u00dc\3\2\2\2\34\u00e0\3\2\2\2\36\u00ea\3"+
					"\2\2\2 \u00ec\3\2\2\2\"\u00ee\3\2\2\2$\u00ff\3\2\2\2&\u0108\3\2\2\2(\u010e"+
					"\3\2\2\2*\u0114\3\2\2\2,\u011d\3\2\2\2.\u0129\3\2\2\2\60\u012b\3\2\2\2"+
					"\62\u0133\3\2\2\2\64\u013b\3\2\2\2\66\u0143\3\2\2\28\u014b\3\2\2\2:\u0153"+
					"\3\2\2\2<\u015e\3\2\2\2>\u016e\3\2\2\2@\u017e\3\2\2\2B\u0180\3\2\2\2D"+
					"\u0188\3\2\2\2F\u0190\3\2\2\2H\u0198\3\2\2\2J\u019a\3\2\2\2L\u019c\3\2"+
					"\2\2N\u019e\3\2\2\2P\u01a0\3\2\2\2RT\5\4\3\2SR\3\2\2\2TW\3\2\2\2US\3\2"+
					"\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\2\2\3Y\3\3\2\2\2Zb\5\6\4\2[b\5"+
					"\b\5\2\\b\5\n\6\2]b\5\36\20\2^b\5\f\7\2_b\5\16\b\2`b\5\20\t\2aZ\3\2\2"+
					"\2a[\3\2\2\2a\\\3\2\2\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\5\3\2"+
					"\2\2cd\7\t\2\2dg\7;\2\2ef\7Q\2\2fh\7;\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2"+
					"\2im\7H\2\2jl\5B\"\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2"+
					"om\3\2\2\2pq\7I\2\2q\7\3\2\2\2rs\7\23\2\2st\5B\"\2t\t\3\2\2\2uv\7:\2\2"+
					"vy\7;\2\2wx\7O\2\2xz\5,\27\2yw\3\2\2\2yz\3\2\2\2z~\3\2\2\2{|\7\31\2\2"+
					"|}\7%\2\2}\177\5N(\2~{\3\2\2\2~\177\3\2\2\2\177\13\3\2\2\2\u0080\u0081"+
					"\7;\2\2\u0081\u0082\7\31\2\2\u0082\u0083\5N(\2\u0083\u0087\7H\2\2\u0084"+
					"\u0086\5B\"\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
					"\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
					"\u008b\7I\2\2\u008b\r\3\2\2\2\u008c\u008d\7\'\2\2\u008d\u008e\7;\2\2\u008e"+
					"\u008f\7\22\2\2\u008f\u0090\7;\2\2\u0090\u0096\7H\2\2\u0091\u0095\5\26"+
					"\f\2\u0092\u0095\5\22\n\2\u0093\u0095\5\24\13\2\u0094\u0091\3\2\2\2\u0094"+
					"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
					"\2\2\u0096\u0097\3\2\2\2\u0097\u009c\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
					"\u009b\5\36\20\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3"+
					"\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a2\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
					"\u00a1\5B\"\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
					"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
					"\u00a6\7I\2\2\u00a6\17\3\2\2\2\u00a7\u00a8\7(\2\2\u00a8\u00a9\7;\2\2\u00a9"+
					"\u00aa\7\22\2\2\u00aa\u00ab\7;\2\2\u00ab\u00af\7H\2\2\u00ac\u00ae\5B\""+
					"\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
					"\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7I\2\2\u00b3"+
					"\21\3\2\2\2\u00b4\u00b6\7)\2\2\u00b5\u00b7\7;\2\2\u00b6\u00b5\3\2\2\2"+
					"\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\7H\2\2\u00b9\u00bb"+
					"\5\30\r\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2"+
					"\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7I\2\2\u00bf\23\3"+
					"\2\2\2\u00c0\u00c2\7*\2\2\u00c1\u00c3\7;\2\2\u00c2\u00c1\3\2\2\2\u00c2"+
					"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\7H\2\2\u00c5\u00c7\5\32"+
					"\16\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
					"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7I\2\2\u00cb\25\3\2\2\2"+
					"\u00cc\u00ce\7+\2\2\u00cd\u00cf\7;\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf"+
					"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\7H\2\2\u00d1\u00d3\5\34\17\2"+
					"\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
					"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7I\2\2\u00d7\27\3\2\2\2\u00d8"+
					"\u00d9\5H%\2\u00d9\u00da\7O\2\2\u00da\u00db\5,\27\2\u00db\31\3\2\2\2\u00dc"+
					"\u00dd\5J&\2\u00dd\u00de\7O\2\2\u00de\u00df\5,\27\2\u00df\33\3\2\2\2\u00e0"+
					"\u00e1\5L\'\2\u00e1\u00e2\7O\2\2\u00e2\u00e3\5,\27\2\u00e3\35\3\2\2\2"+
					"\u00e4\u00eb\5 \21\2\u00e5\u00eb\5\"\22\2\u00e6\u00eb\5$\23\2\u00e7\u00eb"+
					"\5&\24\2\u00e8\u00eb\5(\25\2\u00e9\u00eb\5*\26\2\u00ea\u00e4\3\2\2\2\u00ea"+
					"\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2"+
					"\2\2\u00ea\u00e9\3\2\2\2\u00eb\37\3\2\2\2\u00ec\u00ed\5,\27\2\u00ed!\3"+
					"\2\2\2\u00ee\u00ef\7\22\2\2\u00ef\u00f3\7F\2\2\u00f0\u00f4\5\n\6\2\u00f1"+
					"\u00f4\5 \21\2\u00f2\u00f4\7L\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2"+
					"\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7\5,\27\2\u00f6"+
					"\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\7L"+
					"\2\2\u00f9\u00fb\5,\27\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
					"\u00fc\3\2\2\2\u00fc\u00fd\7G\2\2\u00fd\u00fe\5\36\20\2\u00fe#\3\2\2\2"+
					"\u00ff\u0100\7\24\2\2\u0100\u0101\7F\2\2\u0101\u0102\5,\27\2\u0102\u0103"+
					"\7G\2\2\u0103\u0106\5\36\20\2\u0104\u0105\7\17\2\2\u0105\u0107\5\36\20"+
					"\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107%\3\2\2\2\u0108\u010a"+
					"\7\35\2\2\u0109\u010b\5,\27\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2"+
					"\u010b\u010c\3\2\2\2\u010c\u010d\7L\2\2\u010d\'\3\2\2\2\u010e\u010f\7"+
					"&\2\2\u010f\u0110\7F\2\2\u0110\u0111\5,\27\2\u0111\u0112\7G\2\2\u0112"+
					"\u0113\5\36\20\2\u0113)\3\2\2\2\u0114\u0118\7H\2\2\u0115\u0117\5\4\3\2"+
					"\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
					"\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7I\2\2\u011c"+
					"+\3\2\2\2\u011d\u011e\5.\30\2\u011e\u011f\7L\2\2\u011f-\3\2\2\2\u0120"+
					"\u0121\5> \2\u0121\u0122\7N\2\2\u0122\u0124\3\2\2\2\u0123\u0120\3\2\2"+
					"\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7;\2\2\u0126\u0127"+
					"\7O\2\2\u0127\u012a\5.\30\2\u0128\u012a\5\60\31\2\u0129\u0123\3\2\2\2"+
					"\u0129\u0128\3\2\2\2\u012a/\3\2\2\2\u012b\u0130\5\62\32\2\u012c\u012d"+
					"\7Z\2\2\u012d\u012f\5\62\32\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2"+
					"\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\61\3\2\2\2\u0132\u0130"+
					"\3\2\2\2\u0133\u0138\5\64\33\2\u0134\u0135\7Y\2\2\u0135\u0137\5\64\33"+
					"\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
					"\3\2\2\2\u0139\63\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0140\5\66\34\2\u013c"+
					"\u013d\t\2\2\2\u013d\u013f\5\66\34\2\u013e\u013c\3\2\2\2\u013f\u0142\3"+
					"\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\65\3\2\2\2\u0142"+
					"\u0140\3\2\2\2\u0143\u0148\58\35\2\u0144\u0145\t\3\2\2\u0145\u0147\58"+
					"\35\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
					"\u0149\3\2\2\2\u0149\67\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u0150\5:\36"+
					"\2\u014c\u014d\t\4\2\2\u014d\u014f\5:\36\2\u014e\u014c\3\2\2\2\u014f\u0152"+
					"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u01519\3\2\2\2\u0152"+
					"\u0150\3\2\2\2\u0153\u0158\5<\37\2\u0154\u0155\t\5\2\2\u0155\u0157\5<"+
					"\37\2\u0156\u0154\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
					"\u0159\3\2\2\2\u0159;\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\t\6\2\2"+
					"\u015c\u015f\5<\37\2\u015d\u015f\5> \2\u015e\u015b\3\2\2\2\u015e\u015d"+
					"\3\2\2\2\u015f=\3\2\2\2\u0160\u016f\5@!\2\u0161\u016b\5P)\2\u0162\u0164"+
					"\7F\2\2\u0163\u0165\5F$\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
					"\u0166\3\2\2\2\u0166\u016a\7G\2\2\u0167\u0168\7N\2\2\u0168\u016a\7;\2"+
					"\2\u0169\u0162\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169"+
					"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
					"\u0160\3\2\2\2\u016e\u0161\3\2\2\2\u016f?\3\2\2\2\u0170\u017f\7;\2\2\u0171"+
					"\u017f\7B\2\2\u0172\u017f\7E\2\2\u0173\u017f\7!\2\2\u0174\u017f\7<\2\2"+
					"\u0175\u017f\7@\2\2\u0176\u017f\7C\2\2\u0177\u0178\7F\2\2\u0178\u0179"+
					"\5,\27\2\u0179\u017a\7G\2\2\u017a\u017f\3\2\2\2\u017b\u017c\7\37\2\2\u017c"+
					"\u017d\7N\2\2\u017d\u017f\7;\2\2\u017e\u0170\3\2\2\2\u017e\u0171\3\2\2"+
					"\2\u017e\u0172\3\2\2\2\u017e\u0173\3\2\2\2\u017e\u0174\3\2\2\2\u017e\u0175"+
					"\3\2\2\2\u017e\u0176\3\2\2\2\u017e\u0177\3\2\2\2\u017e\u017b\3\2\2\2\u017f"+
					"A\3\2\2\2\u0180\u0181\7;\2\2\u0181\u0183\7F\2\2\u0182\u0184\5D#\2\u0183"+
					"\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7G"+
					"\2\2\u0186\u0187\5*\26\2\u0187C\3\2\2\2\u0188\u018d\7;\2\2\u0189\u018a"+
					"\7M\2\2\u018a\u018c\7;\2\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d"+
					"\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018eE\3\2\2\2\u018f\u018d\3\2\2\2"+
					"\u0190\u0195\5.\30\2\u0191\u0192\7M\2\2\u0192\u0194\5.\30\2\u0193\u0191"+
					"\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
					"G\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\t\7\2\2\u0199I\3\2\2\2\u019a"+
					"\u019b\t\b\2\2\u019bK\3\2\2\2\u019c\u019d\t\t\2\2\u019dM\3\2\2\2\u019e"+
					"\u019f\t\n\2\2\u019fO\3\2\2\2\u01a0\u01a1\t\13\2\2\u01a1Q\3\2\2\2,Uag"+
					"my~\u0087\u0094\u0096\u009c\u00a2\u00af\u00b6\u00bc\u00c2\u00c8\u00ce"+
					"\u00d4\u00ea\u00f3\u00f6\u00fa\u0106\u010a\u0118\u0123\u0129\u0130\u0138"+
					"\u0140\u0148\u0150\u0158\u015e\u0164\u0169\u016b\u016e\u017e\u0183\u018d"+
					"\u0195";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}