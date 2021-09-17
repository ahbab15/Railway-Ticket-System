import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Reservation extends JFrame{
	
	private Container c;
	private ImageIcon icon;
	private Font f,ft;
	
	
	
	
	
	
	
	private JLabel reserve;
	private JButton report, details,ticket;
	
	

	Reservation(){
		initComponents();
	}
		
	public void initComponents() {	
		c = this.getContentPane();
		c.setLayout(null);
		
		f = new Font("Ariel", Font.BOLD, 18);
		ft = new Font("Ariel",Font.BOLD,25);
		
		icon = new ImageIcon(getClass().getResource("iconn.png"));
		this.setIconImage(icon.getImage());
		
		reserve = new JLabel("Railway Reservation");
		reserve.setBounds(220,40,500,40);
		reserve.setFont(ft);
		c.add(reserve);
		
		report = new JButton("Train Reports");
		report.setFont(f);
		report.setBounds(180, 100, 170, 30);
		c.add(report);
		
		details = new JButton("Train Details");
		details.setBounds(360, 100, 170, 30);
		details.setFont(f);
		c.add(details);
		
		ticket = new JButton("Tickets");
		ticket.setBounds(180, 170, 170, 30);
		ticket.setFont(f);
		c.add(ticket);
		
		
		
		
		
		
		
		
		ticket.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				Ticket_details tframe = new Ticket_details();
				tframe.setVisible(true);
				
				
				
				
			}			
		});
		
		
		details.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				Train_details tframe = new Train_details();
				tframe.setVisible(true);
				
				
				
				
			}			
		});
		
		
		
		
			
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {	
		Reservation frame = new Reservation();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(100, 50, 700, 500);
		frame.setResizable(false);
		frame.setTitle("Reservation");
		
		
		
	}

}

