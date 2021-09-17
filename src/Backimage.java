import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

public class Backimage extends Canvas {
	
	Image img;
	
	public Backimage() {
		img = Toolkit.getDefaultToolkit().getImage("java.png");
				
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2 =  (Graphics2D)g;
		g2.drawImage(img,0,0,700,500,this);
		
	}

}
