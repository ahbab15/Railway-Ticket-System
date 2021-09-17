import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Rail extends JFrame {
	
	private JLabel user, pass,enter;
	private JTextField tf;
	private JPasswordField pf;
	private JButton login, clear, reg;
	private Container c;
	private Font f,ft;
	private ImageIcon icon;
	
	Rail(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 50, 700, 500);
		this.setTitle("Railway System");
		
		f = new Font("Ariel", Font.BOLD, 18);
		ft = new Font("Ariel",Font.BOLD,25);
		
		
		
		icon = new ImageIcon(getClass().getResource("iconn.png"));
		this.setIconImage(icon.getImage());
		
		c = this.getContentPane();
		c.setLayout(null);
		
		
		enter = new JLabel("Enter Your Username and Password");
		enter.setBounds(160, 40, 500, 40);
		enter.setFont(ft);
		c.add(enter);
		
		user = new JLabel("Username: ");
		user.setBounds(160, 110, 120, 40);
		user.setFont(f);
		c.add(user);
		
		tf = new JTextField();
		tf.setFont(f);
		tf.setBounds(295, 110, 200, 40);
		c.add(tf);
		
		pass = new JLabel("Password: ");
		pass.setBounds(160, 180, 120, 40);
		pass.setFont(f);
		c.add(pass);
		
		pf = new JPasswordField();
		pf.setFont(f);
		pf.setEchoChar('*');
		pf.setBounds(295,  180,  200,  40);
		c.add(pf);
		
		login = new JButton("Log in");
		login.setFont(f);
		login.setBounds(120, 300, 100, 40);
		c.add(login);
		
		clear = new JButton("Clear");
		clear.setFont(f);
		clear.setBounds(240, 300, 100, 40);
		c.add(clear);
		
		reg = new JButton("Register now");
		reg.setFont(f);
		reg.setBounds(360, 300, 200, 40);
		c.add(reg);
		
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				tf.setText("");
				pf.setText("");
				
				
			}			
		});
		
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rail","root","");
					Statement stmt = con.createStatement();
					String sql ="Select * from regi where u_uname='"+tf.getText()+"' and u_password = '"+pf.getText().toString()+"'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next()) {
						
						dispose();
						Reservation frame = new Reservation();
						frame.setVisible(true);
						frame.setBounds(100, 50, 700, 500);
					
					}
					
					else
						JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
					con.close();
					
					
				}catch(Exception e) {System.out.print(e);}
			}			
		});
		
		
		
		reg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				Register rframe = new Register();
				rframe.setVisible(true);
				
				
			}			
		});
		
		
		
		
	}

	public static void main(String[] args) {
		Rail frame = new Rail();
		frame.setVisible(true);
		Backimage b = new Backimage();
		frame.add(b);
		
	}

}
