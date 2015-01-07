import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class BackGame extends JPanel {
	public void paintComponent(Graphics g){
		
		
		
		
		// ligne du haut 1
		
				g.fillRect(0, 0, 1200, 40);
				g.setColor(Color.RED);
				g.drawLine(0, 40, 1200, 40);
			

			
				
				// ligne de bas haut
				g.setColor(Color.BLACK);
				g.fillRect(0, 600, 1200, 40);
				g.setColor(Color.RED);
				g.drawLine(0, 600, 1200, 600);
				
		
		
		
	
		
		
		 try {
		        
		        Image img2 = ImageIO.read(new File("perso2.png"));
		        g.drawImage(img2, 10, 42, this);;
		        //Pour une image de fond
		        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }          
	    
		 try {
		        
		        Image img1 = ImageIO.read(new File("perso1.png"));
		        
		        g.drawImage(img1, 1110, 42, this);
		        //Pour une image de fond
		        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }          		
		// Espace de combat 
		 
		 //carré
		 
		 		g.setColor(Color.BLACK);
		 	g.fillRect(80,40,80,80);
		 	g.fillRect(80,200,80,320);
		 	
		 	g.fillRect(240,40,80,80);
		 	g.fillRect(240,200,80,320);
		 	
		 	g.fillRect(400,120,80,160);
		 	g.fillRect(400,360,80,240);
		 	
		 	g.fillRect(560,40,80,240);
		 	g.fillRect(560,360,80,80);
		 	g.fillRect(560,520,80,80);
		 	
		 	g.fillRect(720,120,80,240);
		 	g.fillRect(720,440,80,160);
		 	
		 	g.fillRect(880,120,80,240);
		 	g.fillRect(880,440,80,160);
		 	
		 	g.fillRect(1040,120,80,80);
		 	g.fillRect(1040,280,80,320);
		 	
		 	
		 	/** Contour des carrées blancs
		 	//Vetical de gauche a droite et de haut en bas
		 	g.setColor(Color.BLACK);
		 		g.fillRect(80,40, 2,80);
		 		g.fillRect(80,200, 2,320);
		 		
		 		g.fillRect(160,40, 2,80);
		 		g.fillRect(160,200, 2,320);
		 		
		 		g.fillRect(240,40, 2,80);
		 		g.fillRect(240,200, 2,320);
		 		
		 		g.fillRect(320,40, 2,80);
		 		g.fillRect(320,200, 2,320);
		 		
		 		g.fillRect(400,120, 2,160);
		 		g.fillRect(400,360, 2,240);
		 		
		 		g.fillRect(480,120, 2,160);
		 		g.fillRect(480,360, 2,240);
		 		
		 		g.fillRect(560,40, 2,240);
		 		g.fillRect(560,360, 2,80);
		 		g.fillRect(560,520, 2,80);
		 		
		 		g.fillRect(640,40, 2,240);
		 		g.fillRect(640,360, 2,80);
		 		g.fillRect(640,520, 2,80);
		 		
		 		g.fillRect(720,120, 2, 240);
		 		g.fillRect(720,440, 2, 160);
		 		
		 		g.fillRect(800,120, 2, 240);
		 		g.fillRect(800,440, 2, 160);
		 		
		 		g.fillRect(880,120, 2, 240);
		 		g.fillRect(880,440, 2, 160);
		 		
		 		g.fillRect(960,120, 2, 240);
		 		g.fillRect(960,440, 2, 160);
		 		
		 		g.fillRect(1040,120, 2,80);
		 		g.fillRect(1040,280, 2,1000);
		 		
		 		g.fillRect(1120,120, 2,80);
		 		g.fillRect(1120,280, 2,1000);
		 		
		 		
		 	//LIGNE VERTICAL
		 		g.fillRect(80,120, 80, 2);
		 		g.fillRect(80,200, 80, 2);
		 		g.fillRect(80,520, 80, 2);
		 		
		 		g.fillRect(240,120, 80, 2);
		 		g.fillRect(240,200, 80, 2);
		 		g.fillRect(240,520, 80, 2);
		 		
		 		g.fillRect(400,120, 80, 2);
		 		g.fillRect(400,280, 80, 2);
		 		g.fillRect(400,360, 80, 2);
		 		
		 		g.fillRect(560,280, 80, 2);
		 		g.fillRect(560,360, 80, 2);
		 		g.fillRect(560,440, 80, 2);
		 		g.fillRect(560,520, 80, 2);
		 		
		 		g.fillRect(720,120, 80, 2);
		 		g.fillRect(720,360, 80, 2);
		 		g.fillRect(720,440, 80, 2);
		 		
		 		g.fillRect(880,120, 80, 2);
		 		g.fillRect(880,360, 80, 2);
		 		g.fillRect(880,440, 80, 2);
		 		
		 		g.fillRect(1040,120, 80, 2);
		 		g.fillRect(1040,200, 80, 2);
		 		g.fillRect(1040,280, 80, 2);
		 		
		 		*/
		 		
		 		
		 	/** Lumière
		 		g.setColor(Color.yellow);
		 		g.fillOval(150,340, 20, 20);
		 		g.fillOval(230,340, 20, 20);
		 		
		 		g.fillOval(150,507, 20, 20);
		 		g.fillOval(230,507, 20, 20);
		 		g.fillOval(190,590, 20, 20);
		 		
		 		g.fillOval(390,110, 20, 20);
		 		g.fillOval(470,110, 20, 20);
		 		g.fillOval(430,30, 20, 20);

		 		g.fillOval(550,350, 20, 20);
		 		g.fillOval(470,270, 20, 20);
		 		
		 		*/
		 		
		 		
		 	
		 	
		 	/** Ordinateur
		 		try {
			       
			       Image img1 = ImageIO.read(new File("pc.png"));
			        g.drawImage(img1, 890, 320, this);
			       // Pour une image de fond
			       // g.drawImage(img1,50,50, this.getWidth(), this.getHeight(), this);
			        } catch (IOException e) {
			            e.printStackTrace();
			        }      
			        */    				
		 		
		 		
	}
	
	
}
