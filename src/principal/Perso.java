package principal;

import StdDraw.StdDraw;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class Perso extends Map{
	 
	int posX;
	int posY;
	int nb;
	int type;
	
	
public Perso (int x, int y, int n, int t){
		posX = x ;
		posY = y ;
		nb=n;
		type=t;
	}

public void moove() {
	
	tab[posY][posX]=0;
	
	if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)){
		if(tab [posY][posX-1]!=1){
			posX=posX-1;
		}
	}
	if (StdDraw.isKeyPressed(KeyEvent.VK_UP)){
		if(tab [posY][posX+1]!=1){
			posX=posX+1;
		}
	}
	if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
		if(tab [posY+1][posX]!=1){
			posY=posY+1;
		}
	}
	if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){
		if(tab [posY-1][posX]!=1){
			posY=posY-1;
		}
	}
	tab [posY][posX] = nb;
	}

}
