package cartes;

public class Carte implements Comparable<Object>{
	
	public static final int CARREAU = 1,
						 	COEUR = 2,
						 	PIQUE = 3,
						 	TREFLE = 4;
	private int valeur;
	private int couleur;
	
	public Carte(int n) {
		affecte(n);
	}
	
	public Carte(Carte c) {
		this.valeur = c.valeur;
		this.couleur = c.couleur;
	}
	
	public void affecte(int n) {
		// cartes numérotées de 1 à 52
		valeur = (n - 1) % 13 + 1;
		
		switch((n - 1) / 13 + 1) {
			case 1 : couleur = CARREAU; break;
			case 2 : couleur = COEUR; break;
			case 3 : couleur = PIQUE; break;
			case 4 : couleur = TREFLE; break;
		}
		
	}
	@Override
	public String toString() {
		String s = "";
		
		switch (valeur) {
			case 1 : s += "As"; break;
			case 11 : s += "Valet"; break;
			case 12 : s += "Dame"; break;
			case 13 : s += "Roi"; break;
			default : s += valeur; break; // String.valueOf(valeur)
		}
	
		s += " de ";
		
		switch(couleur) {
			case CARREAU : s += "Carreau"; break;
			case COEUR : s += "COEUR"; break;
			case PIQUE : s += "PIQUE"; break;
			case TREFLE : s += "TREFLE"; break;
		}
	
		s += "";
	
		return s;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// optim
		if(this == obj) // meme objet
			return true;
		// pas de comparaison possible 
		if ((obj == null) || !(this.getClass().equals(obj.getClass())))
			return false;
		
		// ok
		Carte c = (Carte) obj;
		return (this.couleur == c.couleur && this.valeur == c.valeur);
		
	}

	@Override
	public int compareTo(Object obj) {
		if ((obj == null) || !(this.getClass().equals(obj.getClass())))
			return -2;
		
		Carte c = (Carte) obj;
		if (this.couleur < c.couleur)
			return -1;
		if (this.couleur > c.couleur)
			return +1;
		
		//meme couleur
		if (this.valeur < c.valeur)
			return -1;
		if (this.valeur > c.valeur)
			return +1;
		
		//identique
		return 0;
		
	}	
}