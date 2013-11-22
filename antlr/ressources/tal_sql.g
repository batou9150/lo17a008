grammar tal_sql;

SELECT : 'vouloir'
;

ARTICLE : 'article'
;

PAGE : 'page'
;

CONJ : 'et' | 'ou'
;

POINT : '.'
;

MOT : 'mot' | 'contenir' | 'parler'
;
 
WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

VAR 	: ('A'..'Z' | 'a'..'z') ('a'..'z')+
;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;} : 
		SELECT 
			{
				req_arbre.ajouteFils(new Arbre("","select distinct"));
			} 
		(ARTICLE
			{
			req_arbre.ajouteFils(new Arbre("","article"));
			}
		 | PAGE
			{
			req_arbre.ajouteFils(new Arbre("","page"));
			})
		MOT
			{
				req_arbre.ajouteFils(new Arbre("","from titreresume"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(CONJ par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR
		{ lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));}
;

