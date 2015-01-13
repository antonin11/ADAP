package principal;

import StdDraw.StdDraw;

import java.awt.Color;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		//on dŽfinit le nombre de joueur et on crŽe un tableau de Perso du nombre de joueur
		Map map = new Map();
		StdDraw.setCanvasSize(1200, 600);
		map.display();
		while (true) {

			StopWatch stopWatch = new StopWatch();
			stopWatch.start();
			
			
			
			
			stopWatch.stop();

			long timeToWait = 200 - stopWatch.getElapsedTime();

			if (timeToWait > 0)
				Thread.sleep(timeToWait);

		}

	}
}
