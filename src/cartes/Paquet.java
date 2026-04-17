package cartes;

import java.util.Arrays;

public class Paquet {
	
	private Carte[] tab = new Carte[52];
	
	public Paquet() {
		initialise();
	}
	
	public Paquet(Paquet p) {
		
		for (int i = 0; i < tab.length; i++) {
			this.tab[i] = new Carte(p.tab[i]);
		}
	}
	
	public void initialise() {
		
		// tab = new Carte[52];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new Carte(i + 1);
		}
	}
	
	public void brasser(){
		 
		for (int i = 0; i < tab.length; i++) {
			Carte tmp;
			int n = (int)(Math.random() * tab.length);
			tmp = tab[i];
			tab[i] = tab[n];
			tab[n] = tmp;
			
		}
	}
	
	public void trierPaquet() {
		Arrays.sort(this.tab);
	}
	
	
	@Override
	public String toString() {
		String s = "Paquet : \n";
		
		for(Carte carte : tab) {
			s += " " + carte + "\n"; 
			
		}
		
		return s;
	}
	
}
