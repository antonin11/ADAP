package principal;

import StdDraw.StdDraw;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class main {
	private static int WIDTH = 0;
	private static Map map;
	private static Perso perso1;
	private static Perso perso2;
	private static int X;
	private static int Y;
	

	public static void main(String[] args) throws InterruptedException {

		// on dŽfinit le nombre de joueur et on crŽe un tableau de Perso du
		// nombre de joueur

		map = new Map();
		perso1 = new Perso(1, 1, Color.BLUE);
		perso2 = new Perso(15, 1, Color.RED);

		StdDraw.setCanvasSize(1200, 600);

		while (true) {

			StopWatch stopWatch = new StopWatch();
			stopWatch.start();

			Map.lumiere();
			move1(perso1);
			move(perso2);
		
			
			StdDraw.show(0);
			map.display();

			perso1.persoDisplay();
			perso2.persoDisplay();

			stopWatch.stop();

			long timeToWait = 100 - stopWatch.getElapsedTime();

			if (timeToWait > 0)
				Thread.sleep(timeToWait);

		}

	}

	public static void move(Perso perso) {

		X = perso.getX();
		Y = perso.getY();

		
		
		if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {

			if(Map.tab[Y-1][X]!=Map.mur){
				Y = Y - 1;

			}

		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
			if(Map.tab[Y+1][X]!=Map.mur){
				Y = Y + 1;
			}
		}

		if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
			if(Map.tab[Y][X+1]!=Map.mur){
				X = X + 1;
			}
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
			if(Map.tab[Y][X-1]!=Map.mur){
				X = X - 1;

			}
		}
			

		perso.setX(X);
		perso.setY(Y);
	}

	public static void move1(Perso perso) {

		X = perso.getX();
		Y = perso.getY();

		if (StdDraw.isKeyPressed(KeyEvent.VK_Z)) {
			if(Map.tab[Y-1][X]!=Map.mur){
			Y = Y - 1;
			}
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_S)) {
			if(Map.tab[Y+1][X]!=Map.mur){
			Y = Y + 1;
		}
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
			if(Map.tab[Y][X+1]!=Map.mur){
			X = X + 1;
			}
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_Q)) {
			if(Map.tab[Y][X-1]!=Map.mur){
			X = X - 1;

		}
			}
			
		
		

		perso.setX(X);
		perso.setY(Y);
		if (StdDraw.isKeyPressed(KeyEvent.VK_W)) {
			StdDraw.setPenColor(Color.BLUE);
			
			StdDraw.filledRectangle(WIDTH *X+170, Map.sizeMapY - (WIDTH * Y) -70, 100, 2);

		}

	}
	public static void tir(Perso perso) {
		
		if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
			StdDraw.setPenColor(Color.RED);
			StdDraw.filledRectangle(perso.getX(), Y+WIDTH/3, 50, 50);
			;
		
		}

	}
	

	
}
