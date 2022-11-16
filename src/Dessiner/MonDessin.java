package Dessiner;

public class MonDessin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle Rect1 = new Rectangle();
		Rectangle Rect2 = new Rectangle();
		Point p1 = new Point();
		Point p2 = new Point();

		System.out.println("Rect1 largeur = "+Rect1.getLargeur()+" longueur = "+Rect1.getLongeur());
		System.out.println("L'aire du rectangle est "+Rect1.getAire());

		Rect1.setLargeur(18);;

		System.out.println("Et maintenant la valeur est");
		System.out.println("Rect1 largeur = "+Rect1.getLargeur()+" longueur = "+Rect1.getLongeur());
		System.out.println("L'aire du rectangle est "+Rect1.getAire());
	}

}
