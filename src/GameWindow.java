import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.UIManager;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class GameWindow extends JFrame  {


	public static void main(String[] args){
	JFrame fenetrejeu = new JFrame();

	    //Paramtre de la fenetre de jeu..
	    
	    fenetrejeu.setTitle("Super Shooter 2D");
	    fenetrejeu.setSize(1200, 660);
	    fenetrejeu.setResizable(false);
	    fenetrejeu.setBackground(Color.WHITE);
	    //fenetrejeu.setLocation(0, 0); // -> la fenetre s'affiche en x=0 et y=0
	    fenetrejeu.setLocationRelativeTo(null);

	    fenetrejeu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    // interface graphique (déco)
	    
	    JPanel pan =new JPanel();        
	    fenetrejeu.setContentPane(pan);
	    fenetrejeu.setContentPane(new BackGame());
	    
	    
	    
	    
	    
	    

	    fenetrejeu.setVisible(true);

	
	}
}