// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g 2013-11-28 10:05:19

import org.antlr.runtime.*;

public class GrammarParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "SELECT", "COUNT", "ARTICLE", "PAGE",
			"RUBRIQUE", "MOT", "PARAITRE", "AUTEUR", "THEME", "TITRE",
			"VAR_EMAIL", "WS", "POINT", "JOUR", "CONJET", "CONJOU", "MOIS",
			"ANNEE", "VAR_DATE", "VAR_MOT" };
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
	public static final int VAR_DATE = 22;
	public static final int TITRE = 13;
	public static final int SELECT = 4;
	public static final int ARTICLE = 6;

	// delegates
	// delegators

	public GrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public GrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);

	}

	public String[] getTokenNames() {
		return GrammarParser.tokenNames;
	}

	public String getGrammarFileName() {
		return "E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g";
	}

	// $ANTLR start "listerequetes"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:51:1: listerequetes
	// returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql = "";

		Arbre r = null;

		Arbre lr_arbre;
		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:52:25: (r=
			// requete POINT )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:53:3: r=
			// requete POINT
			{
				pushFollow(FOLLOW_requete_in_listerequetes469);
				r = requete();

				state._fsp--;

				match(input, POINT, FOLLOW_POINT_in_listerequetes471);

				lr_arbre = r;
				sql = lr_arbre.sortArbre();

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return sql;
	}

	// $ANTLR end "listerequetes"

	// $ANTLR start "requete"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:61:1: requete
	// returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( COUNT )? ( ARTICLE
	// sr= sous_requetes_article | PAGE sr= sous_requetes_page ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre = new Arbre("");

		Arbre sr = null;

		Arbre ps_arbre;
		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:62:26: (
			// SELECT ( COUNT )? ( ARTICLE sr= sous_requetes_article | PAGE sr=
			// sous_requetes_page ) )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:63:3: SELECT
			// ( COUNT )? ( ARTICLE sr= sous_requetes_article | PAGE sr=
			// sous_requetes_page )
			{
				match(input, SELECT, FOLLOW_SELECT_in_requete499);

				req_arbre.ajouteFils(new Arbre("", "select distinct"));

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:67:3: (
				// COUNT )?
				int alt1 = 2;
				int LA1_0 = input.LA(1);

				if ((LA1_0 == COUNT)) {
					alt1 = 1;
				}
				switch (alt1) {
				case 1:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:67:4:
				// COUNT
				{
					match(input, COUNT, FOLLOW_COUNT_in_requete511);

					req_arbre.ajouteFils(new Arbre("", "count"));

				}
					break;

				}

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:71:3: (
				// ARTICLE sr= sous_requetes_article | PAGE sr=
				// sous_requetes_page )
				int alt2 = 2;
				int LA2_0 = input.LA(1);

				if ((LA2_0 == ARTICLE)) {
					alt2 = 1;
				} else if ((LA2_0 == PAGE)) {
					alt2 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 2,
							0, input);

					throw nvae;
				}
				switch (alt2) {
				case 1:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:71:4:
				// ARTICLE sr= sous_requetes_article
				{
					match(input, ARTICLE, FOLLOW_ARTICLE_in_requete525);

					req_arbre.ajouteFils(new Arbre("", "(article)"));

					pushFollow(FOLLOW_sous_requetes_article_in_requete538);
					sr = sous_requetes_article();

					state._fsp--;

					ps_arbre = sr;
					req_arbre.ajouteFils(ps_arbre);

				}
					break;
				case 2:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:80:6:
				// PAGE sr= sous_requetes_page
				{
					match(input, PAGE, FOLLOW_PAGE_in_requete550);

					req_arbre.ajouteFils(new Arbre("", "(page)"));

					pushFollow(FOLLOW_sous_requetes_page_in_requete563);
					sr = sous_requetes_page();

					state._fsp--;

					ps_arbre = sr;
					req_arbre.ajouteFils(ps_arbre);

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return req_arbre;
	}

	// $ANTLR end "requete"

	// $ANTLR start "sous_requetes_page"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:92:1:
	// sous_requetes_page returns [Arbre sous_requete_arbres = new Arbre(\"\")]
	// : req= sous_requete (c= conj req2= sous_requete )* ;
	public final Arbre sous_requetes_page() throws RecognitionException {
		Arbre sous_requete_arbres = new Arbre("");

		Arbre req = null;

		Arbre c = null;

		Arbre req2 = null;

		Arbre sr_WHERE = new Arbre("", "WHERE"), sr_FROM = new Arbre("", "FROM");
		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:93:85: (req=
			// sous_requete (c= conj req2= sous_requete )* )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:94:2: req=
			// sous_requete (c= conj req2= sous_requete )*
			{
				pushFollow(FOLLOW_sous_requete_in_sous_requetes_page598);
				req = sous_requete();

				state._fsp--;

				sous_requete_arbres.ajouteFils(sr_FROM);
				sous_requete_arbres.ajouteFils(sr_WHERE);
				sr_FROM.ajouteFils(new Arbre(req.fils.mot));
				sr_WHERE.ajouteFils(req.fils.frere);

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:100:2:
				// (c= conj req2= sous_requete )*
				loop3: do {
					int alt3 = 2;
					int LA3_0 = input.LA(1);

					if (((LA3_0 >= CONJET && LA3_0 <= CONJOU))) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
					// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:100:3:
					// c= conj req2= sous_requete
					{
						pushFollow(FOLLOW_conj_in_sous_requetes_page608);
						c = conj();

						state._fsp--;

						pushFollow(FOLLOW_sous_requete_in_sous_requetes_page614);
						req2 = sous_requete();

						state._fsp--;

						sr_FROM.ajouteFils(new Arbre(","));
						sr_FROM.ajouteFils(new Arbre(req2.fils.mot));
						sr_WHERE.ajouteFils(c);
						sr_WHERE.ajouteFils(req2.fils.frere);
						sr_WHERE.ajouteFils(new Arbre("AND", req.fils.mot
								+ ".page = " + req2.fils.mot + ".page"));

					}
						break;

					default:
						break loop3;
					}
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return sous_requete_arbres;
	}

	// $ANTLR end "sous_requetes_page"

	// $ANTLR start "sous_requetes_article"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:109:1:
	// sous_requetes_article returns [Arbre sous_requete_arbres = new
	// Arbre(\"\")] : req= sous_requete (c= conj req2= sous_requete )* ;
	public final Arbre sous_requetes_article() throws RecognitionException {
		Arbre sous_requete_arbres = new Arbre("");

		Arbre req = null;

		Arbre c = null;

		Arbre req2 = null;

		Arbre sr_WHERE = new Arbre("", "WHERE"), sr_FROM = new Arbre("", "FROM");
		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:110:85:
			// (req= sous_requete (c= conj req2= sous_requete )* )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:111:2: req=
			// sous_requete (c= conj req2= sous_requete )*
			{
				pushFollow(FOLLOW_sous_requete_in_sous_requetes_article644);
				req = sous_requete();

				state._fsp--;

				sous_requete_arbres.ajouteFils(sr_FROM);
				sous_requete_arbres.ajouteFils(sr_WHERE);
				sr_FROM.ajouteFils(new Arbre(req.fils.mot));
				sr_WHERE.ajouteFils(req.fils.frere);

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:117:2:
				// (c= conj req2= sous_requete )*
				loop4: do {
					int alt4 = 2;
					int LA4_0 = input.LA(1);

					if (((LA4_0 >= CONJET && LA4_0 <= CONJOU))) {
						alt4 = 1;
					}

					switch (alt4) {
					case 1:
					// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:117:3:
					// c= conj req2= sous_requete
					{
						pushFollow(FOLLOW_conj_in_sous_requetes_article654);
						c = conj();

						state._fsp--;

						pushFollow(FOLLOW_sous_requete_in_sous_requetes_article660);
						req2 = sous_requete();

						state._fsp--;

						sr_FROM.ajouteFils(new Arbre(","));
						sr_FROM.ajouteFils(new Arbre(req2.fils.mot));
						sr_WHERE.ajouteFils(c);
						sr_WHERE.ajouteFils(req2.fils.frere);
						sr_WHERE.ajouteFils(new Arbre("AND", req.fils.mot
								+ ".article = " + req2.fils.mot + ".article"));

					}
						break;

					default:
						break loop4;
					}
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return sous_requete_arbres;
	}

	// $ANTLR end "sous_requetes_article"

	// $ANTLR start "sous_requete"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:126:1: sous_requete
	// returns [Arbre sous_requete_arbre = null] : (req= requete_auteur | req=
	// requete_article | req= requete_date | req= requete_theme | req=
	// requete_titre ) ;
	public final Arbre sous_requete() throws RecognitionException {
		Arbre sous_requete_arbre = null;

		Arbre req = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:127:12: (
			// (req= requete_auteur | req= requete_article | req= requete_date |
			// req= requete_theme | req= requete_titre ) )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:128:2: (req=
			// requete_auteur | req= requete_article | req= requete_date | req=
			// requete_theme | req= requete_titre )
			{
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:128:2:
				// (req= requete_auteur | req= requete_article | req=
				// requete_date | req= requete_theme | req= requete_titre )
				int alt5 = 5;
				switch (input.LA(1)) {
				case AUTEUR: {
					alt5 = 1;
				}
					break;
				case MOT: {
					alt5 = 2;
				}
					break;
				case PARAITRE: {
					alt5 = 3;
				}
					break;
				case THEME: {
					alt5 = 4;
				}
					break;
				case TITRE: {
					alt5 = 5;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 5,
							0, input);

					throw nvae;
				}

				switch (alt5) {
				case 1:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:129:3:
				// req= requete_auteur
				{
					pushFollow(FOLLOW_requete_auteur_in_sous_requete694);
					req = requete_auteur();

					state._fsp--;

					sous_requete_arbre = req;

				}
					break;
				case 2:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:132:3:
				// req= requete_article
				{
					pushFollow(FOLLOW_requete_article_in_sous_requete707);
					req = requete_article();

					state._fsp--;

					sous_requete_arbre = req;

				}
					break;
				case 3:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:135:3:
				// req= requete_date
				{
					pushFollow(FOLLOW_requete_date_in_sous_requete719);
					req = requete_date();

					state._fsp--;

					sous_requete_arbre = req;

				}
					break;
				case 4:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:138:3:
				// req= requete_theme
				{
					pushFollow(FOLLOW_requete_theme_in_sous_requete731);
					req = requete_theme();

					state._fsp--;

					sous_requete_arbre = req;

				}
					break;
				case 5:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:141:3:
				// req= requete_titre
				{
					pushFollow(FOLLOW_requete_titre_in_sous_requete743);
					req = requete_titre();

					state._fsp--;

					sous_requete_arbre = req;

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return sous_requete_arbre;
	}

	// $ANTLR end "sous_requete"

	// $ANTLR start "params"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:151:1: params
	// returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj
	// par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre = new Arbre("");

		Arbre par1 = null;

		Arbre c = null;

		Arbre par2 = null;

		Arbre par1_arbre, par2_arbre, conj_arbre;
		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:152:52:
			// (par1= param (c= conj par2= param )* )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:153:3: par1=
			// param (c= conj par2= param )*
			{
				pushFollow(FOLLOW_param_in_params777);
				par1 = param();

				state._fsp--;

				par1_arbre = par1;
				les_pars_arbre.ajouteFils(par1_arbre);

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:158:3:
				// (c= conj par2= param )*
				loop6: do {
					int alt6 = 2;
					int LA6_0 = input.LA(1);

					if ((LA6_0 == CONJET)) {
						int LA6_1 = input.LA(2);

						if ((LA6_1 == VAR_MOT)) {
							alt6 = 1;
						}

					} else if ((LA6_0 == CONJOU)) {
						int LA6_2 = input.LA(2);

						if ((LA6_2 == VAR_MOT)) {
							alt6 = 1;
						}

					}

					switch (alt6) {
					case 1:
					// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:158:4:
					// c= conj par2= param
					{
						pushFollow(FOLLOW_conj_in_params792);
						c = conj();

						state._fsp--;

						pushFollow(FOLLOW_param_in_params798);
						par2 = param();

						state._fsp--;

						conj_arbre = c;
						par2_arbre = par2;
						les_pars_arbre.ajouteFils(conj_arbre);
						les_pars_arbre.ajouteFils(par2_arbre);

					}
						break;

					default:
						break loop6;
					}
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return les_pars_arbre;
	}

	// $ANTLR end "params"

	// $ANTLR start "param"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:169:1: param returns
	// [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR_MOT ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre = new Arbre("");

		Token a = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:169:51: (a=
			// VAR_MOT )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:170:2: a=
			// VAR_MOT
			{
				a = (Token) match(input, VAR_MOT, FOLLOW_VAR_MOT_in_param827);
				lepar_arbre.ajouteFils(new Arbre("mot like ", "'%"
						+ a.getText() + "%'"));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return lepar_arbre;
	}

	// $ANTLR end "param"

	// $ANTLR start "emails"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:174:1: emails
	// returns [Arbre emails_arbre = new Arbre(\"\")] : email1= email (c= conj
	// email2= email )* ;
	public final Arbre emails() throws RecognitionException {
		Arbre emails_arbre = new Arbre("");

		Arbre email1 = null;

		Arbre c = null;

		Arbre email2 = null;

		Arbre email1_arbre, email2_arbre, conj_arbre;
		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:175:56:
			// (email1= email (c= conj email2= email )* )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:176:2:
			// email1= email (c= conj email2= email )*
			{
				pushFollow(FOLLOW_email_in_emails857);
				email1 = email();

				state._fsp--;

				email1_arbre = email1;
				emails_arbre.ajouteFils(email1_arbre);

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:181:2:
				// (c= conj email2= email )*
				loop7: do {
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if ((LA7_0 == CONJET)) {
						int LA7_1 = input.LA(2);

						if ((LA7_1 == VAR_EMAIL)) {
							alt7 = 1;
						}

					} else if ((LA7_0 == CONJOU)) {
						int LA7_2 = input.LA(2);

						if ((LA7_2 == VAR_EMAIL)) {
							alt7 = 1;
						}

					}

					switch (alt7) {
					case 1:
					// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:181:3:
					// c= conj email2= email
					{
						pushFollow(FOLLOW_conj_in_emails869);
						c = conj();

						state._fsp--;

						pushFollow(FOLLOW_email_in_emails875);
						email2 = email();

						state._fsp--;

						conj_arbre = c;
						email2_arbre = email2;
						emails_arbre.ajouteFils(conj_arbre);
						emails_arbre.ajouteFils(email2_arbre);

					}
						break;

					default:
						break loop7;
					}
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return emails_arbre;
	}

	// $ANTLR end "emails"

	// $ANTLR start "email"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:191:1: email returns
	// [Arbre email_arbre = new Arbre(\"\")] : a= VAR_EMAIL ;
	public final Arbre email() throws RecognitionException {
		Arbre email_arbre = new Arbre("");

		Token a = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:192:11: (a=
			// VAR_EMAIL )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:193:2: a=
			// VAR_EMAIL
			{
				a = (Token) match(input, VAR_EMAIL,
						FOLLOW_VAR_EMAIL_in_email908);

				email_arbre.ajouteFils(new Arbre("email like ", "'%"
						+ a.getText() + "%'"));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return email_arbre;
	}

	// $ANTLR end "email"

	// $ANTLR start "requete_auteur"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:199:1:
	// requete_auteur returns [Arbre auteur_arbre = new Arbre(\"\")] : AUTEUR
	// emailz= emails ;
	public final Arbre requete_auteur() throws RecognitionException {
		Arbre auteur_arbre = new Arbre("");

		Arbre emailz = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:200:11: (
			// AUTEUR emailz= emails )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:201:2:
			// AUTEUR emailz= emails
			{
				match(input, AUTEUR, FOLLOW_AUTEUR_in_requete_auteur933);

				auteur_arbre.ajouteFils(new Arbre("FROM", "auteur"));

				pushFollow(FOLLOW_emails_in_requete_auteur942);
				emailz = emails();

				state._fsp--;

				auteur_arbre.ajouteFils(emailz);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return auteur_arbre;
	}

	// $ANTLR end "requete_auteur"

	// $ANTLR start "requete_article"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:209:1:
	// requete_article returns [Arbre article_arbre = new Arbre(\"\")] : MOT
	// paramz= params ;
	public final Arbre requete_article() throws RecognitionException {
		Arbre article_arbre = new Arbre("");

		Arbre paramz = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:210:11: (
			// MOT paramz= params )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:211:2: MOT
			// paramz= params
			{
				match(input, MOT, FOLLOW_MOT_in_requete_article965);

				article_arbre.ajouteFils(new Arbre("FROM", "titreresume"));

				pushFollow(FOLLOW_params_in_requete_article974);
				paramz = params();

				state._fsp--;

				article_arbre.ajouteFils(paramz);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return article_arbre;
	}

	// $ANTLR end "requete_article"

	// $ANTLR start "requete_date"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:219:1: requete_date
	// returns [Arbre date_arbre = new Arbre(\"\")] : PARAITRE date= VAR_DATE ;
	public final Arbre requete_date() throws RecognitionException {
		Arbre date_arbre = new Arbre("");

		Token date = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:220:12: (
			// PARAITRE date= VAR_DATE )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:221:2:
			// PARAITRE date= VAR_DATE
			{
				match(input, PARAITRE, FOLLOW_PARAITRE_in_requete_date998);

				date_arbre.ajouteFils(new Arbre("FROM", "datearticle"));

				date = (Token) match(input, VAR_DATE,
						FOLLOW_VAR_DATE_in_requete_date1007);

				date_arbre.ajouteFils(new Arbre(
						"CONCAT_WS(' ', 'jj', 'mois', 'annee') = ", date
								.getText()));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return date_arbre;
	}

	// $ANTLR end "requete_date"

	// $ANTLR start "requete_theme"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:229:1: requete_theme
	// returns [Arbre theme_arbre = new Arbre(\"\")] : THEME theme= params ;
	public final Arbre requete_theme() throws RecognitionException {
		Arbre theme_arbre = new Arbre("");

		Arbre theme = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:230:12: (
			// THEME theme= params )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:231:2: THEME
			// theme= params
			{
				match(input, THEME, FOLLOW_THEME_in_requete_theme1031);

				theme_arbre.ajouteFils(new Arbre("FROM", "theme"));

				pushFollow(FOLLOW_params_in_requete_theme1040);
				theme = params();

				state._fsp--;

				theme_arbre.ajouteFils(theme);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return theme_arbre;
	}

	// $ANTLR end "requete_theme"

	// $ANTLR start "requete_titre"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:239:1: requete_titre
	// returns [Arbre titre_arbre = new Arbre(\"\")] : TITRE titre= params ;
	public final Arbre requete_titre() throws RecognitionException {
		Arbre titre_arbre = new Arbre("");

		Arbre titre = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:240:12: (
			// TITRE titre= params )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:241:2: TITRE
			// titre= params
			{
				match(input, TITRE, FOLLOW_TITRE_in_requete_titre1063);

				titre_arbre.ajouteFils(new Arbre("FROM", "titre"));

				pushFollow(FOLLOW_params_in_requete_titre1072);
				titre = params();

				state._fsp--;

				titre_arbre.ajouteFils(titre);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return titre_arbre;
	}

	// $ANTLR end "requete_titre"

	// $ANTLR start "conj"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:249:1: conj returns
	// [Arbre conj_arbre = new Arbre(\"\")] : ( CONJET | CONJOU );
	public final Arbre conj() throws RecognitionException {
		Arbre conj_arbre = new Arbre("");

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:249:49: (
			// CONJET | CONJOU )
			int alt8 = 2;
			int LA8_0 = input.LA(1);

			if ((LA8_0 == CONJET)) {
				alt8 = 1;
			} else if ((LA8_0 == CONJOU)) {
				alt8 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 8, 0,
						input);

				throw nvae;
			}
			switch (alt8) {
			case 1:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:250:2:
			// CONJET
			{
				match(input, CONJET, FOLLOW_CONJET_in_conj1088);

				conj_arbre.ajouteFils(new Arbre("", "AND"));

			}
				break;
			case 2:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:253:2:
			// CONJOU
			{
				match(input, CONJOU, FOLLOW_CONJOU_in_conj1095);

				conj_arbre.ajouteFils(new Arbre("", "OR"));

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return conj_arbre;
	}

	// $ANTLR end "conj"

	// Delegated rules

	public static final BitSet FOLLOW_requete_in_listerequetes469 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_POINT_in_listerequetes471 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SELECT_in_requete499 = new BitSet(
			new long[] { 0x00000000000000E0L });
	public static final BitSet FOLLOW_COUNT_in_requete511 = new BitSet(
			new long[] { 0x00000000000000C0L });
	public static final BitSet FOLLOW_ARTICLE_in_requete525 = new BitSet(
			new long[] { 0x0000000000003E00L });
	public static final BitSet FOLLOW_sous_requetes_article_in_requete538 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PAGE_in_requete550 = new BitSet(
			new long[] { 0x0000000000003E00L });
	public static final BitSet FOLLOW_sous_requetes_page_in_requete563 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_sous_requete_in_sous_requetes_page598 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_conj_in_sous_requetes_page608 = new BitSet(
			new long[] { 0x0000000000003E00L });
	public static final BitSet FOLLOW_sous_requete_in_sous_requetes_page614 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_sous_requete_in_sous_requetes_article644 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_conj_in_sous_requetes_article654 = new BitSet(
			new long[] { 0x0000000000003E00L });
	public static final BitSet FOLLOW_sous_requete_in_sous_requetes_article660 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_requete_auteur_in_sous_requete694 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_requete_article_in_sous_requete707 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_requete_date_in_sous_requete719 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_requete_theme_in_sous_requete731 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_requete_titre_in_sous_requete743 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_param_in_params777 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_conj_in_params792 = new BitSet(
			new long[] { 0x0000000000800000L });
	public static final BitSet FOLLOW_param_in_params798 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_VAR_MOT_in_param827 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_email_in_emails857 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_conj_in_emails869 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_email_in_emails875 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_VAR_EMAIL_in_email908 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_AUTEUR_in_requete_auteur933 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_emails_in_requete_auteur942 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_MOT_in_requete_article965 = new BitSet(
			new long[] { 0x0000000000800000L });
	public static final BitSet FOLLOW_params_in_requete_article974 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PARAITRE_in_requete_date998 = new BitSet(
			new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_VAR_DATE_in_requete_date1007 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_THEME_in_requete_theme1031 = new BitSet(
			new long[] { 0x0000000000800000L });
	public static final BitSet FOLLOW_params_in_requete_theme1040 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TITRE_in_requete_titre1063 = new BitSet(
			new long[] { 0x0000000000800000L });
	public static final BitSet FOLLOW_params_in_requete_titre1072 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CONJET_in_conj1088 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CONJOU_in_conj1095 = new BitSet(
			new long[] { 0x0000000000000002L });

}