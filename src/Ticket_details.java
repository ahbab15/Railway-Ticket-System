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
import javax.swing.JTextField;

public class Ticket_details extends JFrame {
	
	private Container c;
	private ImageIcon icon;
	private JLabel details,splace,eplace, t_no, t_name, price, date, c_name,phone, mail;
	private Font f,ft;
	
	private JComboBox cb, cbb, tn,tnc,pp;
	private String[] ss = {"Chittagong", "Dhaka", "Dinajpur", "Dewangong", "Noakhali"};
	private String[] es = {"Dhaka", "Chittagong", "Dinajpur", "Dewangong", "Noakhali"};
	private String[] tnoo = {"701","703","705","707","712"};
	private String[] tname = {"Subarna Express", "Mohanagar Godhuli", "Ekota Express", "Tista Express", "Upokul Express"};
	private String[] pr = {"500"};
	
	
	
	
	private JButton reserve, clear, reserve_page, cticket, uticket;
	private JTextField pf, df,cnf,pnf,mf;
	
	
	Ticket_details(){
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 50, 700, 500);
		this.setTitle("Ticket Details");
		
		c = this.getContentPane();
		c.setLayout(null);
		ft = new Font("Ariel",Font.BOLD,25);
		f = new Font("Ariel", Font.BOLD, 14);
		
		icon = new ImageIcon(getClass().getResource("iconn.png"));
		this.setIconImage(icon.getImage());
		
		
		details = new JLabel("Ticket Details");
		details.setFont(ft);
		details.setBounds(240, 20, 500, 30);
		c.add(details);
		
		splace = new JLabel("Start Place:");
		splace.setFont(f);
		splace.setBounds(50, 100, 80,20);
		c.add(splace);
		
		splace = new JLabel("Start Place:");
		splace.setFont(f);
		splace.setBounds(50, 100, 80,20);
		c.add(splace);
		
		cb = new JComboBox(ss);
		cb.setEditable(true);
		cb.setBounds(140, 100, 150, 30);
		c.add(cb);
		
		eplace = new JLabel("End Place:");
		eplace.setFont(f);
		eplace.setBounds(50, 150, 80,20);
		c.add(eplace);
		
		cbb = new JComboBox(es);
		cbb.setEditable(true);
		cbb.setBounds(140, 150, 150, 30);
		c.add(cbb);
		
		t_no = new JLabel("Train no.:");
		t_no.setFont(f);
		t_no.setBounds(50, 200, 80,20);
		c.add(t_no);
		
		tn = new JComboBox(tnoo);
		tn.setEditable(true);
		tn.setBounds(140, 200, 150, 30);
		c.add(tn);
		
		
		
		
		
		t_name = new JLabel("Train Name:");
		t_name.setFont(f);
		t_name.setBounds(50, 250, 95,20);
		c.add(t_name);
		
		
		tnc = new JComboBox(tname);
		tnc.setEditable(true);
		tnc.setBounds(140, 250, 150, 30);
		c.add(tnc);
		
		
		
		price = new JLabel("Ticket price:");
		price.setFont(f);
		price.setBounds(50, 300, 95,20);
		c.add(price);
		
		pp = new JComboBox(pr);
		pp.setEditable(true);
		pp.setBounds(140, 300, 150, 30);
		c.add(pp);
		
		date = new JLabel("Date:");
		date.setFont(f);
		date.setBounds(50, 350, 95,20);
		c.add(date);
		
		df = new JTextField();
		df.setFont(f);
		df.setBounds(140, 350, 150, 30);
		c.add(df);
		
		c_name = new JLabel("Customer Name:");
		c_name.setFont(f);
		c_name.setBounds(330, 100, 120,20);
		c.add(c_name);
		
		cnf = new JTextField();
		cnf.setFont(f);
		cnf.setBounds(460, 100, 150, 30);
		c.add(cnf);
		
