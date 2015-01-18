package principal;

import StdDraw.StdDraw;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class Perso extends Map {
	int x;
	int y;
	Color c;
	int nbBalle;
	int range;
	boolean freeze;

	public Perso(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
		freeze = false;

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
	
	public boolean isFreeze(){
		return freeze;
	}
	
	public void setIsFreeze(boolean value){
		
		freeze = value;
		
	}

	public void persoDisplay() {
		
		if(freeze){
			StdDraw.setPenColor(Color.GREEN);
			double r = 28;
			double x = WIDTH * getX()+WIDTH/2;
			double y =  WIDTH * getY()+WIDTH/2;
			StdDraw.filledCircle(x, y, r);
		}
		else{
			StdDraw.setPenColor(c);
			double r = 28;
			double x = WIDTH * getX()+WIDTH/2;
			double y =  WIDTH * getY()+WIDTH/2;
			StdDraw.filledCircle(x, y, r);
			
		}

			
	}
}
