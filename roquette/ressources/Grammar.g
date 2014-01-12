grammar Grammar;

//détection de la requête
SELECT : 'vouloir'|'retourner'|'donner'|'souhaiter'
;

//count facultatif
COUNT : 'nombre' | 'combien'
;

//champs à sélectionner
ARTICLE : 'article' |  'texte' 
;
PAGE : 'page'
;

RUBRIQUE : 'rubrique';
//table à considérer
MOT : 'mot' | 'contenir' | 'parle'
;
PARAITRE : 'parus'
;
AUTEUR 	: 'auteur'
;
THEME 	: 'theme'
;
TITRE 	: 'titre'
;
//conditions

VAR_EMAIL : ('A'..'Z' | 'a'..'z' | '0'..'9')+ ('@')('A'..'Z' | 'a'..'z' | '0'..'9')+ ('.') ('A'..'Z' | 'a'..'z')+
;
	
//autres (point, skip, etc.)
WS  : (' ' |'\t' | '\r' | 'je' | 'Je' | 'qui' | 'les' | 'dont' | 'de' | 'd\'' | 'le') {skip();} | '\n' 
;

POINT : '.' | '?' | '!'
; 

JOUR : ('0'..'3')?('0'..'9')
;
CONJET 	:	 'et';
CONJOU 	:	'ou';
MOIS 	:	'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre';
ANNEE 	:	('0'..'9')('0'..'9')('0'..'9')('0'..'9');
VAR_DATE :	(JOUR ' ' MOIS ' ' ANNEE) | (MOIS ' ' ANNEE) | (ANNEE);
VAR_MOT : ('A'..'Z' | 'a'..'z') ('a'..'z')+
;
//Liste requêtes
listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

