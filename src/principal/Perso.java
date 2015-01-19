package principal;

import StdDraw.StdDraw;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class Perso extends Map {
	int x;
	int y;
	Color c;

	// int nbBalle;
	// int range;

	boolean freeze;

	/*
	 * Nous cr�pns tous les attributs que nous allons utiliser pour nos
	 * personnages
	 */

	public Perso(int x, int y, Color c) {
		/*
		 * On donne des valeurs au
		 */
		this.x = x;
		this.y = y;
		this.c = c;
		freeze = false;

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int setX(int value) {
		return x = value;
	}

	public int setY(int value) {

		return y = value;
	}

	public boolean isFreeze() {
		/*
		 * Ici, nous cr�ons une m�thode qui retourne le mot "freeze", nous
		 * allons utiliser cette methode pour bloquer les personnages.
		 */
		return freeze;

	}

	public void setIsFreeze(boolean value) {
		/* Nous changeons le mot freeze en valeur bool�enne */
		freeze = value;

	}

	public void persoDisplay() {

		/*
		 * Methode permettant d'afficher un cercle avec les attributs de la
		 * methode Perso lorsque celle ci est apell�e
		 */

		if (freeze) {

			/*
			 * Grace a la methode setIsFreeze on peut savoir si le personnage a
			 * �t� touch� ou pas ainsi si il a �t� toucher la methode return
			 * true et cette boucle ce met alors en action
			 */
			StdDraw.setPenColor(Color.GREEN);
			double r = 28;
			double x = WIDTH * getX() + WIDTH / 2;
			double y = WIDTH * getY() + WIDTH / 2;
			StdDraw.filledCircle(x, y, r);

		} else {
			StdDraw.setPenColor(c);
			double r = 28;
			double x = WIDTH * getX() + WIDTH / 2;
			double y = WIDTH * getY() + WIDTH / 2;
			StdDraw.filledCircle(x, y, r);

		}

	}
}
