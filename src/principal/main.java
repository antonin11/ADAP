package principal;

import StdDraw.StdDraw;


import java.awt.Color;
import java.awt.event.KeyEvent;


public class main {
	private static int WIDTH = 35;
	private static Map map;
	private static Perso perso1;
	private static Perso perso2;
	private static int X;
	private static int Y;
	private static StopWatch timer = new StopWatch();
	private static StopWatch timer1 = new StopWatch();
	private static StopWatch timerfreeze = new StopWatch();
	
	
	public static void main(String[] args) throws InterruptedException {

		map = new Map();
		perso1 = new Perso(1, 7, Color.BLUE);
		perso2 = new Perso(15, 7, Color.RED);

		StdDraw.setCanvasSize(1200, 600);

		while (true) {
			if (isFinished()) {
			//	IntruWin();
				return;
			} else {
				StopWatch stopWatch = new StopWatch();
				stopWatch.start();

				StdDraw.show(0);

				Map.lumiere();

				shootP1(perso1);
				shootP2(perso2);

			move1(perso1);
				move2(perso2);


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
	}

	public static void move2(Perso perso) {

		X = perso.getX();
		Y = perso.getY();

		if (perso2.isFreeze()) {

			return;
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {

			if (Map.tab[Y + 1][X] != Map.mur && Map.tab[Y + 1][X] != Map.ordi) {
				Y = Y + 1;

			}

		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
			if (Map.tab[Y - 1][X] != Map.mur && Map.tab[Y - 1][X] != Map.ordi) {
				Y = Y - 1;
			}
		}

		if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
			if (Map.tab[Y][X + 1] != Map.mur && Map.tab[Y][X + 1] != Map.ordi) {
				X = X + 1;
			}
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
			if (Map.tab[Y][X - 1] != Map.mur && Map.tab[Y][X - 1] != Map.ordi) {
				X = X - 1;

			}
		}

		perso.setX(X);
		perso.setY(Y);
	}

	public static void move1(Perso perso) {

		X = perso.getX();
		Y = perso.getY();

		if (perso1.isFreeze()) {
			return;
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_Z)) {

			if (Map.tab[Y + 1][X] != Map.mur) {
				Y = Y + 1;
				// StdDraw.picture(X, Y, "Perso1bas.png", 72, 71);

			}

		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_S)) {
			if (Map.tab[Y - 1][X] != Map.mur) {
				Y = Y - 1;
				// StdDraw.picture(X, Y, "Perso1haut.png", 72, 71);
			}
		}

		if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
			if (Map.tab[Y][X + 1] != Map.mur) {
				X = X + 1;
				// StdDraw.picture(X, Y, "Perso1droite.png", 72, 71);
			}
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_Q)) {
			if (Map.tab[Y][X - 1] != Map.mur) {
				X = X - 1;
				// StdDraw.picture(X, Y, "Perso1gauche.png", 72, 71);

			}
		}

		perso.setX(X);
		perso.setY(Y);

	}

	public static void shootP1(Perso perso) {
		int X = perso.getX();
		int Y = perso.getY();

		if (perso.isFreeze()) {
			return;
		}

		for (int i = 0; i < 4; ++i) {
			if (Map.tab[Y][X] == Map.mur|| Map.tab[Y][X] == Map.ordi) {
				return;
			}
			
			/*if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE) && StdDraw.isKeyPressed(KeyEvent.VK_E )){
				StdDraw.picture(X, Y, "etincelle.png", WIDTH,WIDTH);
			}*/
			
			if (StdDraw.isKeyPressed(KeyEvent.VK_Z)
					&& StdDraw.isKeyPressed(KeyEvent.VK_E)) {
				Y = Y + 1;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_S)
					&& StdDraw.isKeyPressed(KeyEvent.VK_E)) {
				Y = Y - 1;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_D)
					&& StdDraw.isKeyPressed(KeyEvent.VK_E)) {
				X = X + 1;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_Q)
					&& StdDraw.isKeyPressed(KeyEvent.VK_E)) {
				X = X - 1;
			}
			if (X == perso2.getX() && Y == perso2.getY() && StdDraw.isKeyPressed(KeyEvent.VK_E)) {
		
				
				perso2.setIsFreeze(true);
			
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_E))
				if (Map.tab[Y][X] >= 2) {
					Map.breakLight(Y, X);
				}
		}
	}

	public static void shootP2(Perso perso) {
		int X = perso.getX();
		int Y = perso.getY();

		if (perso.isFreeze()) {
			
			return;
		}

		for (int i = 0; i < 4; ++i) {
			if (Map.tab[Y][X] == Map.mur || Map.tab[Y][X] == Map.ordi) {
				return;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_UP)
					&& StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
				Y = Y + 1;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)
					&& StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
				Y = Y - 1;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)
					&& StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
				X = X + 1;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)
					&& StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
				X = X - 1;
			}
			if (X == perso1.getX() && Y == perso1.getY() && StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
				perso1.setIsFreeze(true);
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER))
				if (Map.tab[Y][X] >= 2) {
					Map.breakLight(Y, X);
				}

		}
	}
	
	public static boolean HackeurArret(Perso perso2){
		int X = perso2.getX();
		int Y = perso2.getY();
		int X1 = perso1.getX();
		int Y1 = perso1.getY();
		
		if (X != X1 && Y != Y1) {
			timer1.start();
		}
		if (X == X1 && Y == Y1) {
			StdDraw.setPenColor(Color.WHITE);
			StdDraw.filledRectangle(1200,600,100,40);
			StdDraw.setPenColor(Color.RED);
			StdDraw.text(1200, 600, "00:00:"+"0"+(5-(timer1.getElapsedTimeSecs())));
			timer1.stop();
			
		}
		if (timer1.getElapsedTimeSecs() > 5) {
			System.out.println("Gardien gagne !");
			return true;
		}
			
		
		return false;
		
	}
	
	public static boolean ordiHacké(Perso perso1) {
		int X = perso1.getX();
		int Y = perso1.getY();

		if (Map.tab[Y][X] == Map.coul) {
			timer.start();
		}
		if (Map.tab[Y][X] == Map.ordi ) {
			StdDraw.setPenColor(Color.WHITE);
			StdDraw.filledRectangle(0,600,100,40);
			StdDraw.setPenColor(Color.BLUE);
			StdDraw.text(0, 600, "00:00:"+"0"+(5-(timer.getElapsedTimeSecs())));
			timer.stop();
		}
		if (timer.getElapsedTimeSecs() > 5) {
			
			System.out.println("Hackeur gagne");
			
			return true;
		}
			
		
		return false;
	}

	public static boolean isFinished() {
		
		if (ordiHacké(perso1) || HackeurArret(perso2)) {
			
			return true;
			
		}
		return false;
	}


	
	}

