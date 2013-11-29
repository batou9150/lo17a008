// $ANTLR 3.3 Nov 30, 2010 12:45:30 /volsme/users/lo17a008/Téléchargements/tal_sql.g 2013-11-15 14:31:44

import org.antlr.runtime.*;

import org.antlr.runtime.debug.*;
import java.io.IOException;

public class tal_sqlParser extends DebugParser {
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "SELECT", "ARTICLE", "PAGE", "CONJ",
			"POINT", "MOT", "WS", "VAR" };
	public static final int EOF = -1;
	public static final int SELECT = 4;
	public static final int ARTICLE = 5;
	public static final int PAGE = 6;
	public static final int CONJ = 7;
	public static final int POINT = 8;
	public static final int MOT = 9;
	public static final int WS = 10;
	public static final int VAR = 11;

	// delegates
	// delegators

	public static final String[] ruleNames = new String[] { "invalidRule",
			"listerequetes", "param", "params", "requete" };
	public static final boolean[] decisionCanBacktrack = new boolean[] { false, // invalid
																				// decision
			false, false };

	public int ruleLevel = 0;

	public int getRuleLevel() {
		return ruleLevel;
	}

	public void incRuleLevel() {
		ruleLevel++;
	}

	public void decRuleLevel() {
		ruleLevel--;
	}

	public tal_sqlParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT,
				new RecognizerSharedState());
	}

	public tal_sqlParser(TokenStream input, int port,
			RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy = new DebugEventSocketProxy(this, port,
				null);
		setDebugListener(proxy);
		try {
			proxy.handshake();
		} catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public tal_sqlParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	public String[] getTokenNames() {
		return tal_sqlParser.tokenNames;
	}

	public String getGrammarFileName() {
		return "ressources/tal_sql.g";
	}

	// $ANTLR start "listerequetes"
	// /volsme/users/lo17a008/Téléchargements/tal_sql.g:27:1: listerequetes
	// returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql = "";

		Arbre r = null;

		Arbre lr_arbre;
		try {
			dbg.enterRule(getGrammarFileName(), "listerequetes");
			if (getRuleLevel() == 0) {
				dbg.commence();
			}
			incRuleLevel();
			dbg.location(27, 1);

			try {
				// /volsme/users/lo17a008/Téléchargements/tal_sql.g:28:25: (r=
				// requete POINT )
				dbg.enterAlt(1);

				// /volsme/users/lo17a008/Téléchargements/tal_sql.g:29:3: r=
				// requete POINT
				{
					dbg.location(29, 5);
					pushFollow(FOLLOW_requete_in_listerequetes158);
					r = requete();

					state._fsp--;

					dbg.location(29, 15);
					match(input, POINT, FOLLOW_POINT_in_listerequetes160);
					dbg.location(30, 4);

					lr_arbre = r;
					sql = lr_arbre.sortArbre();

				}

			} catch (RecognitionException re) {
				reportError(re);
				recover(input, re);
			} finally {
			}
			dbg.location(34, 1);

		} finally {
			dbg.exitRule(getGrammarFileName(), "listerequetes");
			decRuleLevel();
			if (getRuleLevel() == 0) {
				dbg.terminate();
			}
		}

		return sql;
	}

	// $ANTLR end "listerequetes"

	// $ANTLR start "requete"
	// /volsme/users/lo17a008/Téléchargements/tal_sql.g:36:1: requete returns
	// [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ARTICLE | PAGE ) MOT ps=
	// params ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre = new Arbre("");

		Arbre ps = null;

		Arbre ps_arbre;
		try {
			dbg.enterRule(getGrammarFileName(), "requete");
			if (getRuleLevel() == 0) {
				dbg.commence();
			}
			incRuleLevel();
			dbg.location(36, 1);

			try {
				// /volsme/users/lo17a008/Téléchargements/tal_sql.g:37:26: (
				// SELECT ( ARTICLE | PAGE ) MOT ps= params )
				dbg.enterAlt(1);

				// /volsme/users/lo17a008/Téléchargements/tal_sql.g:38:3:
				// SELECT ( ARTICLE | PAGE ) MOT ps= params
				{
					dbg.location(38, 3);
					match(input, SELECT, FOLLOW_SELECT_in_requete187);
					dbg.location(39, 4);

					req_arbre.ajouteFils(new Arbre("", "select distinct"));

					dbg.location(42, 3);
					// /volsme/users/lo17a008/Téléchargements/tal_sql.g:42:3:
					// ( ARTICLE | PAGE )
					int alt1 = 2;
					try {
						dbg.enterSubRule(1);
						try { // dbg.enterDecision(1, decisionCanBacktrack[1]);

							int LA1_0 = input.LA(1);

							if ((LA1_0 == ARTICLE)) {
								alt1 = 1;
							} else if ((LA1_0 == PAGE)) {
								alt1 = 2;
							} else {
								NoViableAltException nvae = new NoViableAltException(
										"", 1, 0, input);

								dbg.recognitionException(nvae);
								throw nvae;
							}
						} finally {
							dbg.exitDecision(1);
						}

						switch (alt1) {
						case 1:
							dbg.enterAlt(1);

							// /volsme/users/lo17a008/Téléchargements/tal_sql.g:42:4:
							// ARTICLE
							{
								dbg.location(42, 4);
								match(input, ARTICLE,
										FOLLOW_ARTICLE_in_requete199);
								dbg.location(43, 4);

								req_arbre.ajouteFils(new Arbre("", "article"));

							}
							break;
						case 2:
							dbg.enterAlt(2);

							// /volsme/users/lo17a008/Téléchargements/tal_sql.g:46:6:
							// PAGE
							{
								dbg.location(46, 6);
								match(input, PAGE, FOLLOW_PAGE_in_requete211);
								dbg.location(47, 4);

								req_arbre.ajouteFils(new Arbre("", "page"));

							}
							break;

						}
					} finally {
						dbg.exitSubRule(1);
					}

					dbg.location(50, 3);
					match(input, MOT, FOLLOW_MOT_in_requete221);
					dbg.location(51, 4);

					req_arbre.ajouteFils(new Arbre("", "from titreresume"));
					req_arbre.ajouteFils(new Arbre("", "where"));

					dbg.location(55, 6);
					pushFollow(FOLLOW_params_in_requete234);
					ps = params();

					state._fsp--;

					dbg.location(56, 4);

					ps_arbre = ps;
					req_arbre.ajouteFils(ps_arbre);

				}

			} catch (RecognitionException re) {
				reportError(re);
				recover(input, re);
			} finally {
			}
			dbg.location(60, 1);

		} finally {
			dbg.exitRule(getGrammarFileName(), "requete");
			decRuleLevel();
			if (getRuleLevel() == 0) {
				dbg.terminate();
			}
		}

		return req_arbre;
	}

	// $ANTLR end "requete"

	// $ANTLR start "params"
	// /volsme/users/lo17a008/Téléchargements/tal_sql.g:62:1: params returns
	// [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( CONJ par2= param
	// )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre = new Arbre("");

		Arbre par1 = null;

		Arbre par2 = null;

		Arbre par1_arbre, par2_arbre;
		try {
			dbg.enterRule(getGrammarFileName(), "params");
			if (getRuleLevel() == 0) {
				dbg.commence();
			}
			incRuleLevel();
			dbg.location(62, 1);

			try {
				// /volsme/users/lo17a008/Téléchargements/tal_sql.g:63:40:
				// (par1= param ( CONJ par2= param )* )
				dbg.enterAlt(1);

				// /volsme/users/lo17a008/Téléchargements/tal_sql.g:64:3:
				// par1= param ( CONJ par2= param )*
				{
					dbg.location(64, 8);
					pushFollow(FOLLOW_param_in_params266);
					par1 = param();

					state._fsp--;

					dbg.location(65, 4);

					par1_arbre = par1;
					les_pars_arbre.ajouteFils(par1_arbre);

					dbg.location(69, 3);
					// /volsme/users/lo17a008/Téléchargements/tal_sql.g:69:3:
					// ( CONJ par2= param )*
					try {
						dbg.enterSubRule(2);

						loop2: do {
							int alt2 = 2;
							try { // dbg.enterDecision(2,
									// decisionCanBacktrack[2]);

								int LA2_0 = input.LA(1);

								if ((LA2_0 == CONJ)) {
									alt2 = 1;
								}

							} finally {
								dbg.exitDecision(2);
							}

							switch (alt2) {
							case 1:
								dbg.enterAlt(1);

								// /volsme/users/lo17a008/Téléchargements/tal_sql.g:69:4:
								// CONJ par2= param
								{
									dbg.location(69, 4);
									match(input, CONJ, FOLLOW_CONJ_in_params277);
									dbg.location(69, 14);
									pushFollow(FOLLOW_param_in_params283);
									par2 = param();

									state._fsp--;

									dbg.location(70, 4);

									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("",
											"OR"));
									les_pars_arbre.ajouteFils(par2_arbre);

								}
								break;

							default:
								break loop2;
							}
						} while (true);
					} finally {
						dbg.exitSubRule(2);
					}

				}

			} catch (RecognitionException re) {
				reportError(re);
				recover(input, re);
			} finally {
			}
			dbg.location(76, 1);

		} finally {
			dbg.exitRule(getGrammarFileName(), "params");
			decRuleLevel();
			if (getRuleLevel() == 0) {
				dbg.terminate();
			}
		}

		return les_pars_arbre;
	}

	// $ANTLR end "params"

	// $ANTLR start "param"
	// /volsme/users/lo17a008/Téléchargements/tal_sql.g:78:1: param returns
	// [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre = new Arbre("");

		Token a = null;

		try {
			dbg.enterRule(getGrammarFileName(), "param");
			if (getRuleLevel() == 0) {
				dbg.commence();
			}
			incRuleLevel();
			dbg.location(78, 1);

			try {
				// /volsme/users/lo17a008/Téléchargements/tal_sql.g:78:51: (a=
				// VAR )
				dbg.enterAlt(1);

				// /volsme/users/lo17a008/Téléchargements/tal_sql.g:79:2: a=
				// VAR
				{
					dbg.location(79, 4);
					a = (Token) match(input, VAR, FOLLOW_VAR_in_param311);
					dbg.location(80, 3);
					lepar_arbre.ajouteFils(new Arbre("mot =", "'" + a.getText()
							+ "'"));

				}

			} catch (RecognitionException re) {
				reportError(re);
				recover(input, re);
			} finally {
			}
			dbg.location(81, 1);

		} finally {
			dbg.exitRule(getGrammarFileName(), "param");
			decRuleLevel();
			if (getRuleLevel() == 0) {
				dbg.terminate();
			}
		}

		return lepar_arbre;
	}

	// $ANTLR end "param"

	// Delegated rules

	public static final BitSet FOLLOW_requete_in_listerequetes158 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_POINT_in_listerequetes160 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SELECT_in_requete187 = new BitSet(
			new long[] { 0x0000000000000060L });
	public static final BitSet FOLLOW_ARTICLE_in_requete199 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_PAGE_in_requete211 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_MOT_in_requete221 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_params_in_requete234 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_param_in_params266 = new BitSet(
			new long[] { 0x0000000000000082L });
	public static final BitSet FOLLOW_CONJ_in_params277 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_param_in_params283 = new BitSet(
			new long[] { 0x0000000000000082L });
	public static final BitSet FOLLOW_VAR_in_param311 = new BitSet(
			new long[] { 0x0000000000000002L });

}