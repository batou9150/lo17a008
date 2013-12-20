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

RUBRIQUE : 'une' | 'focus' | 'gros titre';
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
	@init {Arbre ps_arbre; boolean count = false;} : 
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
		(ARTICLE
			{
				
			}
		sr = sous_requetes_article
			{
				ps_arbre = $sr.sous_requete_arbres;
				if (count) {
					req_arbre.ajouteFils(new Arbre("","(distinct " + ps_arbre.fils.fils.categorie + ".article)"));
				} else {
					req_arbre.ajouteFils(new Arbre("",ps_arbre.fils.fils.categorie + ".article"));
				}
				req_arbre.ajouteFils(ps_arbre);
			}
		 | PAGE
			{
			}
		sr = sous_requetes_page
			{
				ps_arbre = $sr.sous_requete_arbres;
				if (count) {
					req_arbre.ajouteFils(new Arbre("","(distinct " + ps_arbre.fils.fils.categorie + ".page)"));
				} else {
					req_arbre.ajouteFils(new Arbre("",ps_arbre.fils.fils.categorie + ".page"));
				}
				req_arbre.ajouteFils(ps_arbre);
			})
		
;

sous_requetes_page returns [Arbre sous_requete_arbres = new Arbre("")] 
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
		sr_WHERE.ajouteFils(new Arbre("AND", req.fils.mot + ".page = " + req2.fils.mot + ".page"));
	})*
;

sous_requetes_article returns [Arbre sous_requete_arbres = new Arbre("")] 
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
;

sous_requete returns [Arbre sous_requete_arbre = null] 
	@init	{}  :
	(
		req = requete_auteur {
			sous_requete_arbre = req;
		} |
		req = requete_article ["titreresume"] {
			sous_requete_arbre = req;
		} |
		req = requete_date {
			sous_requete_arbre = req;
		} |
		req = requete_theme ["theme"] {
			sous_requete_arbre = req;
		} |
		req = requete_titre ["titre"] {
			sous_requete_arbre = req;
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

conj returns [Arbre conj_arbre = new Arbre("")] :
	CONJET {
		conj_arbre.ajouteFils(new Arbre("", "AND"));
	} |
	CONJOU {
		conj_arbre.ajouteFils( new Arbre("", "OR"));
	}
;
