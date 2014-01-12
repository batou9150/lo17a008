// $ANTLR 3.5.1 C:\\Users\\O_o\\Downloads\\Grammar.g 2014-01-08 22:14:55

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int AUTEUR=6;
	public static final int CONJET=7;
	public static final int CONJOU=8;
	public static final int COUNT=9;
	public static final int JOUR=10;
	public static final int MOIS=11;
	public static final int MOT=12;
	public static final int PAGE=13;
	public static final int PARAITRE=14;
	public static final int POINT=15;
	public static final int RUBRIQUE=16;
	public static final int SELECT=17;
	public static final int THEME=18;
	public static final int TITRE=19;
	public static final int VAR_DATE=20;
	public static final int VAR_EMAIL=21;
	public static final int VAR_MOT=22;
	public static final int WS=23;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GrammarLexer() {} 
	public GrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\O_o\\Downloads\\Grammar.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:4:8: ( 'vouloir' | 'retourner' | 'donner' | 'souhaiter' )
			int alt1=4;
			switch ( input.LA(1) ) {
			case 'v':
				{
				alt1=1;
				}
				break;
			case 'r':
				{
				alt1=2;
				}
				break;
			case 'd':
				{
				alt1=3;
				}
				break;
			case 's':
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:4:10: 'vouloir'
					{
					match("vouloir"); 

					}
					break;
				case 2 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:4:20: 'retourner'
					{
					match("retourner"); 

					}
					break;
				case 3 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:4:32: 'donner'
					{
					match("donner"); 

					}
					break;
				case 4 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:4:41: 'souhaiter'
					{
					match("souhaiter"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:8:7: ( 'nombre' | 'combien' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='n') ) {
				alt2=1;
			}
			else if ( (LA2_0=='c') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:8:9: 'nombre'
					{
					match("nombre"); 

					}
					break;
				case 2 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:8:20: 'combien'
					{
					match("combien"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:12:9: ( 'article' | 'texte' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='a') ) {
				alt3=1;
			}
			else if ( (LA3_0=='t') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:12:11: 'article'
					{
					match("article"); 

					}
					break;
				case 2 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:12:24: 'texte'
					{
					match("texte"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "PAGE"
	public final void mPAGE() throws RecognitionException {
		try {
			int _type = PAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:14:6: ( 'page' )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:14:8: 'page'
			{
			match("page"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAGE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:17:10: ( 'rubrique' )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:17:12: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:19:5: ( 'mot' | 'contenir' | 'parle' )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt4=1;
				}
				break;
			case 'c':
				{
				alt4=2;
				}
				break;
			case 'p':
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:19:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:19:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:19:28: 'parle'
					{
					match("parle"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "PARAITRE"
	public final void mPARAITRE() throws RecognitionException {
		try {
			int _type = PARAITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:21:10: ( 'parus' )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:21:12: 'parus'
			{
			match("parus"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARAITRE"

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:23:9: ( 'auteur' )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:23:11: 'auteur'
			{
			match("auteur"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTEUR"

	// $ANTLR start "THEME"
	public final void mTHEME() throws RecognitionException {
		try {
			int _type = THEME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:25:8: ( 'theme' )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:25:10: 'theme'
			{
			match("theme"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEME"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:27:8: ( 'titre' )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:27:10: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "VAR_EMAIL"
	public final void mVAR_EMAIL() throws RecognitionException {
		try {
			int _type = VAR_EMAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:31:11: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ ( '@' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ ( '.' ) ( 'A' .. 'Z' | 'a' .. 'z' )+ )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:31:13: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ ( '@' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+ ( '.' ) ( 'A' .. 'Z' | 'a' .. 'z' )+
			{
			// C:\\Users\\O_o\\Downloads\\Grammar.g:31:13: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			// C:\\Users\\O_o\\Downloads\\Grammar.g:31:47: ( '@' )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:31:48: '@'
			{
			match('@'); 
			}

			// C:\\Users\\O_o\\Downloads\\Grammar.g:31:52: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			// C:\\Users\\O_o\\Downloads\\Grammar.g:31:86: ( '.' )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:31:87: '.'
			{
			match('.'); 
			}

			// C:\\Users\\O_o\\Downloads\\Grammar.g:31:92: ( 'A' .. 'Z' | 'a' .. 'z' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_EMAIL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:35:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'qui' | 'les' | 'dont' | 'de' | 'd\\'' | 'le' ) | '\\n' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\t'||LA9_0=='\r'||LA9_0==' '||LA9_0=='J'||LA9_0=='d'||LA9_0=='j'||LA9_0=='l'||LA9_0=='q') ) {
				alt9=1;
			}
			else if ( (LA9_0=='\n') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:35:7: ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'qui' | 'les' | 'dont' | 'de' | 'd\\'' | 'le' )
					{
					// C:\\Users\\O_o\\Downloads\\Grammar.g:35:7: ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'qui' | 'les' | 'dont' | 'de' | 'd\\'' | 'le' )
					int alt8=11;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt8=1;
						}
						break;
					case '\t':
						{
						alt8=2;
						}
						break;
					case '\r':
						{
						alt8=3;
						}
						break;
					case 'j':
						{
						alt8=4;
						}
						break;
					case 'J':
						{
						alt8=5;
						}
						break;
					case 'q':
						{
						alt8=6;
						}
						break;
					case 'l':
						{
						int LA8_7 = input.LA(2);
						if ( (LA8_7=='e') ) {
							int LA8_9 = input.LA(3);
							if ( (LA8_9=='s') ) {
								alt8=7;
							}

							else {
								alt8=11;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 8, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'd':
						{
						switch ( input.LA(2) ) {
						case 'o':
							{
							alt8=8;
							}
							break;
						case 'e':
							{
							alt8=9;
							}
							break;
						case '\'':
							{
							alt8=10;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 8, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\O_o\\Downloads\\Grammar.g:35:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// C:\\Users\\O_o\\Downloads\\Grammar.g:35:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// C:\\Users\\O_o\\Downloads\\Grammar.g:35:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// C:\\Users\\O_o\\Downloads\\Grammar.g:35:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// C:\\Users\\O_o\\Downloads\\Grammar.g:35:34: 'Je'
							{
							match("Je"); 

							}
							break;
						case 6 :
							// C:\\Users\\O_o\\Downloads\\Grammar.g:35:41: 'qui'
							{
							match("qui"); 

							}
							break;
						case 7 :
							// C:\\Users\\O_o\\Downloads\\Grammar.g:35:49: 'les'
							{
							match("les"); 

							}
							break;
						case 8 :
							// C:\\Users\\O_o\\Downloads\\Grammar.g:35:57: 'dont'
							{
							match("dont"); 

							}
							break;
						case 9 :
							// C:\\Users\\O_o\\Downloads\\Grammar.g:35:66: 'de'
							{
							match("de"); 

							}
							break;
						case 10 :
							// C:\\Users\\O_o\\Downloads\\Grammar.g:35:73: 'd\\''
							{
							match("d'"); 

							}
							break;
						case 11 :
							// C:\\Users\\O_o\\Downloads\\Grammar.g:35:81: 'le'
							{
							match("le"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:35:99: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:38:7: ( '.' | '?' | '!' )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)=='.'||input.LA(1)=='?' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "JOUR"
	public final void mJOUR() throws RecognitionException {
		try {
			int _type = JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:41:6: ( ( '0' .. '3' )? ( '0' .. '9' ) )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:41:8: ( '0' .. '3' )? ( '0' .. '9' )
			{
			// C:\\Users\\O_o\\Downloads\\Grammar.g:41:8: ( '0' .. '3' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= '0' && LA10_0 <= '3')) ) {
				int LA10_1 = input.LA(2);
				if ( ((LA10_1 >= '0' && LA10_1 <= '9')) ) {
					alt10=1;
				}
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOUR"

	// $ANTLR start "CONJET"
	public final void mCONJET() throws RecognitionException {
		try {
			int _type = CONJET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:43:9: ( 'et' )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:43:12: 'et'
			{
			match("et"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJET"

	// $ANTLR start "CONJOU"
	public final void mCONJOU() throws RecognitionException {
		try {
			int _type = CONJOU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:44:9: ( 'ou' )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:44:11: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJOU"

	// $ANTLR start "MOIS"
	public final void mMOIS() throws RecognitionException {
		try {
			int _type = MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:45:7: ( 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre' )
			int alt11=12;
			switch ( input.LA(1) ) {
			case 'j':
				{
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='a') ) {
					alt11=1;
				}
				else if ( (LA11_1=='u') ) {
					int LA11_10 = input.LA(3);
					if ( (LA11_10=='i') ) {
						int LA11_14 = input.LA(4);
						if ( (LA11_14=='n') ) {
							alt11=6;
						}
						else if ( (LA11_14=='l') ) {
							alt11=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt11=2;
				}
				break;
			case 'm':
				{
				int LA11_3 = input.LA(2);
				if ( (LA11_3=='a') ) {
					int LA11_11 = input.LA(3);
					if ( (LA11_11=='r') ) {
						alt11=3;
					}
					else if ( (LA11_11=='i') ) {
						alt11=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				int LA11_4 = input.LA(2);
				if ( (LA11_4=='v') ) {
					alt11=4;
				}
				else if ( (LA11_4=='o') ) {
					alt11=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt11=9;
				}
				break;
			case 'o':
				{
				alt11=10;
				}
				break;
			case 'n':
				{
				alt11=11;
				}
				break;
			case 'd':
				{
				alt11=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:45:9: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:45:21: 'fevrier'
					{
					match("fevrier"); 

					}
					break;
				case 3 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:45:33: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:45:42: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:45:52: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:45:60: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:45:69: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:45:81: 'aout'
					{
					match("aout"); 

					}
					break;
				case 9 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:45:90: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:45:104: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:45:116: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:45:129: 'decembre'
					{
					match("decembre"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOIS"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:46:8: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:46:10: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNEE"

	// $ANTLR start "VAR_DATE"
	public final void mVAR_DATE() throws RecognitionException {
		try {
			int _type = VAR_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:47:10: ( ( JOUR ' ' MOIS ' ' ANNEE ) | ( MOIS ' ' ANNEE ) | ( ANNEE ) )
			int alt12=3;
			switch ( input.LA(1) ) {
			case '0':
			case '1':
			case '2':
			case '3':
				{
				int LA12_1 = input.LA(2);
				if ( ((LA12_1 >= '0' && LA12_1 <= '9')) ) {
					int LA12_4 = input.LA(3);
					if ( ((LA12_4 >= '0' && LA12_4 <= '9')) ) {
						alt12=3;
					}
					else if ( (LA12_4==' ') ) {
						alt12=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA12_1==' ') ) {
					alt12=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				{
				int LA12_2 = input.LA(2);
				if ( ((LA12_2 >= '0' && LA12_2 <= '9')) ) {
					alt12=3;
				}
				else if ( (LA12_2==' ') ) {
					alt12=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
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
			case 's':
				{
				alt12=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:47:12: ( JOUR ' ' MOIS ' ' ANNEE )
					{
					// C:\\Users\\O_o\\Downloads\\Grammar.g:47:12: ( JOUR ' ' MOIS ' ' ANNEE )
					// C:\\Users\\O_o\\Downloads\\Grammar.g:47:13: JOUR ' ' MOIS ' ' ANNEE
					{
					mJOUR(); 

					match(' '); 
					mMOIS(); 

					match(' '); 
					mANNEE(); 

					}

					}
					break;
				case 2 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:47:40: ( MOIS ' ' ANNEE )
					{
					// C:\\Users\\O_o\\Downloads\\Grammar.g:47:40: ( MOIS ' ' ANNEE )
					// C:\\Users\\O_o\\Downloads\\Grammar.g:47:41: MOIS ' ' ANNEE
					{
					mMOIS(); 

					match(' '); 
					mANNEE(); 

					}

					}
					break;
				case 3 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:47:59: ( ANNEE )
					{
					// C:\\Users\\O_o\\Downloads\\Grammar.g:47:59: ( ANNEE )
					// C:\\Users\\O_o\\Downloads\\Grammar.g:47:60: ANNEE
					{
					mANNEE(); 
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_DATE"

	// $ANTLR start "VAR_MOT"
	public final void mVAR_MOT() throws RecognitionException {
		try {
			int _type = VAR_MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\O_o\\Downloads\\Grammar.g:48:9: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// C:\\Users\\O_o\\Downloads\\Grammar.g:48:11: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\O_o\\Downloads\\Grammar.g:48:33: ( 'a' .. 'z' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= 'a' && LA13_0 <= 'z')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\O_o\\Downloads\\Grammar.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOT"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\O_o\\Downloads\\Grammar.g:1:8: ( SELECT | COUNT | ARTICLE | PAGE | RUBRIQUE | MOT | PARAITRE | AUTEUR | THEME | TITRE | VAR_EMAIL | WS | POINT | JOUR | CONJET | CONJOU | MOIS | ANNEE | VAR_DATE | VAR_MOT )
		int alt14=20;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:17: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 3 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:23: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 4 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:31: PAGE
				{
				mPAGE(); 

				}
				break;
			case 5 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:36: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 6 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:45: MOT
				{
				mMOT(); 

				}
				break;
			case 7 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:49: PARAITRE
				{
				mPARAITRE(); 

				}
				break;
			case 8 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:58: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 9 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:65: THEME
				{
				mTHEME(); 

				}
				break;
			case 10 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:71: TITRE
				{
				mTITRE(); 

				}
				break;
			case 11 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:77: VAR_EMAIL
				{
				mVAR_EMAIL(); 

				}
				break;
			case 12 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:87: WS
				{
				mWS(); 

				}
				break;
			case 13 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:90: POINT
				{
				mPOINT(); 

				}
				break;
			case 14 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:96: JOUR
				{
				mJOUR(); 

				}
				break;
			case 15 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:101: CONJET
				{
				mCONJET(); 

				}
				break;
			case 16 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:108: CONJOU
				{
				mCONJOU(); 

				}
				break;
			case 17 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:115: MOIS
				{
				mMOIS(); 

				}
				break;
			case 18 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:120: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 19 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:126: VAR_DATE
				{
				mVAR_DATE(); 

				}
				break;
			case 20 :
				// C:\\Users\\O_o\\Downloads\\Grammar.g:1:135: VAR_MOT
				{
				mVAR_MOT(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA14_eotS =
		"\20\uffff\1\63\1\uffff\1\63\4\uffff\1\73\1\uffff\4\73\1\14\16\73\1\14"+
		"\2\73\1\14\1\73\1\14\1\63\3\uffff\1\127\1\130\3\73\1\uffff\23\73\1\161"+
		"\1\73\1\163\2\73\2\14\3\uffff\6\73\1\14\12\73\1\163\3\73\1\u008b\2\73"+
		"\1\uffff\1\163\1\uffff\1\73\1\163\1\73\1\u0090\17\73\1\163\1\u00a0\1\u00a1"+
		"\1\u00a2\1\uffff\1\161\1\u00a3\2\73\1\uffff\5\73\1\u00ab\3\73\1\u00af"+
		"\4\73\1\u00b4\4\uffff\4\73\1\u00ab\2\73\1\uffff\3\73\1\uffff\1\73\1\u00af"+
		"\1\73\1\u00a0\1\uffff\4\163\1\73\1\u00c1\1\163\2\73\1\163\1\161\1\u00ab"+
		"\1\uffff\1\u00ab\1\163";
	static final String DFA14_eofS =
		"\u00c4\uffff";
	static final String DFA14_minS =
		"\1\11\2\60\1\47\10\60\1\uffff\3\60\1\40\1\uffff\1\40\5\60\1\uffff\31\60"+
		"\1\40\2\uffff\6\60\1\uffff\25\60\1\40\5\60\2\uffff\21\60\1\40\6\60\1\uffff"+
		"\1\40\1\uffff\1\60\1\40\21\60\1\40\3\60\1\uffff\4\60\1\uffff\17\60\4\uffff"+
		"\7\60\1\uffff\3\60\1\uffff\4\60\1\uffff\4\40\2\60\1\40\2\60\1\40\2\60"+
		"\1\uffff\1\60\1\40";
	static final String DFA14_maxS =
		"\14\172\1\uffff\4\172\1\uffff\6\172\1\uffff\32\172\2\uffff\6\172\1\uffff"+
		"\33\172\2\uffff\30\172\1\uffff\1\172\1\uffff\27\172\1\uffff\4\172\1\uffff"+
		"\17\172\4\uffff\7\172\1\uffff\3\172\1\uffff\4\172\1\uffff\14\172\1\uffff"+
		"\2\172";
	static final String DFA14_acceptS =
		"\14\uffff\1\14\4\uffff\1\15\6\uffff\1\13\32\uffff\1\16\1\23\6\uffff\1"+
		"\24\33\uffff\1\17\1\20\30\uffff\1\6\1\uffff\1\21\27\uffff\1\4\4\uffff"+
		"\1\22\17\uffff\1\3\1\11\1\12\1\7\7\uffff\1\1\3\uffff\1\2\4\uffff\1\10"+
		"\14\uffff\1\5\2\uffff";
	static final String DFA14_specialS =
		"\u00c4\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\14\2\uffff\1\14\22\uffff\1\14\1\21\14\uffff\1\21\1\uffff\4\20\6\22"+
			"\5\uffff\1\21\1\uffff\11\26\1\15\20\26\6\uffff\1\7\1\26\1\6\1\3\1\23"+
			"\1\25\3\26\1\13\1\26\1\17\1\12\1\5\1\24\1\11\1\16\1\2\1\4\1\10\1\26\1"+
			"\1\4\26",
			"\12\30\6\uffff\33\30\6\uffff\16\31\1\27\13\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\32\17\31\1\33\5\31",
			"\1\14\10\uffff\12\30\6\uffff\33\30\6\uffff\4\31\1\35\11\31\1\34\13\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\37\11\31\1\36\13\31",
			"\12\30\6\uffff\33\30\6\uffff\16\31\1\40\13\31",
			"\12\30\6\uffff\33\30\6\uffff\16\31\1\41\13\31",
			"\12\30\6\uffff\33\30\6\uffff\16\31\1\45\2\31\1\42\2\31\1\43\1\44\4\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\46\2\31\1\47\1\50\21\31",
			"\12\30\6\uffff\33\30\6\uffff\1\51\31\31",
			"\12\30\6\uffff\33\30\6\uffff\1\53\15\31\1\52\13\31",
			"\12\30\6\uffff\33\30\6\uffff\1\55\3\31\1\54\17\31\1\56\5\31",
			"",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\57\25\31",
			"\12\30\6\uffff\33\30\6\uffff\24\31\1\60\5\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\61\25\31",
			"\1\64\17\uffff\12\62\6\uffff\33\30\6\uffff\32\30",
			"",
			"\1\64\17\uffff\12\65\6\uffff\33\30\6\uffff\32\30",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\66\6\31",
			"\12\30\6\uffff\33\30\6\uffff\2\31\1\70\21\31\1\67\5\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\71\25\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\24\31\1\72\5\31",
			"",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\74\6\31",
			"\12\30\6\uffff\33\30\6\uffff\1\31\1\75\30\31",
			"\12\30\6\uffff\33\30\6\uffff\15\31\1\76\14\31",
			"\12\30\6\uffff\33\30\6\uffff\2\31\1\77\27\31",
			"\12\30\6\uffff\33\30\6\uffff\24\31\1\100\5\31",
			"\12\30\6\uffff\33\30\6\uffff\17\31\1\101\12\31",
			"\12\30\6\uffff\33\30\6\uffff\14\31\1\102\10\31\1\103\4\31",
			"\12\30\6\uffff\33\30\6\uffff\14\31\1\104\1\105\14\31",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\106\6\31",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\107\6\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\110\10\31",
			"\12\30\6\uffff\33\30\6\uffff\24\31\1\111\5\31",
			"\12\30\6\uffff\33\30\6\uffff\27\31\1\112\2\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\113\25\31",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\114\6\31",
			"\12\30\6\uffff\33\30\6\uffff\6\31\1\115\12\31\1\116\10\31",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\117\6\31",
			"\12\30\6\uffff\33\30\6\uffff\10\31\1\121\10\31\1\120\10\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\15\31\1\122\14\31",
			"\12\30\6\uffff\33\30\6\uffff\10\31\1\123\21\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\10\31\1\124\21\31",
			"\12\30\6\uffff\33\30\6\uffff\22\31\1\125\7\31",
			"\1\64\17\uffff\12\126\6\uffff\33\30\6\uffff\32\30",
			"",
			"",
			"\12\126\6\uffff\33\30\6\uffff\32\30",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\131\6\31",
			"\12\30\6\uffff\33\30\6\uffff\25\31\1\132\4\31",
			"\12\30\6\uffff\33\30\6\uffff\13\31\1\133\16\31",
			"",
			"\12\30\6\uffff\33\30\6\uffff\16\31\1\134\13\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\135\10\31",
			"\12\30\6\uffff\33\30\6\uffff\15\31\1\136\5\31\1\137\6\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\140\25\31",
			"\12\30\6\uffff\33\30\6\uffff\7\31\1\141\22\31",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\142\6\31",
			"\12\30\6\uffff\33\30\6\uffff\1\31\1\143\30\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\144\25\31",
			"\12\30\6\uffff\33\30\6\uffff\1\31\1\145\30\31",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\146\6\31",
			"\12\30\6\uffff\33\30\6\uffff\10\31\1\147\21\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\150\25\31",
			"\12\30\6\uffff\33\30\6\uffff\10\31\1\151\21\31",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\152\6\31",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\153\6\31",
			"\12\30\6\uffff\33\30\6\uffff\14\31\1\154\15\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\155\10\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\156\25\31",
			"\12\30\6\uffff\33\30\6\uffff\13\31\1\157\10\31\1\160\5\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\22\31\1\162\7\31",
			"\1\64\17\uffff\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\25\31\1\164\4\31",
			"\12\30\6\uffff\33\30\6\uffff\13\31\1\166\1\31\1\165\14\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\167\6\uffff\33\30\6\uffff\32\30",
			"",
			"",
			"\12\30\6\uffff\33\30\6\uffff\16\31\1\170\13\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\171\10\31",
			"\12\30\6\uffff\33\30\6\uffff\16\31\1\172\13\31",
			"\12\30\6\uffff\33\30\6\uffff\24\31\1\173\5\31",
			"\12\30\6\uffff\33\30\6\uffff\10\31\1\174\21\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\175\25\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\14\31\1\176\15\31",
			"\12\30\6\uffff\33\30\6\uffff\1\177\31\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u0080\25\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u0081\10\31",
			"\12\30\6\uffff\33\30\6\uffff\14\31\1\u0082\15\31",
			"\12\30\6\uffff\33\30\6\uffff\10\31\1\u0083\21\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u0084\25\31",
			"\12\30\6\uffff\33\30\6\uffff\2\31\1\u0085\27\31",
			"\12\30\6\uffff\33\30\6\uffff\24\31\1\u0086\5\31",
			"\12\30\6\uffff\33\30\6\uffff\13\31\1\u0087\16\31",
			"\1\64\17\uffff\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u0088\25\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u0089\25\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u008a\25\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u008c\25\31",
			"\12\30\6\uffff\33\30\6\uffff\22\31\1\u008d\7\31",
			"",
			"\1\64\17\uffff\12\30\6\uffff\33\30\6\uffff\32\31",
			"",
			"\12\30\6\uffff\33\30\6\uffff\10\31\1\u008e\21\31",
			"\1\64\17\uffff\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\13\31\1\u008f\16\31",
			"\12\30\6\uffff\33\30\6\uffff\32\30",
			"\12\30\6\uffff\33\30\6\uffff\1\31\1\u0091\30\31",
			"\12\30\6\uffff\33\30\6\uffff\10\31\1\u0092\21\31",
			"\12\30\6\uffff\33\30\6\uffff\10\31\1\u0093\21\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u0094\10\31",
			"\12\30\6\uffff\33\30\6\uffff\20\31\1\u0095\11\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u0096\10\31",
			"\12\30\6\uffff\33\30\6\uffff\1\31\1\u0097\30\31",
			"\12\30\6\uffff\33\30\6\uffff\10\31\1\u0098\21\31",
			"\12\30\6\uffff\33\30\6\uffff\14\31\1\u0099\15\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u009a\25\31",
			"\12\30\6\uffff\33\30\6\uffff\1\31\1\u009b\30\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u009c\25\31",
			"\12\30\6\uffff\33\30\6\uffff\15\31\1\u009d\14\31",
			"\12\30\6\uffff\33\30\6\uffff\13\31\1\u009e\16\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u009f\10\31",
			"\1\64\17\uffff\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u00a4\25\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u00a5\25\31",
			"",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u00a6\10\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u00a7\25\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u00a8\10\31",
			"\12\30\6\uffff\33\30\6\uffff\15\31\1\u00a9\14\31",
			"\12\30\6\uffff\33\30\6\uffff\24\31\1\u00aa\5\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u00ac\10\31",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\u00ad\6\31",
			"\12\30\6\uffff\33\30\6\uffff\1\31\1\u00ae\30\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u00b0\10\31",
			"\12\30\6\uffff\33\30\6\uffff\15\31\1\u00b1\14\31",
			"\12\30\6\uffff\33\30\6\uffff\10\31\1\u00b2\21\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u00b3\25\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"",
			"",
			"",
			"",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u00b5\10\31",
			"\12\30\6\uffff\33\30\6\uffff\23\31\1\u00b6\6\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u00b7\25\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u00b8\10\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u00b9\25\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u00ba\25\31",
			"",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u00bb\25\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u00bc\25\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u00bd\10\31",
			"",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u00be\25\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u00bf\10\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"",
			"\1\64\17\uffff\12\30\6\uffff\33\30\6\uffff\32\31",
			"\1\64\17\uffff\12\30\6\uffff\33\30\6\uffff\32\31",
			"\1\64\17\uffff\12\30\6\uffff\33\30\6\uffff\32\31",
			"\1\64\17\uffff\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u00c0\10\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\1\64\17\uffff\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\21\31\1\u00c2\10\31",
			"\12\30\6\uffff\33\30\6\uffff\4\31\1\u00c3\25\31",
			"\1\64\17\uffff\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"",
			"\12\30\6\uffff\33\30\6\uffff\32\31",
			"\1\64\17\uffff\12\30\6\uffff\33\30\6\uffff\32\31"
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

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
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | COUNT | ARTICLE | PAGE | RUBRIQUE | MOT | PARAITRE | AUTEUR | THEME | TITRE | VAR_EMAIL | WS | POINT | JOUR | CONJET | CONJOU | MOIS | ANNEE | VAR_DATE | VAR_MOT );";
		}
	}

}
