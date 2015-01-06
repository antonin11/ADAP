	import java.awt.Color;
	import java.awt.Component;
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



	public class Windows extends JFrame  {


		public static void main(String[] args){
		JFrame fenetre = new JFrame();
		
		    
		    //Parametre de la fenetre de jeu..
		    
		    fenetre.setTitle("A.D.A.P 2D");
		    fenetre.setSize(1200, 700);
		    fenetre.setBackground(Color.DARK_GRAY);
		    fenetre.setLocationRelativeTo(null);
		    fenetre.setResizable(false);
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
		    
		    // fond d'ecran
		    JPanel pan1 =new JPanel();        
		    fenetre.setContentPane(pan1);
		    fenetre.setContentPane(new WindowRunBack());
		    
		  //Creation de la barre des menus
		    JMenuBar menu_bar1= new JMenuBar();
		 
		    // Creation des differents menus
		    JMenu menu1= new JMenu ("Jouer");
		    JMenu menu2 =new JMenu ("Infos");
		   
		    
		    fenetre.setLayout(null);
		    JButton Play= new JButton("Jouer");
		    JButton Info= new JButton("Infos");
		    Font f=new Font("Arial", Font.ITALIC, 28); 
		    Play.setFont(f);
		    Info.setFont(f);
		    
		    
		    fenetre.getContentPane().add(Play);
		    Play.setBounds(800,250,300,80);
		    
		    Play.setForeground(Color.gray);
		    
		    fenetre.getContentPane().add(Info);
		    Info.setBounds(800,350,300,80);
		    Info.setForeground(Color.gray);
		    

		    
		    
		    
		    
		    
		    fenetre.setVisible(true);
		 
		    
		
		}
	}


