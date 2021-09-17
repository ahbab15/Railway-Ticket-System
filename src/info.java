import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class info extends JFrame {
	
	private Container c;
	private ImageIcon icon;
	private JLabel infom,fname,lname,email,phn_no,address,gender;
	private JButton buy,cancel;
	private Font f,ft;
	private JTextField ff,lf,ef,pf,af;
	private JRadioButton male,female;
	private ButtonGroup grp;
	info(){
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 50, 700, 500);
		this.setTitle("INFO");
		
		
		c = this.getContentPane();
		c.setLayout(null);
		
		f = new Font("Ariel", Font.BOLD, 14);
		ft = new Font("Ariel",Font.BOLD,25);
		
		icon = new ImageIcon(getClass().getResource("iconn.png"));
		this.setIconImage(icon.getImage());
		
		infom = new JLabel("Enter Your Information Here");
		infom.setFont(ft);
		infom.setBounds(160, 40, 500, 30);
		c.add(infom);
		
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
		
		phn_no = new JLabel("Phone no:");
		phn_no.setFont(f);
		phn_no.setBounds(30, 180, 100, 20);
		c.add(phn_no);
		
		pf = new JTextField();
		pf.setFont(f);
		pf.setBounds(140, 180, 200, 20);
		c.add(pf);
		
		
		address = new JLabel("Address:");
		address.setFont(f);
		address.setBounds(30, 210, 100,20);
		c.add(address); 
		
		af = new JTextField();
		af.setFont(f);
		af.setBounds(140, 210, 200, 20);
		c.add(af);
		
		gender = new JLabel("gender:");
		gender.setFont(f);
		gender.setBounds(30, 240, 100,20);
		c.add(gender);
		
		male = new JRadioButton("Male");
		male.setFont(f);
		male.setBounds(140, 240, 70, 20);
		c.add(male);
		
		female = new JRadioButton("Female");
		female.setFont(f);
		female.setBounds(220, 240, 90, 20);
		c.add(female);
		
		grp = new ButtonGroup();
		
		grp.add(male);
		grp.add(female);
		
		buy = new JButton("Buy Ticket");
		buy.setFont(ft);
		buy.setBounds(150, 280, 200, 30);
		c.add(buy);
		
		cancel = new JButton("Cancel");
		cancel.setFont(ft);
		cancel.setBounds(360, 280, 200, 30);
		c.add(cancel);
		
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				ff.setText("");
				lf.setText("");
				ef.setText("");
				pf.setText("");
				af.setText("");
				
			}			
		});
		
		
		buy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				JOptionPane.showMessageDialog(null, "Thank You for your info.");
				
			}			
		});
		
		
		
		
		
		
	}



	public static void main(String[] args) {
		
		info iframe = new info();
		iframe.setVisible(true);
		
		
	}
}
