package feu;

public class TestFeu {

	public static void main(String[] args) {
		
		FeuTricolore feu1 = new FeuTricolore(); // Sera Rouge
        FeuTricolore feu2 = new FeuTricolore("Vert"); // Sera Vert
        System.out.println(feu2);

        // c & d) Test du clignotement (Attention, cela mettra la console en pause)
        System.out.println("\n--- Test du clignotement de feu 1 ---");
        feu1.clignoter(300, 800); // 300ms allumé, 800ms éteint

        // f) Test de la hauteur partagée
        System.out.println("\n--- Test de l'attribut statique ---");
        System.out.println("Hauteur initiale des feux : " + FeuTricolore.getHauteur() + "m");
        
        // On modifie la hauteur au niveau de la CLASSE (et non d'un objet spécifique)
        FeuTricolore.setHauteur(3.0);
        
        System.out.println("Nouvelle hauteur partagée : " + FeuTricolore.getHauteur() + "m");

	}

}
