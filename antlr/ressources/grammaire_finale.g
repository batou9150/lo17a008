grammar grammaire_finale;

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
MOT : 'mot' | 'contenir' | 'parler' | 'parlent'
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

POINT : '.'
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
	@init {Arbre ps_arbre;} : 
		SELECT 
			{
				req_arbre.ajouteFils(new Arbre("","select distinct"));
			} 
		(COUNT 	
			{
				req_arbre.ajouteFils(new Arbre("","count"));
			})?
		(ARTICLE
			{
			req_arbre.ajouteFils(new Arbre("","(article)"));
			}
		 | PAGE
			{
			req_arbre.ajouteFils(new Arbre("","(page)"));
			})
		sr = sous_requetes {
			ps_arbre = $sr.sous_requete_arbres;
			req_arbre.ajouteFils(ps_arbre);
		}
		
;

sous_requetes returns [Arbre sous_requete_arbres = new Arbre("")] 
	@init	{Arbre sr_arbre}  :
	req = sous_requete {
	}
	(conj req2 = sous_requete {
	})*
;

sous_requete returns [Arbre sous_requete_arbre = new Arbre("")] 
	@init	{Arbre sr_arbre}  :
	(req1 = requete_auteur {
	} |
	req1 = requete_article {
	} |
	req1 = requete_date {
	} |
	req1 = requete_theme {
	} |
	req1 = requete_titre {
	})
;
//Requête Mots
//Requête auteurs
//Requête date
//Paramètre auteur

//ParamètreS mots
params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre, conj_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(c = conj par2 = param
			{
				conj_arbre = $c.conj_arbre
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(conj_arbre);
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

//Paramètre mot
param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR_MOT
		{ lepar_arbre.ajouteFils(new Arbre("mot like ", "'%"+a.getText()+"%'"));}
;

emails returns [Arbre emails_arbre = new Arbre("")] 
	@init	{Arbre email1_arbre, email2_arbre;} : 
	email1 = email
		{
			email1_arbre = $email1.email_arbre;
			emails_arbre.ajouteFils(email1_arbre);
		}
	(conj email2 = email
		{
			conj_arbre = $c.conj_arbre
			email2_arbre = $email2.lepar_arbre;
			emails_arbre.ajouteFils(conj_arbre);
			emails_arbre.ajouteFils(email2_arbre);
		}
	)*
;

email returns [Arbre email_arbre = new Arbre("")] 
	@init	{Arbre email1_arbre} :
	a = VAR_EMAIL
		{
			email_arbre.ajouteFils(new Arbre("email like ", "'%"+a.getText()+"%'"));
		}
;

requete_auteur returns [Arbre auteur_arbre = new Arbre("")] 
	@init	{Arbre auteur_arbre} :
	AUTEUR {
		auteur_arbre.ajouteFils(new Arbre("FROM", "auteur");
	}
	emailz = emails {
		auteur_arbre.ajouteFils($emailz.emails_arbre);
	}
;

requete_article returns [Arbre article_arbre = new Arbre("")] 
	@init	{Arbre article_arbre} :
	MOT {
		article_arbre.ajouteFils(new Arbre("FROM", "titreresume");
	}
	paramz = params {
		article_arbre.ajouteFils($paramz.les_pars_arbre);
	}
;

requete_date returns [Arbre date_arbre = new Arbre("")] 
	@init	{Arbre date_arbre}  :
	PARAITRE {
		date_arbre.ajouteFils(new Arbre("FROM", "datearticle"));
	}
	date = VAR_DATE {
		date_arbre.ajouteFils(new Arbre("CONCAT_WS(' ', 'jj', 'mois', 'annee') = ", date.getText());
	}
;

requete_theme returns [Arbre theme_arbre = new Arbre("")] 
	@init	{Arbre theme_arbre}  :
	THEME {
		theme_arbre.ajouteFils(new Arbre("FROM", "theme"));
	}
	theme = params {
		theme_arbre.ajouteFils($theme.les_pars_arbre);
	}
;

requete_titre returns [Arbre titre_arbre = new Arbre("")]
	@init	{Arbre tmp_arbre}  :
	TITRE {
		titre_arbre.ajouteFils(new Arbre("FROM", "titre"));
	}
	titre = params {
		titre_arbre.ajouteFils($titre.les_pars_arbre);
	}
;

conj returns [Arbre conj_arbre = new Arbre("")] :
	CONJET {
		conj_arbre.ajouteFils(new Arbre("", "AND"));
	} |
	CONJOU {
		conj_arbre.ajouteFils(new Arbre("", "OR"));
	}
;