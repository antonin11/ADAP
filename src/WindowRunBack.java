import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;



	public class WindowRunBack extends JPanel { 
		
		  public void paintComponent(Graphics g){
		    //Vous verrez cette phrase chaque fois que la mŽthode sera invoquŽe
		    System.out.println("Je suis exécuté !"); 
		  //x1, y1, width, height, arcWidth, arcHeight
		    
		   // g.setColor( Color.gray);
		   // g.fillRoundRect(800, 200, 150, 60, 5, 5);
		   // g.setColor( Color.gray);
		   // g.fillRoundRect(800, 300, 150, 60, 5, 5);
		     
		     

		    
		    
		    
		    // Image de fond !!
		    try {
		        
		        Image img = ImageIO.read(new File("fond_menu.jpeg"));
		        //g.drawImage(img, -200, 130, this);
		        //Pour une image de fond
		        
		        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }          
		    
		    Font font = new Font("Courier", Font.BOLD, 50);
		    g.setFont(font);
		    g.setColor(Color.red);
		    g.drawString("A.D.A.P", 20, 650);
		    
		  }               
		}

