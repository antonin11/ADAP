package principal;

import StdDraw.StdDraw;

import java.awt.Color;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		//on dŽfinit le nombre de joueur et on crŽe un tableau de Perso du nombre de joueur
		int nbJoueur = 2 ;
		Perso [] perso = new Perso [nbJoueur];
		perso[0]=new Perso(2,2);
		perso[1]=new Perso(2,16);

		Map map = new Map();

		StdDraw.setCanvasSize(1200, 600);

		while (true) {

			StopWatch stopWatch = new StopWatch();
			stopWatch.start();

			map.display();

			stopWatch.stop();

			long timeToWait = 200 - stopWatch.getElapsedTime();

			if (timeToWait > 0)
				Thread.sleep(timeToWait);

		}

	}
}
