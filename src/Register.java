import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends  JFrame {
	
	private Container c;
	private ImageIcon icon;
	private JLabel registering,fname,lname,email,usern,passw,rpassw,address;
	private JButton reg,cancel,loginpage;
	private Font f,ft;
	private JTextField ff,lf,ef,uf,af;
	private JPasswordField pf,rpf;
	
	
	
	Register(){
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 50, 700, 500);
		this.setTitle("Registration");
		
		
		c = this.getContentPane();
		c.setLayout(null);
		
		f = new Font("Ariel", Font.BOLD, 14);
		ft = new Font("Ariel",Font.BOLD,25);
		
		icon = new ImageIcon(getClass().getResource("iconn.png"));
		this.setIconImage(icon.getImage());
		
		registering = new JLabel("Fill up to register");
		registering.setFont(ft);
		registering.setBounds(240, 20, 500, 30);
		c.add(registering);
		
		fname = new JLabel("First Name:");
		fname.setFont(f);
		fname.setBounds(30, 90, 100,20);
		c.add(fname);
		
		
		ff = new JTextField();
		ff.setFont(f);
		ff.setBounds(140, 90, 200, 20);
		c.add(ff);
		
		lname = new JLabel("Last Name:");
		lname.setFont(f);
		lname.setBounds(30, 120, 100,20);
		c.add(lname);
		
		lf = new JTextField();
		lf.setFont(f);
		lf.setBounds(140, 120, 200, 20);
		c.add(lf);
		
		email = new JLabel("Email:");
		email.setFont(f);
		email.setBounds(30, 150, 100,20);
		c.add(email);
		
		ef = new JTextField();
		ef.setFont(f);
		ef.setBounds(140, 150, 200, 20);
		c.add(ef);
		
		usern = new JLabel("UserName:");
		usern.setFont(f);
		usern.setBounds(30, 180, 100,20);
		c.add(usern);
		
		uf = new JTextField();
		uf.setFont(f);
		uf.setBounds(140, 180, 200, 20);
		c.add(uf);
		
		passw = new JLabel("Password: ");
		passw.setBounds(30, 210, 100, 20);
		passw.setFont(f);
		c.add(passw);
		
		pf = new JPasswordField();
		pf.setFont(f);
		pf.setEchoChar('*');
		pf.setBounds(140,  210,  200,  20);
		c.add(pf);
		
		rpassw = new JLabel("Retype pass: ");
		rpassw.setBounds(30, 240, 100, 20);
		rpassw.setFont(f);
		c.add(rpassw);
		
		rpf = new JPasswordField();
		rpf.setFont(f);
		rpf.setEchoChar('*');
		rpf.setBounds(140,  240,  200,  20);
		c.add(rpf);
		
		
		
		address = new JLabel("Address:");
		address.setFont(f);
		address.setBounds(30, 270, 100,20);
		c.add(address); 
		
		af = new JTextField();
		af.setFont(f);
		af.setBounds(140, 270, 250, 60);
		c.add(af);
		
		reg = new JButton("Register");
		reg.setFont(ft);
		reg.setBounds(50, 350, 150, 30);
		c.add(reg);
		
		cancel = new JButton("Cancel");
		cancel.setFont(ft);
		cancel.setBounds(210, 350, 150, 30);
		c.add(cancel);
		
		loginpage = new JButton("Log in page");
		loginpage.setFont(ft);
		loginpage.setBounds(380, 350, 220, 30);
		c.add(loginpage);
		
		
		
		
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				ff.setText("");
				lf.setText("");
				ef.setText("");
				uf.setText("");
				af.setText("");
				pf.setText("");
				rpf.setText("");
				
				
			}			
		});
		
		
		reg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String fname = ff.getText();
				String lanme = lf.getText();
				String email = ef.getText();
				String uname = uf.getText();
				String pass = pf.getText();
				String re_pass = rpf.getText();
				String address = af.getText();
				
				
				
				
				String sql = "INSERT INTO REGI VALUES(?,?,?,?,?,?)";
				try {
					PreparedStatement stmt = Myconnection.getConnection().prepareStatement(sql);
					
					stmt.setString(1,fname);
					stmt.setString(2, lanme);
					stmt.setString(3, email);
					stmt.setString(4, uname);
					stmt.setString(5, pass);
					stmt.setString(6, address);
					
					if(stmt.executeUpdate() > 0)
					{
						
						JOptionPane.showMessageDialog(null, "User added");
					}
					
					
					
						
						
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
						
			}			
		});
		
		
		loginpage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				Rail rframe = new Rail();
				rframe.setVisible(true);
				
				
			}			
		});
		
		
		
		
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Register Rframe = new Register();
		Rframe.setVisible(true);

	}

}