		phone = new JLabel("Phone no.:");
		phone.setFont(f);
		phone.setBounds(330, 140, 120,30);
		c.add(phone);
		
		pnf = new JTextField();
		pnf.setFont(f);
		pnf.setBounds(460, 140, 150, 30);
		c.add(pnf);
		
		mail = new JLabel("Email:");
		mail.setFont(f);
		mail.setBounds(330, 180, 120,30);
		c.add(mail);
		
		mf = new JTextField();
		mf.setFont(f);
		mf.setBounds(460, 180, 150, 30);
		c.add(mf);
		
		reserve = new JButton("Reserve");
		reserve.setBounds(350, 260, 140, 40);
		reserve.setFont(f);
		c.add(reserve);
		
		clear = new JButton("Clear");
		clear.setFont(f);
		clear.setBounds(500, 260, 140, 40);
		c.add(clear);
		
		reserve_page = new JButton("Reserve Page");
		reserve_page.setFont(f);
		reserve_page.setBounds(350, 320, 140, 40);
		c.add(reserve_page);
		
		
		cticket = new JButton("Cancel Ticket");
		cticket.setBounds(500, 320, 140, 40);
		cticket.setFont(f);
		c.add(cticket);
		
		uticket = new JButton("Update Ticket");
		uticket.setBounds(350, 380, 140, 40);
		uticket.setFont(f);
		c.add(uticket);
		
		
		cticket.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
				
				String sql = "Select * from ticket";
				
				
				try {
					PreparedStatement stmt =  Myconnection.getConnection().prepareStatement(sql);
					stmt.executeUpdate("DELETE from ticket where TRAIN_NO = '"+tn.getSelectedItem()+"'");
					JOptionPane.showMessageDialog(null, "Cancelled");
					
					
					
					
					
					
					
					
						
						
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
				
				
				
				
			}			
		});

		
		
		
		
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				mf.setText("");
				pnf.setText("");
				df.setText("");
				cnf.setText("");
				
				
			}			
		});
		
		
		uticket.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					String sql = "SELECT * FROM ticket";
					PreparedStatement stmt = Myconnection.getConnection().prepareStatement(sql);
					
					stmt.executeUpdate("Update ticket set  DATES ='"+ df.getText()+"' and CUSTOMER_NAME = '"+cnf.getText()+"' and PHONE_NUMBER = '"+pnf.getText().toString()+"'");
					JOptionPane.showMessageDialog(null, "Updated");
					
					
					
					
					
						
						
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
				
				
				
			}			
		});
		
		
		reserve_page.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Reservation frame = new Reservation();
				frame.setVisible(true);
				frame.setBounds(100,50,700,500); 
				
				
			}			
		});
		
		
		reserve.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				String tno = (String) tn.getSelectedItem();
				String tname = (String) tnc.getSelectedItem();
				String tprice = (String) pp.getSelectedItem();
				String dt = df.getText();
				String cname = cnf.getText();
				String phno = pnf.getText();
				String email = mf.getText();
				String sss = (String) cb.getSelectedItem();
				String ese = (String) cbb.getSelectedItem();
				
				
				
				String sql = "INSERT INTO ticket VALUES(?,?,?,?,?,?,?,?,?)";
				
				try {
					PreparedStatement stmt = Myconnection.getConnection().prepareStatement(sql);
					
					stmt.setString(1,sss);
					stmt.setString(2, ese);
					stmt.setString(3, tno);
					stmt.setString(4, tname);
					stmt.setString(5, tprice);
					stmt.setString(6, dt);
					stmt.setString(7,cname);
					stmt.setString(8, phno);
					stmt.setString(9, email);
					
					
					
					
					if(stmt.executeUpdate() > 0)
					{
						
						JOptionPane.showMessageDialog(null, "Ticket Reserved");
					}
					
					
					
						
						
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
				

				
				
			}			
		});
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Ticket_details tframe = new Ticket_details();
		tframe.setVisible(true);
		
	}

}
