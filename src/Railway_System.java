import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Railway_System extends JFrame {
	
	private Container c;
	private Font f,ft;
	private JLabel welcome;
	private JButton admin,user;
	private ImageIcon icon;
	
	Railway_System(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 50, 700, 500);
		this.setTitle("WELCOME");
		
		f = new Font("Ariel", Font.BOLD, 18);
		ft = new Font("Ariel",Font.BOLD,25);
		
		c = this.getContentPane();
		c.setLayout(null);
		
		icon = new ImageIcon(getClass().getResource("iconn.png"));
		this.setIconImage(icon.getImage());
		
		welcome = new JLabel("Welcome To Railway System");
		welcome.setBounds(170,40,500,40);
		welcome.setFont(ft);
		c.add(welcome);
		
		admin = new JButton("Administration");
		admin.setFont(f);
		admin.setBounds(250,150,200,30);
		c.add(admin);
		
		user = new JButton("User");
		user.setFont(f);
		user.setBounds(250,210,200,30);
		c.add(user);
		
		user.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Rail ff = new Rail();
				ff.setVisible(true);
				
				
			}			
		});
		
		
		admin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Admin aframe = new Admin();
				aframe.setVisible(true);
				
				
			}			
		});
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		Railway_System rframe = new Railway_System();
		rframe.setVisible(true);

	}

}
