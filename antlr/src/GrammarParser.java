// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g 2013-11-27 21:21:57

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
	// | PAGE ) sr= sous_requetes ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre = new Arbre("");

		Arbre sr = null;

		Arbre ps_arbre;
		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:62:26: (
			// SELECT ( COUNT )? ( ARTICLE | PAGE ) sr= sous_requetes )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:63:3: SELECT
			// ( COUNT )? ( ARTICLE | PAGE ) sr= sous_requetes
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
				// ARTICLE | PAGE )
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
				// ARTICLE
				{
					match(input, ARTICLE, FOLLOW_ARTICLE_in_requete525);

					req_arbre.ajouteFils(new Arbre("", "(article)"));

				}
					break;
				case 2:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:75:6:
				// PAGE
				{
					match(input, PAGE, FOLLOW_PAGE_in_requete537);

					req_arbre.ajouteFils(new Arbre("", "(page)"));

				}
					break;

				}

				pushFollow(FOLLOW_sous_requetes_in_requete551);
				sr = sous_requetes();

				state._fsp--;

				ps_arbre = sr;
				req_arbre.ajouteFils(ps_arbre);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return req_arbre;
	}

	// $ANTLR end "requete"

	// $ANTLR start "sous_requetes"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:86:1: sous_requetes
	// returns [Arbre sous_requete_arbres = new Arbre(\"\")] : req= sous_requete
	// (c= conj req2= sous_requete )* ;
	public final Arbre sous_requetes() throws RecognitionException {
		Arbre sous_requete_arbres = new Arbre("");

		Arbre req = null;

		Arbre c = null;

		Arbre req2 = null;

		Arbre sr_where = new Arbre("", "WHERE"), sr_FROM = new Arbre("", "FROM");
		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:87:85: (req=
			// sous_requete (c= conj req2= sous_requete )* )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:88:2: req=
			// sous_requete (c= conj req2= sous_requete )*
			{
				pushFollow(FOLLOW_sous_requete_in_sous_requetes582);
				req = sous_requete();

				state._fsp--;

				sous_requete_arbres.ajouteFils(sr_FROM);
				sous_requete_arbres.ajouteFils(sr_where);
				sr_FROM.ajouteFils(new Arbre(req.fils.mot));
				sr_where.ajouteFils(req.fils.frere);

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:94:2:
				// (c= conj req2= sous_requete )*
				loop3: do {
					int alt3 = 2;
					int LA3_0 = input.LA(1);

					if (((LA3_0 >= CONJET && LA3_0 <= CONJOU))) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
					// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:94:3:
					// c= conj req2= sous_requete
					{
						pushFollow(FOLLOW_conj_in_sous_requetes592);
						c = conj();

						state._fsp--;

						pushFollow(FOLLOW_sous_requete_in_sous_requetes598);
						req2 = sous_requete();

						state._fsp--;

						sr_FROM.ajouteFils(new Arbre(","));
						sr_FROM.ajouteFils(new Arbre(req2.fils.mot));
						sr_where.ajouteFils(c);
						sr_where.ajouteFils(req2.fils.frere);

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

	// $ANTLR end "sous_requetes"

	// $ANTLR start "sous_requete"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:102:1: sous_requete
	// returns [Arbre sous_requete_arbre = null] : (req= requete_auteur | req=
	// requete_article | req= requete_date | req= requete_theme | req=
	// requete_titre ) ;
	public final Arbre sous_requete() throws RecognitionException {
		Arbre sous_requete_arbre = null;

		Arbre req = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:103:12: (
			// (req= requete_auteur | req= requete_article | req= requete_date |
			// req= requete_theme | req= requete_titre ) )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:104:2: (req=
			// requete_auteur | req= requete_article | req= requete_date | req=
			// requete_theme | req= requete_titre )
			{
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:104:2:
				// (req= requete_auteur | req= requete_article | req=
				// requete_date | req= requete_theme | req= requete_titre )
				int alt4 = 5;
				switch (input.LA(1)) {
				case AUTEUR: {
					alt4 = 1;
				}
					break;
				case MOT: {
					alt4 = 2;
				}
					break;
				case PARAITRE: {
					alt4 = 3;
				}
					break;
				case THEME: {
					alt4 = 4;
				}
					break;
				case TITRE: {
					alt4 = 5;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 4,
							0, input);

					throw nvae;
				}

				switch (alt4) {
				case 1:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:105:3:
				// req= requete_auteur
				{
					pushFollow(FOLLOW_requete_auteur_in_sous_requete632);
					req = requete_auteur();

					state._fsp--;

					sous_requete_arbre = req;

				}
					break;
				case 2:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:108:3:
				// req= requete_article
				{
					pushFollow(FOLLOW_requete_article_in_sous_requete645);
					req = requete_article();

					state._fsp--;

					sous_requete_arbre = req;

				}
					break;
				case 3:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:111:3:
				// req= requete_date
				{
					pushFollow(FOLLOW_requete_date_in_sous_requete657);
					req = requete_date();

					state._fsp--;

					sous_requete_arbre = req;

				}
					break;
				case 4:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:114:3:
				// req= requete_theme
				{
					pushFollow(FOLLOW_requete_theme_in_sous_requete669);
					req = requete_theme();

					state._fsp--;

					sous_requete_arbre = req;

				}
					break;
				case 5:
				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:117:3:
				// req= requete_titre
				{
					pushFollow(FOLLOW_requete_titre_in_sous_requete681);
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
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:127:1: params
	// returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj
	// par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre = new Arbre("");

		Arbre par1 = null;

		Arbre c = null;

		Arbre par2 = null;

		Arbre par1_arbre, par2_arbre, conj_arbre;
		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:128:52:
			// (par1= param (c= conj par2= param )* )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:129:3: par1=
			// param (c= conj par2= param )*
			{
				pushFollow(FOLLOW_param_in_params715);
				par1 = param();

				state._fsp--;

				par1_arbre = par1;
				les_pars_arbre.ajouteFils(par1_arbre);

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:134:3:
				// (c= conj par2= param )*
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if ((LA5_0 == CONJET)) {
						int LA5_1 = input.LA(2);

						if ((LA5_1 == VAR_MOT)) {
							alt5 = 1;
						}

					} else if ((LA5_0 == CONJOU)) {
						int LA5_2 = input.LA(2);

						if ((LA5_2 == VAR_MOT)) {
							alt5 = 1;
						}

					}

					switch (alt5) {
					case 1:
					// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:134:4:
					// c= conj par2= param
					{
						pushFollow(FOLLOW_conj_in_params730);
						c = conj();

						state._fsp--;

						pushFollow(FOLLOW_param_in_params736);
						par2 = param();

						state._fsp--;

						conj_arbre = c;
						par2_arbre = par2;
						les_pars_arbre.ajouteFils(conj_arbre);
						les_pars_arbre.ajouteFils(par2_arbre);

					}
						break;

					default:
						break loop5;
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
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:145:1: param returns
	// [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR_MOT ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre = new Arbre("");

		Token a = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:145:51: (a=
			// VAR_MOT )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:146:2: a=
			// VAR_MOT
			{
				a = (Token) match(input, VAR_MOT, FOLLOW_VAR_MOT_in_param765);
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
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:150:1: emails
	// returns [Arbre emails_arbre = new Arbre(\"\")] : email1= email (c= conj
	// email2= email )* ;
	public final Arbre emails() throws RecognitionException {
		Arbre emails_arbre = new Arbre("");

		Arbre email1 = null;

		Arbre c = null;

		Arbre email2 = null;

		Arbre email1_arbre, email2_arbre, conj_arbre;
		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:151:56:
			// (email1= email (c= conj email2= email )* )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:152:2:
			// email1= email (c= conj email2= email )*
			{
				pushFollow(FOLLOW_email_in_emails795);
				email1 = email();

				state._fsp--;

				email1_arbre = email1;
				emails_arbre.ajouteFils(email1_arbre);

				// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:157:2:
				// (c= conj email2= email )*
				loop6: do {
					int alt6 = 2;
					int LA6_0 = input.LA(1);

					if ((LA6_0 == CONJET)) {
						int LA6_1 = input.LA(2);

						if ((LA6_1 == VAR_EMAIL)) {
							alt6 = 1;
						}

					} else if ((LA6_0 == CONJOU)) {
						int LA6_2 = input.LA(2);

						if ((LA6_2 == VAR_EMAIL)) {
							alt6 = 1;
						}

					}

					switch (alt6) {
					case 1:
					// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:157:3:
					// c= conj email2= email
					{
						pushFollow(FOLLOW_conj_in_emails807);
						c = conj();

						state._fsp--;

						pushFollow(FOLLOW_email_in_emails813);
						email2 = email();

						state._fsp--;

						conj_arbre = c;
						email2_arbre = email2;
						emails_arbre.ajouteFils(conj_arbre);
						emails_arbre.ajouteFils(email2_arbre);

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
		return emails_arbre;
	}

	// $ANTLR end "emails"

	// $ANTLR start "email"
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:167:1: email returns
	// [Arbre email_arbre = new Arbre(\"\")] : a= VAR_EMAIL ;
	public final Arbre email() throws RecognitionException {
		Arbre email_arbre = new Arbre("");

		Token a = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:168:11: (a=
			// VAR_EMAIL )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:169:2: a=
			// VAR_EMAIL
			{
				a = (Token) match(input, VAR_EMAIL,
						FOLLOW_VAR_EMAIL_in_email846);

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
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:175:1:
	// requete_auteur returns [Arbre auteur_arbre = new Arbre(\"\")] : AUTEUR
	// emailz= emails ;
	public final Arbre requete_auteur() throws RecognitionException {
		Arbre auteur_arbre = new Arbre("");

		Arbre emailz = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:176:11: (
			// AUTEUR emailz= emails )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:177:2:
			// AUTEUR emailz= emails
			{
				match(input, AUTEUR, FOLLOW_AUTEUR_in_requete_auteur871);

				auteur_arbre.ajouteFils(new Arbre("FROM", "auteur"));

				pushFollow(FOLLOW_emails_in_requete_auteur880);
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
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:185:1:
	// requete_article returns [Arbre article_arbre = new Arbre(\"\")] : MOT
	// paramz= params ;
	public final Arbre requete_article() throws RecognitionException {
		Arbre article_arbre = new Arbre("");

		Arbre paramz = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:186:11: (
			// MOT paramz= params )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:187:2: MOT
			// paramz= params
			{
				match(input, MOT, FOLLOW_MOT_in_requete_article903);

				article_arbre.ajouteFils(new Arbre("FROM", "titreresume"));

				pushFollow(FOLLOW_params_in_requete_article912);
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
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:195:1: requete_date
	// returns [Arbre date_arbre = new Arbre(\"\")] : PARAITRE date= VAR_DATE ;
	public final Arbre requete_date() throws RecognitionException {
		Arbre date_arbre = new Arbre("");

		Token date = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:196:12: (
			// PARAITRE date= VAR_DATE )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:197:2:
			// PARAITRE date= VAR_DATE
			{
				match(input, PARAITRE, FOLLOW_PARAITRE_in_requete_date936);

				date_arbre.ajouteFils(new Arbre("FROM", "datearticle"));

				date = (Token) match(input, VAR_DATE,
						FOLLOW_VAR_DATE_in_requete_date945);

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
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:205:1: requete_theme
	// returns [Arbre theme_arbre = new Arbre(\"\")] : THEME theme= params ;
	public final Arbre requete_theme() throws RecognitionException {
		Arbre theme_arbre = new Arbre("");

		Arbre theme = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:206:12: (
			// THEME theme= params )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:207:2: THEME
			// theme= params
			{
				match(input, THEME, FOLLOW_THEME_in_requete_theme969);

				theme_arbre.ajouteFils(new Arbre("FROM", "theme"));

				pushFollow(FOLLOW_params_in_requete_theme978);
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
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:215:1: requete_titre
	// returns [Arbre titre_arbre = new Arbre(\"\")] : TITRE titre= params ;
	public final Arbre requete_titre() throws RecognitionException {
		Arbre titre_arbre = new Arbre("");

		Arbre titre = null;

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:216:12: (
			// TITRE titre= params )
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:217:2: TITRE
			// titre= params
			{
				match(input, TITRE, FOLLOW_TITRE_in_requete_titre1001);

				titre_arbre.ajouteFils(new Arbre("FROM", "titre"));

				pushFollow(FOLLOW_params_in_requete_titre1010);
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
	// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:225:1: conj returns
	// [Arbre conj_arbre = new Arbre(\"\")] : ( CONJET | CONJOU );
	public final Arbre conj() throws RecognitionException {
		Arbre conj_arbre = new Arbre("");

		try {
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:225:49: (
			// CONJET | CONJOU )
			int alt7 = 2;
			int LA7_0 = input.LA(1);

			if ((LA7_0 == CONJET)) {
				alt7 = 1;
			} else if ((LA7_0 == CONJOU)) {
				alt7 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 7, 0,
						input);

				throw nvae;
			}
			switch (alt7) {
			case 1:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:226:2:
			// CONJET
			{
				match(input, CONJET, FOLLOW_CONJET_in_conj1026);

				conj_arbre.ajouteFils(new Arbre("", "AND"));

			}
				break;
			case 2:
			// E:\\Projects\\lo17a008\\antlr\\ressources\\Grammar.g:229:2:
			// CONJOU
			{
				match(input, CONJOU, FOLLOW_CONJOU_in_conj1033);

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
	public static final BitSet FOLLOW_PAGE_in_requete537 = new BitSet(
			new long[] { 0x0000000000003E00L });
	public static final BitSet FOLLOW_sous_requetes_in_requete551 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_sous_requete_in_sous_requetes582 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_conj_in_sous_requetes592 = new BitSet(
			new long[] { 0x0000000000003E00L });
	public static final BitSet FOLLOW_sous_requete_in_sous_requetes598 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_requete_auteur_in_sous_requete632 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_requete_article_in_sous_requete645 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_requete_date_in_sous_requete657 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_requete_theme_in_sous_requete669 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_requete_titre_in_sous_requete681 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_param_in_params715 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_conj_in_params730 = new BitSet(
			new long[] { 0x0000000000800000L });
	public static final BitSet FOLLOW_param_in_params736 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_VAR_MOT_in_param765 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_email_in_emails795 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_conj_in_emails807 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_email_in_emails813 = new BitSet(
			new long[] { 0x00000000000C0002L });
	public static final BitSet FOLLOW_VAR_EMAIL_in_email846 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_AUTEUR_in_requete_auteur871 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_emails_in_requete_auteur880 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_MOT_in_requete_article903 = new BitSet(
			new long[] { 0x0000000000800000L });
	public static final BitSet FOLLOW_params_in_requete_article912 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PARAITRE_in_requete_date936 = new BitSet(
			new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_VAR_DATE_in_requete_date945 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_THEME_in_requete_theme969 = new BitSet(
			new long[] { 0x0000000000800000L });
	public static final BitSet FOLLOW_params_in_requete_theme978 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TITRE_in_requete_titre1001 = new BitSet(
			new long[] { 0x0000000000800000L });
	public static final BitSet FOLLOW_params_in_requete_titre1010 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CONJET_in_conj1026 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CONJOU_in_conj1033 = new BitSet(
			new long[] { 0x0000000000000002L });

}