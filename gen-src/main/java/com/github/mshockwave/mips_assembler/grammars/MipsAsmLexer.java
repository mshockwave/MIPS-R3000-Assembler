// Generated from /Users/mac/workspace/mips-r3000-assembler/gen-src/main/antlr/MipsAsm.g4 by ANTLR 4.5.1
package com.github.mshockwave.mips_assembler.grammars;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MipsAsmLexer extends Lexer {
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
		T__38=39, T__39=40, T__40=41, T__41=42, WS=43, NEWLINE=44, COMMENT=45, 
		NUM=46, NUM_SYM=47, ALPHA=48, S_REG=49, T_REG=50, V_REG=51, A_REG=52, 
		K_REG=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "WS", "NEWLINE", "COMMENT", "NUM", "NUM_SYM", "ALPHA", "S_REG", 
		"T_REG", "V_REG", "A_REG", "K_REG"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'_'", "':'", "'$zero'", "'$sp'", "'$fp'", "'$ra'", "'add'", "','", 
		"'addu'", "'sub'", "'and'", "'or'", "'nor'", "'xor'", "'nand'", "'slt'", 
		"'sll'", "'srl'", "'sra'", "'jr'", "'addi'", "'addiu'", "'lw'", "'('", 
		"')'", "'lh'", "'lhu'", "'lb'", "'lbu'", "'sw'", "'sh'", "'sb'", "'lui'", 
		"'andi'", "'ori'", "'nori'", "'slti'", "'beq'", "'bgtz'", "'j'", "'jal'", 
		"'halt'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "WS", "NEWLINE", "COMMENT", 
		"NUM", "NUM_SYM", "ALPHA", "S_REG", "T_REG", "V_REG", "A_REG", "K_REG"
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


	public MipsAsmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MipsAsm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u0149\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\6"+
		",\u010f\n,\r,\16,\u0110\3,\3,\3-\5-\u0116\n-\3-\3-\3.\3.\7.\u011c\n.\f"+
		".\16.\u011f\13.\3.\3.\3.\3.\3/\6/\u0126\n/\r/\16/\u0127\3\60\3\60\3\61"+
		"\6\61\u012d\n\61\r\61\16\61\u012e\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\u011d\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67\3\2\t\4\2\13\13\"\"\3\2\62;\4\2--//\4\2C"+
		"Cc|\3\2\629\3\2\62\63\3\2\62\65\u014d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\tw\3\2\2"+
		"\2\13{\3\2\2\2\r\177\3\2\2\2\17\u0083\3\2\2\2\21\u0087\3\2\2\2\23\u0089"+
		"\3\2\2\2\25\u008e\3\2\2\2\27\u0092\3\2\2\2\31\u0096\3\2\2\2\33\u0099\3"+
		"\2\2\2\35\u009d\3\2\2\2\37\u00a1\3\2\2\2!\u00a6\3\2\2\2#\u00aa\3\2\2\2"+
		"%\u00ae\3\2\2\2\'\u00b2\3\2\2\2)\u00b6\3\2\2\2+\u00b9\3\2\2\2-\u00be\3"+
		"\2\2\2/\u00c4\3\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb\3\2\2"+
		"\2\67\u00ce\3\2\2\29\u00d2\3\2\2\2;\u00d5\3\2\2\2=\u00d9\3\2\2\2?\u00dc"+
		"\3\2\2\2A\u00df\3\2\2\2C\u00e2\3\2\2\2E\u00e6\3\2\2\2G\u00eb\3\2\2\2I"+
		"\u00ef\3\2\2\2K\u00f4\3\2\2\2M\u00f9\3\2\2\2O\u00fd\3\2\2\2Q\u0102\3\2"+
		"\2\2S\u0104\3\2\2\2U\u0108\3\2\2\2W\u010e\3\2\2\2Y\u0115\3\2\2\2[\u0119"+
		"\3\2\2\2]\u0125\3\2\2\2_\u0129\3\2\2\2a\u012c\3\2\2\2c\u0130\3\2\2\2e"+
		"\u0135\3\2\2\2g\u013a\3\2\2\2i\u013f\3\2\2\2k\u0144\3\2\2\2mn\7a\2\2n"+
		"\4\3\2\2\2op\7<\2\2p\6\3\2\2\2qr\7&\2\2rs\7|\2\2st\7g\2\2tu\7t\2\2uv\7"+
		"q\2\2v\b\3\2\2\2wx\7&\2\2xy\7u\2\2yz\7r\2\2z\n\3\2\2\2{|\7&\2\2|}\7h\2"+
		"\2}~\7r\2\2~\f\3\2\2\2\177\u0080\7&\2\2\u0080\u0081\7t\2\2\u0081\u0082"+
		"\7c\2\2\u0082\16\3\2\2\2\u0083\u0084\7c\2\2\u0084\u0085\7f\2\2\u0085\u0086"+
		"\7f\2\2\u0086\20\3\2\2\2\u0087\u0088\7.\2\2\u0088\22\3\2\2\2\u0089\u008a"+
		"\7c\2\2\u008a\u008b\7f\2\2\u008b\u008c\7f\2\2\u008c\u008d\7w\2\2\u008d"+
		"\24\3\2\2\2\u008e\u008f\7u\2\2\u008f\u0090\7w\2\2\u0090\u0091\7d\2\2\u0091"+
		"\26\3\2\2\2\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094\u0095\7f\2\2\u0095"+
		"\30\3\2\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\32\3\2\2\2\u0099"+
		"\u009a\7p\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c\34\3\2\2\2\u009d"+
		"\u009e\7z\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7t\2\2\u00a0\36\3\2\2\2\u00a1"+
		"\u00a2\7p\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7f\2\2"+
		"\u00a5 \3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7v\2"+
		"\2\u00a9\"\3\2\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7"+
		"n\2\2\u00ad$\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1"+
		"\7n\2\2\u00b1&\3\2\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5"+
		"\7c\2\2\u00b5(\3\2\2\2\u00b6\u00b7\7l\2\2\u00b7\u00b8\7t\2\2\u00b8*\3"+
		"\2\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7f\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd,\3\2\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7f\2\2\u00c0"+
		"\u00c1\7f\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7w\2\2\u00c3.\3\2\2\2\u00c4"+
		"\u00c5\7n\2\2\u00c5\u00c6\7y\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8"+
		"\62\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca\64\3\2\2\2\u00cb\u00cc\7n\2\2\u00cc"+
		"\u00cd\7j\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7j\2\2\u00d0"+
		"\u00d1\7w\2\2\u00d18\3\2\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7d\2\2\u00d4"+
		":\3\2\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7w\2\2\u00d8"+
		"<\3\2\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7y\2\2\u00db>\3\2\2\2\u00dc\u00dd"+
		"\7u\2\2\u00dd\u00de\7j\2\2\u00de@\3\2\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1"+
		"\7d\2\2\u00e1B\3\2\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9"+
		"\7f\2\2\u00e9\u00ea\7k\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed"+
		"\7t\2\2\u00ed\u00ee\7k\2\2\u00eeH\3\2\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1"+
		"\7q\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7k\2\2\u00f3J\3\2\2\2\u00f4\u00f5"+
		"\7u\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7k\2\2\u00f8"+
		"L\3\2\2\2\u00f9\u00fa\7d\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7s\2\2\u00fc"+
		"N\3\2\2\2\u00fd\u00fe\7d\2\2\u00fe\u00ff\7i\2\2\u00ff\u0100\7v\2\2\u0100"+
		"\u0101\7|\2\2\u0101P\3\2\2\2\u0102\u0103\7l\2\2\u0103R\3\2\2\2\u0104\u0105"+
		"\7l\2\2\u0105\u0106\7c\2\2\u0106\u0107\7n\2\2\u0107T\3\2\2\2\u0108\u0109"+
		"\7j\2\2\u0109\u010a\7c\2\2\u010a\u010b\7n\2\2\u010b\u010c\7v\2\2\u010c"+
		"V\3\2\2\2\u010d\u010f\t\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113"+
		"\b,\2\2\u0113X\3\2\2\2\u0114\u0116\7\17\2\2\u0115\u0114\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\f\2\2\u0118Z\3\2\2\2"+
		"\u0119\u011d\7%\2\2\u011a\u011c\13\2\2\2\u011b\u011a\3\2\2\2\u011c\u011f"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0121\5Y-\2\u0121\u0122\3\2\2\2\u0122\u0123\b.\2"+
		"\2\u0123\\\3\2\2\2\u0124\u0126\t\3\2\2\u0125\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128^\3\2\2\2\u0129"+
		"\u012a\t\4\2\2\u012a`\3\2\2\2\u012b\u012d\t\5\2\2\u012c\u012b\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012fb\3"+
		"\2\2\2\u0130\u0131\7&\2\2\u0131\u0132\7u\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\t\6\2\2\u0134d\3\2\2\2\u0135\u0136\7&\2\2\u0136\u0137\7v\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\t\3\2\2\u0139f\3\2\2\2\u013a\u013b\7&\2\2\u013b"+
		"\u013c\7x\2\2\u013c\u013d\3\2\2\2\u013d\u013e\t\7\2\2\u013eh\3\2\2\2\u013f"+
		"\u0140\7&\2\2\u0140\u0141\7c\2\2\u0141\u0142\3\2\2\2\u0142\u0143\t\b\2"+
		"\2\u0143j\3\2\2\2\u0144\u0145\7&\2\2\u0145\u0146\7m\2\2\u0146\u0147\3"+
		"\2\2\2\u0147\u0148\t\7\2\2\u0148l\3\2\2\2\b\2\u0110\u0115\u011d\u0127"+
		"\u012e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}