package salary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.src.backend.DbFactiry;
import com.src.backend.Employee;

import slip.sp;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Window.Type;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class hhhh extends JFrame {

	private JPanel contentPane;
	private JTextField txtempname;
	private JTextField txtempid;
	private JTable table;
	private JTextField phoneNo;
	private JTextField salary;
	private JTextField address;
	private Employee empl;
	private JTextField doj;
	private JTextField pay;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hhhh frame = new hhhh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hhhh() {
		setForeground(Color.CYAN);
		setFont(new Font("Arabic Typesetting", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		    setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
		System.out.println("width"+(int)dim.getWidth());
		System.out.println("height "+(int) dim.getHeight());
		
		//setBounds(100, 100, 671, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setToolTipText("NET PAYMENT");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setPreferredSize(dim);
		contentPane.setMinimumSize(dim);
		
		JLabel txtfield = new JLabel("SALARY   MANAGMENT  SYSTEM");
		txtfield.setFont(new Font("Rockwell", Font.BOLD, 20));
		txtfield.setVerticalAlignment(SwingConstants.BOTTOM);
		txtfield.setBounds(149, 11, 485, 35);
		contentPane.add(txtfield);
		
		JLabel lbEMPNAME = new JLabel("EMP_NAME");
		lbEMPNAME.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbEMPNAME.setBounds(20, 139, 89, 14);
		contentPane.add(lbEMPNAME);
		
		JLabel lbempid = new JLabel("EMP_ID");
		lbempid.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbempid.setBounds(20, 104, 46, 14);
		contentPane.add(lbempid);
		
		JLabel lblNewLabel_3 = new JLabel("PAYMENT TYPE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_3.setBounds(20, 171, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btninsert = new JButton("INSERT");
		btninsert.setFont(new Font("Tahoma", Font.BOLD, 11));   
		btninsert.setVerticalAlignment(SwingConstants.BOTTOM);
		btninsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			try {
				
				int a=DbFactiry.getInstance().insertslip(txtempname.getText(),txtempid.getText(),phoneNo.getText(),salary.getText(),address.getText(),doj.getText(),pay.getText());
			if(a>0)
			{
				JOptionPane.showMessageDialog( null,"value inserted successfully");
			}
			else
			{
				JOptionPane.showMessageDialog(null, " insertion unsuccessfully");
			}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				 
			}
		}
		);
		btninsert.setBounds(10, 370, 89, 23);
		contentPane.add(btninsert);
		
		JButton btndelete = new JButton("DELETE");
		btndelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try{ 
				DbFactiry.getInstance().deleteslip(txtempid.getText());
				JOptionPane.showMessageDialog( null,"value deleted successfully");
				
				/*if(a==0)
					{
						JOptionPane.showMessageDialog( null,"value deleted successfully");
					}
					else if(a>0)
					{
						JOptionPane.showMessageDialog(null, " deletion unsuccessfully");
					}*/
						
					
				}
				
				catch (SQLException exp1) {
					
					exp1.printStackTrace();
				}
					
					
				}
				
			
			}
		);
		btndelete.setBounds(119, 371, 89, 23);
		contentPane.add(btndelete);
		
		JButton btnupdate = new JButton("UPDATE");
		btnupdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try{
				
				int a=DbFactiry.getInstance().updateslip(salary.getText(),txtempid.getText());
				if(a>0)
				{
					JOptionPane.showMessageDialog( null,"value updated successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, " updation unsuccessfully");
				}
				
					
				}


			catch (SQLException exp) {
				// TODO Auto-generated catch block
				exp.printStackTrace();
			}
			
				//call insert from backend
				
			}
		}
				
	
				
			
		);
		btnupdate.setBounds(220, 371, 89, 23);
		contentPane.add(btnupdate);
		
		JButton btngenerate = new JButton("GENERATE  SALARY SLIP");
		btngenerate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btngenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e==null){
					JOptionPane.showMessageDialog(null,"invalid employee id");
					
					
				}
				else{
					

					sp info =new sp(empl,true);
					
					
					
				}
			}
		});
		btngenerate.setBounds(418, 371, 153, 23);
		
		contentPane.add(btngenerate);
		
		txtempname = new JTextField();
		txtempname.setBounds(119, 136, 249, 20);
		contentPane.add(txtempname);
		txtempname.setColumns(10);
		
		txtempid = new JTextField();
		txtempid.setBounds(119, 101, 249, 20);
		contentPane.add(txtempid);
		txtempid.setColumns(10);
		
		Choice TYPE = new Choice();
		//TYPE.setBackground(Color.WHITE);
		//TYPE.setForeground(Color.WHITE);
		TYPE.add("Net Payment");
		TYPE.add("General");
		TYPE.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		TYPE.setBounds(119, 164, 120, 21);
		contentPane.add(TYPE);
		
		table = new JTable();
		table.setBounds(315, 182, 69, -30);
		contentPane.add(table);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(77, 80, 1, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(23, 80, 611, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(34, 219, 1, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(23, 356, 647, 3);
		contentPane.add(separator_3);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				JFrame frmLoginSystem = new JFrame("exit");
				if(JOptionPane.showConfirmDialog(frmLoginSystem,"confirm if you want to exit","login systems",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
					System.exit(0);
			}
			}});
		btnexit.setBounds(581, 371, 89, 23);
		contentPane.add(btnexit);
		
		JLabel lbphoneno = new JLabel("PHONE NO");
		lbphoneno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbphoneno.setHorizontalAlignment(SwingConstants.TRAILING);
		lbphoneno.setBounds(10, 207, 65, 14);
		contentPane.add(lbphoneno);
		
		JLabel lbSALARY = new JLabel("SALARY");
		lbSALARY.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbSALARY.setHorizontalAlignment(SwingConstants.CENTER);
		lbSALARY.setBounds(23, 235, 46, 14);
		contentPane.add(lbSALARY);
		
		JLabel lbADDRESS = new JLabel("ADDRESS");
		lbADDRESS.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbADDRESS.setHorizontalAlignment(SwingConstants.CENTER);
		lbADDRESS.setBounds(10, 269, 75, 14);
		contentPane.add(lbADDRESS);
		
		phoneNo = new JTextField();
		phoneNo.setBounds(119, 199, 249, 20);
		contentPane.add(phoneNo);
		phoneNo.setColumns(10);
		
		salary = new JTextField();
		salary.setBounds(119, 232, 249, 20);
		contentPane.add(salary);
		salary.setColumns(10);
		
		address = new JTextField();
		address.setBounds(119, 266, 249, 20);
		contentPane.add(address);
		address.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				empl = DbFactiry.getInstance().getEmployeeDetails(txtempid.getText());//method call 
					txtempname.setText(empl.getEmployeeName());
					TYPE.select(empl.getPaymentType());
					phoneNo.setText(empl.getPhoneNumber());
					salary.setText(empl.getSalary());
					address.setText(empl.getAddress());
				doj.setText(empl.getDateOfJoining());
				pay.setText(empl.getPaymentType());
					
					
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnSearch.setBounds(319, 371, 89, 23);
		contentPane.add(btnSearch);
		
		JLabel DOJ = new JLabel("DOJ");
		DOJ.setFont(new Font("Tahoma", Font.BOLD, 11));
		DOJ.setHorizontalAlignment(SwingConstants.CENTER);
		DOJ.setBounds(23, 306, 46, 14);
		contentPane.add(DOJ);
		
		JLabel PAYDATE = new JLabel("PAYMENT_DATE");
		PAYDATE.setFont(new Font("Tahoma", Font.BOLD, 11));
		PAYDATE.setHorizontalAlignment(SwingConstants.CENTER);
		PAYDATE.setBounds(10, 331, 99, 14);
		contentPane.add(PAYDATE);
		
		doj = new JTextField();
		doj.setBounds(119, 297, 249, 20);
		contentPane.add(doj);
		doj.setColumns(10);
		
		pay = new JTextField();
		pay.setBounds(122, 326, 246, 20);
		contentPane.add(pay);
		pay.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\corporateadvisory.jpg"));
		label.setBounds(0, 0, 1350, 730);
		contentPane.add(label);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, txtfield, lbEMPNAME, lbempid, lblNewLabel_3, btninsert, btndelete, btnupdate, btngenerate, txtempname, txtempid, TYPE, table, separator, separator_1, separator_2, separator_3, btnexit, lbphoneno, lbSALARY, lbADDRESS, phoneNo, salary, address, btnSearch, DOJ, PAYDATE, doj, pay}));
	}
}
