package principal;

import java.awt.Color;

import javax.swing.JFrame;

import StdDraw.StdDraw;


public class main {
	
	public static void main(String[] args) throws InterruptedException{
		
		Map map = new Map();
		
		
		while(true){
			
			StopWatch stopWatch = new StopWatch();
			stopWatch.start();
			
			map.display();
			
			
		
			stopWatch.stop();
			
			long timeToWait = 200 - stopWatch.getElapsedTime();
			
			if(timeToWait > 0)
				Thread.sleep(timeToWait);
			
		}
		
	
			
			
			

			
			
		}
}	

	


