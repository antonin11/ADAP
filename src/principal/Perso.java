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

public void CreaPerso(){
	int nbJoueur = 2 ;

    Perso [] perso = new Perso [nbJoueur];
	perso[0]=new Perso(2,2,4,0);
	perso[1]=new Perso(15,2,5,1);
	
	for(int i=0;i<nbJoueur;i++){
		perso[i].moove();
	}
}

public void moove() {
	
	if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)){
		if(tab [posY+1][posX]!=1){
			posY=posY+1;
			tab[posY][posX]=0;
			tab [posY][posX] = nb;
		}
	}
	if (StdDraw.isKeyPressed(KeyEvent.VK_UP)){
		if(tab [posY-1][posX]!=1){
			posY=posY-1;
			tab[posY][posX]=0;
			tab [posY][posX] = nb;
		}
	}
	if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
		if(tab [posY][posX+1]!=1){
			posX=posX+1;
			tab[posY][posX]=0;
			tab [posY][posX] = nb;
		}
	}
	if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){
		if(tab [posY][posX-1]!=1){
			posX=posX-1;
			tab[posY][posX]=0;
			tab [posY][posX] = nb;
		}
	}
	
	}

}
