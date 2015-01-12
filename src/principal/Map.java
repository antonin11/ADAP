package principal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import org.omg.CORBA.PUBLIC_MEMBER;

import StdDraw.StdDraw;

public class Map {
	public int sizeMapx;
	int sizeMapy;
	int sizeCar; // carreau=Car
	int a = 17; // abscisse
	int o = 9; // ordonnée
	int coul = 0;
	int mur = 1;
	int lum = 2;
	int ordi = 3;
	float WIDTH = 30f;

	public static int[][] tab = {
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 5, 1, 0, 1, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 4, 1 },
			{ 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 1, 2, 1, 0, 0, 2, 0, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 0, 0, 3, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 2, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };;

	// Le tableau est définit en intervertissant les x et les y .
	// Il faut donc définir x=j et y=i dans les boucles for.

	public Map() {
		sizeCar = 29;
		sizeMapx = a * sizeCar;
		sizeMapy = o * sizeCar;

	}

	public void display() { // Afficher la MAP à l'écran c'est à dire défnit une
							// fenetre.

		StdDraw.setXscale(0, sizeMapx);
		StdDraw.setYscale(0, sizeMapy);

		/**
		 * for (int i =0;i<=sizeMapx;i+=sizeCar){ StdDraw.line(0,i,sizeMapx, i);
		 * 
		 * }
		 * 
		 * for (int i= 0; i <=sizeMapx;i+=sizeCar){
		 * StdDraw.line(i,0,i,sizeMapy); }
		 */

		remplissageSquare();
		remplissagePerso();

		StdDraw.show(0);

	}

	public void remplissageSquare() {

		for (int i = 0; i < (a); i++) {
			for (int j = 0; j < (o); j++) {

				if (tab[j][i] == coul) {
					StdDraw.setPenColor(Color.WHITE);
					double x = WIDTH * i;
					double y = sizeMapy - WIDTH * j;
					double r = WIDTH / 2;
					StdDraw.filledSquare(x, y, r);
				}
			}
		}

		for (int i = 0; i < (a); i++) {
			for (int j = 0; j < (o); j++) {

				if (tab[j][i] == mur) {
					StdDraw.setPenColor(Color.BLACK);
					double x = WIDTH * i;
					double y = sizeMapy - WIDTH * j;
					double r = WIDTH / 2;
					StdDraw.filledSquare(x, y, r);
				}
			}
		}

		for (int i = 0; i < (a); i++) {
			for (int j = 0; j < (o); j++) {

				if (tab[j][i] == lum) {
					StdDraw.setPenColor(Color.YELLOW);
					double x = WIDTH * i;
					double y = sizeMapy - WIDTH * j;
					double r = WIDTH / 2;
					StdDraw.filledSquare(x, y, r);
				}

			}
		}

		for (int i = 0; i < (a); i++) {
			for (int j = 0; j < (o); j++) {

				if (tab[j][i] == ordi) {
					StdDraw.setPenColor(Color.GREEN);
					double x = WIDTH * i;
					double y = sizeMapy - WIDTH * j;
					double r = WIDTH / 2;
					StdDraw.filledSquare(x, y, r);

				}

			}
		}

	}

	public void remplissagePerso() {

		StdDraw.show(0);
		for (int i = 0; i < (a); i++) {
			for (int j = 0; j < (o); j++) {

				if (tab[j][i] == 4) {
					StdDraw.setPenColor(Color.RED);
					double x = WIDTH * i;
					double y = sizeMapy - WIDTH * j;
					double r = WIDTH / 3;
					StdDraw.filledCircle(x, y, r);

				}

			}
		}
		for (int i = 0; i < (a); i++) {
			for (int j = 0; j < (o); j++) {

				if (tab[j][i] == 5) {
					StdDraw.setPenColor(Color.BLUE);
					double x = WIDTH * i;
					double y = sizeMapy - WIDTH * j;
					double r = WIDTH / 3;
					StdDraw.filledCircle(x, y, r);

				}

			}
		}

		/**
		 * Affiche la position de la souris (aux carreaux) if
		 * (StdDraw.mousePressed()){ double clickX= StdDraw.mouseX(); double
		 * clickY= StdDraw.mouseY();
		 * 
		 * System.out.println("["+clickX/sizeCar+";"+(int)((clickY/sizeCar))+"]"
		 * );
		 */
	}

}
