package principal;

import StdDraw.StdDraw;

import java.awt.Color;

import java.awt.event.KeyEvent;

public class Map extends main {

	public static final float WIDTH = 70f;
	public static final int sizeMapX = 1200;
	public static final int sizeMapY = 600;
	
	static int coul = 0;
	static int mur = 1;
	
	static int lum = 2;
	static int ordi = 3;

	public static int[][] tab = /*{
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 1, 0, 1, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 1, 2, 1, 0, 0, 2, 0, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 0, 0, 3, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 2, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };*/
	
		{	{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 2, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 0, 0, 3, 0, 1, 0, 1 },
			{ 1, 0, 1, 2, 1, 0, 0, 2, 0, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
		
	public static int[][] lumi = {
		
	/*	{ 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, -1, -1, -1, 0, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, -1, 0, 0, 0, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } }; */
	
	{ 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	{ 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	{ 0, 0, -1, -1, -1, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0 },
	{ 0, 0, -1, -1, -1, 0, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0 },
	{ 0, 0, -1, -1, -1, 0, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0 },
	{ 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0 },
	{ 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	{ 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	{ 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	// Le tableau est définit en intervertissant les x et les y .
	// Il faut donc définir x=j et y=i dans les boucles for.

	public Map() {

	}

	public void display() { // Afficher la MAP à l'écran c'est à dire défnit une
							// fenetre.

		StdDraw.setXscale(-100, sizeMapX + 100);
		StdDraw.setYscale(-100, sizeMapY + 100);

		for (int j = 0; j < tab.length; j++) {
			for (int i = 0; i < tab[j].length; i++) {
				double r = WIDTH / 2;
				double x = WIDTH * i+r;
				double y =  WIDTH * j+r;

				if (tab[j][i] == coul) {
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledSquare(x, y, r);
				} else if (tab[j][i] == mur) {
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.filledSquare(x, y, r);
				} else if (tab[j][i] == lum) {
					StdDraw.setPenColor(Color.YELLOW);
					StdDraw.filledSquare(x, y, r);
				} else if (tab[j][i] == ordi) {
					StdDraw.setPenColor(Color.GREEN);
					StdDraw.filledSquare(x, y, r);
				}

			}
		}
		/*
		 * Si on veut afficher la grille for (int i =5;i<=9*70;i+=70){
		 * StdDraw.line(-35,i,sizeMapX-46, i);
		 * 
		 * 
		 * }
		 * 
		 * for (int i= 35; i <=16*70;i+=70){ StdDraw.line(i,5,i,sizeMapY+20); }
		 */
	}

	public static void lumiere() {
		for (int j = 0; j < lumi.length; j++) {
			for (int i = 0; i < lumi[j].length; i++) {
				
				double r = WIDTH / 2;
				double x = WIDTH * i+r;
				double y =  WIDTH * j+r;

				if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
					if (lumi[j][i] ==0) {
						StdDraw.setPenColor(Color.BLACK);
						StdDraw.filledSquare(x, y, r+1);}

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

