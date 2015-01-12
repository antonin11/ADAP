package principal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import org.omg.CORBA.PUBLIC_MEMBER;

import StdDraw.StdDraw;

public class Map {

		int sizeMapx;
		int sizeMapy;
		int a=17; //abscisse
		int o=9; //ordonnée
		
		
		//carreau=Car
		
		int sizeCar;
		
		int [][] tab = new int [a][o];
		
		public Map(){
			sizeCar=60;
			sizeMapx=a*sizeCar;
			sizeMapy=o*sizeCar;
			
			
				display();
			
			while(true){
				remplissageSquare();
				remplissagePerso();
				
				
				
			}
			
		}
		
			public void display(){ // Afficher la MAP à l'écran c'est à dire défnit une fenetre.
		    
			StdDraw.setCanvasSize(sizeMapx,sizeMapy);
			StdDraw.setXscale(0,sizeMapx);
			StdDraw.setYscale(0,sizeMapy);
			
			/**
				for (int i =0;i<=sizeMapx;i+=sizeCar){
					StdDraw.line(0,i,sizeMapx, i);
					
				}
				
				for (int i= 0; i <=sizeMapx;i+=sizeCar){
					StdDraw.line(i,0,i,sizeMapy);
				}
				*/
				
		}			
			public void remplissageSquare(){ // Met en couleur les différents carrées de la map
				//contour
				
				tab [0][0] = 1;
				tab [0][1] = 1;
				tab [0][2] = 1;
				tab [0][3] = 1;
				tab [0][4] = 1;
				tab [0][5] = 1;
				tab [0][6] = 1;
				tab [0][7] = 1;
				tab [0][8] = 1;
				
				tab [16][0] = 1;
				tab [16][1] = 1;
				tab [16][2] = 1;
				tab [16][3] = 1;
				tab [16][4] = 1;
				tab [16][5] = 1;
				tab [16][6] = 1;
				tab [16][7] = 1;
				tab [16][8] = 1;
				
				tab [1][0] = 1;
				tab [2][0] = 1;
				tab [3][0] = 1;
				tab [4][0] = 1;
				tab [5][0] = 1;
				tab [6][0] = 1;
				tab [7][0] = 1;
				tab [8][0] = 1;
				tab [9][0] = 1;
				tab [10][0] = 1;
				tab [11][0] = 1;
				tab [12][0] = 1;
				tab [13][0] = 1;
				tab [14][0] = 1;
				tab [15][0] = 1;
				
				tab [1][8] = 1;
				tab [2][8] = 1;
				tab [3][8] = 1;
				tab [4][8] = 1;
				tab [5][8] = 1;
				tab [6][8] = 1;
				tab [7][8] = 1;
				tab [8][8] = 1;
				tab [9][8] = 1;
				tab [10][8] = 1;
				tab [11][8] = 1;
				tab [12][8] = 1;
				tab [13][8] = 1;
				tab [14][8] = 1;
				tab [15][8] = 1;
				
				// Creation des couloirs;

					tab [2][2] = 1;
					tab [2][3] = 1;
					tab [2][4] = 1;
					tab [2][5] = 1;
					tab [2][7] = 1;
					
					tab [4][2] = 1;
					tab [4][3] = 1;
					tab [4][4] = 1;
					tab [4][5] = 1;
					tab [4][7] = 1;
					
					tab [6][1] = 1;
					tab [6][2] = 1;
					tab [6][3] = 1;
					tab [6][5] = 1;
					tab [6][6] = 1;
					tab [6][7] = 1;
					
					tab [8][1] = 1;
					tab [8][3] = 1;
					tab [8][5] = 1;
					tab [8][6] = 1;
					tab [8][7] = 1;
					
					tab [10][1] = 1;
					tab [10][2] = 1;
					tab [10][4] = 1;
					tab [10][5] = 1;
					tab [10][6] = 1;
					
					tab [12][1] = 1;
					tab [12][2] = 1;
					tab [12][4] = 1;
					tab [12][5] = 1;
					tab [12][6] = 1;
					
					tab [14][1] = 1;
					tab [14][2] = 1;
					tab [14][3] = 1;
					tab [14][4] = 1;
					tab [14][6] = 1;
					
				// Creation des lumieres
					tab[3][4]=2;
					tab[3][1]=2;
					tab[6][7]=2;
					tab[7][4]=2;
					tab[9][3]=2;
					
					
				
					
					
				
				for(int i=0;i<(a);i++){
					for (int j=0;j<(o);j++){
						
						if(tab [i][j] == 1){
							StdDraw.setPenColor(Color.BLACK);
							StdDraw.filledSquare(i*sizeCar+sizeCar/2,j*sizeCar+sizeCar/2,sizeCar/2);
						}
					}
				}
				
				for(int i=0;i<(a);i++){
					for (int j=0;j<(o);j++){
									
						if(tab [i][j] == 2){
							StdDraw.setPenColor(Color.YELLOW);
							StdDraw.filledSquare(i*sizeCar+sizeCar/2,j*sizeCar+sizeCar/2,sizeCar/2);
						}
						
				}
			}
				
				
			}
			
			public void remplissagePerso(){
				// Case des personnages
				tab[1][7]=4;
				tab[15][7]=3;
				
			// Case ordinateur
				tab[12][3]=5;
				
				for(int i=0;i<(a);i++){
					for (int j=0;j<(o);j++){
									
						if(tab [i][j] == 4){
							StdDraw.setPenColor(Color.RED);
							
							StdDraw.filledCircle(925,450, 17.5);
							//StdDraw.picture(1170,520,"perso1.png", 40, 40,0);
							
						}
						
				}
			}
				for(int i=0;i<(a);i++){
					for (int j=0;j<(o);j++){
									
						if(tab [i][j] == 3){
							StdDraw.setPenColor(Color.BLUE);
							StdDraw.filledCircle(90,450, 17.5);
							//StdDraw.picture(30,520,"perso1.png", 40, 40,0);
						}
						
				}
			}
				for(int i=0;i<(a);i++){
					for (int j=0;j<(o);j++){
									
						if(tab [i][j] == 5){
							StdDraw.setPenColor(Color.GREEN);
							StdDraw.filledSquare(i*sizeCar+sizeCar/2,j*sizeCar+sizeCar/2,sizeCar/2);
							// StdDraw.picture(i*sizeCar+sizeCar/2,(j*sizeCar+sizeCar/2)-20,"pc.png", 30, 30,0);
							
						}
						
				}
			}
				
				
				
				
				
				
				/** Affiche la position de la souris (aux carreaux)
				if (StdDraw.mousePressed()){
						double clickX= StdDraw.mouseX();
						double clickY= StdDraw.mouseY();
	
	System.out.println("["+clickX/sizeCar+";"+(int)((clickY/sizeCar))+"]");
	*/
		}
     


}
			
			
			

