// Generated from /Users/mac/workspace/mips-r3000-assembler/gen-src/main/antlr/MipsAsm.g4 by ANTLR 4.5.1
package com.github.mshockwave.mips_assembler.grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MipsAsmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, WS=45, NEWLINE=46, 
		COMMENT=47, NUM=48, HEX_NUM=49, ALPHA=50, IMM_REG=51, S_REG=52, T_REG=53, 
		V_REG=54, A_REG=55, K_REG=56;
	public static final int
		RULE_prog = 0, RULE_iden = 1, RULE_label = 2, RULE_reg = 3, RULE_usigned_imm = 4, 
		RULE_signed_imm = 5, RULE_stat = 6, RULE_op_add = 7, RULE_op_addu = 8, 
		RULE_op_sub = 9, RULE_op_and = 10, RULE_op_or = 11, RULE_op_nor = 12, 
		RULE_op_xor = 13, RULE_op_nand = 14, RULE_op_slt = 15, RULE_op_sll = 16, 
		RULE_op_srl = 17, RULE_op_sra = 18, RULE_op_jr = 19, RULE_instr_r = 20, 
		RULE_op_addi = 21, RULE_op_addiu = 22, RULE_op_lw = 23, RULE_op_lh = 24, 
		RULE_op_lhu = 25, RULE_op_lb = 26, RULE_op_lbu = 27, RULE_op_sw = 28, 
		RULE_op_sh = 29, RULE_op_sb = 30, RULE_op_lui = 31, RULE_op_andi = 32, 
		RULE_op_ori = 33, RULE_op_nori = 34, RULE_op_slti = 35, RULE_op_beq = 36, 
		RULE_op_bne = 37, RULE_op_bgtz = 38, RULE_instr_i = 39, RULE_op_j = 40, 
		RULE_op_jal = 41, RULE_instr_j = 42, RULE_op_halt = 43, RULE_instr = 44;
	public static final String[] ruleNames = {
		"prog", "iden", "label", "reg", "usigned_imm", "signed_imm", "stat", "op_add", 
		"op_addu", "op_sub", "op_and", "op_or", "op_nor", "op_xor", "op_nand", 
		"op_slt", "op_sll", "op_srl", "op_sra", "op_jr", "instr_r", "op_addi", 
		"op_addiu", "op_lw", "op_lh", "op_lhu", "op_lb", "op_lbu", "op_sw", "op_sh", 
		"op_sb", "op_lui", "op_andi", "op_ori", "op_nori", "op_slti", "op_beq", 
		"op_bne", "op_bgtz", "instr_i", "op_j", "op_jal", "instr_j", "op_halt", 
		"instr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'_'", "':'", "'$zero'", "'$sp'", "'$fp'", "'$ra'", "'-'", "'add'", 
		"','", "'addu'", "'sub'", "'and'", "'or'", "'nor'", "'xor'", "'nand'", 
		"'slt'", "'sll'", "'srl'", "'sra'", "'jr'", "'addi'", "'addiu'", "'lw'", 
		"'('", "')'", "'lh'", "'lhu'", "'lb'", "'lbu'", "'sw'", "'sh'", "'sb'", 
		"'lui'", "'andi'", "'ori'", "'nori'", "'slti'", "'beq'", "'bne'", "'bgtz'", 
		"'j'", "'jal'", "'halt'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "WS", "NEWLINE", 
		"COMMENT", "NUM", "HEX_NUM", "ALPHA", "IMM_REG", "S_REG", "T_REG", "V_REG", 
		"A_REG", "K_REG"
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
	public String getGrammarFileName() { return "MipsAsm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MipsAsmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				stat();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << NEWLINE) | (1L << COMMENT) | (1L << NUM) | (1L << ALPHA))) != 0) );
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

	public static class IdenContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(MipsAsmParser.ALPHA, 0); }
		public TerminalNode NUM() { return getToken(MipsAsmParser.NUM, 0); }
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public IdenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterIden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitIden(this);
		}
	}

	public final IdenContext iden() throws RecognitionException {
		IdenContext _localctx = new IdenContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_iden);
		try {
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(ALPHA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(ALPHA);
				setState(98);
				iden();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(NUM);
				setState(100);
				iden();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				match(T__0);
				setState(102);
				iden();
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

	public static class LabelContext extends ParserRuleContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			iden();
			setState(106);
			match(T__1);
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

	public static class RegContext extends ParserRuleContext {
		public TerminalNode S_REG() { return getToken(MipsAsmParser.S_REG, 0); }
		public TerminalNode T_REG() { return getToken(MipsAsmParser.T_REG, 0); }
		public TerminalNode A_REG() { return getToken(MipsAsmParser.A_REG, 0); }
		public TerminalNode V_REG() { return getToken(MipsAsmParser.V_REG, 0); }
		public TerminalNode K_REG() { return getToken(MipsAsmParser.K_REG, 0); }
		public TerminalNode IMM_REG() { return getToken(MipsAsmParser.IMM_REG, 0); }
		public RegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitReg(this);
		}
	}

	public final RegContext reg() throws RecognitionException {
		RegContext _localctx = new RegContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << IMM_REG) | (1L << S_REG) | (1L << T_REG) | (1L << V_REG) | (1L << A_REG) | (1L << K_REG))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Usigned_immContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(MipsAsmParser.NUM, 0); }
		public TerminalNode HEX_NUM() { return getToken(MipsAsmParser.HEX_NUM, 0); }
		public Usigned_immContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usigned_imm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterUsigned_imm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitUsigned_imm(this);
		}
	}

	public final Usigned_immContext usigned_imm() throws RecognitionException {
		Usigned_immContext _localctx = new Usigned_immContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_usigned_imm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==HEX_NUM) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Signed_immContext extends ParserRuleContext {
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public Signed_immContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_imm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterSigned_imm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitSigned_imm(this);
		}
	}

	public final Signed_immContext signed_imm() throws RecognitionException {
		Signed_immContext _localctx = new Signed_immContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_signed_imm);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__6);
				setState(113);
				usigned_imm();
				}
				break;
			case NUM:
			case HEX_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				usigned_imm();
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

	public static class StatContext extends ParserRuleContext {
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MipsAsmParser.NEWLINE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(MipsAsmParser.COMMENT, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stat);
		try {
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				instr(0);
				setState(118);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				instr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				label();
				setState(122);
				instr(0);
				setState(123);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				label();
				setState(126);
				instr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				match(COMMENT);
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

	public static class Op_addContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_add(this);
		}
	}

	public final Op_addContext op_add() throws RecognitionException {
		Op_addContext _localctx = new Op_addContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_op_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__7);
			setState(133);
			((Op_addContext)_localctx).rd = reg();
			setState(134);
			match(T__8);
			setState(135);
			((Op_addContext)_localctx).rs = reg();
			setState(136);
			match(T__8);
			setState(137);
			((Op_addContext)_localctx).rt = reg();
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

	public static class Op_adduContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_adduContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_addu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_addu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_addu(this);
		}
	}

	public final Op_adduContext op_addu() throws RecognitionException {
		Op_adduContext _localctx = new Op_adduContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_op_addu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__9);
			setState(140);
			((Op_adduContext)_localctx).rd = reg();
			setState(141);
			match(T__8);
			setState(142);
			((Op_adduContext)_localctx).rs = reg();
			setState(143);
			match(T__8);
			setState(144);
			((Op_adduContext)_localctx).rt = reg();
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

	public static class Op_subContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_sub(this);
		}
	}

	public final Op_subContext op_sub() throws RecognitionException {
		Op_subContext _localctx = new Op_subContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_op_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__10);
			setState(147);
			((Op_subContext)_localctx).rd = reg();
			setState(148);
			match(T__8);
			setState(149);
			((Op_subContext)_localctx).rs = reg();
			setState(150);
			match(T__8);
			setState(151);
			((Op_subContext)_localctx).rt = reg();
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

	public static class Op_andContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_and(this);
		}
	}

	public final Op_andContext op_and() throws RecognitionException {
		Op_andContext _localctx = new Op_andContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_op_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__11);
			setState(154);
			((Op_andContext)_localctx).rd = reg();
			setState(155);
			match(T__8);
			setState(156);
			((Op_andContext)_localctx).rs = reg();
			setState(157);
			match(T__8);
			setState(158);
			((Op_andContext)_localctx).rt = reg();
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

	public static class Op_orContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_or(this);
		}
	}

	public final Op_orContext op_or() throws RecognitionException {
		Op_orContext _localctx = new Op_orContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__12);
			setState(161);
			((Op_orContext)_localctx).rd = reg();
			setState(162);
			match(T__8);
			setState(163);
			((Op_orContext)_localctx).rs = reg();
			setState(164);
			match(T__8);
			setState(165);
			((Op_orContext)_localctx).rt = reg();
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

	public static class Op_norContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_norContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_nor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_nor(this);
		}
	}

	public final Op_norContext op_nor() throws RecognitionException {
		Op_norContext _localctx = new Op_norContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op_nor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__13);
			setState(168);
			((Op_norContext)_localctx).rd = reg();
			setState(169);
			match(T__8);
			setState(170);
			((Op_norContext)_localctx).rs = reg();
			setState(171);
			match(T__8);
			setState(172);
			((Op_norContext)_localctx).rt = reg();
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

	public static class Op_xorContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_xorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_xor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_xor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_xor(this);
		}
	}

	public final Op_xorContext op_xor() throws RecognitionException {
		Op_xorContext _localctx = new Op_xorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op_xor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__14);
			setState(175);
			((Op_xorContext)_localctx).rd = reg();
			setState(176);
			match(T__8);
			setState(177);
			((Op_xorContext)_localctx).rs = reg();
			setState(178);
			match(T__8);
			setState(179);
			((Op_xorContext)_localctx).rt = reg();
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

	public static class Op_nandContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_nandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_nand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_nand(this);
		}
	}

	public final Op_nandContext op_nand() throws RecognitionException {
		Op_nandContext _localctx = new Op_nandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op_nand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__15);
			setState(182);
			((Op_nandContext)_localctx).rd = reg();
			setState(183);
			match(T__8);
			setState(184);
			((Op_nandContext)_localctx).rs = reg();
			setState(185);
			match(T__8);
			setState(186);
			((Op_nandContext)_localctx).rt = reg();
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

	public static class Op_sltContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_sltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_slt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_slt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_slt(this);
		}
	}

	public final Op_sltContext op_slt() throws RecognitionException {
		Op_sltContext _localctx = new Op_sltContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_op_slt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__16);
			setState(189);
			((Op_sltContext)_localctx).rd = reg();
			setState(190);
			match(T__8);
			setState(191);
			((Op_sltContext)_localctx).rs = reg();
			setState(192);
			match(T__8);
			setState(193);
			((Op_sltContext)_localctx).rt = reg();
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

	public static class Op_sllContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rt;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_sllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_sll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_sll(this);
		}
	}

	public final Op_sllContext op_sll() throws RecognitionException {
		Op_sllContext _localctx = new Op_sllContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op_sll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__17);
			setState(196);
			((Op_sllContext)_localctx).rd = reg();
			setState(197);
			match(T__8);
			setState(198);
			((Op_sllContext)_localctx).rt = reg();
			setState(199);
			match(T__8);
			setState(200);
			usigned_imm();
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

	public static class Op_srlContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rt;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_srlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_srl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_srl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_srl(this);
		}
	}

	public final Op_srlContext op_srl() throws RecognitionException {
		Op_srlContext _localctx = new Op_srlContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op_srl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__18);
			setState(203);
			((Op_srlContext)_localctx).rd = reg();
			setState(204);
			match(T__8);
			setState(205);
			((Op_srlContext)_localctx).rt = reg();
			setState(206);
			match(T__8);
			setState(207);
			usigned_imm();
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

	public static class Op_sraContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rt;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_sraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_sra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_sra(this);
		}
	}

	public final Op_sraContext op_sra() throws RecognitionException {
		Op_sraContext _localctx = new Op_sraContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_op_sra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__19);
			setState(210);
			((Op_sraContext)_localctx).rd = reg();
			setState(211);
			match(T__8);
			setState(212);
			((Op_sraContext)_localctx).rt = reg();
			setState(213);
			match(T__8);
			setState(214);
			usigned_imm();
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

	public static class Op_jrContext extends ParserRuleContext {
		public RegContext rs;
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public Op_jrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_jr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_jr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_jr(this);
		}
	}

	public final Op_jrContext op_jr() throws RecognitionException {
		Op_jrContext _localctx = new Op_jrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op_jr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__20);
			setState(217);
			((Op_jrContext)_localctx).rs = reg();
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

	public static class Instr_rContext extends ParserRuleContext {
		public Op_addContext op_add() {
			return getRuleContext(Op_addContext.class,0);
		}
		public Op_adduContext op_addu() {
			return getRuleContext(Op_adduContext.class,0);
		}
		public Op_subContext op_sub() {
			return getRuleContext(Op_subContext.class,0);
		}
		public Op_andContext op_and() {
			return getRuleContext(Op_andContext.class,0);
		}
		public Op_orContext op_or() {
			return getRuleContext(Op_orContext.class,0);
		}
		public Op_norContext op_nor() {
			return getRuleContext(Op_norContext.class,0);
		}
		public Op_xorContext op_xor() {
			return getRuleContext(Op_xorContext.class,0);
		}
		public Op_nandContext op_nand() {
			return getRuleContext(Op_nandContext.class,0);
		}
		public Op_sltContext op_slt() {
			return getRuleContext(Op_sltContext.class,0);
		}
		public Op_sllContext op_sll() {
			return getRuleContext(Op_sllContext.class,0);
		}
		public Op_srlContext op_srl() {
			return getRuleContext(Op_srlContext.class,0);
		}
		public Op_sraContext op_sra() {
			return getRuleContext(Op_sraContext.class,0);
		}
		public Op_jrContext op_jr() {
			return getRuleContext(Op_jrContext.class,0);
		}
		public Instr_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterInstr_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitInstr_r(this);
		}
	}

	public final Instr_rContext instr_r() throws RecognitionException {
		Instr_rContext _localctx = new Instr_rContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_instr_r);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				op_add();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				op_addu();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				op_sub();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				op_and();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				op_or();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				op_nor();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				op_xor();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 8);
				{
				setState(226);
				op_nand();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 9);
				{
				setState(227);
				op_slt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 10);
				{
				setState(228);
				op_sll();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 11);
				{
				setState(229);
				op_srl();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 12);
				{
				setState(230);
				op_sra();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 13);
				{
				setState(231);
				op_jr();
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

	public static class Op_addiContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_addiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_addi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_addi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_addi(this);
		}
	}

	public final Op_addiContext op_addi() throws RecognitionException {
		Op_addiContext _localctx = new Op_addiContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_addi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__21);
			setState(235);
			((Op_addiContext)_localctx).rt = reg();
			setState(236);
			match(T__8);
			setState(237);
			((Op_addiContext)_localctx).rs = reg();
			setState(238);
			match(T__8);
			setState(239);
			signed_imm();
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

	public static class Op_addiuContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_addiuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_addiu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_addiu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_addiu(this);
		}
	}

	public final Op_addiuContext op_addiu() throws RecognitionException {
		Op_addiuContext _localctx = new Op_addiuContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_addiu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__22);
			setState(242);
			((Op_addiuContext)_localctx).rt = reg();
			setState(243);
			match(T__8);
			setState(244);
			((Op_addiuContext)_localctx).rs = reg();
			setState(245);
			match(T__8);
			setState(246);
			usigned_imm();
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

	public static class Op_lwContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_lwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_lw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_lw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_lw(this);
		}
	}

	public final Op_lwContext op_lw() throws RecognitionException {
		Op_lwContext _localctx = new Op_lwContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_op_lw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__23);
			setState(249);
			((Op_lwContext)_localctx).rt = reg();
			setState(250);
			match(T__8);
			setState(251);
			signed_imm();
			setState(252);
			match(T__24);
			setState(253);
			((Op_lwContext)_localctx).rs = reg();
			setState(254);
			match(T__25);
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

	public static class Op_lhContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_lhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_lh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_lh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_lh(this);
		}
	}

	public final Op_lhContext op_lh() throws RecognitionException {
		Op_lhContext _localctx = new Op_lhContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_op_lh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__26);
			setState(257);
			((Op_lhContext)_localctx).rt = reg();
			setState(258);
			match(T__8);
			setState(259);
			signed_imm();
			setState(260);
			match(T__24);
			setState(261);
			((Op_lhContext)_localctx).rs = reg();
			setState(262);
			match(T__25);
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

	public static class Op_lhuContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_lhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_lhu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_lhu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_lhu(this);
		}
	}

	public final Op_lhuContext op_lhu() throws RecognitionException {
		Op_lhuContext _localctx = new Op_lhuContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_lhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__27);
			setState(265);
			((Op_lhuContext)_localctx).rt = reg();
			setState(266);
			match(T__8);
			setState(267);
			signed_imm();
			setState(268);
			match(T__24);
			setState(269);
			((Op_lhuContext)_localctx).rs = reg();
			setState(270);
			match(T__25);
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

	public static class Op_lbContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_lbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_lb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_lb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_lb(this);
		}
	}

	public final Op_lbContext op_lb() throws RecognitionException {
		Op_lbContext _localctx = new Op_lbContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_op_lb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__28);
			setState(273);
			((Op_lbContext)_localctx).rt = reg();
			setState(274);
			match(T__8);
			setState(275);
			signed_imm();
			setState(276);
			match(T__24);
			setState(277);
			((Op_lbContext)_localctx).rs = reg();
			setState(278);
			match(T__25);
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

	public static class Op_lbuContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_lbuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_lbu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_lbu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_lbu(this);
		}
	}

	public final Op_lbuContext op_lbu() throws RecognitionException {
		Op_lbuContext _localctx = new Op_lbuContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_op_lbu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__29);
			setState(281);
			((Op_lbuContext)_localctx).rt = reg();
			setState(282);
			match(T__8);
			setState(283);
			signed_imm();
			setState(284);
			match(T__24);
			setState(285);
			((Op_lbuContext)_localctx).rs = reg();
			setState(286);
			match(T__25);
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

	public static class Op_swContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_swContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_sw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_sw(this);
		}
	}

	public final Op_swContext op_sw() throws RecognitionException {
		Op_swContext _localctx = new Op_swContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_op_sw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__30);
			setState(289);
			((Op_swContext)_localctx).rt = reg();
			setState(290);
			match(T__8);
			setState(291);
			signed_imm();
			setState(292);
			match(T__24);
			setState(293);
			((Op_swContext)_localctx).rs = reg();
			setState(294);
			match(T__25);
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

	public static class Op_shContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_shContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_sh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_sh(this);
		}
	}

	public final Op_shContext op_sh() throws RecognitionException {
		Op_shContext _localctx = new Op_shContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_sh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__31);
			setState(297);
			((Op_shContext)_localctx).rt = reg();
			setState(298);
			match(T__8);
			setState(299);
			signed_imm();
			setState(300);
			match(T__24);
			setState(301);
			((Op_shContext)_localctx).rs = reg();
			setState(302);
			match(T__25);
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

	public static class Op_sbContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_sbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_sb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_sb(this);
		}
	}

	public final Op_sbContext op_sb() throws RecognitionException {
		Op_sbContext _localctx = new Op_sbContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_sb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(T__32);
			setState(305);
			((Op_sbContext)_localctx).rt = reg();
			setState(306);
			match(T__8);
			setState(307);
			signed_imm();
			setState(308);
			match(T__24);
			setState(309);
			((Op_sbContext)_localctx).rs = reg();
			setState(310);
			match(T__25);
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

	public static class Op_luiContext extends ParserRuleContext {
		public RegContext rt;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public Op_luiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_lui; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_lui(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_lui(this);
		}
	}

	public final Op_luiContext op_lui() throws RecognitionException {
		Op_luiContext _localctx = new Op_luiContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_op_lui);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T__33);
			setState(313);
			((Op_luiContext)_localctx).rt = reg();
			setState(314);
			match(T__8);
			setState(315);
			usigned_imm();
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

	public static class Op_andiContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_andiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_andi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_andi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_andi(this);
		}
	}

	public final Op_andiContext op_andi() throws RecognitionException {
		Op_andiContext _localctx = new Op_andiContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_andi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__34);
			setState(318);
			((Op_andiContext)_localctx).rt = reg();
			setState(319);
			match(T__8);
			setState(320);
			((Op_andiContext)_localctx).rs = reg();
			setState(321);
			match(T__8);
			setState(322);
			usigned_imm();
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

	public static class Op_oriContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_oriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_ori; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_ori(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_ori(this);
		}
	}

	public final Op_oriContext op_ori() throws RecognitionException {
		Op_oriContext _localctx = new Op_oriContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_ori);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__35);
			setState(325);
			((Op_oriContext)_localctx).rt = reg();
			setState(326);
			match(T__8);
			setState(327);
			((Op_oriContext)_localctx).rs = reg();
			setState(328);
			match(T__8);
			setState(329);
			usigned_imm();
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

	public static class Op_noriContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_noriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nori; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_nori(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_nori(this);
		}
	}

	public final Op_noriContext op_nori() throws RecognitionException {
		Op_noriContext _localctx = new Op_noriContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_op_nori);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__36);
			setState(332);
			((Op_noriContext)_localctx).rt = reg();
			setState(333);
			match(T__8);
			setState(334);
			((Op_noriContext)_localctx).rs = reg();
			setState(335);
			match(T__8);
			setState(336);
			usigned_imm();
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

	public static class Op_sltiContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_sltiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_slti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_slti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_slti(this);
		}
	}

	public final Op_sltiContext op_slti() throws RecognitionException {
		Op_sltiContext _localctx = new Op_sltiContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_op_slti);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__37);
			setState(339);
			((Op_sltiContext)_localctx).rt = reg();
			setState(340);
			match(T__8);
			setState(341);
			((Op_sltiContext)_localctx).rs = reg();
			setState(342);
			match(T__8);
			setState(343);
			signed_imm();
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

	public static class Op_beqContext extends ParserRuleContext {
		public RegContext rs;
		public RegContext rt;
		public IdenContext target;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_beqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_beq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_beq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_beq(this);
		}
	}

	public final Op_beqContext op_beq() throws RecognitionException {
		Op_beqContext _localctx = new Op_beqContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_op_beq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__38);
			setState(346);
			((Op_beqContext)_localctx).rs = reg();
			setState(347);
			match(T__8);
			setState(348);
			((Op_beqContext)_localctx).rt = reg();
			setState(349);
			match(T__8);
			setState(350);
			((Op_beqContext)_localctx).target = iden();
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

	public static class Op_bneContext extends ParserRuleContext {
		public RegContext rs;
		public RegContext rt;
		public IdenContext target;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_bneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_bne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_bne(this);
		}
	}

	public final Op_bneContext op_bne() throws RecognitionException {
		Op_bneContext _localctx = new Op_bneContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_bne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__39);
			setState(353);
			((Op_bneContext)_localctx).rs = reg();
			setState(354);
			match(T__8);
			setState(355);
			((Op_bneContext)_localctx).rt = reg();
			setState(356);
			match(T__8);
			setState(357);
			((Op_bneContext)_localctx).target = iden();
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

	public static class Op_bgtzContext extends ParserRuleContext {
		public RegContext rs;
		public IdenContext target;
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_bgtzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bgtz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_bgtz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_bgtz(this);
		}
	}

	public final Op_bgtzContext op_bgtz() throws RecognitionException {
		Op_bgtzContext _localctx = new Op_bgtzContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_op_bgtz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__40);
			setState(360);
			((Op_bgtzContext)_localctx).rs = reg();
			setState(361);
			match(T__8);
			setState(362);
			((Op_bgtzContext)_localctx).target = iden();
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

	public static class Instr_iContext extends ParserRuleContext {
		public Op_addiContext op_addi() {
			return getRuleContext(Op_addiContext.class,0);
		}
		public Op_addiuContext op_addiu() {
			return getRuleContext(Op_addiuContext.class,0);
		}
		public Op_lwContext op_lw() {
			return getRuleContext(Op_lwContext.class,0);
		}
		public Op_lhContext op_lh() {
			return getRuleContext(Op_lhContext.class,0);
		}
		public Op_lhuContext op_lhu() {
			return getRuleContext(Op_lhuContext.class,0);
		}
		public Op_lbContext op_lb() {
			return getRuleContext(Op_lbContext.class,0);
		}
		public Op_lbuContext op_lbu() {
			return getRuleContext(Op_lbuContext.class,0);
		}
		public Op_swContext op_sw() {
			return getRuleContext(Op_swContext.class,0);
		}
		public Op_shContext op_sh() {
			return getRuleContext(Op_shContext.class,0);
		}
		public Op_sbContext op_sb() {
			return getRuleContext(Op_sbContext.class,0);
		}
		public Op_luiContext op_lui() {
			return getRuleContext(Op_luiContext.class,0);
		}
		public Op_andiContext op_andi() {
			return getRuleContext(Op_andiContext.class,0);
		}
		public Op_oriContext op_ori() {
			return getRuleContext(Op_oriContext.class,0);
		}
		public Op_noriContext op_nori() {
			return getRuleContext(Op_noriContext.class,0);
		}
		public Op_sltiContext op_slti() {
			return getRuleContext(Op_sltiContext.class,0);
		}
		public Op_beqContext op_beq() {
			return getRuleContext(Op_beqContext.class,0);
		}
		public Op_bneContext op_bne() {
			return getRuleContext(Op_bneContext.class,0);
		}
		public Op_bgtzContext op_bgtz() {
			return getRuleContext(Op_bgtzContext.class,0);
		}
		public Instr_iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterInstr_i(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitInstr_i(this);
		}
	}

	public final Instr_iContext instr_i() throws RecognitionException {
		Instr_iContext _localctx = new Instr_iContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_instr_i);
		try {
			setState(382);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				op_addi();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				op_addiu();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				op_lw();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				op_lh();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				op_lhu();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(369);
				op_lb();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 7);
				{
				setState(370);
				op_lbu();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 8);
				{
				setState(371);
				op_sw();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 9);
				{
				setState(372);
				op_sh();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 10);
				{
				setState(373);
				op_sb();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 11);
				{
				setState(374);
				op_lui();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 12);
				{
				setState(375);
				op_andi();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 13);
				{
				setState(376);
				op_ori();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 14);
				{
				setState(377);
				op_nori();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 15);
				{
				setState(378);
				op_slti();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 16);
				{
				setState(379);
				op_beq();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 17);
				{
				setState(380);
				op_bne();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 18);
				{
				setState(381);
				op_bgtz();
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

	public static class Op_jContext extends ParserRuleContext {
		public IdenContext target;
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_jContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_j; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_j(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_j(this);
		}
	}

	public final Op_jContext op_j() throws RecognitionException {
		Op_jContext _localctx = new Op_jContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_j);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__41);
			setState(385);
			((Op_jContext)_localctx).target = iden();
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

	public static class Op_jalContext extends ParserRuleContext {
		public IdenContext target;
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_jalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_jal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_jal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_jal(this);
		}
	}

	public final Op_jalContext op_jal() throws RecognitionException {
		Op_jalContext _localctx = new Op_jalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_op_jal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__42);
			setState(388);
			((Op_jalContext)_localctx).target = iden();
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

	public static class Instr_jContext extends ParserRuleContext {
		public Op_jContext op_j() {
			return getRuleContext(Op_jContext.class,0);
		}
		public Op_jalContext op_jal() {
			return getRuleContext(Op_jalContext.class,0);
		}
		public Instr_jContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_j; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterInstr_j(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitInstr_j(this);
		}
	}

	public final Instr_jContext instr_j() throws RecognitionException {
		Instr_jContext _localctx = new Instr_jContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_instr_j);
		try {
			setState(392);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				op_j();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				op_jal();
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

	public static class Op_haltContext extends ParserRuleContext {
		public Op_haltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_halt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_halt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_halt(this);
		}
	}

	public final Op_haltContext op_halt() throws RecognitionException {
		Op_haltContext _localctx = new Op_haltContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op_halt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__43);
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

	public static class InstrContext extends ParserRuleContext {
		public Instr_rContext instr_r() {
			return getRuleContext(Instr_rContext.class,0);
		}
		public Instr_iContext instr_i() {
			return getRuleContext(Instr_iContext.class,0);
		}
		public Instr_jContext instr_j() {
			return getRuleContext(Instr_jContext.class,0);
		}
		public Op_haltContext op_halt() {
			return getRuleContext(Op_haltContext.class,0);
		}
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(MipsAsmParser.COMMENT, 0); }
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitInstr(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		return instr(0);
	}

	private InstrContext instr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstrContext _localctx = new InstrContext(_ctx, _parentState);
		InstrContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_instr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			switch (_input.LA(1)) {
			case T__7:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				{
				setState(397);
				instr_r();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				{
				setState(398);
				instr_i();
				}
				break;
			case T__41:
			case T__42:
				{
				setState(399);
				instr_j();
				}
				break;
			case T__43:
				{
				setState(400);
				op_halt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instr);
					setState(403);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(404);
					match(COMMENT);
					}
					} 
				}
				setState(409);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 44:
			return instr_sempred((InstrContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean instr_sempred(InstrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u019d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\6\2^\n\2\r\2\16\2_\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3j\n\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7v\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0085\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00eb\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0181\n)\3*\3*\3*\3+\3+\3+\3,\3,\5,\u018b"+
		"\n,\3-\3-\3.\3.\3.\3.\3.\5.\u0194\n.\3.\3.\7.\u0198\n.\f.\16.\u019b\13"+
		".\3.\2\3Z/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\2\4\4\2\5\b\65:\3\2\62\63\u019c\2]\3\2\2\2\4i\3\2\2"+
		"\2\6k\3\2\2\2\bn\3\2\2\2\np\3\2\2\2\fu\3\2\2\2\16\u0084\3\2\2\2\20\u0086"+
		"\3\2\2\2\22\u008d\3\2\2\2\24\u0094\3\2\2\2\26\u009b\3\2\2\2\30\u00a2\3"+
		"\2\2\2\32\u00a9\3\2\2\2\34\u00b0\3\2\2\2\36\u00b7\3\2\2\2 \u00be\3\2\2"+
		"\2\"\u00c5\3\2\2\2$\u00cc\3\2\2\2&\u00d3\3\2\2\2(\u00da\3\2\2\2*\u00ea"+
		"\3\2\2\2,\u00ec\3\2\2\2.\u00f3\3\2\2\2\60\u00fa\3\2\2\2\62\u0102\3\2\2"+
		"\2\64\u010a\3\2\2\2\66\u0112\3\2\2\28\u011a\3\2\2\2:\u0122\3\2\2\2<\u012a"+
		"\3\2\2\2>\u0132\3\2\2\2@\u013a\3\2\2\2B\u013f\3\2\2\2D\u0146\3\2\2\2F"+
		"\u014d\3\2\2\2H\u0154\3\2\2\2J\u015b\3\2\2\2L\u0162\3\2\2\2N\u0169\3\2"+
		"\2\2P\u0180\3\2\2\2R\u0182\3\2\2\2T\u0185\3\2\2\2V\u018a\3\2\2\2X\u018c"+
		"\3\2\2\2Z\u0193\3\2\2\2\\^\5\16\b\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3"+
		"\2\2\2`\3\3\2\2\2aj\7\64\2\2bj\7\62\2\2cd\7\64\2\2dj\5\4\3\2ef\7\62\2"+
		"\2fj\5\4\3\2gh\7\3\2\2hj\5\4\3\2ia\3\2\2\2ib\3\2\2\2ic\3\2\2\2ie\3\2\2"+
		"\2ig\3\2\2\2j\5\3\2\2\2kl\5\4\3\2lm\7\4\2\2m\7\3\2\2\2no\t\2\2\2o\t\3"+
		"\2\2\2pq\t\3\2\2q\13\3\2\2\2rs\7\t\2\2sv\5\n\6\2tv\5\n\6\2ur\3\2\2\2u"+
		"t\3\2\2\2v\r\3\2\2\2wx\5Z.\2xy\7\60\2\2y\u0085\3\2\2\2z\u0085\5Z.\2{|"+
		"\5\6\4\2|}\5Z.\2}~\7\60\2\2~\u0085\3\2\2\2\177\u0080\5\6\4\2\u0080\u0081"+
		"\5Z.\2\u0081\u0085\3\2\2\2\u0082\u0085\7\60\2\2\u0083\u0085\7\61\2\2\u0084"+
		"w\3\2\2\2\u0084z\3\2\2\2\u0084{\3\2\2\2\u0084\177\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0083\3\2\2\2\u0085\17\3\2\2\2\u0086\u0087\7\n\2\2\u0087"+
		"\u0088\5\b\5\2\u0088\u0089\7\13\2\2\u0089\u008a\5\b\5\2\u008a\u008b\7"+
		"\13\2\2\u008b\u008c\5\b\5\2\u008c\21\3\2\2\2\u008d\u008e\7\f\2\2\u008e"+
		"\u008f\5\b\5\2\u008f\u0090\7\13\2\2\u0090\u0091\5\b\5\2\u0091\u0092\7"+
		"\13\2\2\u0092\u0093\5\b\5\2\u0093\23\3\2\2\2\u0094\u0095\7\r\2\2\u0095"+
		"\u0096\5\b\5\2\u0096\u0097\7\13\2\2\u0097\u0098\5\b\5\2\u0098\u0099\7"+
		"\13\2\2\u0099\u009a\5\b\5\2\u009a\25\3\2\2\2\u009b\u009c\7\16\2\2\u009c"+
		"\u009d\5\b\5\2\u009d\u009e\7\13\2\2\u009e\u009f\5\b\5\2\u009f\u00a0\7"+
		"\13\2\2\u00a0\u00a1\5\b\5\2\u00a1\27\3\2\2\2\u00a2\u00a3\7\17\2\2\u00a3"+
		"\u00a4\5\b\5\2\u00a4\u00a5\7\13\2\2\u00a5\u00a6\5\b\5\2\u00a6\u00a7\7"+
		"\13\2\2\u00a7\u00a8\5\b\5\2\u00a8\31\3\2\2\2\u00a9\u00aa\7\20\2\2\u00aa"+
		"\u00ab\5\b\5\2\u00ab\u00ac\7\13\2\2\u00ac\u00ad\5\b\5\2\u00ad\u00ae\7"+
		"\13\2\2\u00ae\u00af\5\b\5\2\u00af\33\3\2\2\2\u00b0\u00b1\7\21\2\2\u00b1"+
		"\u00b2\5\b\5\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\5\b\5\2\u00b4\u00b5\7"+
		"\13\2\2\u00b5\u00b6\5\b\5\2\u00b6\35\3\2\2\2\u00b7\u00b8\7\22\2\2\u00b8"+
		"\u00b9\5\b\5\2\u00b9\u00ba\7\13\2\2\u00ba\u00bb\5\b\5\2\u00bb\u00bc\7"+
		"\13\2\2\u00bc\u00bd\5\b\5\2\u00bd\37\3\2\2\2\u00be\u00bf\7\23\2\2\u00bf"+
		"\u00c0\5\b\5\2\u00c0\u00c1\7\13\2\2\u00c1\u00c2\5\b\5\2\u00c2\u00c3\7"+
		"\13\2\2\u00c3\u00c4\5\b\5\2\u00c4!\3\2\2\2\u00c5\u00c6\7\24\2\2\u00c6"+
		"\u00c7\5\b\5\2\u00c7\u00c8\7\13\2\2\u00c8\u00c9\5\b\5\2\u00c9\u00ca\7"+
		"\13\2\2\u00ca\u00cb\5\n\6\2\u00cb#\3\2\2\2\u00cc\u00cd\7\25\2\2\u00cd"+
		"\u00ce\5\b\5\2\u00ce\u00cf\7\13\2\2\u00cf\u00d0\5\b\5\2\u00d0\u00d1\7"+
		"\13\2\2\u00d1\u00d2\5\n\6\2\u00d2%\3\2\2\2\u00d3\u00d4\7\26\2\2\u00d4"+
		"\u00d5\5\b\5\2\u00d5\u00d6\7\13\2\2\u00d6\u00d7\5\b\5\2\u00d7\u00d8\7"+
		"\13\2\2\u00d8\u00d9\5\n\6\2\u00d9\'\3\2\2\2\u00da\u00db\7\27\2\2\u00db"+
		"\u00dc\5\b\5\2\u00dc)\3\2\2\2\u00dd\u00eb\5\20\t\2\u00de\u00eb\5\22\n"+
		"\2\u00df\u00eb\5\24\13\2\u00e0\u00eb\5\26\f\2\u00e1\u00eb\5\30\r\2\u00e2"+
		"\u00eb\5\32\16\2\u00e3\u00eb\5\34\17\2\u00e4\u00eb\5\36\20\2\u00e5\u00eb"+
		"\5 \21\2\u00e6\u00eb\5\"\22\2\u00e7\u00eb\5$\23\2\u00e8\u00eb\5&\24\2"+
		"\u00e9\u00eb\5(\25\2\u00ea\u00dd\3\2\2\2\u00ea\u00de\3\2\2\2\u00ea\u00df"+
		"\3\2\2\2\u00ea\u00e0\3\2\2\2\u00ea\u00e1\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea"+
		"\u00e3\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2"+
		"\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"+\3\2\2\2\u00ec\u00ed\7\30\2\2\u00ed\u00ee\5\b\5\2\u00ee\u00ef\7\13\2"+
		"\2\u00ef\u00f0\5\b\5\2\u00f0\u00f1\7\13\2\2\u00f1\u00f2\5\f\7\2\u00f2"+
		"-\3\2\2\2\u00f3\u00f4\7\31\2\2\u00f4\u00f5\5\b\5\2\u00f5\u00f6\7\13\2"+
		"\2\u00f6\u00f7\5\b\5\2\u00f7\u00f8\7\13\2\2\u00f8\u00f9\5\n\6\2\u00f9"+
		"/\3\2\2\2\u00fa\u00fb\7\32\2\2\u00fb\u00fc\5\b\5\2\u00fc\u00fd\7\13\2"+
		"\2\u00fd\u00fe\5\f\7\2\u00fe\u00ff\7\33\2\2\u00ff\u0100\5\b\5\2\u0100"+
		"\u0101\7\34\2\2\u0101\61\3\2\2\2\u0102\u0103\7\35\2\2\u0103\u0104\5\b"+
		"\5\2\u0104\u0105\7\13\2\2\u0105\u0106\5\f\7\2\u0106\u0107\7\33\2\2\u0107"+
		"\u0108\5\b\5\2\u0108\u0109\7\34\2\2\u0109\63\3\2\2\2\u010a\u010b\7\36"+
		"\2\2\u010b\u010c\5\b\5\2\u010c\u010d\7\13\2\2\u010d\u010e\5\f\7\2\u010e"+
		"\u010f\7\33\2\2\u010f\u0110\5\b\5\2\u0110\u0111\7\34\2\2\u0111\65\3\2"+
		"\2\2\u0112\u0113\7\37\2\2\u0113\u0114\5\b\5\2\u0114\u0115\7\13\2\2\u0115"+
		"\u0116\5\f\7\2\u0116\u0117\7\33\2\2\u0117\u0118\5\b\5\2\u0118\u0119\7"+
		"\34\2\2\u0119\67\3\2\2\2\u011a\u011b\7 \2\2\u011b\u011c\5\b\5\2\u011c"+
		"\u011d\7\13\2\2\u011d\u011e\5\f\7\2\u011e\u011f\7\33\2\2\u011f\u0120\5"+
		"\b\5\2\u0120\u0121\7\34\2\2\u01219\3\2\2\2\u0122\u0123\7!\2\2\u0123\u0124"+
		"\5\b\5\2\u0124\u0125\7\13\2\2\u0125\u0126\5\f\7\2\u0126\u0127\7\33\2\2"+
		"\u0127\u0128\5\b\5\2\u0128\u0129\7\34\2\2\u0129;\3\2\2\2\u012a\u012b\7"+
		"\"\2\2\u012b\u012c\5\b\5\2\u012c\u012d\7\13\2\2\u012d\u012e\5\f\7\2\u012e"+
		"\u012f\7\33\2\2\u012f\u0130\5\b\5\2\u0130\u0131\7\34\2\2\u0131=\3\2\2"+
		"\2\u0132\u0133\7#\2\2\u0133\u0134\5\b\5\2\u0134\u0135\7\13\2\2\u0135\u0136"+
		"\5\f\7\2\u0136\u0137\7\33\2\2\u0137\u0138\5\b\5\2\u0138\u0139\7\34\2\2"+
		"\u0139?\3\2\2\2\u013a\u013b\7$\2\2\u013b\u013c\5\b\5\2\u013c\u013d\7\13"+
		"\2\2\u013d\u013e\5\n\6\2\u013eA\3\2\2\2\u013f\u0140\7%\2\2\u0140\u0141"+
		"\5\b\5\2\u0141\u0142\7\13\2\2\u0142\u0143\5\b\5\2\u0143\u0144\7\13\2\2"+
		"\u0144\u0145\5\n\6\2\u0145C\3\2\2\2\u0146\u0147\7&\2\2\u0147\u0148\5\b"+
		"\5\2\u0148\u0149\7\13\2\2\u0149\u014a\5\b\5\2\u014a\u014b\7\13\2\2\u014b"+
		"\u014c\5\n\6\2\u014cE\3\2\2\2\u014d\u014e\7\'\2\2\u014e\u014f\5\b\5\2"+
		"\u014f\u0150\7\13\2\2\u0150\u0151\5\b\5\2\u0151\u0152\7\13\2\2\u0152\u0153"+
		"\5\n\6\2\u0153G\3\2\2\2\u0154\u0155\7(\2\2\u0155\u0156\5\b\5\2\u0156\u0157"+
		"\7\13\2\2\u0157\u0158\5\b\5\2\u0158\u0159\7\13\2\2\u0159\u015a\5\f\7\2"+
		"\u015aI\3\2\2\2\u015b\u015c\7)\2\2\u015c\u015d\5\b\5\2\u015d\u015e\7\13"+
		"\2\2\u015e\u015f\5\b\5\2\u015f\u0160\7\13\2\2\u0160\u0161\5\4\3\2\u0161"+
		"K\3\2\2\2\u0162\u0163\7*\2\2\u0163\u0164\5\b\5\2\u0164\u0165\7\13\2\2"+
		"\u0165\u0166\5\b\5\2\u0166\u0167\7\13\2\2\u0167\u0168\5\4\3\2\u0168M\3"+
		"\2\2\2\u0169\u016a\7+\2\2\u016a\u016b\5\b\5\2\u016b\u016c\7\13\2\2\u016c"+
		"\u016d\5\4\3\2\u016dO\3\2\2\2\u016e\u0181\5,\27\2\u016f\u0181\5.\30\2"+
		"\u0170\u0181\5\60\31\2\u0171\u0181\5\62\32\2\u0172\u0181\5\64\33\2\u0173"+
		"\u0181\5\66\34\2\u0174\u0181\58\35\2\u0175\u0181\5:\36\2\u0176\u0181\5"+
		"<\37\2\u0177\u0181\5> \2\u0178\u0181\5@!\2\u0179\u0181\5B\"\2\u017a\u0181"+
		"\5D#\2\u017b\u0181\5F$\2\u017c\u0181\5H%\2\u017d\u0181\5J&\2\u017e\u0181"+
		"\5L\'\2\u017f\u0181\5N(\2\u0180\u016e\3\2\2\2\u0180\u016f\3\2\2\2\u0180"+
		"\u0170\3\2\2\2\u0180\u0171\3\2\2\2\u0180\u0172\3\2\2\2\u0180\u0173\3\2"+
		"\2\2\u0180\u0174\3\2\2\2\u0180\u0175\3\2\2\2\u0180\u0176\3\2\2\2\u0180"+
		"\u0177\3\2\2\2\u0180\u0178\3\2\2\2\u0180\u0179\3\2\2\2\u0180\u017a\3\2"+
		"\2\2\u0180\u017b\3\2\2\2\u0180\u017c\3\2\2\2\u0180\u017d\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181Q\3\2\2\2\u0182\u0183\7,\2\2\u0183"+
		"\u0184\5\4\3\2\u0184S\3\2\2\2\u0185\u0186\7-\2\2\u0186\u0187\5\4\3\2\u0187"+
		"U\3\2\2\2\u0188\u018b\5R*\2\u0189\u018b\5T+\2\u018a\u0188\3\2\2\2\u018a"+
		"\u0189\3\2\2\2\u018bW\3\2\2\2\u018c\u018d\7.\2\2\u018dY\3\2\2\2\u018e"+
		"\u018f\b.\1\2\u018f\u0194\5*\26\2\u0190\u0194\5P)\2\u0191\u0194\5V,\2"+
		"\u0192\u0194\5X-\2\u0193\u018e\3\2\2\2\u0193\u0190\3\2\2\2\u0193\u0191"+
		"\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u0199\3\2\2\2\u0195\u0196\f\3\2\2\u0196"+
		"\u0198\7\61\2\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3"+
		"\2\2\2\u0199\u019a\3\2\2\2\u019a[\3\2\2\2\u019b\u0199\3\2\2\2\13_iu\u0084"+
		"\u00ea\u0180\u018a\u0193\u0199";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}