//Requête
requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre; boolean count = false;ArrayList<String> types;int i = 0;} : 
		SELECT 
			{
				req_arbre.ajouteFils(new Arbre("","select distinct"));
			} 
		(COUNT 	
			{
				count = true;
				req_arbre = new Arbre("");
				req_arbre.ajouteFils(new Arbre("","select count"));
			})?
		fields = champs {
				types = fields;
			}
		sr = sous_requetes [types.get(0)]
			{
				ps_arbre = $sr.sous_requete_arbres;
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
		
;
champs returns [ArrayList<String> listField = new ArrayList<String>()]
	@init {} : 
	field = champ {
		listField.add(field);
	}
	(conj field2 = champ {
		listField.add(field2);
	})*
;	
champ returns [String type]
	@init {} :
	ARTICLE {
		type = "article";
	}
	| PAGE {
		type = "page";
	}
;
sous_requetes [String type] returns [Arbre sous_requete_arbres = new Arbre("")] 
	@init	{Arbre sr_WHERE = new Arbre("", "WHERE"), sr_FROM = new Arbre("", "FROM");}  :
	req = sous_requete {
		sous_requete_arbres.ajouteFils(sr_FROM);
		sous_requete_arbres.ajouteFils(sr_WHERE);
		sr_FROM.ajouteFils(new Arbre(req.sous_requete_arbre.fils.mot));
		sr_WHERE.ajouteFils(req.sous_requete_arbre.fils.frere);
	}
	(c = conj req2 = sous_requete {
		sr_FROM.ajouteFils(new Arbre(","));
		sr_FROM.ajouteFils(new Arbre(req2.sous_requete_arbre.fils.mot));
		sr_WHERE.ajouteFils(c);
		sr_WHERE.ajouteFils(req2.sous_requete_arbre.fils.frere);
		if (req2.type.equals("auteur") || req2.type.equals("date")) {
			sr_WHERE.ajouteFils(new Arbre("OR", req.sous_requete_arbre.fils.mot + "." + req.type + " = " + req2.sous_requete_arbre.fils.mot + "." + req.type));
		} else {
			sr_WHERE.ajouteFils(new Arbre("AND", req.sous_requete_arbre.fils.mot + "." + req.type + " = " + req2.sous_requete_arbre.fils.mot + "." + req.type));
		}
	})*
;

/*sous_requetes_article returns [Arbre sous_requete_arbres = new Arbre("")] 
	@init	{Arbre sr_WHERE = new Arbre("", "WHERE"), sr_FROM = new Arbre("", "FROM");}  :
	req = sous_requete {
		sous_requete_arbres.ajouteFils(sr_FROM);
		sous_requete_arbres.ajouteFils(sr_WHERE);
		sr_FROM.ajouteFils(new Arbre(req.fils.mot));
		sr_WHERE.ajouteFils(req.fils.frere);
	}
	(c = conj req2 = sous_requete {
		sr_FROM.ajouteFils(new Arbre(","));
		sr_FROM.ajouteFils(new Arbre(req2.fils.mot));
		sr_WHERE.ajouteFils(c);
		sr_WHERE.ajouteFils(req2.fils.frere);
		sr_WHERE.ajouteFils(new Arbre("AND", req.fils.mot + ".article = " + req2.fils.mot + ".article"));
	})*
;*/

sous_requete returns [Arbre sous_requete_arbre = null, String type = ""] 
	@init	{}  :
	(
		req = requete_auteur {
			retval.sous_requete_arbre = req;
			retval.type = "auteur";
		} |
		req = requete_article ["titreresume"] {
			retval.sous_requete_arbre = req;
			retval.type = "titre";
		} |
		req = requete_date {
			retval.sous_requete_arbre = req;
			retval.type = "date";
		} |
		req = requete_theme ["theme"] {
			retval.sous_requete_arbre = req;
			retval.type = "theme";
		} |
		req = requete_titre ["titre"] {
			retval.sous_requete_arbre = req;
			retval.type = "titre";
		} |
		req = requete_rubrique ["titreresume"] {
			retval.sous_requete_arbre = req;
			retval.type = "rubrique";
		})
;
//Requête Mots
//Requête auteurs
//Requête date
//Paramètre auteur

//ParamètreS mots
params [String table] returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre, conj_arbre;} : 
		par1 = param [table]
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(c = conj par2 = param [table]
			{
				conj_arbre = $c.conj_arbre;
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(conj_arbre);
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

//Paramètre mot
param [String table] returns [ Arbre lepar_arbre = new Arbre("")] :
	a = VAR_MOT
		{ lepar_arbre.ajouteFils(new Arbre(table + ".mot like ", "'\%"+a.getText()+"\%'"));}
;

emails returns [Arbre emails_arbre = new Arbre("")] 
	@init	{Arbre email1_arbre, email2_arbre, conj_arbre;} : 
	email1 = email
		{
			email1_arbre = $email1.email_arbre;
			emails_arbre.ajouteFils(email1_arbre);
		}
	(c = conj email2 = email
		{
			conj_arbre = $c.conj_arbre;
			email2_arbre = $email2.email_arbre;
			emails_arbre.ajouteFils(conj_arbre);
			emails_arbre.ajouteFils(email2_arbre);
		}
	)*
;

email returns [Arbre email_arbre = new Arbre("")] 
	@init	{} :
	a = VAR_EMAIL
		{
			email_arbre.ajouteFils(new Arbre("email like ", "'\%"+a.getText()+"\%'"));
		}
;

requete_auteur returns [Arbre auteur_arbre = new Arbre("")] 
	@init	{} :
	AUTEUR {
		auteur_arbre.ajouteFils(new Arbre("FROM", "email"));
	}
	emailz = emails {
		auteur_arbre.ajouteFils($emailz.emails_arbre);
	}
;

requete_article [String table] returns [Arbre article_arbre = new Arbre("")] 
	@init	{} :
	MOT {
		article_arbre.ajouteFils(new Arbre("FROM", "titreresume"));
	}
	paramz = params [table] {
		article_arbre.ajouteFils($paramz.les_pars_arbre);
	}
;

requete_date returns [Arbre date_arbre = new Arbre("")] 
	@init	{}  :
	PARAITRE {
		date_arbre.ajouteFils(new Arbre("FROM", "datearticle"));
	}
	date = VAR_DATE {
		date_arbre.ajouteFils(new Arbre("jj || ' ' || mois || ' ' || annee like", "'\%" + date.getText() + "\%'"));
	}
;

requete_theme [String table] returns [Arbre theme_arbre = new Arbre("")] 
	@init	{}  :
	THEME {
		theme_arbre.ajouteFils(new Arbre("FROM", "theme"));
	}
	theme = params [table] {
		theme_arbre.ajouteFils($theme.les_pars_arbre);
	}
;

requete_titre [String table]  returns [Arbre titre_arbre = new Arbre("")]
	@init	{}  :
	TITRE {
		titre_arbre.ajouteFils(new Arbre("FROM", "titre"));
	}
	titre = params [table] {
		titre_arbre.ajouteFils($titre.les_pars_arbre);
	}
;

requete_rubrique [String table] returns [Arbre rubrique_arbre = new Arbre("")]
	@init {} :
	RUBRIQUE {
		rubrique_arbre.ajouteFils(new Arbre("FROM", "titreresume"));
	}
	rubrique = params [table] {
		rubrique_arbre.ajouteFils($rubrique.les_pars_arbre);
	}
	;
	
conj returns [Arbre conj_arbre = new Arbre("")] :
	CONJET {
		conj_arbre.ajouteFils(new Arbre("", "AND"));
	} |
	CONJOU {
		conj_arbre.ajouteFils( new Arbre("", "OR"));
	}
	;