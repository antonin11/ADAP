package principal;

import StdDraw.StdDraw;
import java.util.Timer;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class main {
	private static int WIDTH = 10;
	private static Map map;
	private static Perso perso1;
	private static Perso perso2;
	private static int X;
	private static int Y;
	private static StopWatch timer;

	public static void main(String[] args) throws InterruptedException {

		map = new Map();
		perso1 = new Perso(1, 7, Color.BLUE);
		perso2 = new Perso(15, 7, Color.RED);

		StdDraw.setCanvasSize(1200, 600);

		while (true){

			StopWatch stopWatch = new StopWatch();
			stopWatch.start();

			StdDraw.show(0);

			Map.lumiere();

			shootP1(perso1);
			shootP2(perso2);

			move1(perso1);
			move(perso2);

			StdDraw.show(0);
			map.display();

			perso1.persoDisplay();
			perso2.persoDisplay();

			stopWatch.stop();

			long timeToWait = 70 - stopWatch.getElapsedTime();

			if (timeToWait > 0)
				Thread.sleep(timeToWait);
		}

	}

	public static void move(Perso perso) {

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
			if (Map.tab[Y][X] == Map.mur) {
				return;
			}
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
			if (X == perso2.getX() && Y == perso2.getY()) {
				perso2.setIsFreeze(true);
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
			if (Map.tab[Y][X] == Map.mur) {
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
			if (X == perso1.getX() && Y == perso1.getY()) {
				perso1.setIsFreeze(true);
			}

		}
	}

/*	public static boolean ordiHacké(Perso perso1) {
		int X = perso1.getX();
		int Y = perso1.getY();
		int Xordi = WIDTH * X+WIDTH/2;
		int Yordi = WIDTH * Y+WIDTH/2;
		if (X == Xordi && Y == Yordi) {
			if (!timer.isRunning()-timer.getElapsedTime()) {
				timer.start();
			}
		}

		if (X != Xordi || Y != Yordi) {
			if (!timer.isRunning())
				timer.stop();
		}

		if (timer.getElapsedTime() > 5000) {
			System.out.println("Win");
			return true;

		}

		return false;
	}
	*/
	/*public static boolean isFinished()
	{
		if(ordiHacké(perso1)){
			StdDraw.setPenColor(Color.WHITE);
			StdDraw.text(600, 300, "Intru a gagné ! ");
			StdDraw.setPenColor(Color.BLUE);
			StdDraw.filledCircle(600, 300, 300);
			
			return true;
	}
		return false;
	}*/
}
