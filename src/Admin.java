import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;



public class Admin extends JFrame {
	
	private Container c;
	private Font f;
	private ImageIcon icon;
	private JTextField tf;
	private JButton jb;
	
	Admin(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 50, 700, 500);
		this.setTitle("Adminstration");
		
		icon = new ImageIcon(getClass().getResource("iconn.png"));
		this.setIconImage(icon.getImage());
		
		f = new Font("Ariel", Font.BOLD, 18);
		
		c = this.getContentPane();
		c.setLayout(null);
		
		
		tf = new JTextField();
		tf.setBounds(00, 50, 700, 300);
		c.add(tf);
		
		jb = new JButton("Railway page");
		jb.setBounds(150, 350, 150, 40);
		c.add(jb);
		
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				Railway_System aframe = new Railway_System();
				aframe.setVisible(true);
				
				
				
			}			
		});
		
		
		
		try {
			
			PreparedStatement stmt = Myconnection.getConnection().prepareStatement("Select * from ticket");
			
			ResultSet rs = stmt.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			
			
			String rr = rsmd.getColumnName(2);
			rsmd.getColumnCount();
			rsmd.getColumnLabel(1);
			tf.setText(rr);
			
				
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		Admin frame = new Admin();
		frame.setVisible(true);
	}

}
