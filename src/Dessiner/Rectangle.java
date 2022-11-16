package Dessiner;

public class Rectangle {

	// constructeur
	public Rectangle() {
		super();
		longueur = 3;
		largeur = 6;
		setAire();
	}
	
	// Les attributs
	private int longueur;
	private int largeur;
	private int aire;
	
	//les méthodes
	public void setLargeur(int x) {
		largeur = x;
		setAire();
	}
	
	public int getLargeur() {
		return largeur;
	}
	
	public void setLongueur(int x) {
		longueur = x;
		setAire();
	}
	
	public int getLongeur() {
		return longueur;
	}

	private void setAire() {
		aire = largeur*longueur;
	}
	
	public int getAire() {
		return aire;
	}
}
