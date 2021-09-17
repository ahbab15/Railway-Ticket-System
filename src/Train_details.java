import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Train_details extends JFrame {
	
	private Container c;
	private ImageIcon icon,img1;
	private JLabel details;
	private JButton btn, reserve;
	private Font ft;
	
	
	Train_details(){
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 50, 700, 500);
		this.setTitle("Train Details");
		
		c = this.getContentPane();
		c.setLayout(null);
		ft = new Font("Ariel",Font.BOLD,25);
		
		icon = new ImageIcon(getClass().getResource("iconn.png"));
		this.setIconImage(icon.getImage());
		
		img1 = new ImageIcon(getClass().getResource("traindd.png"));
		
		
		btn = new JButton(img1);
		btn.setBounds(00, 80, 700, 200);
		c.add(btn);
		
		reserve = new JButton("Reservation Page");
		reserve.setBounds(200, 350, 150, 40);
		c.add(reserve);
		
		reserve.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				Reservation rframe = new Reservation();
				rframe.setVisible(true);
				rframe.setBounds(100, 50, 700, 500);
				
				
			}			
		});
		
		
		details = new JLabel("Train Details");
		details.setFont(ft);
		details.setBounds(240, 20, 500, 30);
		c.add(details);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Train_details tframe = new Train_details();
		tframe.setVisible(true);
		
	}

}
