class Arbre {
	Arbre fils = null;
	Arbre frere = null;
	String categorie;
	String mot;

	Arbre(String categorie, String mot) {
		this.categorie = categorie;
		this.mot = mot;
	}

	Arbre(String categorie) {
		this.categorie = categorie;
		this.mot = "";
	}

	void ajouteFils(Arbre a) {
		if (fils == null)
			fils = a;
		else
			fils.ajouteFrere(a);
	}

	private void ajouteFrere(Arbre a) {
		Arbre tmp = frere;
		if (frere == null)
			frere = a;
		else {
			while (tmp.frere != null)
				tmp = tmp.frere;
			tmp.frere = a;
		}
	}

	void afficheCat() {
		// afficheCatAvecNl();
		System.out.println(sortArbreAvecNl());
		System.out.println();
	}

	String sortArbre() {
		return sortArbreAvecNl();
	}

	private String sortArbreAvecNl() {
		String arbre = categorie + " " + mot + " ";
		if (fils != null) {
			arbre = arbre + " " + fils.sortArbreAvecNl() + " ";
		}
		if (frere != null) {
			arbre = arbre + frere.sortArbreAvecNl();
		}
		return arbre;
	}
}
