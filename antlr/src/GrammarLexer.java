// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g 2013-11-27 21:21:57

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
			// 'une' | 'focus' | 'gros titre' )
			int alt4 = 3;
			switch (input.LA(1)) {
			case 'u': {
				alt4 = 1;
			}
				break;
			case 'f': {
				alt4 = 2;
			}
				break;
			case 'g': {
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
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:17:12: 'une'
			{
				match("une");

			}
				break;
			case 2:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:17:20:
			// 'focus'
			{
				match("focus");

			}
				break;
			case 3:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:17:30: 'gros
			// titre'
			{
				match("gros titre");

			}
				break;

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
			// 'mot' | 'contenir' | 'parler' | 'parlent' )
			int alt5 = 4;
			alt5 = dfa5.predict(input);
			switch (alt5) {
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
			// 'parler'
			{
				match("parler");

			}
				break;
			case 4:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:19:39:
			// 'parlent'
			{
				match("parlent");

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

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:31:47: (
				// '@' )
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:31:48:
				// '@'
				{
					match('@');

				}

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:31:52: (
				// 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
				int cnt7 = 0;
				loop7: do {
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if (((LA7_0 >= '0' && LA7_0 <= '9')
							|| (LA7_0 >= 'A' && LA7_0 <= 'Z') || (LA7_0 >= 'a' && LA7_0 <= 'z'))) {
						alt7 = 1;
					}

					switch (alt7) {
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
						if (cnt7 >= 1)
							break loop7;
						EarlyExitException eee = new EarlyExitException(7,
								input);
						throw eee;
					}
					cnt7++;
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
				int cnt8 = 0;
				loop8: do {
					int alt8 = 2;
					int LA8_0 = input.LA(1);

					if (((LA8_0 >= 'A' && LA8_0 <= 'Z') || (LA8_0 >= 'a' && LA8_0 <= 'z'))) {
						alt8 = 1;
					}

					switch (alt8) {
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
						if (cnt8 >= 1)
							break loop8;
						EarlyExitException eee = new EarlyExitException(8,
								input);
						throw eee;
					}
					cnt8++;
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
			int alt10 = 2;
			int LA10_0 = input.LA(1);

			if ((LA10_0 == '\t' || LA10_0 == '\r' || LA10_0 == ' '
					|| LA10_0 == 'J' || LA10_0 == 'd' || LA10_0 == 'j'
					|| LA10_0 == 'l' || LA10_0 == 'q')) {
				alt10 = 1;
			} else if ((LA10_0 == '\n')) {
				alt10 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 10, 0,
						input);

				throw nvae;
			}
			switch (alt10) {
			case 1:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:7: ( ' '
			// | '\\t' | '\\r' | 'je' | 'Je' | 'qui' | 'les' | 'dont' | 'de' |
			// 'd\\'' | 'le' )
			{
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:35:7: (
				// ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'qui' | 'les' | 'dont' |
				// 'de' | 'd\\'' | 'le' )
				int alt9 = 11;
				alt9 = dfa9.predict(input);
				switch (alt9) {
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
				int alt11 = 2;
				int LA11_0 = input.LA(1);

				if (((LA11_0 >= '0' && LA11_0 <= '3'))) {
					int LA11_1 = input.LA(2);

					if (((LA11_1 >= '0' && LA11_1 <= '9'))) {
						alt11 = 1;
					}
				}
				switch (alt11) {
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
			int alt12 = 12;
			alt12 = dfa12.predict(input);
			switch (alt12) {
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
			int alt13 = 3;
			switch (input.LA(1)) {
			case '0':
			case '1':
			case '2':
			case '3': {
				int LA13_1 = input.LA(2);

				if (((LA13_1 >= '0' && LA13_1 <= '9'))) {
					int LA13_4 = input.LA(3);

					if ((LA13_4 == ' ')) {
						alt13 = 1;
					} else if (((LA13_4 >= '0' && LA13_4 <= '9'))) {
						alt13 = 3;
					} else {
						NoViableAltException nvae = new NoViableAltException(
								"", 13, 4, input);

						throw nvae;
					}
				} else if ((LA13_1 == ' ')) {
					alt13 = 1;
				} else {
					NoViableAltException nvae = new NoViableAltException("",
							13, 1, input);

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
				int LA13_2 = input.LA(2);

				if (((LA13_2 >= '0' && LA13_2 <= '9'))) {
					alt13 = 3;
				} else if ((LA13_2 == ' ')) {
					alt13 = 1;
				} else {
					NoViableAltException nvae = new NoViableAltException("",
							13, 2, input);

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
				alt13 = 2;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 13, 0,
						input);

				throw nvae;
			}

			switch (alt13) {
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
				int cnt14 = 0;
				loop14: do {
					int alt14 = 2;
					int LA14_0 = input.LA(1);

					if (((LA14_0 >= 'a' && LA14_0 <= 'z'))) {
						alt14 = 1;
					}

					switch (alt14) {
					case 1:
					// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:48:34:
					// 'a' .. 'z'
					{
						matchRange('a', 'z');

					}
						break;

					default:
						if (cnt14 >= 1)
							break loop14;
						EarlyExitException eee = new EarlyExitException(14,
								input);
						throw eee;
					}
					cnt14++;
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
		int alt15 = 20;
		alt15 = dfa15.predict(input);
		switch (alt15) {
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

	protected DFA5 dfa5 = new DFA5(this);
	protected DFA9 dfa9 = new DFA9(this);
	protected DFA12 dfa12 = new DFA12(this);
	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA5_eotS = "\12\uffff";
	static final String DFA5_eofS = "\12\uffff";
	static final String DFA5_minS = "\1\143\2\uffff\1\141\1\162\1\154\1\145\1\156\2\uffff";
	static final String DFA5_maxS = "\1\160\2\uffff\1\141\1\162\1\154\1\145\1\162\2\uffff";
	static final String DFA5_acceptS = "\1\uffff\1\1\1\2\5\uffff\1\3\1\4";
	static final String DFA5_specialS = "\12\uffff}>";
	static final String[] DFA5_transitionS = { "\1\2\11\uffff\1\1\2\uffff\1\3",
			"", "", "\1\4", "\1\5", "\1\6", "\1\7", "\1\11\3\uffff\1\10", "",
			"" };

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}

		public String getDescription() {
			return "19:1: MOT : ( 'mot' | 'contenir' | 'parler' | 'parlent' );";
		}
	}

	static final String DFA9_eotS = "\11\uffff\1\16\5\uffff";
	static final String DFA9_eofS = "\17\uffff";
	static final String DFA9_minS = "\1\11\6\uffff\1\145\1\47\1\163\5\uffff";
	static final String DFA9_maxS = "\1\161\6\uffff\1\145\1\157\1\163\5\uffff";
	static final String DFA9_acceptS = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\10\1\11\1\12\1\7\1\13";
	static final String DFA9_specialS = "\17\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\3\uffff\1\3\22\uffff\1\1\51\uffff\1\5\31\uffff\1\10\5"
					+ "\uffff\1\4\1\uffff\1\7\4\uffff\1\6", "", "", "", "", "",
			"", "\1\11", "\1\14\75\uffff\1\13\11\uffff\1\12", "\1\15", "", "",
			"", "", "" };

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}

		public String getDescription() {
			return "35:7: ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'qui' | 'les' | 'dont' | 'de' | 'd\\'' | 'le' )";
		}
	}

	static final String DFA12_eotS = "\23\uffff";
	static final String DFA12_eofS = "\23\uffff";
	static final String DFA12_minS = "\2\141\1\uffff\1\141\1\157\5\uffff\2\151\2\uffff\1\154\4\uffff";
	static final String DFA12_maxS = "\1\163\1\165\1\uffff\1\141\1\166\5\uffff\1\151\1\162\2\uffff\1"
			+ "\156\4\uffff";
	static final String DFA12_acceptS = "\2\uffff\1\2\2\uffff\1\11\1\12\1\13\1\14\1\1\2\uffff\1\4\1\10\1"
			+ "\uffff\1\3\1\5\1\6\1\7";
	static final String DFA12_specialS = "\23\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\4\2\uffff\1\10\1\uffff\1\2\3\uffff\1\1\2\uffff\1\3\1\7\1"
					+ "\6\3\uffff\1\5", "\1\11\23\uffff\1\12", "", "\1\13",
			"\1\15\6\uffff\1\14", "", "", "", "", "", "\1\16",
			"\1\20\10\uffff\1\17", "", "", "\1\22\1\uffff\1\21", "", "", "", "" };

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA
			.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}

		public String getDescription() {
			return "45:1: MOIS : ( 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre' );";
		}
	}

	static final String DFA15_eotS = "\23\uffff\1\70\1\uffff\1\70\3\uffff\2\77\1\uffff\2\77\1\17\22\77"
			+ "\1\17\2\77\1\17\1\77\1\17\1\70\3\uffff\1\136\1\137\2\77\1\uffff"
			+ "\22\77\1\166\3\77\1\172\1\77\1\174\2\77\2\17\3\uffff\4\77\1\17\12"
			+ "\77\1\174\3\77\1\u0092\2\77\1\uffff\3\77\1\uffff\1\174\1\uffff\1"
			+ "\77\1\174\1\77\1\u0099\15\77\1\174\1\u00a7\1\u00a8\1\u00a9\1\uffff"
			+ "\1\77\1\u00ac\1\166\3\77\1\uffff\3\77\1\u00b3\3\77\1\u00b7\4\77"
			+ "\1\u00bc\3\uffff\1\172\1\77\1\uffff\4\77\1\u00b3\1\77\1\uffff\3"
			+ "\77\1\uffff\1\77\1\u00b7\1\77\1\u00a7\1\uffff\1\172\4\174\1\77\1"
			+ "\174\2\77\1\174\1\172\2\u00b3\1\174";
	static final String DFA15_eofS = "\u00cb\uffff";
	static final String DFA15_minS = "\1\11\2\60\1\47\13\60\1\uffff\3\60\1\40\1\uffff\1\40\5\60\1\uffff"
			+ "\33\60\1\40\2\uffff\5\60\1\uffff\30\60\1\40\5\60\2\uffff\17\60\1"
			+ "\40\6\60\1\uffff\2\60\1\40\1\uffff\1\40\1\uffff\1\60\1\40\17\60"
			+ "\1\40\3\60\1\uffff\6\60\1\uffff\15\60\3\uffff\2\60\1\uffff\6\60"
			+ "\1\uffff\3\60\1\uffff\4\60\1\uffff\1\60\4\40\1\60\1\40\2\60\1\40"
			+ "\3\60\1\40";
	static final String DFA15_maxS = "\17\172\1\uffff\4\172\1\uffff\6\172\1\uffff\34\172\2\uffff\5\172"
			+ "\1\uffff\36\172\2\uffff\26\172\1\uffff\3\172\1\uffff\1\172\1\uffff"
			+ "\25\172\1\uffff\6\172\1\uffff\15\172\3\uffff\2\172\1\uffff\6\172"
			+ "\1\uffff\3\172\1\uffff\4\172\1\uffff\16\172";
	static final String DFA15_acceptS = "\17\uffff\1\14\4\uffff\1\15\6\uffff\1\13\34\uffff\1\16\1\23\5\uffff"
			+ "\1\24\36\uffff\1\17\1\20\26\uffff\1\5\3\uffff\1\6\1\uffff\1\21\25"
			+ "\uffff\1\4\6\uffff\1\22\15\uffff\1\3\1\11\1\12\2\uffff\1\7\6\uffff"
			+ "\1\1\3\uffff\1\2\4\uffff\1\10\16\uffff";
	static final String DFA15_specialS = "\u00cb\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\17\2\uffff\1\17\22\uffff\1\17\1\24\14\uffff\1\24\1\uffff"
					+ "\4\23\6\25\5\uffff\1\24\1\uffff\11\30\1\20\20\30\6\uffff\1\7"
					+ "\1\30\1\6\1\3\1\26\1\13\1\14\2\30\1\16\1\30\1\22\1\15\1\5\1"
					+ "\27\1\11\1\21\1\2\1\4\1\10\1\12\1\1\4\30",
			"\12\33\6\uffff\33\33\6\uffff\16\32\1\31\13\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\34\25\32",
			"\1\17\10\uffff\12\33\6\uffff\33\33\6\uffff\4\32\1\36\11\32"
					+ "\1\35\13\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\40\11\32\1\37\13\32",
			"\12\33\6\uffff\33\33\6\uffff\16\32\1\41\13\32",
			"\12\33\6\uffff\33\33\6\uffff\16\32\1\42\13\32",
			"\12\33\6\uffff\33\33\6\uffff\16\32\1\46\2\32\1\43\2\32\1\44"
					+ "\1\45\4\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\47\2\32\1\50\1\51\21\32",
			"\12\33\6\uffff\33\33\6\uffff\1\52\31\32",
			"\12\33\6\uffff\33\33\6\uffff\15\32\1\53\14\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\55\11\32\1\54\13\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\56\10\32",
			"\12\33\6\uffff\33\33\6\uffff\1\60\15\32\1\57\13\32",
			"\12\33\6\uffff\33\33\6\uffff\1\62\3\32\1\61\17\32\1\63\5\32",
			"",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\64\25\32",
			"\12\33\6\uffff\33\33\6\uffff\24\32\1\65\5\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\66\25\32",
			"\1\71\17\uffff\12\67\6\uffff\33\33\6\uffff\32\33",
			"",
			"\1\71\17\uffff\12\72\6\uffff\33\33\6\uffff\32\33",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\73\6\32",
			"\12\33\6\uffff\33\33\6\uffff\2\32\1\75\21\32\1\74\5\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\24\32\1\76\5\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\100\6\32",
			"\12\33\6\uffff\33\33\6\uffff\15\32\1\101\14\32",
			"\12\33\6\uffff\33\33\6\uffff\2\32\1\102\27\32",
			"\12\33\6\uffff\33\33\6\uffff\24\32\1\103\5\32",
			"\12\33\6\uffff\33\33\6\uffff\17\32\1\104\12\32",
			"\12\33\6\uffff\33\33\6\uffff\14\32\1\105\10\32\1\106\4\32",
			"\12\33\6\uffff\33\33\6\uffff\14\32\1\107\1\110\14\32",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\111\6\32",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\112\6\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\113\10\32",
			"\12\33\6\uffff\33\33\6\uffff\24\32\1\114\5\32",
			"\12\33\6\uffff\33\33\6\uffff\27\32\1\115\2\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\116\25\32",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\117\6\32",
			"\12\33\6\uffff\33\33\6\uffff\6\32\1\120\12\32\1\121\10\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\122\25\32",
			"\12\33\6\uffff\33\33\6\uffff\2\32\1\123\27\32",
			"\12\33\6\uffff\33\33\6\uffff\25\32\1\124\4\32",
			"\12\33\6\uffff\33\33\6\uffff\16\32\1\125\13\32",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\126\6\32",
			"\12\33\6\uffff\33\33\6\uffff\10\32\1\130\10\32\1\127\10\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\15\32\1\131\14\32",
			"\12\33\6\uffff\33\33\6\uffff\10\32\1\132\21\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\10\32\1\133\21\32",
			"\12\33\6\uffff\33\33\6\uffff\22\32\1\134\7\32",
			"\1\71\17\uffff\12\135\6\uffff\33\33\6\uffff\32\33",
			"",
			"",
			"\12\135\6\uffff\33\33\6\uffff\32\33",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\140\6\32",
			"\12\33\6\uffff\33\33\6\uffff\13\32\1\141\16\32",
			"",
			"\12\33\6\uffff\33\33\6\uffff\16\32\1\142\13\32",
			"\12\33\6\uffff\33\33\6\uffff\15\32\1\143\5\32\1\144\6\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\145\25\32",
			"\12\33\6\uffff\33\33\6\uffff\7\32\1\146\22\32",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\147\6\32",
			"\12\33\6\uffff\33\33\6\uffff\1\32\1\150\30\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\151\25\32",
			"\12\33\6\uffff\33\33\6\uffff\1\32\1\152\30\32",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\153\6\32",
			"\12\33\6\uffff\33\33\6\uffff\10\32\1\154\21\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\155\25\32",
			"\12\33\6\uffff\33\33\6\uffff\10\32\1\156\21\32",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\157\6\32",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\160\6\32",
			"\12\33\6\uffff\33\33\6\uffff\14\32\1\161\15\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\162\10\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\163\25\32",
			"\12\33\6\uffff\33\33\6\uffff\13\32\1\164\10\32\1\165\5\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\24\32\1\167\5\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\170\10\32",
			"\12\33\6\uffff\33\33\6\uffff\22\32\1\171\7\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\22\32\1\173\7\32",
			"\1\71\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\25\32\1\175\4\32",
			"\12\33\6\uffff\33\33\6\uffff\13\32\1\177\1\32\1\176\14\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\u0080\6\uffff\33\33\6\uffff\32\33",
			"",
			"",
			"\12\33\6\uffff\33\33\6\uffff\16\32\1\u0081\13\32",
			"\12\33\6\uffff\33\33\6\uffff\16\32\1\u0082\13\32",
			"\12\33\6\uffff\33\33\6\uffff\24\32\1\u0083\5\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u0084\25\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\14\32\1\u0085\15\32",
			"\12\33\6\uffff\33\33\6\uffff\1\u0086\31\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u0087\25\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u0088\10\32",
			"\12\33\6\uffff\33\33\6\uffff\14\32\1\u0089\15\32",
			"\12\33\6\uffff\33\33\6\uffff\10\32\1\u008a\21\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u008b\25\32",
			"\12\33\6\uffff\33\33\6\uffff\2\32\1\u008c\27\32",
			"\12\33\6\uffff\33\33\6\uffff\24\32\1\u008d\5\32",
			"\12\33\6\uffff\33\33\6\uffff\13\32\1\u008e\16\32",
			"\1\71\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u008f\25\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u0090\25\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u0091\25\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u0093\25\32",
			"\12\33\6\uffff\33\33\6\uffff\22\32\1\u0094\7\32",
			"",
			"\12\33\6\uffff\33\33\6\uffff\22\32\1\u0095\7\32",
			"\12\33\6\uffff\33\33\6\uffff\10\32\1\u0096\21\32",
			"\1\166\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32",
			"",
			"\1\71\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32",
			"",
			"\12\33\6\uffff\33\33\6\uffff\10\32\1\u0097\21\32",
			"\1\71\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\13\32\1\u0098\16\32",
			"\12\33\6\uffff\33\33\6\uffff\32\33",
			"\12\33\6\uffff\33\33\6\uffff\1\32\1\u009a\30\32",
			"\12\33\6\uffff\33\33\6\uffff\10\32\1\u009b\21\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u009c\10\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u009d\10\32",
			"\12\33\6\uffff\33\33\6\uffff\1\32\1\u009e\30\32",
			"\12\33\6\uffff\33\33\6\uffff\10\32\1\u009f\21\32",
			"\12\33\6\uffff\33\33\6\uffff\14\32\1\u00a0\15\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u00a1\25\32",
			"\12\33\6\uffff\33\33\6\uffff\1\32\1\u00a2\30\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u00a3\25\32",
			"\12\33\6\uffff\33\33\6\uffff\15\32\1\u00a4\14\32",
			"\12\33\6\uffff\33\33\6\uffff\13\32\1\u00a5\16\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u00a6\10\32",
			"\1\71\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"",
			"\12\33\6\uffff\33\33\6\uffff\15\32\1\u00ab\3\32\1\u00aa\10"
					+ "\32", "\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u00ad\25\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u00ae\25\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u00af\25\32", "",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u00b0\10\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u00b1\10\32",
			"\12\33\6\uffff\33\33\6\uffff\15\32\1\u00b2\14\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u00b4\10\32",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\u00b5\6\32",
			"\12\33\6\uffff\33\33\6\uffff\1\32\1\u00b6\30\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u00b8\10\32",
			"\12\33\6\uffff\33\33\6\uffff\15\32\1\u00b9\14\32",
			"\12\33\6\uffff\33\33\6\uffff\10\32\1\u00ba\21\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u00bb\25\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32", "", "", "",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\u00bd\6\32", "",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u00be\10\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u00bf\10\32",
			"\12\33\6\uffff\33\33\6\uffff\23\32\1\u00c0\6\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u00c1\25\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u00c2\25\32", "",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u00c3\25\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u00c4\25\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u00c5\10\32", "",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u00c6\25\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u00c7\10\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32", "",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\1\71\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32",
			"\1\71\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32",
			"\1\71\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32",
			"\1\71\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u00c8\10\32",
			"\1\71\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\21\32\1\u00c9\10\32",
			"\12\33\6\uffff\33\33\6\uffff\4\32\1\u00ca\25\32",
			"\1\71\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\12\33\6\uffff\33\33\6\uffff\32\32",
			"\1\71\17\uffff\12\33\6\uffff\33\33\6\uffff\32\32" };

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA
			.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}

		public String getDescription() {
			return "1:1: Tokens : ( SELECT | COUNT | ARTICLE | PAGE | RUBRIQUE | MOT | PARAITRE | AUTEUR | THEME | TITRE | VAR_EMAIL | WS | POINT | JOUR | CONJET | CONJOU | MOIS | ANNEE | VAR_DATE | VAR_MOT );";
		}
	}

}