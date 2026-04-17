package main;

import cartes.Carte;
import cartes.Paquet;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("BEGIN CARTES \n");
		
		Carte c1 = new Carte(14);
		c1.affecte(14);
		System.out.println(c1);
		
		System.out.println("\n Test Paquet \n");
		Paquet p1 = new Paquet();
		System.out.println(p1);
		
		
		System.out.println("\n Brasser \n");
		p1.brasser();
		System.out.println("P1 : " +p1);
		
		System.out.println("\n COPY \n");
		Paquet p3 = new Paquet(p1);
		System.out.println("P1 : " + p3);
		
		p1.brasser();
		System.out.println("P1 : " + p1);
		System.out.println("P3 : " + p3);
		
		System.out.println("\n COMPTE \n");
		c1 = new Carte(20);
		Carte c2 = new Carte(40);
		System.out.println(c1 + " =? " + c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.compareTo(c2));

		System.out.println("\n TRIER \n");
		p3.trierPaquet();
		System.out.println("P3 trié :" + p3);
		
		
		System.out.println("\nEND CARTES");
	}
}
