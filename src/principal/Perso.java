package principal;

import StdDraw.StdDraw;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class Perso{
	 
	int posX;
	int posY;
	
	
public Perso (int x, int y){
		posX = x ;
		posY = y ;
	}

public void moove() {
	
	if(StdDraw.isKeyPressed(KeyEvent.VK_SPACE)){
    	StdDraw.setPenColor(Color.RED);
    	StdDraw.filledCircle(600,300,200);
    }
	}

}
