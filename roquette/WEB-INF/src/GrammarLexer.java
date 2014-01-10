// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g 2014-01-09 00:23:47

import org.antlr.runtime.*;

public class GrammarLexer extends Lexer {
	public static final int VAR_MOT = 23;
	public static final int CONJOU = 19;
	public static final int ANNEE = 21;
	public static final int POINT = 16;
	public static final int VAR_EMAIL = 14;
	public static final int THEME = 12;
	public static final int PARAITRE = 10;
	public static final int COUNT = 5;
	public static final int EOF = -1;
	public static final int MOT = 9;
	public static final int AUTEUR = 11;
	public static final int PAGE = 7;
	public static final int WS = 15;
	public static final int RUBRIQUE = 8;
	public static final int JOUR = 17;
	public static final int MOIS = 20;
	public static final int CONJET = 18;
	public static final int TITRE = 13;
	public static final int VAR_DATE = 22;
	public static final int SELECT = 4;
	public static final int ARTICLE = 6;

	// delegates
	// delegators

	public GrammarLexer() {
		;
	}

	public GrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public GrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);

	}

	public String getGrammarFileName() {
		return "E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g";
	}

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:4:8: (
			// 'vouloir' | 'retourner' | 'donner' | 'souhaiter' )
			int alt1 = 4;
			switch (input.LA(1)) {
			case 'v': {
				alt1 = 1;
			}
				break;
			case 'r': {
				alt1 = 2;
			}
				break;
			case 'd': {
				alt1 = 3;
			}
				break;
			case 's': {
				alt1 = 4;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 1, 0,
						input);

				throw nvae;
			}

			switch (alt1) {
			case 1:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:4:10:
			// 'vouloir'
			{
				match("vouloir");

			}
				break;
			case 2:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:4:20:
			// 'retourner'
			{
				match("retourner");

			}
				break;
			case 3:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:4:32:
			// 'donner'
			{
				match("donner");

			}
				break;
			case 4:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:4:41:
			// 'souhaiter'
			{
				match("souhaiter");

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SELECT"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:8:7: (
			// 'nombre' | 'combien' )
			int alt2 = 2;
			int LA2_0 = input.LA(1);

			if ((LA2_0 == 'n')) {
				alt2 = 1;
			} else if ((LA2_0 == 'c')) {
				alt2 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 2, 0,
						input);

				throw nvae;
			}
			switch (alt2) {
			case 1:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:8:9:
			// 'nombre'
			{
				match("nombre");

			}
				break;
			case 2:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:8:20:
			// 'combien'
			{
				match("combien");

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "COUNT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:12:9: (
			// 'article' | 'texte' )
			int alt3 = 2;
			int LA3_0 = input.LA(1);

			if ((LA3_0 == 'a')) {
				alt3 = 1;
			} else if ((LA3_0 == 't')) {
				alt3 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 3, 0,
						input);

				throw nvae;
			}
			switch (alt3) {
			case 1:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:12:11:
			// 'article'
			{
				match("article");

			}
				break;
			case 2:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:12:24:
			// 'texte'
			{
				match("texte");

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "ARTICLE"

	// $ANTLR start "PAGE"
	public final void mPAGE() throws RecognitionException {
		try {
			int _type = PAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:14:6: (
			// 'page' )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:14:8: 'page'
			{
				match("page");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PAGE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:17:10: (
			// 'rubrique' )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:17:12:
			// 'rubrique'
			{
				match("rubrique");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:19:5: (
			// 'mot' | 'contenir' | 'parle' )
			int alt4 = 3;
			switch (input.LA(1)) {
			case 'm': {
				alt4 = 1;
			}
				break;
			case 'c': {
				alt4 = 2;
			}
				break;
			case 'p': {
				alt4 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 4, 0,
						input);

				throw nvae;
			}

			switch (alt4) {
			case 1:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:19:7: 'mot'
			{
				match("mot");

			}
				break;
			case 2:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:19:15:
			// 'contenir'
			{
				match("contenir");

			}
				break;
			case 3:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:19:28:
			// 'parle'
			{
				match("parle");

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "MOT"

	// $ANTLR start "PARAITRE"
	public final void mPARAITRE() throws RecognitionException {
		try {
			int _type = PARAITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:21:10: (
			// 'parus' )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:21:12:
			// 'parus'
			{
				match("parus");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PARAITRE"

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:23:9: (
			// 'auteur' )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:23:11:
			// 'auteur'
			{
				match("auteur");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "AUTEUR"

	// $ANTLR start "THEME"
	public final void mTHEME() throws RecognitionException {
		try {
			int _type = THEME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:25:8: (
			// 'theme' )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:25:10:
			// 'theme'
			{
				match("theme");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "THEME"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:27:8: (
			// 'titre' )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:27:10:
			// 'titre'
			{
				match("titre");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "TITRE"

	// $ANTLR start "VAR_EMAIL"
	public final void mVAR_EMAIL() throws RecognitionException {
		try {
			int _type = VAR_EMAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:31:11: ( (
			// 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ ( '@' ) ( 'A' .. 'Z' |
			// 'a' .. 'z' | '0' .. '9' )+ ( '.' ) ( 'A' .. 'Z' | 'a' .. 'z' )+ )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:31:13: ( 'A'
			// .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ ( '@' ) ( 'A' .. 'Z' | 'a' ..
			// 'z' | '0' .. '9' )+ ( '.' ) ( 'A' .. 'Z' | 'a' .. 'z' )+
			{
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:31:13: (
				// 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
				int cnt5 = 0;
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if (((LA5_0 >= '0' && LA5_0 <= '9')
							|| (LA5_0 >= 'A' && LA5_0 <= 'Z') || (LA5_0 >= 'a' && LA5_0 <= 'z'))) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
					// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')
								|| (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
								|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt5 >= 1)
							break loop5;
						EarlyExitException eee = new EarlyExitException(5,
								input);
						throw eee;
					}
					cnt5++;
				} while (true);

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:31:47: (
				// '@' )
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:31:48:
				// '@'
				{
					match('@');

				}

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:31:52: (
				// 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
				int cnt6 = 0;
				loop6: do {
					int alt6 = 2;
					int LA6_0 = input.LA(1);

					if (((LA6_0 >= '0' && LA6_0 <= '9')
							|| (LA6_0 >= 'A' && LA6_0 <= 'Z') || (LA6_0 >= 'a' && LA6_0 <= 'z'))) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
					// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')
								|| (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
								|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt6 >= 1)
							break loop6;
						EarlyExitException eee = new EarlyExitException(6,
								input);
						throw eee;
					}
					cnt6++;
				} while (true);

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:31:86: (
				// '.' )
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:31:87:
				// '.'
				{
					match('.');

				}

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:31:92: (
				// 'A' .. 'Z' | 'a' .. 'z' )+
				int cnt7 = 0;
				loop7: do {
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if (((LA7_0 >= 'A' && LA7_0 <= 'Z') || (LA7_0 >= 'a' && LA7_0 <= 'z'))) {
						alt7 = 1;
					}

					switch (alt7) {
					case 1:
					// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:
					{
						if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
								|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt7 >= 1)
							break loop7;
						EarlyExitException eee = new EarlyExitException(7,
								input);
						throw eee;
					}
					cnt7++;
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "VAR_EMAIL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:5: ( (
			// ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'qui' | 'les' | 'dont' | 'de'
			// | 'd\\'' | 'le' ) | '\\n' )
			int alt9 = 2;
			int LA9_0 = input.LA(1);

			if ((LA9_0 == '\t' || LA9_0 == '\r' || LA9_0 == ' ' || LA9_0 == 'J'
					|| LA9_0 == 'd' || LA9_0 == 'j' || LA9_0 == 'l' || LA9_0 == 'q')) {
				alt9 = 1;
			} else if ((LA9_0 == '\n')) {
				alt9 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 9, 0,
						input);

				throw nvae;
			}
			switch (alt9) {
			case 1:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:7: ( ' '
			// | '\\t' | '\\r' | 'je' | 'Je' | 'qui' | 'les' | 'dont' | 'de' |
			// 'd\\'' | 'le' )
			{
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:7: (
				// ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'qui' | 'les' | 'dont' |
				// 'de' | 'd\\'' | 'le' )
				int alt8 = 11;
				alt8 = dfa8.predict(input);
				switch (alt8) {
				case 1:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:8:
				// ' '
				{
					match(' ');

				}
					break;
				case 2:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:13:
				// '\\t'
				{
					match('\t');

				}
					break;
				case 3:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:20:
				// '\\r'
				{
					match('\r');

				}
					break;
				case 4:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:27:
				// 'je'
				{
					match("je");

				}
					break;
				case 5:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:34:
				// 'Je'
				{
					match("Je");

				}
					break;
				case 6:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:41:
				// 'qui'
				{
					match("qui");

				}
					break;
				case 7:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:49:
				// 'les'
				{
					match("les");

				}
					break;
				case 8:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:57:
				// 'dont'
				{
					match("dont");

				}
					break;
				case 9:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:66:
				// 'de'
				{
					match("de");

				}
					break;
				case 10:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:73:
				// 'd\\''
				{
					match("d'");

				}
					break;
				case 11:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:81:
				// 'le'
				{
					match("le");

				}
					break;

				}

				skip();

			}
				break;
			case 2:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:99: '\\n'
			{
				match('\n');

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "WS"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:38:7: ( '.'
			// | '?' | '!' )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:
			{
				if (input.LA(1) == '!' || input.LA(1) == '.'
						|| input.LA(1) == '?') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "POINT"

	// $ANTLR start "JOUR"
	public final void mJOUR() throws RecognitionException {
		try {
			int _type = JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:41:6: ( (
			// '0' .. '3' )? ( '0' .. '9' ) )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:41:8: ( '0'
			// .. '3' )? ( '0' .. '9' )
			{
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:41:8: (
				// '0' .. '3' )?
				int alt10 = 2;
				int LA10_0 = input.LA(1);

				if (((LA10_0 >= '0' && LA10_0 <= '3'))) {
					int LA10_1 = input.LA(2);

					if (((LA10_1 >= '0' && LA10_1 <= '9'))) {
						alt10 = 1;
					}
				}
				switch (alt10) {
				case 1:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:41:9:
				// '0' .. '3'
				{
					matchRange('0', '3');

				}
					break;

				}

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:41:19: (
				// '0' .. '9' )
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:41:20:
				// '0' .. '9'
				{
					matchRange('0', '9');

				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "JOUR"

	// $ANTLR start "CONJET"
	public final void mCONJET() throws RecognitionException {
		try {
			int _type = CONJET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:43:9: ( 'et'
			// )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:43:12: 'et'
			{
				match("et");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "CONJET"

	// $ANTLR start "CONJOU"
	public final void mCONJOU() throws RecognitionException {
		try {
			int _type = CONJOU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:44:9: ( 'ou'
			// )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:44:11: 'ou'
			{
				match("ou");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "CONJOU"

	// $ANTLR start "MOIS"
	public final void mMOIS() throws RecognitionException {
		try {
			int _type = MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:7: (
			// 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' |
			// 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' |
			// 'decembre' )
			int alt11 = 12;
			alt11 = dfa11.predict(input);
			switch (alt11) {
			case 1:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:9:
			// 'janvier'
			{
				match("janvier");

			}
				break;
			case 2:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:21:
			// 'fevrier'
			{
				match("fevrier");

			}
				break;
			case 3:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:33:
			// 'mars'
			{
				match("mars");

			}
				break;
			case 4:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:42:
			// 'avril'
			{
				match("avril");

			}
				break;
			case 5:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:52: 'mai'
			{
				match("mai");

			}
				break;
			case 6:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:60:
			// 'juin'
			{
				match("juin");

			}
				break;
			case 7:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:69:
			// 'juillet'
			{
				match("juillet");

			}
				break;
			case 8:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:81:
			// 'aout'
			{
				match("aout");

			}
				break;
			case 9:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:90:
			// 'septembre'
			{
				match("septembre");

			}
				break;
			case 10:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:104:
			// 'octobre'
			{
				match("octobre");

			}
				break;
			case 11:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:116:
			// 'novembre'
			{
				match("novembre");

			}
				break;
			case 12:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:45:129:
			// 'decembre'
			{
				match("decembre");

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "MOIS"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:46:8: ( (
			// '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:46:10: ( '0'
			// .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:46:10: (
				// '0' .. '9' )
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:46:11:
				// '0' .. '9'
				{
					matchRange('0', '9');

				}

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:46:20: (
				// '0' .. '9' )
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:46:21:
				// '0' .. '9'
				{
					matchRange('0', '9');

				}

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:46:30: (
				// '0' .. '9' )
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:46:31:
				// '0' .. '9'
				{
					matchRange('0', '9');

				}

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:46:40: (
				// '0' .. '9' )
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:46:41:
				// '0' .. '9'
				{
					matchRange('0', '9');

				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "ANNEE"

	// $ANTLR start "VAR_DATE"
	public final void mVAR_DATE() throws RecognitionException {
		try {
			int _type = VAR_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:47:10: ( (
			// JOUR ' ' MOIS ' ' ANNEE ) | ( MOIS ' ' ANNEE ) | ( ANNEE ) )
			int alt12 = 3;
			switch (input.LA(1)) {
			case '0':
			case '1':
			case '2':
			case '3': {
				int LA12_1 = input.LA(2);

				if ((LA12_1 == ' ')) {
					alt12 = 1;
				} else if (((LA12_1 >= '0' && LA12_1 <= '9'))) {
					int LA12_5 = input.LA(3);

					if ((LA12_5 == ' ')) {
						alt12 = 1;
					} else if (((LA12_5 >= '0' && LA12_5 <= '9'))) {
						alt12 = 3;
					} else {
						NoViableAltException nvae = new NoViableAltException(
								"", 12, 5, input);

						throw nvae;
					}
				} else {
					NoViableAltException nvae = new NoViableAltException("",
							12, 1, input);

					throw nvae;
				}
			}
				break;
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9': {
				int LA12_2 = input.LA(2);

				if ((LA12_2 == ' ')) {
					alt12 = 1;
				} else if (((LA12_2 >= '0' && LA12_2 <= '9'))) {
					alt12 = 3;
				} else {
					NoViableAltException nvae = new NoViableAltException("",
							12, 2, input);

					throw nvae;
				}
			}
				break;
			case 'a':
			case 'd':
			case 'f':
			case 'j':
			case 'm':
			case 'n':
			case 'o':
			case 's': {
				alt12 = 2;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 12, 0,
						input);

				throw nvae;
			}

			switch (alt12) {
			case 1:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:47:12: (
			// JOUR ' ' MOIS ' ' ANNEE )
			{
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:47:12: (
				// JOUR ' ' MOIS ' ' ANNEE )
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:47:13:
				// JOUR ' ' MOIS ' ' ANNEE
				{
					mJOUR();
					match(' ');
					mMOIS();
					match(' ');
					mANNEE();

				}

			}
				break;
			case 2:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:47:40: (
			// MOIS ' ' ANNEE )
			{
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:47:40: (
				// MOIS ' ' ANNEE )
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:47:41:
				// MOIS ' ' ANNEE
				{
					mMOIS();
					match(' ');
					mANNEE();

				}

			}
				break;
			case 3:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:47:59: (
			// ANNEE )
			{
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:47:59: (
				// ANNEE )
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:47:60:
				// ANNEE
				{
					mANNEE();

				}

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "VAR_DATE"

	// $ANTLR start "VAR_MOT"
	public final void mVAR_MOT() throws RecognitionException {
		try {
			int _type = VAR_MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:48:9: ( (
			// 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:48:11: ( 'A'
			// .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:48:33: (
				// 'a' .. 'z' )+
				int cnt13 = 0;
				loop13: do {
					int alt13 = 2;
					int LA13_0 = input.LA(1);

					if (((LA13_0 >= 'a' && LA13_0 <= 'z'))) {
						alt13 = 1;
					}

					switch (alt13) {
					case 1:
					// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:48:34:
					// 'a' .. 'z'
					{
						matchRange('a', 'z');

					}
						break;

					default:
						if (cnt13 >= 1)
							break loop13;
						EarlyExitException eee = new EarlyExitException(13,
								input);
						throw eee;
					}
					cnt13++;
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "VAR_MOT"

	public void mTokens() throws RecognitionException {
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:8: ( SELECT |
		// COUNT | ARTICLE | PAGE | RUBRIQUE | MOT | PARAITRE | AUTEUR | THEME |
		// TITRE | VAR_EMAIL | WS | POINT | JOUR | CONJET | CONJOU | MOIS |
		// ANNEE | VAR_DATE | VAR_MOT )
		int alt14 = 20;
		alt14 = dfa14.predict(input);
		switch (alt14) {
		case 1:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:10: SELECT
		{
			mSELECT();

		}
			break;
		case 2:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:17: COUNT
		{
			mCOUNT();

		}
			break;
		case 3:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:23: ARTICLE
		{
			mARTICLE();

		}
			break;
		case 4:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:31: PAGE
		{
			mPAGE();

		}
			break;
		case 5:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:36: RUBRIQUE
		{
			mRUBRIQUE();

		}
			break;
		case 6:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:45: MOT
		{
			mMOT();

		}
			break;
		case 7:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:49: PARAITRE
		{
			mPARAITRE();

		}
			break;
		case 8:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:58: AUTEUR
		{
			mAUTEUR();

		}
			break;
		case 9:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:65: THEME
		{
			mTHEME();

		}
			break;
		case 10:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:71: TITRE
		{
			mTITRE();

		}
			break;
		case 11:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:77: VAR_EMAIL
		{
			mVAR_EMAIL();

		}
			break;
		case 12:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:87: WS
		{
			mWS();

		}
			break;
		case 13:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:90: POINT
		{
			mPOINT();

		}
			break;
		case 14:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:96: JOUR
		{
			mJOUR();

		}
			break;
		case 15:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:101: CONJET
		{
			mCONJET();

		}
			break;
		case 16:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:108: CONJOU
		{
			mCONJOU();

		}
			break;
		case 17:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:115: MOIS
		{
			mMOIS();

		}
			break;
		case 18:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:120: ANNEE
		{
			mANNEE();

		}
			break;
		case 19:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:126: VAR_DATE
		{
			mVAR_DATE();

		}
			break;
		case 20:
		// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:1:135: VAR_MOT
		{
			mVAR_MOT();

		}
			break;

		}

	}

	protected DFA8 dfa8 = new DFA8(this);
	protected DFA11 dfa11 = new DFA11(this);
	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA8_eotS = "\11\uffff\1\16\5\uffff";
	static final String DFA8_eofS = "\17\uffff";
	static final String DFA8_minS = "\1\11\6\uffff\1\145\1\47\1\163\5\uffff";
	static final String DFA8_maxS = "\1\161\6\uffff\1\145\1\157\1\163\5\uffff";
	static final String DFA8_acceptS = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\10\1\11\1\12\1\7\1\13";
	static final String DFA8_specialS = "\17\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\2\3\uffff\1\3\22\uffff\1\1\51\uffff\1\5\31\uffff\1\10\5"
					+ "\uffff\1\4\1\uffff\1\7\4\uffff\1\6", "", "", "", "", "",
			"", "\1\11", "\1\14\75\uffff\1\13\11\uffff\1\12", "\1\15", "", "",
			"", "", "" };

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}

		public String getDescription() {
			return "35:7: ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'qui' | 'les' | 'dont' | 'de' | 'd\\'' | 'le' )";
		}
	}

	static final String DFA11_eotS = "\23\uffff";
	static final String DFA11_eofS = "\23\uffff";
	static final String DFA11_minS = "\2\141\1\uffff\1\141\1\157\5\uffff\2\151\2\uffff\1\154\4\uffff";
	static final String DFA11_maxS = "\1\163\1\165\1\uffff\1\141\1\166\5\uffff\1\151\1\162\2\uffff\1"
			+ "\156\4\uffff";
	static final String DFA11_acceptS = "\2\uffff\1\2\2\uffff\1\11\1\12\1\13\1\14\1\1\2\uffff\1\4\1\10\1"
			+ "\uffff\1\3\1\5\1\6\1\7";
	static final String DFA11_specialS = "\23\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\4\2\uffff\1\10\1\uffff\1\2\3\uffff\1\1\2\uffff\1\3\1\7\1"
					+ "\6\3\uffff\1\5", "\1\11\23\uffff\1\12", "", "\1\13",
			"\1\15\6\uffff\1\14", "", "", "", "", "", "\1\16",
			"\1\20\10\uffff\1\17", "", "", "\1\22\1\uffff\1\21", "", "", "", "" };

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA
			.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}

		public String getDescription() {
			return "45:1: MOIS : ( 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre' );";
		}
	}

	static final String DFA14_eotS = "\20\uffff\1\63\1\uffff\1\63\4\uffff\2\73\1\uffff\3\73\1\14\16\73"
			+ "\1\14\2\73\1\14\1\73\1\14\1\63\3\uffff\1\127\1\130\3\73\1\uffff"
			+ "\23\73\1\161\1\73\1\163\2\73\2\14\3\uffff\6\73\1\14\12\73\1\163"
			+ "\3\73\1\u008b\2\73\1\uffff\1\163\1\uffff\1\73\1\163\1\73\1\u0090"
			+ "\17\73\1\163\1\u00a0\1\u00a1\1\u00a2\1\uffff\1\161\1\u00a3\2\73"
			+ "\1\uffff\5\73\1\u00ab\3\73\1\u00af\4\73\1\u00b4\4\uffff\4\73\1\u00ab"
			+ "\2\73\1\uffff\3\73\1\uffff\1\73\1\u00af\1\73\1\u00a0\1\uffff\4\163"
			+ "\1\73\1\u00c1\1\163\2\73\1\163\1\161\1\u00ab\1\uffff\1\u00ab\1\163";
	static final String DFA14_eofS = "\u00c4\uffff";
	static final String DFA14_minS = "\1\11\2\60\1\47\10\60\1\uffff\3\60\1\40\1\uffff\1\40\6\60\1\uffff"
			+ "\30\60\1\40\2\uffff\6\60\1\uffff\25\60\1\40\5\60\2\uffff\21\60\1"
			+ "\40\6\60\1\uffff\1\40\1\uffff\1\60\1\40\21\60\1\40\3\60\1\uffff"
			+ "\4\60\1\uffff\17\60\4\uffff\7\60\1\uffff\3\60\1\uffff\4\60\1\uffff"
			+ "\4\40\2\60\1\40\2\60\1\40\2\60\1\uffff\1\60\1\40";
	static final String DFA14_maxS = "\14\172\1\uffff\4\172\1\uffff\7\172\1\uffff\31\172\2\uffff\6\172"
			+ "\1\uffff\33\172\2\uffff\30\172\1\uffff\1\172\1\uffff\27\172\1\uffff"
			+ "\4\172\1\uffff\17\172\4\uffff\7\172\1\uffff\3\172\1\uffff\4\172"
			+ "\1\uffff\14\172\1\uffff\2\172";
	static final String DFA14_acceptS = "\14\uffff\1\14\4\uffff\1\15\7\uffff\1\13\31\uffff\1\16\1\23\6\uffff"
			+ "\1\24\33\uffff\1\17\1\20\30\uffff\1\6\1\uffff\1\21\27\uffff\1\4"
			+ "\4\uffff\1\22\17\uffff\1\3\1\11\1\12\1\7\7\uffff\1\1\3\uffff\1\2"
			+ "\4\uffff\1\10\14\uffff\1\5\2\uffff";
	static final String DFA14_specialS = "\u00c4\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\14\2\uffff\1\14\22\uffff\1\14\1\21\14\uffff\1\21\1\uffff"
					+ "\4\20\6\22\5\uffff\1\21\1\uffff\11\26\1\15\20\26\6\uffff\1\7"
					+ "\1\26\1\6\1\3\1\23\1\25\3\26\1\13\1\26\1\17\1\12\1\5\1\24\1"
					+ "\11\1\16\1\2\1\4\1\10\1\26\1\1\4\26",
			"\12\31\6\uffff\33\31\6\uffff\16\30\1\27\13\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\32\17\30\1\33\5\30",
			"\1\14\10\uffff\12\31\6\uffff\33\31\6\uffff\4\30\1\35\11\30"
					+ "\1\34\13\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\37\11\30\1\36\13\30",
			"\12\31\6\uffff\33\31\6\uffff\16\30\1\40\13\30",
			"\12\31\6\uffff\33\31\6\uffff\16\30\1\41\13\30",
			"\12\31\6\uffff\33\31\6\uffff\16\30\1\45\2\30\1\42\2\30\1\43"
					+ "\1\44\4\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\46\2\30\1\47\1\50\21\30",
			"\12\31\6\uffff\33\31\6\uffff\1\51\31\30",
			"\12\31\6\uffff\33\31\6\uffff\1\53\15\30\1\52\13\30",
			"\12\31\6\uffff\33\31\6\uffff\1\55\3\30\1\54\17\30\1\56\5\30", "",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\57\25\30",
			"\12\31\6\uffff\33\31\6\uffff\24\30\1\60\5\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\61\25\30",
			"\1\64\17\uffff\12\62\6\uffff\33\31\6\uffff\32\31", "",
			"\1\64\17\uffff\12\65\6\uffff\33\31\6\uffff\32\31",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\66\6\30",
			"\12\31\6\uffff\33\31\6\uffff\2\30\1\70\21\30\1\67\5\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\71\25\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\24\30\1\72\5\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30", "",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\74\6\30",
			"\12\31\6\uffff\33\31\6\uffff\1\30\1\75\30\30",
			"\12\31\6\uffff\33\31\6\uffff\15\30\1\76\14\30",
			"\12\31\6\uffff\33\31\6\uffff\2\30\1\77\27\30",
			"\12\31\6\uffff\33\31\6\uffff\24\30\1\100\5\30",
			"\12\31\6\uffff\33\31\6\uffff\17\30\1\101\12\30",
			"\12\31\6\uffff\33\31\6\uffff\14\30\1\102\10\30\1\103\4\30",
			"\12\31\6\uffff\33\31\6\uffff\14\30\1\104\1\105\14\30",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\106\6\30",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\107\6\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\110\10\30",
			"\12\31\6\uffff\33\31\6\uffff\24\30\1\111\5\30",
			"\12\31\6\uffff\33\31\6\uffff\27\30\1\112\2\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\113\25\30",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\114\6\30",
			"\12\31\6\uffff\33\31\6\uffff\6\30\1\115\12\30\1\116\10\30",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\117\6\30",
			"\12\31\6\uffff\33\31\6\uffff\10\30\1\121\10\30\1\120\10\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\15\30\1\122\14\30",
			"\12\31\6\uffff\33\31\6\uffff\10\30\1\123\21\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\10\30\1\124\21\30",
			"\12\31\6\uffff\33\31\6\uffff\22\30\1\125\7\30",
			"\1\64\17\uffff\12\126\6\uffff\33\31\6\uffff\32\31", "", "",
			"\12\126\6\uffff\33\31\6\uffff\32\31",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\131\6\30",
			"\12\31\6\uffff\33\31\6\uffff\25\30\1\132\4\30",
			"\12\31\6\uffff\33\31\6\uffff\13\30\1\133\16\30", "",
			"\12\31\6\uffff\33\31\6\uffff\16\30\1\134\13\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\135\10\30",
			"\12\31\6\uffff\33\31\6\uffff\15\30\1\136\5\30\1\137\6\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\140\25\30",
			"\12\31\6\uffff\33\31\6\uffff\7\30\1\141\22\30",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\142\6\30",
			"\12\31\6\uffff\33\31\6\uffff\1\30\1\143\30\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\144\25\30",
			"\12\31\6\uffff\33\31\6\uffff\1\30\1\145\30\30",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\146\6\30",
			"\12\31\6\uffff\33\31\6\uffff\10\30\1\147\21\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\150\25\30",
			"\12\31\6\uffff\33\31\6\uffff\10\30\1\151\21\30",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\152\6\30",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\153\6\30",
			"\12\31\6\uffff\33\31\6\uffff\14\30\1\154\15\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\155\10\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\156\25\30",
			"\12\31\6\uffff\33\31\6\uffff\13\30\1\157\10\30\1\160\5\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\22\30\1\162\7\30",
			"\1\64\17\uffff\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\25\30\1\164\4\30",
			"\12\31\6\uffff\33\31\6\uffff\13\30\1\166\1\30\1\165\14\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\167\6\uffff\33\31\6\uffff\32\31", "", "",
			"\12\31\6\uffff\33\31\6\uffff\16\30\1\170\13\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\171\10\30",
			"\12\31\6\uffff\33\31\6\uffff\16\30\1\172\13\30",
			"\12\31\6\uffff\33\31\6\uffff\24\30\1\173\5\30",
			"\12\31\6\uffff\33\31\6\uffff\10\30\1\174\21\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\175\25\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\14\30\1\176\15\30",
			"\12\31\6\uffff\33\31\6\uffff\1\177\31\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u0080\25\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u0081\10\30",
			"\12\31\6\uffff\33\31\6\uffff\14\30\1\u0082\15\30",
			"\12\31\6\uffff\33\31\6\uffff\10\30\1\u0083\21\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u0084\25\30",
			"\12\31\6\uffff\33\31\6\uffff\2\30\1\u0085\27\30",
			"\12\31\6\uffff\33\31\6\uffff\24\30\1\u0086\5\30",
			"\12\31\6\uffff\33\31\6\uffff\13\30\1\u0087\16\30",
			"\1\64\17\uffff\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u0088\25\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u0089\25\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u008a\25\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u008c\25\30",
			"\12\31\6\uffff\33\31\6\uffff\22\30\1\u008d\7\30", "",
			"\1\64\17\uffff\12\31\6\uffff\33\31\6\uffff\32\30", "",
			"\12\31\6\uffff\33\31\6\uffff\10\30\1\u008e\21\30",
			"\1\64\17\uffff\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\13\30\1\u008f\16\30",
			"\12\31\6\uffff\33\31\6\uffff\32\31",
			"\12\31\6\uffff\33\31\6\uffff\1\30\1\u0091\30\30",
			"\12\31\6\uffff\33\31\6\uffff\10\30\1\u0092\21\30",
			"\12\31\6\uffff\33\31\6\uffff\10\30\1\u0093\21\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u0094\10\30",
			"\12\31\6\uffff\33\31\6\uffff\20\30\1\u0095\11\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u0096\10\30",
			"\12\31\6\uffff\33\31\6\uffff\1\30\1\u0097\30\30",
			"\12\31\6\uffff\33\31\6\uffff\10\30\1\u0098\21\30",
			"\12\31\6\uffff\33\31\6\uffff\14\30\1\u0099\15\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u009a\25\30",
			"\12\31\6\uffff\33\31\6\uffff\1\30\1\u009b\30\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u009c\25\30",
			"\12\31\6\uffff\33\31\6\uffff\15\30\1\u009d\14\30",
			"\12\31\6\uffff\33\31\6\uffff\13\30\1\u009e\16\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u009f\10\30",
			"\1\64\17\uffff\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30", "",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u00a4\25\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u00a5\25\30", "",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u00a6\10\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u00a7\25\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u00a8\10\30",
			"\12\31\6\uffff\33\31\6\uffff\15\30\1\u00a9\14\30",
			"\12\31\6\uffff\33\31\6\uffff\24\30\1\u00aa\5\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u00ac\10\30",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\u00ad\6\30",
			"\12\31\6\uffff\33\31\6\uffff\1\30\1\u00ae\30\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u00b0\10\30",
			"\12\31\6\uffff\33\31\6\uffff\15\30\1\u00b1\14\30",
			"\12\31\6\uffff\33\31\6\uffff\10\30\1\u00b2\21\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u00b3\25\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30", "", "", "", "",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u00b5\10\30",
			"\12\31\6\uffff\33\31\6\uffff\23\30\1\u00b6\6\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u00b7\25\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u00b8\10\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u00b9\25\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u00ba\25\30", "",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u00bb\25\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u00bc\25\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u00bd\10\30", "",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u00be\25\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u00bf\10\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30", "",
			"\1\64\17\uffff\12\31\6\uffff\33\31\6\uffff\32\30",
			"\1\64\17\uffff\12\31\6\uffff\33\31\6\uffff\32\30",
			"\1\64\17\uffff\12\31\6\uffff\33\31\6\uffff\32\30",
			"\1\64\17\uffff\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u00c0\10\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\1\64\17\uffff\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\21\30\1\u00c2\10\30",
			"\12\31\6\uffff\33\31\6\uffff\4\30\1\u00c3\25\30",
			"\1\64\17\uffff\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\12\31\6\uffff\33\31\6\uffff\32\30", "",
			"\12\31\6\uffff\33\31\6\uffff\32\30",
			"\1\64\17\uffff\12\31\6\uffff\33\31\6\uffff\32\30" };

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA
			.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}

		public String getDescription() {
			return "1:1: Tokens : ( SELECT | COUNT | ARTICLE | PAGE | RUBRIQUE | MOT | PARAITRE | AUTEUR | THEME | TITRE | VAR_EMAIL | WS | POINT | JOUR | CONJET | CONJOU | MOIS | ANNEE | VAR_DATE | VAR_MOT );";
		}
	}

}