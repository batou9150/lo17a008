// $ANTLR 3.3 Nov 30, 2010 12:45:30 /volsme/users/lo17a008/public_html/ressources/Grammar.g 2013-12-20 15:09:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "COUNT", "ARTICLE", "PAGE", "RUBRIQUE", "MOT", "PARAITRE", "AUTEUR", "THEME", "TITRE", "VAR_EMAIL", "WS", "POINT", "JOUR", "CONJET", "CONJOU", "MOIS", "ANNEE", "VAR_DATE", "VAR_MOT"
    };
    public static final int EOF=-1;
    public static final int SELECT=4;
    public static final int COUNT=5;
    public static final int ARTICLE=6;
    public static final int PAGE=7;
    public static final int RUBRIQUE=8;
    public static final int MOT=9;
    public static final int PARAITRE=10;
    public static final int AUTEUR=11;
    public static final int THEME=12;
    public static final int TITRE=13;
    public static final int VAR_EMAIL=14;
    public static final int WS=15;
    public static final int POINT=16;
    public static final int JOUR=17;
    public static final int CONJET=18;
    public static final int CONJOU=19;
    public static final int MOIS=20;
    public static final int ANNEE=21;
    public static final int VAR_DATE=22;
    public static final int VAR_MOT=23;

    // delegates
    // delegators


        public GrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GrammarParser.tokenNames; }
    public String getGrammarFileName() { return "/volsme/users/lo17a008/public_html/ressources/Grammar.g"; }



    // $ANTLR start "listerequetes"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:51:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;


        Arbre lr_arbre;
        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:52:25: (r= requete POINT )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:53:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes465);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes467); 

            				lr_arbre = r;
            				sql = lr_arbre.sortArbre();
            			

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sql;
    }
    // $ANTLR end "listerequetes"


    // $ANTLR start "requete"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:61:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( COUNT )? fields= champs sr= sous_requetes[types.get(0)] ;
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        ArrayList<String> fields = null;

        Arbre sr = null;


        Arbre ps_arbre; boolean count = false;ArrayList<String> types;int i = 0;
        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:62:83: ( SELECT ( COUNT )? fields= champs sr= sous_requetes[types.get(0)] )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:63:3: SELECT ( COUNT )? fields= champs sr= sous_requetes[types.get(0)]
            {
            match(input,SELECT,FOLLOW_SELECT_in_requete495); 

            				req_arbre.ajouteFils(new Arbre("","select distinct"));
            			
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:67:3: ( COUNT )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==COUNT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:67:4: COUNT
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete507); 

                    				count = true;
                    				req_arbre = new Arbre("");
                    				req_arbre.ajouteFils(new Arbre("","select count"));
                    			

                    }
                    break;

            }

            pushFollow(FOLLOW_champs_in_requete524);
            fields=champs();

            state._fsp--;


            				types = fields;
            			
            pushFollow(FOLLOW_sous_requetes_in_requete534);
            sr=sous_requetes(types.get(0));

            state._fsp--;


            				ps_arbre = sr;
            				if (count) {
            					req_arbre.ajouteFils(new Arbre("","(distinct"));
            				}
            				for(String type : types) {
            					if (i != 0) {
            						req_arbre.ajouteFils(new Arbre("", ","));
            					}
            					i++;
            					req_arbre.ajouteFils(new Arbre("",ps_arbre.fils.fils.categorie + "." + type));
            				}
            				if (count) {
            					req_arbre.ajouteFils(new Arbre("",")"));
            				}
            				req_arbre.ajouteFils(ps_arbre);
            			

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return req_arbre;
    }
    // $ANTLR end "requete"


    // $ANTLR start "champs"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:96:1: champs returns [ArrayList<String> listField = new ArrayList<String>()] : field= champ ( conj field2= champ )* ;
    public final ArrayList<String> champs() throws RecognitionException {
        ArrayList<String> listField =  new ArrayList<String>();

        String field = null;

        String field2 = null;


        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:97:11: (field= champ ( conj field2= champ )* )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:98:2: field= champ ( conj field2= champ )*
            {
            pushFollow(FOLLOW_champ_in_champs568);
            field=champ();

            state._fsp--;


            		listField.add(field);
            	
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:101:2: ( conj field2= champ )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=CONJET && LA2_0<=CONJOU)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:101:3: conj field2= champ
            	    {
            	    pushFollow(FOLLOW_conj_in_champs574);
            	    conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_champ_in_champs580);
            	    field2=champ();

            	    state._fsp--;


            	    		listField.add(field2);
            	    	

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return listField;
    }
    // $ANTLR end "champs"


    // $ANTLR start "champ"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:105:1: champ returns [String type] : ( ARTICLE | PAGE );
    public final String champ() throws RecognitionException {
        String type = null;

        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:106:11: ( ARTICLE | PAGE )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ARTICLE) ) {
                alt3=1;
            }
            else if ( (LA3_0==PAGE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:107:2: ARTICLE
                    {
                    match(input,ARTICLE,FOLLOW_ARTICLE_in_champ604); 

                    		type = "article";
                    	

                    }
                    break;
                case 2 :
                    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:110:4: PAGE
                    {
                    match(input,PAGE,FOLLOW_PAGE_in_champ611); 

                    		type = "page";
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "champ"


    // $ANTLR start "sous_requetes"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:114:1: sous_requetes[String type] returns [Arbre sous_requete_arbres = new Arbre(\"\")] : req= sous_requete (c= conj req2= sous_requete )* ;
    public final Arbre sous_requetes(String type) throws RecognitionException {
        Arbre sous_requete_arbres =  new Arbre("");

        Arbre req = null;

        Arbre c = null;

        Arbre req2 = null;


        Arbre sr_WHERE = new Arbre("", "WHERE"), sr_FROM = new Arbre("", "FROM");
        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:115:85: (req= sous_requete (c= conj req2= sous_requete )* )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:116:2: req= sous_requete (c= conj req2= sous_requete )*
            {
            pushFollow(FOLLOW_sous_requete_in_sous_requetes640);
            req=sous_requete();

            state._fsp--;


            		sous_requete_arbres.ajouteFils(sr_FROM);
            		sous_requete_arbres.ajouteFils(sr_WHERE);
            		sr_FROM.ajouteFils(new Arbre(req.fils.mot));
            		sr_WHERE.ajouteFils(req.fils.frere);
            	
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:122:2: (c= conj req2= sous_requete )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=CONJET && LA4_0<=CONJOU)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:122:3: c= conj req2= sous_requete
            	    {
            	    pushFollow(FOLLOW_conj_in_sous_requetes650);
            	    c=conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_sous_requete_in_sous_requetes656);
            	    req2=sous_requete();

            	    state._fsp--;


            	    		sr_FROM.ajouteFils(new Arbre(","));
            	    		sr_FROM.ajouteFils(new Arbre(req2.fils.mot));
            	    		sr_WHERE.ajouteFils(c);
            	    		sr_WHERE.ajouteFils(req2.fils.frere);
            	    		sr_WHERE.ajouteFils(new Arbre("AND", req.fils.mot + "." + type + " = " + req2.fils.mot + "." + type));
            	    	

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sous_requete_arbres;
    }
    // $ANTLR end "sous_requetes"


    // $ANTLR start "sous_requete"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:148:1: sous_requete returns [Arbre sous_requete_arbre = null] : (req= requete_auteur | req= requete_article[\"titreresume\"] | req= requete_date | req= requete_theme[\"theme\"] | req= requete_titre[\"titre\"] ) ;
    public final Arbre sous_requete() throws RecognitionException {
        Arbre sous_requete_arbre =  null;

        Arbre req = null;


        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:149:12: ( (req= requete_auteur | req= requete_article[\"titreresume\"] | req= requete_date | req= requete_theme[\"theme\"] | req= requete_titre[\"titre\"] ) )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:150:2: (req= requete_auteur | req= requete_article[\"titreresume\"] | req= requete_date | req= requete_theme[\"theme\"] | req= requete_titre[\"titre\"] )
            {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:150:2: (req= requete_auteur | req= requete_article[\"titreresume\"] | req= requete_date | req= requete_theme[\"theme\"] | req= requete_titre[\"titre\"] )
            int alt5=5;
            switch ( input.LA(1) ) {
            case AUTEUR:
                {
                alt5=1;
                }
                break;
            case MOT:
                {
                alt5=2;
                }
                break;
            case PARAITRE:
                {
                alt5=3;
                }
                break;
            case THEME:
                {
                alt5=4;
                }
                break;
            case TITRE:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:151:3: req= requete_auteur
                    {
                    pushFollow(FOLLOW_requete_auteur_in_sous_requete693);
                    req=requete_auteur();

                    state._fsp--;


                    			sous_requete_arbre = req;
                    		

                    }
                    break;
                case 2 :
                    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:154:3: req= requete_article[\"titreresume\"]
                    {
                    pushFollow(FOLLOW_requete_article_in_sous_requete705);
                    req=requete_article("titreresume");

                    state._fsp--;


                    			sous_requete_arbre = req;
                    		

                    }
                    break;
                case 3 :
                    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:157:3: req= requete_date
                    {
                    pushFollow(FOLLOW_requete_date_in_sous_requete719);
                    req=requete_date();

                    state._fsp--;


                    			sous_requete_arbre = req;
                    		

                    }
                    break;
                case 4 :
                    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:160:3: req= requete_theme[\"theme\"]
                    {
                    pushFollow(FOLLOW_requete_theme_in_sous_requete731);
                    req=requete_theme("theme");

                    state._fsp--;


                    			sous_requete_arbre = req;
                    		

                    }
                    break;
                case 5 :
                    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:163:3: req= requete_titre[\"titre\"]
                    {
                    pushFollow(FOLLOW_requete_titre_in_sous_requete745);
                    req=requete_titre("titre");

                    state._fsp--;


                    			sous_requete_arbre = req;
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sous_requete_arbre;
    }
    // $ANTLR end "sous_requete"


    // $ANTLR start "params"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:173:1: params[String table] returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param[table] (c= conj par2= param[table] )* ;
    public final Arbre params(String table) throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre c = null;

        Arbre par2 = null;


        Arbre par1_arbre, par2_arbre, conj_arbre;
        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:174:52: (par1= param[table] (c= conj par2= param[table] )* )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:175:3: par1= param[table] (c= conj par2= param[table] )*
            {
            pushFollow(FOLLOW_param_in_params783);
            par1=param(table);

            state._fsp--;


            				par1_arbre = par1;
            				les_pars_arbre.ajouteFils(par1_arbre);
            			
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:180:3: (c= conj par2= param[table] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==CONJET) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==VAR_MOT) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==CONJOU) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==VAR_MOT) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:180:4: c= conj par2= param[table]
            	    {
            	    pushFollow(FOLLOW_conj_in_params799);
            	    c=conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_param_in_params805);
            	    par2=param(table);

            	    state._fsp--;


            	    				conj_arbre = c;
            	    				par2_arbre = par2;
            	    				les_pars_arbre.ajouteFils(conj_arbre);
            	    				les_pars_arbre.ajouteFils(par2_arbre);
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return les_pars_arbre;
    }
    // $ANTLR end "params"


    // $ANTLR start "param"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:191:1: param[String table] returns [ Arbre lepar_arbre = new Arbre(\"\")] : a= VAR_MOT ;
    public final Arbre param(String table) throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;

        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:191:67: (a= VAR_MOT )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:192:2: a= VAR_MOT
            {
            a=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param838); 
             lepar_arbre.ajouteFils(new Arbre(table + ".mot like ", "'%"+a.getText()+"%'"));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return lepar_arbre;
    }
    // $ANTLR end "param"


    // $ANTLR start "emails"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:196:1: emails returns [Arbre emails_arbre = new Arbre(\"\")] : email1= email (c= conj email2= email )* ;
    public final Arbre emails() throws RecognitionException {
        Arbre emails_arbre =  new Arbre("");

        Arbre email1 = null;

        Arbre c = null;

        Arbre email2 = null;


        Arbre email1_arbre, email2_arbre, conj_arbre;
        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:197:56: (email1= email (c= conj email2= email )* )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:198:2: email1= email (c= conj email2= email )*
            {
            pushFollow(FOLLOW_email_in_emails868);
            email1=email();

            state._fsp--;


            			email1_arbre = email1;
            			emails_arbre.ajouteFils(email1_arbre);
            		
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:203:2: (c= conj email2= email )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==CONJET) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==VAR_EMAIL) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==CONJOU) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==VAR_EMAIL) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:203:3: c= conj email2= email
            	    {
            	    pushFollow(FOLLOW_conj_in_emails880);
            	    c=conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_email_in_emails886);
            	    email2=email();

            	    state._fsp--;


            	    			conj_arbre = c;
            	    			email2_arbre = email2;
            	    			emails_arbre.ajouteFils(conj_arbre);
            	    			emails_arbre.ajouteFils(email2_arbre);
            	    		

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return emails_arbre;
    }
    // $ANTLR end "emails"


    // $ANTLR start "email"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:213:1: email returns [Arbre email_arbre = new Arbre(\"\")] : a= VAR_EMAIL ;
    public final Arbre email() throws RecognitionException {
        Arbre email_arbre =  new Arbre("");

        Token a=null;

        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:214:11: (a= VAR_EMAIL )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:215:2: a= VAR_EMAIL
            {
            a=(Token)match(input,VAR_EMAIL,FOLLOW_VAR_EMAIL_in_email919); 

            			email_arbre.ajouteFils(new Arbre("email like ", "'%"+a.getText()+"%'"));
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return email_arbre;
    }
    // $ANTLR end "email"


    // $ANTLR start "requete_auteur"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:221:1: requete_auteur returns [Arbre auteur_arbre = new Arbre(\"\")] : AUTEUR emailz= emails ;
    public final Arbre requete_auteur() throws RecognitionException {
        Arbre auteur_arbre =  new Arbre("");

        Arbre emailz = null;


        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:222:11: ( AUTEUR emailz= emails )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:223:2: AUTEUR emailz= emails
            {
            match(input,AUTEUR,FOLLOW_AUTEUR_in_requete_auteur944); 

            		auteur_arbre.ajouteFils(new Arbre("FROM", "email"));
            	
            pushFollow(FOLLOW_emails_in_requete_auteur953);
            emailz=emails();

            state._fsp--;


            		auteur_arbre.ajouteFils(emailz);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return auteur_arbre;
    }
    // $ANTLR end "requete_auteur"


    // $ANTLR start "requete_article"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:231:1: requete_article[String table] returns [Arbre article_arbre = new Arbre(\"\")] : MOT paramz= params[table] ;
    public final Arbre requete_article(String table) throws RecognitionException {
        Arbre article_arbre =  new Arbre("");

        Arbre paramz = null;


        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:232:11: ( MOT paramz= params[table] )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:233:2: MOT paramz= params[table]
            {
            match(input,MOT,FOLLOW_MOT_in_requete_article978); 

            		article_arbre.ajouteFils(new Arbre("FROM", "titreresume"));
            	
            pushFollow(FOLLOW_params_in_requete_article987);
            paramz=params(table);

            state._fsp--;


            		article_arbre.ajouteFils(paramz);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return article_arbre;
    }
    // $ANTLR end "requete_article"


    // $ANTLR start "requete_date"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:241:1: requete_date returns [Arbre date_arbre = new Arbre(\"\")] : PARAITRE date= VAR_DATE ;
    public final Arbre requete_date() throws RecognitionException {
        Arbre date_arbre =  new Arbre("");

        Token date=null;

        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:242:12: ( PARAITRE date= VAR_DATE )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:243:2: PARAITRE date= VAR_DATE
            {
            match(input,PARAITRE,FOLLOW_PARAITRE_in_requete_date1013); 

            		date_arbre.ajouteFils(new Arbre("FROM", "datearticle"));
            	
            date=(Token)match(input,VAR_DATE,FOLLOW_VAR_DATE_in_requete_date1022); 

            		date_arbre.ajouteFils(new Arbre("jj || ' ' || mois || ' ' || annee like", "'%" + date.getText() + "%'"));
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return date_arbre;
    }
    // $ANTLR end "requete_date"


    // $ANTLR start "requete_theme"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:251:1: requete_theme[String table] returns [Arbre theme_arbre = new Arbre(\"\")] : THEME theme= params[table] ;
    public final Arbre requete_theme(String table) throws RecognitionException {
        Arbre theme_arbre =  new Arbre("");

        Arbre theme = null;


        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:252:12: ( THEME theme= params[table] )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:253:2: THEME theme= params[table]
            {
            match(input,THEME,FOLLOW_THEME_in_requete_theme1048); 

            		theme_arbre.ajouteFils(new Arbre("FROM", "theme"));
            	
            pushFollow(FOLLOW_params_in_requete_theme1057);
            theme=params(table);

            state._fsp--;


            		theme_arbre.ajouteFils(theme);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return theme_arbre;
    }
    // $ANTLR end "requete_theme"


    // $ANTLR start "requete_titre"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:261:1: requete_titre[String table] returns [Arbre titre_arbre = new Arbre(\"\")] : TITRE titre= params[table] ;
    public final Arbre requete_titre(String table) throws RecognitionException {
        Arbre titre_arbre =  new Arbre("");

        Arbre titre = null;


        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:262:12: ( TITRE titre= params[table] )
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:263:2: TITRE titre= params[table]
            {
            match(input,TITRE,FOLLOW_TITRE_in_requete_titre1085); 

            		titre_arbre.ajouteFils(new Arbre("FROM", "titre"));
            	
            pushFollow(FOLLOW_params_in_requete_titre1094);
            titre=params(table);

            state._fsp--;


            		titre_arbre.ajouteFils(titre);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return titre_arbre;
    }
    // $ANTLR end "requete_titre"


    // $ANTLR start "conj"
    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:271:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( CONJET | CONJOU );
    public final Arbre conj() throws RecognitionException {
        Arbre conj_arbre =  new Arbre("");

        try {
            // /volsme/users/lo17a008/public_html/ressources/Grammar.g:271:49: ( CONJET | CONJOU )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==CONJET) ) {
                alt8=1;
            }
            else if ( (LA8_0==CONJOU) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:272:2: CONJET
                    {
                    match(input,CONJET,FOLLOW_CONJET_in_conj1112); 

                    		conj_arbre.ajouteFils(new Arbre("", "AND"));
                    	

                    }
                    break;
                case 2 :
                    // /volsme/users/lo17a008/public_html/ressources/Grammar.g:275:2: CONJOU
                    {
                    match(input,CONJOU,FOLLOW_CONJOU_in_conj1119); 

                    		conj_arbre.ajouteFils( new Arbre("", "OR"));
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return conj_arbre;
    }
    // $ANTLR end "conj"

    // Delegated rules


 

    public static final BitSet FOLLOW_requete_in_listerequetes465 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POINT_in_listerequetes467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete495 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_COUNT_in_requete507 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_champs_in_requete524 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_sous_requetes_in_requete534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_champ_in_champs568 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_conj_in_champs574 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_champ_in_champs580 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ARTICLE_in_champ604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAGE_in_champ611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sous_requete_in_sous_requetes640 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_conj_in_sous_requetes650 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_sous_requete_in_sous_requetes656 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_requete_auteur_in_sous_requete693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requete_article_in_sous_requete705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requete_date_in_sous_requete719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requete_theme_in_sous_requete731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requete_titre_in_sous_requete745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params783 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_conj_in_params799 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_param_in_params805 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_VAR_MOT_in_param838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_email_in_emails868 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_conj_in_emails880 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_email_in_emails886 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_VAR_EMAIL_in_email919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTEUR_in_requete_auteur944 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_emails_in_requete_auteur953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOT_in_requete_article978 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_params_in_requete_article987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAITRE_in_requete_date1013 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_VAR_DATE_in_requete_date1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THEME_in_requete_theme1048 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_params_in_requete_theme1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TITRE_in_requete_titre1085 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_params_in_requete_titre1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONJET_in_conj1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONJOU_in_conj1119 = new BitSet(new long[]{0x0000000000000002L});

}