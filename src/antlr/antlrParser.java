// Generated from /Users/chase/Desktop/4450/parproject/src/antlr.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class antlrParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_mathExpr = 2, RULE_plusExpr = 3, 
		RULE_conditionExpression = 4, RULE_expression = 5, RULE_var = 6, RULE_print = 7, 
		RULE_printExpr = 8, RULE_ifBlock = 9, RULE_expression_block = 10, RULE_statement_block = 11, 
		RULE_assignment = 12, RULE_strCast = 13, RULE_whileBlock = 14, RULE_forBlock = 15, 
		RULE_rangeStatement = 16, RULE_rangeExp = 17, RULE_intCast = 18, RULE_ezTab = 19, 
		RULE_ezSpace = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "mathExpr", "plusExpr", "conditionExpression", "expression", 
			"var", "print", "printExpr", "ifBlock", "expression_block", "statement_block", 
			"assignment", "strCast", "whileBlock", "forBlock", "rangeStatement", 
			"rangeExp", "intCast", "ezTab", "ezSpace"
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

	@Override
	public String getGrammarFileName() { return "antlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public antlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(antlrParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			block();
			setState(43);
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

	public static class BlockContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				assignment();
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(46);
						block();
						}
						} 
					}
					setState(51);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				ifBlock();
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(53);
						block();
						}
						} 
					}
					setState(58);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				print();
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(60);
						block();
						}
						} 
					}
					setState(65);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				whileBlock();
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(67);
						block();
						}
						} 
					}
					setState(72);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				forBlock();
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(74);
						block();
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				expression(0);
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(81);
						block();
						}
						} 
					}
					setState(86);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
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

	public static class MathExprContext extends ParserRuleContext {
		public Token conditon;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(antlrParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(antlrParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(antlrParser.MULT, 0); }
		public TerminalNode DIVIDE() { return getToken(antlrParser.DIVIDE, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(antlrParser.PLUSEQUAL, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(antlrParser.MINUSEQUAL, 0); }
		public TerminalNode MULTEQUAl() { return getToken(antlrParser.MULTEQUAl, 0); }
		public TerminalNode DIVIDEEQUAL() { return getToken(antlrParser.DIVIDEEQUAL, 0); }
		public TerminalNode MOD() { return getToken(antlrParser.MOD, 0); }
		public List<EzSpaceContext> ezSpace() {
			return getRuleContexts(EzSpaceContext.class);
		}
		public EzSpaceContext ezSpace(int i) {
			return getRuleContext(EzSpaceContext.class,i);
		}
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitMathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		return mathExpr(0);
	}

	private MathExprContext mathExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathExprContext _localctx = new MathExprContext(_ctx, _parentState);
		MathExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_mathExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(90);
				((MathExprContext)_localctx).conditon = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUSEQUAL) | (1L << PLUSEQUAL) | (1L << MULTEQUAl) | (1L << DIVIDEEQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
					((MathExprContext)_localctx).conditon = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(91);
				var();
				}
				break;
			case 2:
				{
				setState(92);
				ezSpace(0);
				setState(93);
				((MathExprContext)_localctx).conditon = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUSEQUAL) | (1L << PLUSEQUAL) | (1L << MULTEQUAl) | (1L << DIVIDEEQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
					((MathExprContext)_localctx).conditon = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				var();
				}
				break;
			case 3:
				{
				setState(96);
				((MathExprContext)_localctx).conditon = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUSEQUAL) | (1L << PLUSEQUAL) | (1L << MULTEQUAl) | (1L << DIVIDEEQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
					((MathExprContext)_localctx).conditon = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				ezSpace(0);
				setState(98);
				var();
				}
				break;
			case 4:
				{
				setState(100);
				ezSpace(0);
				setState(101);
				((MathExprContext)_localctx).conditon = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUSEQUAL) | (1L << PLUSEQUAL) | (1L << MULTEQUAl) | (1L << DIVIDEEQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
					((MathExprContext)_localctx).conditon = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				ezSpace(0);
				setState(103);
				var();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MathExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
					setState(107);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(108);
					mathExpr(2);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class PlusExprContext extends ParserRuleContext {
		public List<EzSpaceContext> ezSpace() {
			return getRuleContexts(EzSpaceContext.class);
		}
		public EzSpaceContext ezSpace(int i) {
			return getRuleContext(EzSpaceContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(antlrParser.PLUS, 0); }
		public PlusExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitPlusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusExprContext plusExpr() throws RecognitionException {
		PlusExprContext _localctx = new PlusExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_plusExpr);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				ezSpace(0);
				setState(115);
				match(PLUS);
				setState(116);
				ezSpace(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				ezSpace(0);
				setState(119);
				match(PLUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(PLUS);
				setState(122);
				ezSpace(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(PLUS);
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

	public static class ConditionExpressionContext extends ParserRuleContext {
		public Token condition;
		public List<EzSpaceContext> ezSpace() {
			return getRuleContexts(EzSpaceContext.class);
		}
		public EzSpaceContext ezSpace(int i) {
			return getRuleContext(EzSpaceContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LESSTHAN() { return getToken(antlrParser.LESSTHAN, 0); }
		public TerminalNode LESSTHANEQUALTO() { return getToken(antlrParser.LESSTHANEQUALTO, 0); }
		public TerminalNode GREATERTHAN() { return getToken(antlrParser.GREATERTHAN, 0); }
		public TerminalNode GREATERTHANEQUALTO() { return getToken(antlrParser.GREATERTHANEQUALTO, 0); }
		public TerminalNode EQUALEQUAL() { return getToken(antlrParser.EQUALEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(antlrParser.NOTEQUAL, 0); }
		public List<ConditionExpressionContext> conditionExpression() {
			return getRuleContexts(ConditionExpressionContext.class);
		}
		public ConditionExpressionContext conditionExpression(int i) {
			return getRuleContext(ConditionExpressionContext.class,i);
		}
		public ConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		return conditionExpression(0);
	}

	private ConditionExpressionContext conditionExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, _parentState);
		ConditionExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_conditionExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(127);
				ezSpace(0);
				setState(128);
				((ConditionExpressionContext)_localctx).condition = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALEQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << LESSTHANEQUALTO) | (1L << GREATERTHANEQUALTO))) != 0)) ) {
					((ConditionExpressionContext)_localctx).condition = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
				ezSpace(0);
				setState(130);
				var();
				}
				break;
			case 2:
				{
				setState(132);
				((ConditionExpressionContext)_localctx).condition = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALEQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << LESSTHANEQUALTO) | (1L << GREATERTHANEQUALTO))) != 0)) ) {
					((ConditionExpressionContext)_localctx).condition = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				ezSpace(0);
				setState(134);
				var();
				}
				break;
			case 3:
				{
				setState(136);
				ezSpace(0);
				setState(137);
				((ConditionExpressionContext)_localctx).condition = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALEQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << LESSTHANEQUALTO) | (1L << GREATERTHANEQUALTO))) != 0)) ) {
					((ConditionExpressionContext)_localctx).condition = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(138);
				var();
				}
				break;
			case 4:
				{
				setState(140);
				((ConditionExpressionContext)_localctx).condition = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALEQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << LESSTHANEQUALTO) | (1L << GREATERTHANEQUALTO))) != 0)) ) {
					((ConditionExpressionContext)_localctx).condition = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(141);
				var();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionExpression);
					setState(144);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(145);
					conditionExpression(6);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token conditon;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public TerminalNode LESSTHAN() { return getToken(antlrParser.LESSTHAN, 0); }
		public TerminalNode LESSTHANEQUALTO() { return getToken(antlrParser.LESSTHANEQUALTO, 0); }
		public TerminalNode GREATERTHAN() { return getToken(antlrParser.GREATERTHAN, 0); }
		public TerminalNode GREATERTHANEQUALTO() { return getToken(antlrParser.GREATERTHANEQUALTO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<EzSpaceContext> ezSpace() {
			return getRuleContexts(EzSpaceContext.class);
		}
		public EzSpaceContext ezSpace(int i) {
			return getRuleContext(EzSpaceContext.class,i);
		}
		public TerminalNode AND() { return getToken(antlrParser.AND, 0); }
		public TerminalNode OR() { return getToken(antlrParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(152);
				var();
				setState(153);
				mathExpr(0);
				}
				break;
			case 2:
				{
				setState(155);
				var();
				setState(156);
				mathExpr(0);
				setState(157);
				conditionExpression(0);
				}
				break;
			case 3:
				{
				setState(159);
				var();
				setState(160);
				conditionExpression(0);
				setState(161);
				mathExpr(0);
				}
				break;
			case 4:
				{
				setState(163);
				var();
				setState(164);
				((ExpressionContext)_localctx).conditon = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << LESSTHANEQUALTO) | (1L << GREATERTHANEQUALTO))) != 0)) ) {
					((ExpressionContext)_localctx).conditon = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				var();
				}
				break;
			case 5:
				{
				setState(167);
				var();
				}
				break;
			case 6:
				{
				setState(168);
				var();
				setState(169);
				conditionExpression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(174);
						ezSpace(0);
						setState(175);
						match(AND);
						setState(176);
						ezSpace(0);
						setState(177);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(180);
						ezSpace(0);
						setState(181);
						match(OR);
						setState(182);
						ezSpace(0);
						setState(183);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(186);
						match(OR);
						setState(187);
						ezSpace(0);
						setState(188);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(191);
						ezSpace(0);
						setState(192);
						match(OR);
						setState(193);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(196);
						match(OR);
						setState(197);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(199);
						ezSpace(0);
						setState(200);
						match(AND);
						setState(201);
						ezSpace(0);
						setState(202);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(205);
						match(AND);
						setState(206);
						ezSpace(0);
						setState(207);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(210);
						ezSpace(0);
						setState(211);
						match(AND);
						setState(212);
						expression(3);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(215);
						match(AND);
						setState(216);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(antlrParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(antlrParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(antlrParser.STRING, 0); }
		public TerminalNode VARNAME() { return getToken(antlrParser.VARNAME, 0); }
		public IntCastContext intCast() {
			return getRuleContext(IntCastContext.class,0);
		}
		public StrCastContext strCast() {
			return getRuleContext(StrCastContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(INT);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(MINUS);
				setState(224);
				match(INT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(STRING);
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(VARNAME);
				}
				break;
			case INTCAST:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				intCast();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				strCast();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(antlrParser.PRINT, 0); }
		public TerminalNode OPEN() { return getToken(antlrParser.OPEN, 0); }
		public PrintExprContext printExpr() {
			return getRuleContext(PrintExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(antlrParser.CLOSE, 0); }
		public List<EzSpaceContext> ezSpace() {
			return getRuleContexts(EzSpaceContext.class);
		}
		public EzSpaceContext ezSpace(int i) {
			return getRuleContext(EzSpaceContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(PRINT);
				setState(232);
				match(OPEN);
				setState(233);
				printExpr();
				setState(234);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(PRINT);
				setState(237);
				match(OPEN);
				setState(238);
				ezSpace(0);
				setState(239);
				printExpr();
				setState(240);
				match(CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(PRINT);
				setState(243);
				match(OPEN);
				setState(244);
				printExpr();
				setState(245);
				ezSpace(0);
				setState(246);
				match(CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(PRINT);
				setState(249);
				match(OPEN);
				setState(250);
				ezSpace(0);
				setState(251);
				printExpr();
				setState(252);
				ezSpace(0);
				setState(253);
				match(CLOSE);
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

	public static class PrintExprContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public PlusExprContext plusExpr() {
			return getRuleContext(PlusExprContext.class,0);
		}
		public PrintExprContext printExpr() {
			return getRuleContext(PrintExprContext.class,0);
		}
		public StrCastContext strCast() {
			return getRuleContext(StrCastContext.class,0);
		}
		public PrintExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExprContext printExpr() throws RecognitionException {
		PrintExprContext _localctx = new PrintExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printExpr);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				var();
				setState(258);
				plusExpr();
				setState(259);
				printExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				strCast();
				setState(262);
				plusExpr();
				setState(263);
				printExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				strCast();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				var();
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(antlrParser.IF, 0); }
		public EzSpaceContext ezSpace() {
			return getRuleContext(EzSpaceContext.class,0);
		}
		public List<Expression_blockContext> expression_block() {
			return getRuleContexts(Expression_blockContext.class);
		}
		public Expression_blockContext expression_block(int i) {
			return getRuleContext(Expression_blockContext.class,i);
		}
		public List<EzTabContext> ezTab() {
			return getRuleContexts(EzTabContext.class);
		}
		public EzTabContext ezTab(int i) {
			return getRuleContext(EzTabContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(antlrParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(antlrParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(antlrParser.ELSE, 0); }
		public TerminalNode COL() { return getToken(antlrParser.COL, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifBlock);
		try {
			int _alt;
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(IF);
				setState(270);
				ezSpace(0);
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(271);
						expression_block();
						}
						} 
					}
					setState(276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(277);
						ezTab(0);
						setState(278);
						match(ELIF);
						setState(279);
						expression_block();
						}
						} 
					}
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(286);
					ezTab(0);
					setState(287);
					match(ELSE);
					setState(288);
					match(COL);
					setState(289);
					statement_block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(IF);
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(294);
						expression_block();
						}
						} 
					}
					setState(299);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(300);
						ezTab(0);
						setState(301);
						match(ELIF);
						setState(302);
						expression_block();
						}
						} 
					}
					setState(308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(309);
					ezTab(0);
					setState(310);
					match(ELSE);
					setState(311);
					match(COL);
					setState(312);
					statement_block();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(IF);
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(317);
						expression_block();
						}
						} 
					}
					setState(322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(323);
						match(ELIF);
						setState(324);
						expression_block();
						}
						} 
					}
					setState(329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(330);
					match(ELSE);
					setState(331);
					match(COL);
					setState(332);
					statement_block();
					}
					break;
				}
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

	public static class Expression_blockContext extends ParserRuleContext {
		public EzSpaceContext ezSpace() {
			return getRuleContext(EzSpaceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COL() { return getToken(antlrParser.COL, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(antlrParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(antlrParser.CLOSE, 0); }
		public Expression_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterExpression_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitExpression_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitExpression_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_blockContext expression_block() throws RecognitionException {
		Expression_blockContext _localctx = new Expression_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression_block);
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
			case TAB:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				ezSpace(0);
				setState(338);
				expression(0);
				setState(339);
				match(COL);
				setState(340);
				statement_block();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(OPEN);
				setState(343);
				expression(0);
				setState(344);
				match(CLOSE);
				setState(345);
				match(COL);
				setState(346);
				statement_block();
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

	public static class Statement_blockContext extends ParserRuleContext {
		public EzTabContext ezTab() {
			return getRuleContext(EzTabContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(antlrParser.BREAK, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitStatement_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitStatement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_block);
		try {
			int _alt;
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				ezTab(0);
				setState(351);
				expression(0);
				setState(352);
				statement_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				ezTab(0);
				setState(355);
				ifBlock();
				setState(356);
				statement_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				ezTab(0);
				setState(359);
				assignment();
				setState(360);
				statement_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				ezTab(0);
				setState(363);
				whileBlock();
				setState(364);
				statement_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				ezTab(0);
				setState(367);
				print();
				setState(368);
				statement_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(370);
				ezTab(0);
				setState(371);
				forBlock();
				setState(372);
				statement_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(374);
				ezTab(0);
				setState(375);
				match(BREAK);
				setState(376);
				statement_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(378);
						block();
						}
						} 
					}
					setState(383);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
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
		public TerminalNode VARNAME() { return getToken(antlrParser.VARNAME, 0); }
		public TerminalNode EQUAL() { return getToken(antlrParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<EzSpaceContext> ezSpace() {
			return getRuleContexts(EzSpaceContext.class);
		}
		public EzSpaceContext ezSpace(int i) {
			return getRuleContext(EzSpaceContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(VARNAME);
				setState(387);
				match(EQUAL);
				setState(388);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(VARNAME);
				setState(390);
				ezSpace(0);
				setState(391);
				match(EQUAL);
				setState(392);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				match(VARNAME);
				setState(395);
				ezSpace(0);
				setState(396);
				match(EQUAL);
				setState(397);
				ezSpace(0);
				setState(398);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				match(VARNAME);
				setState(401);
				match(EQUAL);
				setState(402);
				ezSpace(0);
				setState(403);
				expression(0);
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

	public static class StrCastContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(antlrParser.STR, 0); }
		public TerminalNode OPEN() { return getToken(antlrParser.OPEN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(antlrParser.CLOSE, 0); }
		public List<EzSpaceContext> ezSpace() {
			return getRuleContexts(EzSpaceContext.class);
		}
		public EzSpaceContext ezSpace(int i) {
			return getRuleContext(EzSpaceContext.class,i);
		}
		public StrCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterStrCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitStrCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitStrCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrCastContext strCast() throws RecognitionException {
		StrCastContext _localctx = new StrCastContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_strCast);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(STR);
				setState(408);
				match(OPEN);
				setState(409);
				var();
				setState(410);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(STR);
				setState(413);
				match(OPEN);
				setState(414);
				ezSpace(0);
				setState(415);
				var();
				setState(416);
				ezSpace(0);
				setState(417);
				match(CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(STR);
				setState(420);
				match(OPEN);
				setState(421);
				ezSpace(0);
				setState(422);
				var();
				setState(423);
				match(CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				match(STR);
				setState(426);
				match(OPEN);
				setState(427);
				var();
				setState(428);
				ezSpace(0);
				setState(429);
				match(CLOSE);
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(antlrParser.WHILE, 0); }
		public EzSpaceContext ezSpace() {
			return getRuleContext(EzSpaceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COL() { return getToken(antlrParser.COL, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Expression_blockContext expression_block() {
			return getRuleContext(Expression_blockContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileBlock);
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(WHILE);
				setState(434);
				ezSpace(0);
				setState(435);
				expression(0);
				setState(436);
				match(COL);
				setState(437);
				statement_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(WHILE);
				setState(440);
				expression_block();
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

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(antlrParser.FOR, 0); }
		public List<EzSpaceContext> ezSpace() {
			return getRuleContexts(EzSpaceContext.class);
		}
		public EzSpaceContext ezSpace(int i) {
			return getRuleContext(EzSpaceContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode IN() { return getToken(antlrParser.IN, 0); }
		public TerminalNode RANGE() { return getToken(antlrParser.RANGE, 0); }
		public RangeStatementContext rangeStatement() {
			return getRuleContext(RangeStatementContext.class,0);
		}
		public TerminalNode COL() { return getToken(antlrParser.COL, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(FOR);
			setState(444);
			ezSpace(0);
			setState(445);
			var();
			setState(446);
			ezSpace(0);
			setState(447);
			match(IN);
			setState(448);
			ezSpace(0);
			setState(449);
			match(RANGE);
			setState(450);
			rangeStatement();
			setState(451);
			match(COL);
			setState(452);
			statement_block();
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

	public static class RangeStatementContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(antlrParser.OPEN, 0); }
		public List<EzSpaceContext> ezSpace() {
			return getRuleContexts(EzSpaceContext.class);
		}
		public EzSpaceContext ezSpace(int i) {
			return getRuleContext(EzSpaceContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(antlrParser.CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(antlrParser.COMMA, 0); }
		public RangeExpContext rangeExp() {
			return getRuleContext(RangeExpContext.class,0);
		}
		public RangeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterRangeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitRangeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitRangeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeStatementContext rangeStatement() throws RecognitionException {
		RangeStatementContext _localctx = new RangeStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rangeStatement);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(OPEN);
				setState(455);
				ezSpace(0);
				setState(456);
				var();
				setState(457);
				ezSpace(0);
				setState(458);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(OPEN);
				setState(461);
				var();
				setState(462);
				ezSpace(0);
				setState(463);
				match(CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(OPEN);
				setState(466);
				ezSpace(0);
				setState(467);
				var();
				setState(468);
				match(CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				match(OPEN);
				setState(471);
				var();
				setState(472);
				match(CLOSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
				match(OPEN);
				setState(475);
				var();
				setState(476);
				match(COMMA);
				setState(477);
				rangeExp();
				setState(478);
				match(CLOSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(480);
				match(OPEN);
				setState(481);
				ezSpace(0);
				setState(482);
				var();
				setState(483);
				match(COMMA);
				setState(484);
				rangeExp();
				setState(485);
				match(CLOSE);
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

	public static class RangeExpContext extends ParserRuleContext {
		public EzSpaceContext ezSpace() {
			return getRuleContext(EzSpaceContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public RangeExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterRangeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitRangeExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitRangeExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpContext rangeExp() throws RecognitionException {
		RangeExpContext _localctx = new RangeExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rangeExp);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				ezSpace(0);
				setState(490);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				ezSpace(0);
				setState(494);
				var();
				setState(495);
				mathExpr(0);
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

	public static class IntCastContext extends ParserRuleContext {
		public TerminalNode INTCAST() { return getToken(antlrParser.INTCAST, 0); }
		public TerminalNode OPEN() { return getToken(antlrParser.OPEN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(antlrParser.CLOSE, 0); }
		public List<EzSpaceContext> ezSpace() {
			return getRuleContexts(EzSpaceContext.class);
		}
		public EzSpaceContext ezSpace(int i) {
			return getRuleContext(EzSpaceContext.class,i);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public IntCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterIntCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitIntCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitIntCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntCastContext intCast() throws RecognitionException {
		IntCastContext _localctx = new IntCastContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_intCast);
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(INTCAST);
				setState(500);
				match(OPEN);
				setState(501);
				var();
				setState(502);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(INTCAST);
				setState(505);
				match(OPEN);
				setState(506);
				ezSpace(0);
				setState(507);
				var();
				setState(508);
				ezSpace(0);
				setState(509);
				match(CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				match(INTCAST);
				setState(512);
				match(OPEN);
				setState(513);
				ezSpace(0);
				setState(514);
				var();
				setState(515);
				match(CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				match(INTCAST);
				setState(518);
				match(OPEN);
				setState(519);
				var();
				setState(520);
				ezSpace(0);
				setState(521);
				match(CLOSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(523);
				match(INTCAST);
				setState(524);
				match(OPEN);
				setState(525);
				var();
				setState(526);
				mathExpr(0);
				setState(527);
				match(CLOSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(529);
				match(INTCAST);
				setState(530);
				match(OPEN);
				setState(531);
				ezSpace(0);
				setState(532);
				var();
				setState(533);
				mathExpr(0);
				setState(534);
				ezSpace(0);
				setState(535);
				match(CLOSE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(537);
				match(INTCAST);
				setState(538);
				match(OPEN);
				setState(539);
				ezSpace(0);
				setState(540);
				var();
				setState(541);
				mathExpr(0);
				setState(542);
				match(CLOSE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(544);
				match(INTCAST);
				setState(545);
				match(OPEN);
				setState(546);
				var();
				setState(547);
				mathExpr(0);
				setState(548);
				ezSpace(0);
				setState(549);
				match(CLOSE);
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

	public static class EzTabContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(antlrParser.TAB, 0); }
		public List<EzTabContext> ezTab() {
			return getRuleContexts(EzTabContext.class);
		}
		public EzTabContext ezTab(int i) {
			return getRuleContext(EzTabContext.class,i);
		}
		public EzTabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ezTab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterEzTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitEzTab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitEzTab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EzTabContext ezTab() throws RecognitionException {
		return ezTab(0);
	}

	private EzTabContext ezTab(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EzTabContext _localctx = new EzTabContext(_ctx, _parentState);
		EzTabContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_ezTab, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(554);
			match(TAB);
			}
			_ctx.stop = _input.LT(-1);
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EzTabContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ezTab);
					setState(556);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(557);
					ezTab(2);
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class EzSpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(antlrParser.SPACE, 0); }
		public TerminalNode TAB() { return getToken(antlrParser.TAB, 0); }
		public List<EzSpaceContext> ezSpace() {
			return getRuleContexts(EzSpaceContext.class);
		}
		public EzSpaceContext ezSpace(int i) {
			return getRuleContext(EzSpaceContext.class,i);
		}
		public EzSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ezSpace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).enterEzSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrListener ) ((antlrListener)listener).exitEzSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrVisitor ) return ((antlrVisitor<? extends T>)visitor).visitEzSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EzSpaceContext ezSpace() throws RecognitionException {
		return ezSpace(0);
	}

	private EzSpaceContext ezSpace(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EzSpaceContext _localctx = new EzSpaceContext(_ctx, _parentState);
		EzSpaceContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_ezSpace, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(564);
				match(SPACE);
				}
				break;
			case TAB:
				{
				setState(565);
				match(TAB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EzSpaceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ezSpace);
					setState(568);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(569);
					ezSpace(2);
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		case 2:
			return mathExpr_sempred((MathExprContext)_localctx, predIndex);
		case 4:
			return conditionExpression_sempred((ConditionExpressionContext)_localctx, predIndex);
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 19:
			return ezTab_sempred((EzTabContext)_localctx, predIndex);
		case 20:
			return ezSpace_sempred((EzSpaceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathExpr_sempred(MathExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionExpression_sempred(ConditionExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ezTab_sempred(EzTabContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ezSpace_sempred(EzSpaceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0242\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\7\3\62\n"+
		"\3\f\3\16\3\65\13\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\7\3@\n\3\f"+
		"\3\16\3C\13\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\3\3\7\3N\n\3\f\3\16"+
		"\3Q\13\3\3\3\3\3\7\3U\n\3\f\3\16\3X\13\3\5\3Z\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4l\n\4\3\4\3\4\7\4p\n\4"+
		"\f\4\16\4s\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\177\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0091"+
		"\n\6\3\6\3\6\7\6\u0095\n\6\f\6\16\6\u0098\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ae\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00dc\n\7\f\7\16\7\u00df\13\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e8\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0102\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u010e\n\n\3\13"+
		"\3\13\3\13\7\13\u0113\n\13\f\13\16\13\u0116\13\13\3\13\3\13\3\13\3\13"+
		"\7\13\u011c\n\13\f\13\16\13\u011f\13\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0126\n\13\3\13\3\13\7\13\u012a\n\13\f\13\16\13\u012d\13\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0133\n\13\f\13\16\13\u0136\13\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u013d\n\13\3\13\3\13\7\13\u0141\n\13\f\13\16\13\u0144\13\13"+
		"\3\13\3\13\7\13\u0148\n\13\f\13\16\13\u014b\13\13\3\13\3\13\3\13\5\13"+
		"\u0150\n\13\5\13\u0152\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u015f\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u017e"+
		"\n\r\f\r\16\r\u0181\13\r\5\r\u0183\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0198"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01b2\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01bc\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u01ea\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01f4\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u022a\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u0231\n\25\f\25\16\25\u0234\13\25\3\26\3\26"+
		"\3\26\5\26\u0239\n\26\3\26\3\26\7\26\u023d\n\26\f\26\16\26\u0240\13\26"+
		"\3\26\2\7\6\n\f(*\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5"+
		"\5\2\16\21\25\30\35\35\4\2\22\23(+\3\2(+\2\u0287\2,\3\2\2\2\4Y\3\2\2\2"+
		"\6k\3\2\2\2\b~\3\2\2\2\n\u0090\3\2\2\2\f\u00ad\3\2\2\2\16\u00e7\3\2\2"+
		"\2\20\u0101\3\2\2\2\22\u010d\3\2\2\2\24\u0151\3\2\2\2\26\u015e\3\2\2\2"+
		"\30\u0182\3\2\2\2\32\u0197\3\2\2\2\34\u01b1\3\2\2\2\36\u01bb\3\2\2\2 "+
		"\u01bd\3\2\2\2\"\u01e9\3\2\2\2$\u01f3\3\2\2\2&\u0229\3\2\2\2(\u022b\3"+
		"\2\2\2*\u0238\3\2\2\2,-\5\4\3\2-.\7\2\2\3.\3\3\2\2\2/\63\5\32\16\2\60"+
		"\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"Z\3\2\2\2\65\63\3\2\2\2\66:\5\24\13\2\679\5\4\3\28\67\3\2\2\29<\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;Z\3\2\2\2<:\3\2\2\2=A\5\20\t\2>@\5\4\3\2?>\3\2"+
		"\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BZ\3\2\2\2CA\3\2\2\2DH\5\36\20\2EG\5"+
		"\4\3\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IZ\3\2\2\2JH\3\2\2\2KO\5"+
		" \21\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PZ\3\2\2\2QO\3"+
		"\2\2\2RV\5\f\7\2SU\5\4\3\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2Y/\3\2\2\2Y\66\3\2\2\2Y=\3\2\2\2YD\3\2\2\2YK\3\2\2\2Y"+
		"R\3\2\2\2Z\5\3\2\2\2[\\\b\4\1\2\\]\t\2\2\2]l\5\16\b\2^_\5*\26\2_`\t\2"+
		"\2\2`a\5\16\b\2al\3\2\2\2bc\t\2\2\2cd\5*\26\2de\5\16\b\2el\3\2\2\2fg\5"+
		"*\26\2gh\t\2\2\2hi\5*\26\2ij\5\16\b\2jl\3\2\2\2k[\3\2\2\2k^\3\2\2\2kb"+
		"\3\2\2\2kf\3\2\2\2lq\3\2\2\2mn\f\3\2\2np\5\6\4\4om\3\2\2\2ps\3\2\2\2q"+
		"o\3\2\2\2qr\3\2\2\2r\7\3\2\2\2sq\3\2\2\2tu\5*\26\2uv\7\25\2\2vw\5*\26"+
		"\2w\177\3\2\2\2xy\5*\26\2yz\7\25\2\2z\177\3\2\2\2{|\7\25\2\2|\177\5*\26"+
		"\2}\177\7\25\2\2~t\3\2\2\2~x\3\2\2\2~{\3\2\2\2~}\3\2\2\2\177\t\3\2\2\2"+
		"\u0080\u0081\b\6\1\2\u0081\u0082\5*\26\2\u0082\u0083\t\3\2\2\u0083\u0084"+
		"\5*\26\2\u0084\u0085\5\16\b\2\u0085\u0091\3\2\2\2\u0086\u0087\t\3\2\2"+
		"\u0087\u0088\5*\26\2\u0088\u0089\5\16\b\2\u0089\u0091\3\2\2\2\u008a\u008b"+
		"\5*\26\2\u008b\u008c\t\3\2\2\u008c\u008d\5\16\b\2\u008d\u0091\3\2\2\2"+
		"\u008e\u008f\t\3\2\2\u008f\u0091\5\16\b\2\u0090\u0080\3\2\2\2\u0090\u0086"+
		"\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0096\3\2\2\2\u0092"+
		"\u0093\f\7\2\2\u0093\u0095\5\n\6\b\u0094\u0092\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\13\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009a\b\7\1\2\u009a\u009b\5\16\b\2\u009b\u009c\5\6\4\2"+
		"\u009c\u00ae\3\2\2\2\u009d\u009e\5\16\b\2\u009e\u009f\5\6\4\2\u009f\u00a0"+
		"\5\n\6\2\u00a0\u00ae\3\2\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3\5\n\6\2"+
		"\u00a3\u00a4\5\6\4\2\u00a4\u00ae\3\2\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7"+
		"\t\4\2\2\u00a7\u00a8\5\16\b\2\u00a8\u00ae\3\2\2\2\u00a9\u00ae\5\16\b\2"+
		"\u00aa\u00ab\5\16\b\2\u00ab\u00ac\5\n\6\2\u00ac\u00ae\3\2\2\2\u00ad\u0099"+
		"\3\2\2\2\u00ad\u009d\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad"+
		"\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\u00dd\3\2\2\2\u00af\u00b0\f\f"+
		"\2\2\u00b0\u00b1\5*\26\2\u00b1\u00b2\7%\2\2\u00b2\u00b3\5*\26\2\u00b3"+
		"\u00b4\5\f\7\r\u00b4\u00dc\3\2\2\2\u00b5\u00b6\f\n\2\2\u00b6\u00b7\5*"+
		"\26\2\u00b7\u00b8\7$\2\2\u00b8\u00b9\5*\26\2\u00b9\u00ba\5\f\7\13\u00ba"+
		"\u00dc\3\2\2\2\u00bb\u00bc\f\t\2\2\u00bc\u00bd\7$\2\2\u00bd\u00be\5*\26"+
		"\2\u00be\u00bf\5\f\7\n\u00bf\u00dc\3\2\2\2\u00c0\u00c1\f\b\2\2\u00c1\u00c2"+
		"\5*\26\2\u00c2\u00c3\7$\2\2\u00c3\u00c4\5\f\7\t\u00c4\u00dc\3\2\2\2\u00c5"+
		"\u00c6\f\7\2\2\u00c6\u00c7\7$\2\2\u00c7\u00dc\5\f\7\b\u00c8\u00c9\f\6"+
		"\2\2\u00c9\u00ca\5*\26\2\u00ca\u00cb\7%\2\2\u00cb\u00cc\5*\26\2\u00cc"+
		"\u00cd\5\f\7\7\u00cd\u00dc\3\2\2\2\u00ce\u00cf\f\5\2\2\u00cf\u00d0\7%"+
		"\2\2\u00d0\u00d1\5*\26\2\u00d1\u00d2\5\f\7\6\u00d2\u00dc\3\2\2\2\u00d3"+
		"\u00d4\f\4\2\2\u00d4\u00d5\5*\26\2\u00d5\u00d6\7%\2\2\u00d6\u00d7\5\f"+
		"\7\5\u00d7\u00dc\3\2\2\2\u00d8\u00d9\f\3\2\2\u00d9\u00da\7%\2\2\u00da"+
		"\u00dc\5\f\7\4\u00db\u00af\3\2\2\2\u00db\u00b5\3\2\2\2\u00db\u00bb\3\2"+
		"\2\2\u00db\u00c0\3\2\2\2\u00db\u00c5\3\2\2\2\u00db\u00c8\3\2\2\2\u00db"+
		"\u00ce\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\u00df\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\r\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00e0\u00e8\7\33\2\2\u00e1\u00e2\7\26\2\2\u00e2\u00e8\7\33\2"+
		"\2\u00e3\u00e8\7\34\2\2\u00e4\u00e8\7&\2\2\u00e5\u00e8\5&\24\2\u00e6\u00e8"+
		"\5\34\17\2\u00e7\u00e0\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e3\3\2\2\2"+
		"\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\17"+
		"\3\2\2\2\u00e9\u00ea\7\n\2\2\u00ea\u00eb\7\"\2\2\u00eb\u00ec\5\22\n\2"+
		"\u00ec\u00ed\7#\2\2\u00ed\u0102\3\2\2\2\u00ee\u00ef\7\n\2\2\u00ef\u00f0"+
		"\7\"\2\2\u00f0\u00f1\5*\26\2\u00f1\u00f2\5\22\n\2\u00f2\u00f3\7#\2\2\u00f3"+
		"\u0102\3\2\2\2\u00f4\u00f5\7\n\2\2\u00f5\u00f6\7\"\2\2\u00f6\u00f7\5\22"+
		"\n\2\u00f7\u00f8\5*\26\2\u00f8\u00f9\7#\2\2\u00f9\u0102\3\2\2\2\u00fa"+
		"\u00fb\7\n\2\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd\5*\26\2\u00fd\u00fe\5\22"+
		"\n\2\u00fe\u00ff\5*\26\2\u00ff\u0100\7#\2\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00e9\3\2\2\2\u0101\u00ee\3\2\2\2\u0101\u00f4\3\2\2\2\u0101\u00fa\3\2"+
		"\2\2\u0102\21\3\2\2\2\u0103\u0104\5\16\b\2\u0104\u0105\5\b\5\2\u0105\u0106"+
		"\5\22\n\2\u0106\u010e\3\2\2\2\u0107\u0108\5\34\17\2\u0108\u0109\5\b\5"+
		"\2\u0109\u010a\5\22\n\2\u010a\u010e\3\2\2\2\u010b\u010e\5\34\17\2\u010c"+
		"\u010e\5\16\b\2\u010d\u0103\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u010b\3"+
		"\2\2\2\u010d\u010c\3\2\2\2\u010e\23\3\2\2\2\u010f\u0110\7\37\2\2\u0110"+
		"\u0114\5*\26\2\u0111\u0113\5\26\f\2\u0112\u0111\3\2\2\2\u0113\u0116\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011d\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\5(\25\2\u0118\u0119\7!\2\2\u0119\u011a\5\26"+
		"\f\2\u011a\u011c\3\2\2\2\u011b\u0117\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0125\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0121\5(\25\2\u0121\u0122\7 \2\2\u0122\u0123\7\31\2\2\u0123"+
		"\u0124\5\30\r\2\u0124\u0126\3\2\2\2\u0125\u0120\3\2\2\2\u0125\u0126\3"+
		"\2\2\2\u0126\u0152\3\2\2\2\u0127\u012b\7\37\2\2\u0128\u012a\5\26\f\2\u0129"+
		"\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u0134\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\5(\25\2\u012f"+
		"\u0130\7!\2\2\u0130\u0131\5\26\f\2\u0131\u0133\3\2\2\2\u0132\u012e\3\2"+
		"\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u013c\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\5(\25\2\u0138\u0139\7 "+
		"\2\2\u0139\u013a\7\31\2\2\u013a\u013b\5\30\r\2\u013b\u013d\3\2\2\2\u013c"+
		"\u0137\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0152\3\2\2\2\u013e\u0142\7\37"+
		"\2\2\u013f\u0141\5\26\f\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0149\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0146\7!\2\2\u0146\u0148\5\26\f\2\u0147\u0145\3\2\2\2\u0148"+
		"\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014f\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7 \2\2\u014d\u014e\7\31\2\2\u014e"+
		"\u0150\5\30\r\2\u014f\u014c\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3"+
		"\2\2\2\u0151\u010f\3\2\2\2\u0151\u0127\3\2\2\2\u0151\u013e\3\2\2\2\u0152"+
		"\25\3\2\2\2\u0153\u0154\5*\26\2\u0154\u0155\5\f\7\2\u0155\u0156\7\31\2"+
		"\2\u0156\u0157\5\30\r\2\u0157\u015f\3\2\2\2\u0158\u0159\7\"\2\2\u0159"+
		"\u015a\5\f\7\2\u015a\u015b\7#\2\2\u015b\u015c\7\31\2\2\u015c\u015d\5\30"+
		"\r\2\u015d\u015f\3\2\2\2\u015e\u0153\3\2\2\2\u015e\u0158\3\2\2\2\u015f"+
		"\27\3\2\2\2\u0160\u0161\5(\25\2\u0161\u0162\5\f\7\2\u0162\u0163\5\30\r"+
		"\2\u0163\u0183\3\2\2\2\u0164\u0165\5(\25\2\u0165\u0166\5\24\13\2\u0166"+
		"\u0167\5\30\r\2\u0167\u0183\3\2\2\2\u0168\u0169\5(\25\2\u0169\u016a\5"+
		"\32\16\2\u016a\u016b\5\30\r\2\u016b\u0183\3\2\2\2\u016c\u016d\5(\25\2"+
		"\u016d\u016e\5\36\20\2\u016e\u016f\5\30\r\2\u016f\u0183\3\2\2\2\u0170"+
		"\u0171\5(\25\2\u0171\u0172\5\20\t\2\u0172\u0173\5\30\r\2\u0173\u0183\3"+
		"\2\2\2\u0174\u0175\5(\25\2\u0175\u0176\5 \21\2\u0176\u0177\5\30\r\2\u0177"+
		"\u0183\3\2\2\2\u0178\u0179\5(\25\2\u0179\u017a\7\r\2\2\u017a\u017b\5\30"+
		"\r\2\u017b\u0183\3\2\2\2\u017c\u017e\5\4\3\2\u017d\u017c\3\2\2\2\u017e"+
		"\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2"+
		"\2\2\u0181\u017f\3\2\2\2\u0182\u0160\3\2\2\2\u0182\u0164\3\2\2\2\u0182"+
		"\u0168\3\2\2\2\u0182\u016c\3\2\2\2\u0182\u0170\3\2\2\2\u0182\u0174\3\2"+
		"\2\2\u0182\u0178\3\2\2\2\u0182\u017f\3\2\2\2\u0183\31\3\2\2\2\u0184\u0185"+
		"\7&\2\2\u0185\u0186\7\24\2\2\u0186\u0198\5\f\7\2\u0187\u0188\7&\2\2\u0188"+
		"\u0189\5*\26\2\u0189\u018a\7\24\2\2\u018a\u018b\5\f\7\2\u018b\u0198\3"+
		"\2\2\2\u018c\u018d\7&\2\2\u018d\u018e\5*\26\2\u018e\u018f\7\24\2\2\u018f"+
		"\u0190\5*\26\2\u0190\u0191\5\f\7\2\u0191\u0198\3\2\2\2\u0192\u0193\7&"+
		"\2\2\u0193\u0194\7\24\2\2\u0194\u0195\5*\26\2\u0195\u0196\5\f\7\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0184\3\2\2\2\u0197\u0187\3\2\2\2\u0197\u018c\3\2"+
		"\2\2\u0197\u0192\3\2\2\2\u0198\33\3\2\2\2\u0199\u019a\7\6\2\2\u019a\u019b"+
		"\7\"\2\2\u019b\u019c\5\16\b\2\u019c\u019d\7#\2\2\u019d\u01b2\3\2\2\2\u019e"+
		"\u019f\7\6\2\2\u019f\u01a0\7\"\2\2\u01a0\u01a1\5*\26\2\u01a1\u01a2\5\16"+
		"\b\2\u01a2\u01a3\5*\26\2\u01a3\u01a4\7#\2\2\u01a4\u01b2\3\2\2\2\u01a5"+
		"\u01a6\7\6\2\2\u01a6\u01a7\7\"\2\2\u01a7\u01a8\5*\26\2\u01a8\u01a9\5\16"+
		"\b\2\u01a9\u01aa\7#\2\2\u01aa\u01b2\3\2\2\2\u01ab\u01ac\7\6\2\2\u01ac"+
		"\u01ad\7\"\2\2\u01ad\u01ae\5\16\b\2\u01ae\u01af\5*\26\2\u01af\u01b0\7"+
		"#\2\2\u01b0\u01b2\3\2\2\2\u01b1\u0199\3\2\2\2\u01b1\u019e\3\2\2\2\u01b1"+
		"\u01a5\3\2\2\2\u01b1\u01ab\3\2\2\2\u01b2\35\3\2\2\2\u01b3\u01b4\7\7\2"+
		"\2\u01b4\u01b5\5*\26\2\u01b5\u01b6\5\f\7\2\u01b6\u01b7\7\31\2\2\u01b7"+
		"\u01b8\5\30\r\2\u01b8\u01bc\3\2\2\2\u01b9\u01ba\7\7\2\2\u01ba\u01bc\5"+
		"\26\f\2\u01bb\u01b3\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\37\3\2\2\2\u01bd"+
		"\u01be\7\b\2\2\u01be\u01bf\5*\26\2\u01bf\u01c0\5\16\b\2\u01c0\u01c1\5"+
		"*\26\2\u01c1\u01c2\7\t\2\2\u01c2\u01c3\5*\26\2\u01c3\u01c4\7\5\2\2\u01c4"+
		"\u01c5\5\"\22\2\u01c5\u01c6\7\31\2\2\u01c6\u01c7\5\30\r\2\u01c7!\3\2\2"+
		"\2\u01c8\u01c9\7\"\2\2\u01c9\u01ca\5*\26\2\u01ca\u01cb\5\16\b\2\u01cb"+
		"\u01cc\5*\26\2\u01cc\u01cd\7#\2\2\u01cd\u01ea\3\2\2\2\u01ce\u01cf\7\""+
		"\2\2\u01cf\u01d0\5\16\b\2\u01d0\u01d1\5*\26\2\u01d1\u01d2\7#\2\2\u01d2"+
		"\u01ea\3\2\2\2\u01d3\u01d4\7\"\2\2\u01d4\u01d5\5*\26\2\u01d5\u01d6\5\16"+
		"\b\2\u01d6\u01d7\7#\2\2\u01d7\u01ea\3\2\2\2\u01d8\u01d9\7\"\2\2\u01d9"+
		"\u01da\5\16\b\2\u01da\u01db\7#\2\2\u01db\u01ea\3\2\2\2\u01dc\u01dd\7\""+
		"\2\2\u01dd\u01de\5\16\b\2\u01de\u01df\7\4\2\2\u01df\u01e0\5$\23\2\u01e0"+
		"\u01e1\7#\2\2\u01e1\u01ea\3\2\2\2\u01e2\u01e3\7\"\2\2\u01e3\u01e4\5*\26"+
		"\2\u01e4\u01e5\5\16\b\2\u01e5\u01e6\7\4\2\2\u01e6\u01e7\5$\23\2\u01e7"+
		"\u01e8\7#\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01c8\3\2\2\2\u01e9\u01ce\3\2"+
		"\2\2\u01e9\u01d3\3\2\2\2\u01e9\u01d8\3\2\2\2\u01e9\u01dc\3\2\2\2\u01e9"+
		"\u01e2\3\2\2\2\u01ea#\3\2\2\2\u01eb\u01ec\5*\26\2\u01ec\u01ed\5\16\b\2"+
		"\u01ed\u01f4\3\2\2\2\u01ee\u01f4\5\16\b\2\u01ef\u01f0\5*\26\2\u01f0\u01f1"+
		"\5\16\b\2\u01f1\u01f2\5\6\4\2\u01f2\u01f4\3\2\2\2\u01f3\u01eb\3\2\2\2"+
		"\u01f3\u01ee\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f4%\3\2\2\2\u01f5\u01f6\7"+
		"\3\2\2\u01f6\u01f7\7\"\2\2\u01f7\u01f8\5\16\b\2\u01f8\u01f9\7#\2\2\u01f9"+
		"\u022a\3\2\2\2\u01fa\u01fb\7\3\2\2\u01fb\u01fc\7\"\2\2\u01fc\u01fd\5*"+
		"\26\2\u01fd\u01fe\5\16\b\2\u01fe\u01ff\5*\26\2\u01ff\u0200\7#\2\2\u0200"+
		"\u022a\3\2\2\2\u0201\u0202\7\3\2\2\u0202\u0203\7\"\2\2\u0203\u0204\5*"+
		"\26\2\u0204\u0205\5\16\b\2\u0205\u0206\7#\2\2\u0206\u022a\3\2\2\2\u0207"+
		"\u0208\7\3\2\2\u0208\u0209\7\"\2\2\u0209\u020a\5\16\b\2\u020a\u020b\5"+
		"*\26\2\u020b\u020c\7#\2\2\u020c\u022a\3\2\2\2\u020d\u020e\7\3\2\2\u020e"+
		"\u020f\7\"\2\2\u020f\u0210\5\16\b\2\u0210\u0211\5\6\4\2\u0211\u0212\7"+
		"#\2\2\u0212\u022a\3\2\2\2\u0213\u0214\7\3\2\2\u0214\u0215\7\"\2\2\u0215"+
		"\u0216\5*\26\2\u0216\u0217\5\16\b\2\u0217\u0218\5\6\4\2\u0218\u0219\5"+
		"*\26\2\u0219\u021a\7#\2\2\u021a\u022a\3\2\2\2\u021b\u021c\7\3\2\2\u021c"+
		"\u021d\7\"\2\2\u021d\u021e\5*\26\2\u021e\u021f\5\16\b\2\u021f\u0220\5"+
		"\6\4\2\u0220\u0221\7#\2\2\u0221\u022a\3\2\2\2\u0222\u0223\7\3\2\2\u0223"+
		"\u0224\7\"\2\2\u0224\u0225\5\16\b\2\u0225\u0226\5\6\4\2\u0226\u0227\5"+
		"*\26\2\u0227\u0228\7#\2\2\u0228\u022a\3\2\2\2\u0229\u01f5\3\2\2\2\u0229"+
		"\u01fa\3\2\2\2\u0229\u0201\3\2\2\2\u0229\u0207\3\2\2\2\u0229\u020d\3\2"+
		"\2\2\u0229\u0213\3\2\2\2\u0229\u021b\3\2\2\2\u0229\u0222\3\2\2\2\u022a"+
		"\'\3\2\2\2\u022b\u022c\b\25\1\2\u022c\u022d\7\f\2\2\u022d\u0232\3\2\2"+
		"\2\u022e\u022f\f\3\2\2\u022f\u0231\5(\25\4\u0230\u022e\3\2\2\2\u0231\u0234"+
		"\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233)\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0235\u0236\b\26\1\2\u0236\u0239\7\13\2\2\u0237\u0239\7"+
		"\f\2\2\u0238\u0235\3\2\2\2\u0238\u0237\3\2\2\2\u0239\u023e\3\2\2\2\u023a"+
		"\u023b\f\3\2\2\u023b\u023d\5*\26\4\u023c\u023a\3\2\2\2\u023d\u0240\3\2"+
		"\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f+\3\2\2\2\u0240\u023e"+
		"\3\2\2\2*\63:AHOVYkq~\u0090\u0096\u00ad\u00db\u00dd\u00e7\u0101\u010d"+
		"\u0114\u011d\u0125\u012b\u0134\u013c\u0142\u0149\u014f\u0151\u015e\u017f"+
		"\u0182\u0197\u01b1\u01bb\u01e9\u01f3\u0229\u0232\u0238\u023e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}