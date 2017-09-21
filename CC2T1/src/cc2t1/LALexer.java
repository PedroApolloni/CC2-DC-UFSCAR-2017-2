// Generated from LA.g4 by ANTLR 4.7
package cc2t1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, COMENTARIO=59, 
		WS=60, IDENT=61, NUM_INT=62, NUM_REAL=63, CADEIA=64, ERROR=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"T__57", "COMENTARIO", "WS", "IDENT", "NUM_INT", "NUM_REAL", "CADEIA", 
		"ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "':'", 
		"'='", "','", "'^'", "'.'", "'['", "']'", "'literal'", "'inteiro'", "'real'", 
		"'logico'", "'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", 
		"'procedimento'", "'('", "')'", "'fim_procedimento'", "'funcao'", "'fim_funcao'", 
		"'var'", "'leia'", "'escreva'", "'se'", "'entao'", "'fim_se'", "'caso'", 
		"'seja'", "'fim_caso'", "'para'", "'<-'", "'ate'", "'faca'", "'fim_para'", 
		"'enquanto'", "'fim_enquanto'", "'retorne'", "'senao'", "'..'", "'-'", 
		"'*'", "'/'", "'+'", "'&'", "'%'", "'<>'", "'>='", "'<='", "'>'", "'<'", 
		"'nao'", "'ou'", "'e'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "COMENTARIO", 
		"WS", "IDENT", "NUM_INT", "NUM_REAL", "CADEIA", "ERROR"
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


	public LALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LA.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 58:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 64:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 throw new ParseCancellationException("Linha "+getLine()+": "+getText()+" - simbolo nao identificado"); 
			//break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u01f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-"+
		"\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\39\39\39\39\3:\3:\3:\3;\3"+
		";\3<\3<\7<\u01ce\n<\f<\16<\u01d1\13<\3<\3<\3<\3=\3=\3=\3>\3>\7>\u01db"+
		"\n>\f>\16>\u01de\13>\3?\6?\u01e1\n?\r?\16?\u01e2\3@\3@\3@\3@\3A\3A\7A"+
		"\u01eb\nA\fA\16A\u01ee\13A\3A\3A\3B\3B\3B\2\2C\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\3\2\7\3\2\177\177\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\3\2\f\f\2\u01f7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u008f\3\2\2\2\7\u009d\3\2\2\2\t\u00a5"+
		"\3\2\2\2\13\u00af\3\2\2\2\r\u00b1\3\2\2\2\17\u00b3\3\2\2\2\21\u00b5\3"+
		"\2\2\2\23\u00b7\3\2\2\2\25\u00b9\3\2\2\2\27\u00bb\3\2\2\2\31\u00bd\3\2"+
		"\2\2\33\u00c5\3\2\2\2\35\u00cd\3\2\2\2\37\u00d2\3\2\2\2!\u00d9\3\2\2\2"+
		"#\u00e4\3\2\2\2%\u00ea\3\2\2\2\'\u00f3\3\2\2\2)\u0100\3\2\2\2+\u010d\3"+
		"\2\2\2-\u010f\3\2\2\2/\u0111\3\2\2\2\61\u0122\3\2\2\2\63\u0129\3\2\2\2"+
		"\65\u0134\3\2\2\2\67\u0138\3\2\2\29\u013d\3\2\2\2;\u0145\3\2\2\2=\u0148"+
		"\3\2\2\2?\u014e\3\2\2\2A\u0155\3\2\2\2C\u015a\3\2\2\2E\u015f\3\2\2\2G"+
		"\u0168\3\2\2\2I\u016d\3\2\2\2K\u0170\3\2\2\2M\u0174\3\2\2\2O\u0179\3\2"+
		"\2\2Q\u0182\3\2\2\2S\u018b\3\2\2\2U\u0198\3\2\2\2W\u01a0\3\2\2\2Y\u01a6"+
		"\3\2\2\2[\u01a9\3\2\2\2]\u01ab\3\2\2\2_\u01ad\3\2\2\2a\u01af\3\2\2\2c"+
		"\u01b1\3\2\2\2e\u01b3\3\2\2\2g\u01b5\3\2\2\2i\u01b8\3\2\2\2k\u01bb\3\2"+
		"\2\2m\u01be\3\2\2\2o\u01c0\3\2\2\2q\u01c2\3\2\2\2s\u01c6\3\2\2\2u\u01c9"+
		"\3\2\2\2w\u01cb\3\2\2\2y\u01d5\3\2\2\2{\u01d8\3\2\2\2}\u01e0\3\2\2\2\177"+
		"\u01e4\3\2\2\2\u0081\u01e8\3\2\2\2\u0083\u01f1\3\2\2\2\u0085\u0086\7c"+
		"\2\2\u0086\u0087\7n\2\2\u0087\u0088\7i\2\2\u0088\u0089\7q\2\2\u0089\u008a"+
		"\7t\2\2\u008a\u008b\7k\2\2\u008b\u008c\7v\2\2\u008c\u008d\7o\2\2\u008d"+
		"\u008e\7q\2\2\u008e\4\3\2\2\2\u008f\u0090\7h\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7o\2\2\u0092\u0093\7a\2\2\u0093\u0094\7c\2\2\u0094\u0095\7n\2\2"+
		"\u0095\u0096\7i\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\u0099"+
		"\7k\2\2\u0099\u009a\7v\2\2\u009a\u009b\7o\2\2\u009b\u009c\7q\2\2\u009c"+
		"\6\3\2\2\2\u009d\u009e\7f\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7e\2\2\u00a0"+
		"\u00a1\7n\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g\2\2"+
		"\u00a4\b\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7p"+
		"\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7g\2\2\u00ae\n\3\2\2\2\u00af\u00b0"+
		"\7<\2\2\u00b0\f\3\2\2\2\u00b1\u00b2\7?\2\2\u00b2\16\3\2\2\2\u00b3\u00b4"+
		"\7.\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7`\2\2\u00b6\22\3\2\2\2\u00b7\u00b8"+
		"\7\60\2\2\u00b8\24\3\2\2\2\u00b9\u00ba\7]\2\2\u00ba\26\3\2\2\2\u00bb\u00bc"+
		"\7_\2\2\u00bc\30\3\2\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7c\2\2\u00c3"+
		"\u00c4\7n\2\2\u00c4\32\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7"+
		"\u00c8\7v\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7t\2\2"+
		"\u00cb\u00cc\7q\2\2\u00cc\34\3\2\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7"+
		"g\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7n\2\2\u00d1\36\3\2\2\2\u00d2\u00d3"+
		"\7n\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7i\2\2\u00d5\u00d6\7k\2\2\u00d6"+
		"\u00d7\7e\2\2\u00d7\u00d8\7q\2\2\u00d8 \3\2\2\2\u00d9\u00da\7x\2\2\u00da"+
		"\u00db\7g\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7c\2\2"+
		"\u00de\u00df\7f\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2"+
		"\7t\2\2\u00e2\u00e3\7q\2\2\u00e3\"\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6"+
		"\7c\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7q\2\2\u00e9"+
		"$\3\2\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7i\2\2\u00ed"+
		"\u00ee\7k\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7t\2\2"+
		"\u00f1\u00f2\7q\2\2\u00f2&\3\2\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7k\2"+
		"\2\u00f5\u00f6\7o\2\2\u00f6\u00f7\7a\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9"+
		"\7g\2\2\u00f9\u00fa\7i\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7u\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7q\2\2\u00ff(\3\2\2\2\u0100"+
		"\u0101\7r\2\2\u0101\u0102\7t\2\2\u0102\u0103\7q\2\2\u0103\u0104\7e\2\2"+
		"\u0104\u0105\7g\2\2\u0105\u0106\7f\2\2\u0106\u0107\7k\2\2\u0107\u0108"+
		"\7o\2\2\u0108\u0109\7g\2\2\u0109\u010a\7p\2\2\u010a\u010b\7v\2\2\u010b"+
		"\u010c\7q\2\2\u010c*\3\2\2\2\u010d\u010e\7*\2\2\u010e,\3\2\2\2\u010f\u0110"+
		"\7+\2\2\u0110.\3\2\2\2\u0111\u0112\7h\2\2\u0112\u0113\7k\2\2\u0113\u0114"+
		"\7o\2\2\u0114\u0115\7a\2\2\u0115\u0116\7r\2\2\u0116\u0117\7t\2\2\u0117"+
		"\u0118\7q\2\2\u0118\u0119\7e\2\2\u0119\u011a\7g\2\2\u011a\u011b\7f\2\2"+
		"\u011b\u011c\7k\2\2\u011c\u011d\7o\2\2\u011d\u011e\7g\2\2\u011e\u011f"+
		"\7p\2\2\u011f\u0120\7v\2\2\u0120\u0121\7q\2\2\u0121\60\3\2\2\2\u0122\u0123"+
		"\7h\2\2\u0123\u0124\7w\2\2\u0124\u0125\7p\2\2\u0125\u0126\7e\2\2\u0126"+
		"\u0127\7c\2\2\u0127\u0128\7q\2\2\u0128\62\3\2\2\2\u0129\u012a\7h\2\2\u012a"+
		"\u012b\7k\2\2\u012b\u012c\7o\2\2\u012c\u012d\7a\2\2\u012d\u012e\7h\2\2"+
		"\u012e\u012f\7w\2\2\u012f\u0130\7p\2\2\u0130\u0131\7e\2\2\u0131\u0132"+
		"\7c\2\2\u0132\u0133\7q\2\2\u0133\64\3\2\2\2\u0134\u0135\7x\2\2\u0135\u0136"+
		"\7c\2\2\u0136\u0137\7t\2\2\u0137\66\3\2\2\2\u0138\u0139\7n\2\2\u0139\u013a"+
		"\7g\2\2\u013a\u013b\7k\2\2\u013b\u013c\7c\2\2\u013c8\3\2\2\2\u013d\u013e"+
		"\7g\2\2\u013e\u013f\7u\2\2\u013f\u0140\7e\2\2\u0140\u0141\7t\2\2\u0141"+
		"\u0142\7g\2\2\u0142\u0143\7x\2\2\u0143\u0144\7c\2\2\u0144:\3\2\2\2\u0145"+
		"\u0146\7u\2\2\u0146\u0147\7g\2\2\u0147<\3\2\2\2\u0148\u0149\7g\2\2\u0149"+
		"\u014a\7p\2\2\u014a\u014b\7v\2\2\u014b\u014c\7c\2\2\u014c\u014d\7q\2\2"+
		"\u014d>\3\2\2\2\u014e\u014f\7h\2\2\u014f\u0150\7k\2\2\u0150\u0151\7o\2"+
		"\2\u0151\u0152\7a\2\2\u0152\u0153\7u\2\2\u0153\u0154\7g\2\2\u0154@\3\2"+
		"\2\2\u0155\u0156\7e\2\2\u0156\u0157\7c\2\2\u0157\u0158\7u\2\2\u0158\u0159"+
		"\7q\2\2\u0159B\3\2\2\2\u015a\u015b\7u\2\2\u015b\u015c\7g\2\2\u015c\u015d"+
		"\7l\2\2\u015d\u015e\7c\2\2\u015eD\3\2\2\2\u015f\u0160\7h\2\2\u0160\u0161"+
		"\7k\2\2\u0161\u0162\7o\2\2\u0162\u0163\7a\2\2\u0163\u0164\7e\2\2\u0164"+
		"\u0165\7c\2\2\u0165\u0166\7u\2\2\u0166\u0167\7q\2\2\u0167F\3\2\2\2\u0168"+
		"\u0169\7r\2\2\u0169\u016a\7c\2\2\u016a\u016b\7t\2\2\u016b\u016c\7c\2\2"+
		"\u016cH\3\2\2\2\u016d\u016e\7>\2\2\u016e\u016f\7/\2\2\u016fJ\3\2\2\2\u0170"+
		"\u0171\7c\2\2\u0171\u0172\7v\2\2\u0172\u0173\7g\2\2\u0173L\3\2\2\2\u0174"+
		"\u0175\7h\2\2\u0175\u0176\7c\2\2\u0176\u0177\7e\2\2\u0177\u0178\7c\2\2"+
		"\u0178N\3\2\2\2\u0179\u017a\7h\2\2\u017a\u017b\7k\2\2\u017b\u017c\7o\2"+
		"\2\u017c\u017d\7a\2\2\u017d\u017e\7r\2\2\u017e\u017f\7c\2\2\u017f\u0180"+
		"\7t\2\2\u0180\u0181\7c\2\2\u0181P\3\2\2\2\u0182\u0183\7g\2\2\u0183\u0184"+
		"\7p\2\2\u0184\u0185\7s\2\2\u0185\u0186\7w\2\2\u0186\u0187\7c\2\2\u0187"+
		"\u0188\7p\2\2\u0188\u0189\7v\2\2\u0189\u018a\7q\2\2\u018aR\3\2\2\2\u018b"+
		"\u018c\7h\2\2\u018c\u018d\7k\2\2\u018d\u018e\7o\2\2\u018e\u018f\7a\2\2"+
		"\u018f\u0190\7g\2\2\u0190\u0191\7p\2\2\u0191\u0192\7s\2\2\u0192\u0193"+
		"\7w\2\2\u0193\u0194\7c\2\2\u0194\u0195\7p\2\2\u0195\u0196\7v\2\2\u0196"+
		"\u0197\7q\2\2\u0197T\3\2\2\2\u0198\u0199\7t\2\2\u0199\u019a\7g\2\2\u019a"+
		"\u019b\7v\2\2\u019b\u019c\7q\2\2\u019c\u019d\7t\2\2\u019d\u019e\7p\2\2"+
		"\u019e\u019f\7g\2\2\u019fV\3\2\2\2\u01a0\u01a1\7u\2\2\u01a1\u01a2\7g\2"+
		"\2\u01a2\u01a3\7p\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7q\2\2\u01a5X\3\2"+
		"\2\2\u01a6\u01a7\7\60\2\2\u01a7\u01a8\7\60\2\2\u01a8Z\3\2\2\2\u01a9\u01aa"+
		"\7/\2\2\u01aa\\\3\2\2\2\u01ab\u01ac\7,\2\2\u01ac^\3\2\2\2\u01ad\u01ae"+
		"\7\61\2\2\u01ae`\3\2\2\2\u01af\u01b0\7-\2\2\u01b0b\3\2\2\2\u01b1\u01b2"+
		"\7(\2\2\u01b2d\3\2\2\2\u01b3\u01b4\7\'\2\2\u01b4f\3\2\2\2\u01b5\u01b6"+
		"\7>\2\2\u01b6\u01b7\7@\2\2\u01b7h\3\2\2\2\u01b8\u01b9\7@\2\2\u01b9\u01ba"+
		"\7?\2\2\u01baj\3\2\2\2\u01bb\u01bc\7>\2\2\u01bc\u01bd\7?\2\2\u01bdl\3"+
		"\2\2\2\u01be\u01bf\7@\2\2\u01bfn\3\2\2\2\u01c0\u01c1\7>\2\2\u01c1p\3\2"+
		"\2\2\u01c2\u01c3\7p\2\2\u01c3\u01c4\7c\2\2\u01c4\u01c5\7q\2\2\u01c5r\3"+
		"\2\2\2\u01c6\u01c7\7q\2\2\u01c7\u01c8\7w\2\2\u01c8t\3\2\2\2\u01c9\u01ca"+
		"\7g\2\2\u01cav\3\2\2\2\u01cb\u01cf\7}\2\2\u01cc\u01ce\n\2\2\2\u01cd\u01cc"+
		"\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7\177\2\2\u01d3\u01d4\b"+
		"<\2\2\u01d4x\3\2\2\2\u01d5\u01d6\t\3\2\2\u01d6\u01d7\b=\3\2\u01d7z\3\2"+
		"\2\2\u01d8\u01dc\t\4\2\2\u01d9\u01db\t\5\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd|\3\2\2\2"+
		"\u01de\u01dc\3\2\2\2\u01df\u01e1\4\62;\2\u01e0\u01df\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3~\3\2\2\2\u01e4"+
		"\u01e5\5}?\2\u01e5\u01e6\7\60\2\2\u01e6\u01e7\5}?\2\u01e7\u0080\3\2\2"+
		"\2\u01e8\u01ec\7$\2\2\u01e9\u01eb\n\6\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee"+
		"\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef\u01f0\7$\2\2\u01f0\u0082\3\2\2\2\u01f1\u01f2\13\2"+
		"\2\2\u01f2\u01f3\bB\4\2\u01f3\u0084\3\2\2\2\7\2\u01cf\u01dc\u01e2\u01ec"+
		"\5\3<\2\3=\3\3B\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}