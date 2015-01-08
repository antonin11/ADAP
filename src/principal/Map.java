package principal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import StdDraw.StdDraw;

public class Map {

		int sizeMapx;
		int sizeMapy;
		int a=15; //abscisse
		int o=7; //ordonnée
		
		
		//carreau=Car
		
		int sizeCar;
		
		int [][] tab = new int [a][o];
		
		public Map(){
			sizeMapx=a*80;
			sizeMapy=o*80;
			sizeCar=80;
			
			display();
			
			if(true){
				remplissage();
			}
		}
		
		public void display(){
		    
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
		  
		
			public void remplissage(){
				
				// Creation des couloirs;
				
					tab [1][1] = 1;
					tab [1][2] = 1;
					tab [1][3] = 1;
					tab [1][4] = 1;
					tab [1][6] = 1;
					
					tab [3][1] = 1;
					tab [3][2] = 1;
					tab [3][3] = 1;
					tab [3][4] = 1;
					tab [3][6] = 1;
					
					tab [5][0] = 1;
					tab [5][1] = 1;
					tab [5][2] = 1;
					tab [5][4] = 1;
					tab [5][5] = 1;
					tab [5][6] = 1;
					
					tab [7][0] = 1;
					tab [7][2] = 1;
					tab [7][4] = 1;
					tab [7][5] = 1;
					tab [7][6] = 1;
					
					tab [9][0] = 1;
					tab [9][1] = 1;
					tab [9][3] = 1;
					tab [9][4] = 1;
					tab [9][5] = 1;
					
					tab [11][0] = 1;
					tab [11][1] = 1;
					tab [11][3] = 1;
					tab [11][4] = 1;
					tab [11][5] = 1;
					
					tab [13][0] = 1;
					tab [13][1] = 1;
					tab [13][2] = 1;
					tab [13][3] = 1;
					tab [13][5] = 1;
					
				// Creation des lumieres
					tab[2][3]=2;
					tab[2][0]=2;
					tab[5][6]=2;
					tab[6][3]=2;
					tab[8][2]=2;
					
				// Case des personnages
					tab[0][6]=3;
					tab[14][6]=4;
					
				// Case ordinateur
					tab[11][3]=5;
					
					
				
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
				for(int i=0;i<(a);i++){
					for (int j=0;j<(o);j++){
									
						if(tab [i][j] == 3){
							StdDraw.setPenColor(Color.BLUE);
							StdDraw.picture(i*sizeCar+sizeCar/2,j*sizeCar+sizeCar/2,"perso2.png");
						}
						
				}
			}
				for(int i=0;i<(a);i++){
					for (int j=0;j<(o);j++){
									
						if(tab [i][j] == 4){
							StdDraw.setPenColor(Color.RED);
							StdDraw.picture(i*sizeCar+sizeCar/2,j*sizeCar+sizeCar/2,"perso1.png");
							
						}
						
				}
			}
				for(int i=0;i<(a);i++){
					for (int j=0;j<(o);j++){
									
						if(tab [i][j] == 5){
							StdDraw.setPenColor(Color.BLACK);
							StdDraw.filledSquare(i*sizeCar+sizeCar/2,j*sizeCar+sizeCar/2,sizeCar/2);
							StdDraw.picture(i*sizeCar+sizeCar/2,j*sizeCar+sizeCar/2,"pc.png");
							
						}
						
				}
			}
			
				
				
				
				//Affiche la position de la souris (aux carreaux)
				if (StdDraw.mousePressed()){
						double clickX= StdDraw.mouseX();
						double clickY= StdDraw.mouseY();
	
	System.out.println("["+(int)clickX/sizeCar+";"+(int)((clickY/sizeCar))+"]");
		}
     }

		
}
			
			
			

