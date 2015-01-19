package principal;

import StdDraw.StdDraw;

import java.awt.Color;

import java.awt.event.KeyEvent;

public class Map extends main {

	public static final float WIDTH = 70f;
	public static final int sizeMapX = 1200;
	public static final int sizeMapY = 600;
	/**
	 * Ici nous définissons les paramètre de notre tableau, ça hauteur, ça
	 * largeur et la taille des carreaux
	 */
	static int coul = 0;
	static int mur = 1;
	static int lum = 2;
	static int ordi = 3;

	static int ecl = -1;
	/**
	 * Nous définissons des mot associé au chiffre de notre tableau pour apellé
	 * plus facilement ces cases dans d'autres classes
	 */

	/*
	 * Nous choisissons de définir notre tableau entre accolade, c'est plus
	 * rapide que de répété tab[][] = X pour chaque case
	 */

	public static int[][] tab =

	{ { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 2, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 0, 0, 3, 0, 1, 0, 1 },
			{ 1, 0, 1, 2, 1, 0, 0, 2, 0, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

	/* Le premier tableau définie la map utilisé pour jouer */

	public static int[][] lumi = {

	{ 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, -1, -1, -1, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, -1, -1, -1, 0, -1, -1, -2, -1, -1, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, -1, -1, -1, 0, -1, -1, -2, -1, -1, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	/* La deuxième map est lié à l'eclairage général */

	public Map() {

	}

	public void display() { /*
							 * Afficher la MAP à l'écran c'est à dire définit
							 * une fenetre
							 */

		StdDraw.setXscale(-100, sizeMapX + 100); /*
												 * Les +100 et -100 sont là pour
												 * créer une marge et centrer
												 * notre tableau
												 */
		StdDraw.setYscale(-100, sizeMapY + 100);
		/*
		 * Afin de "colorier" les cases de notre tableau nous utilisons une
		 * boucle for qui va parcourir tout le tableau ligne par ligne
		 */
		for (int j = 0; j < tab.length; j++) {
			for (int i = 0; i < tab[j].length; i++) {
				double r = WIDTH / 2;
				double x = WIDTH * i + r;
				double y = WIDTH * j + r;
				StdDraw.filledSquare(x, y, r);

				/*
				 * lorsqu'il va reconnaitre une valeure tel que "coul","mur" ou
				 * autre il va prendre en compte les actions ce dessous
				 */

				if (tab[j][i] == coul) {
					// StdDraw.setPenColor(Color.WHITE);

					StdDraw.picture(x, y, "Herbe.png", 71, 71);

				} else if (tab[j][i] == mur) {
					// StdDraw.setPenColor(Color.BLACK);

					StdDraw.picture(x, y, "mur.png", 72, 71);

				} else if (tab[j][i] == lum) {
					// StdDraw.setPenColor(Color.YELLOW);

					StdDraw.picture(x, y, "lumiere.png", 72, 71);
				} else if (tab[j][i] == ordi) {
					// StdDraw.setPenColor(Color.GREEN);

					StdDraw.picture(x, y, "pc.png", 71, 71);
				}

			}
		}

		/*
		 * Si on veut afficher la grille for (int i =5;i<=9*70;i+=70){
		 * StdDraw.line(-35,i,sizeMapX-46, i);
		 * 
		 * }
		 * 
		 * for (int i= 35; i <=16*70;i+=70){ StdDraw.line(i,5,i,sizeMapY+20); }
		 */
	}

	public static void breakLight(int x, int y) {
		tab[x][y] = 0;
		lumi[x][y]++;
		lumi[x + 1][y]++;
		lumi[x][y + 1]++;
		lumi[x - 1][y]++;
		lumi[x][y - 1]++;
		lumi[x + 1][y + 1]++;
		lumi[x + 1][y - 1]++;
		lumi[x - 1][y - 1]++;
		lumi[x - 1][y + 1]++;
	}

	public static void lumiere() { /*
									 * La méthode lumiere permet, lorsque la
									 * barre d'espace est enfoncer de colorier
									 * toutes les cases du tableau en noir sauf
									 * les lumières de secours et une case a
									 * coté des lumières de secours (-1 dans le
									 * tableau "lumi")
									 */
		for (int j = 0; j < lumi.length; j++) {
			for (int i = 0; i < lumi[j].length; i++) {

				double r = WIDTH / 2;
				double x = WIDTH * i + r;
				double y = WIDTH * j + r;

				if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
					if (lumi[j][i] >= 0) {
						StdDraw.setPenColor(Color.BLACK);

						StdDraw.filledSquare(x, y, r + 1);
						/*
						 * Le r+1 est la pour eviter de voir une ligne blanche
						 * entre les cases, il faut simplement dessiner un
						 * carreau plus large
						 */
					}
				}
			}

		}

	}

}

/**
 * Affiche la position de la souris (aux carreaux) if (StdDraw.mousePressed()){
 * double clickX= StdDraw.mouseX(); double clickY= StdDraw.mouseY();
 * 
 * System.out.println("["+clickX/sizeCar+";"+(int)((clickY/sizeCar))+"]" );
 */

