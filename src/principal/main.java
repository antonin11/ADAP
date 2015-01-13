package principal;

import StdDraw.StdDraw;

import java.awt.Color;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		//on définit le nombre de joueur et on crée un tableau de Perso du nombre de joueur
		int nbJoueur = 2 ;
		Perso [] perso = new Perso [nbJoueur];
			perso[0]=new Perso(2,2,4,0);
			perso[1]=new Perso(15,2,5,1);
		
		

		Map map = new Map();
		
		StdDraw.setCanvasSize(1200, 600);

		while (true) {

			StopWatch stopWatch = new StopWatch();
			stopWatch.start();
			for(int i=0;i<nbJoueur;i++){
						perso[i].moove();
					}
			
			map.display();
			
			stopWatch.stop();

			long timeToWait = 200 - stopWatch.getElapsedTime();

			if (timeToWait > 0)
				Thread.sleep(timeToWait);

		}

	}
}
