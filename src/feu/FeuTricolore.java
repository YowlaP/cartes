package feu;

public class FeuTricolore {
	
	private String couleur;
	private boolean enMarche;
	
	private static double hdef = 2.5;
	
	public FeuTricolore() {
		
		this.couleur = "Rouge";
		this.enMarche = true;
		
	}
	
	public FeuTricolore(String init) {
		this.couleur = init;
		this.enMarche = true;
	}
	
	public void changerCouleur(String nvlCouleur) {
		if(this.enMarche) {
			this.couleur = nvlCouleur;
			System.out.println("Le feu passe au " + nvlCouleur);
		}
	}
	
	public void clignoter() {
		
		clignoter(500,500);
	}
	
	public void clignoter(int allume, int eteint) {
		
		this.couleur = "Orange";
		try {
            // On fait clignoter le feu 3 fois pour la simulation
            for (int i = 0; i < 3; i++) {
                System.out.println("  (O) Allumé");
                Thread.sleep(allume); // Pause du programme
                
                System.out.println("  ( ) Éteint");
                Thread.sleep(eteint); // Pause du programme
            }
		}catch (InterruptedException e) {
            System.out.println("Erreur lors du clignotement.");
		}
	}
	
	public static double getHauteur() {
		return hdef;
	}
	
	public static void setHauteur(double hauteur) {
		FeuTricolore.hdef = hauteur;
	}

}
