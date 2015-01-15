package principal;

import StdDraw.StdDraw;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class Perso extends Map {
	int x;
	int y;
	Color c;

	public Perso(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;

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

	public int getX1() {
		return x;
	}

	public int getY1() {
		return y;
	}

	public int setX1(int value) {
		return x = value;
	}

	public int setY1(int value) {

		return y = value;
	}

	public void persoDisplay() {
		StdDraw.setPenColor(c);
		double r = 28;
		double x = WIDTH * getX()+WIDTH/2;
		double y =  WIDTH * getY()+WIDTH/2;
		StdDraw.filledCircle(x, y, r);

	}
}
