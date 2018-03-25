package slip;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;

import com.src.backend.Employee;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class sp extends JFrame {

	private JPanel contentPane;
	private JTextField TXTempname;
	private JTextField txtempid;
	private JTextField txtsalary;
	private JTextField txtaddress;
	private JTextField txtphoneno;
	private JTextField dateOfJoining;
	private JTextField paymentType;

	/**
	 * Launch the application.
	 */
	
	private Employee e;

	
	




	/**
	 * Create the frame.
	 */
	public sp(Employee e, boolean visible) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 597, 416);
		
		 Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		  setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
		System.out.println("width"+(int)dim.getWidth());
		System.out.println("height "+(int) dim.getHeight());
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setPreferredSize(dim);
		contentPane.setMinimumSize(dim);
		
		JLabel lbl = new JLabel("SALARY  SLIP");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl.setBounds(214, 26, 324, 14);
		contentPane.add(lbl);
		
		JLabel lbEMPNAME = new JLabel("EMP_NAME");
		lbEMPNAME.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbEMPNAME.setHorizontalAlignment(SwingConstants.TRAILING);
		lbEMPNAME.setBounds(10, 77, 61, 14);
		contentPane.add(lbEMPNAME);
		
		JLabel lbEMPID = new JLabel("EMP_ID");
		lbEMPID.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbEMPID.setHorizontalAlignment(SwingConstants.TRAILING);
		lbEMPID.setBounds(-5, 119, 61, 14);
		contentPane.add(lbEMPID);
		
		JLabel lbSALARY = new JLabel("SALARY");
		lbSALARY.setHorizontalAlignment(SwingConstants.CENTER);
		lbSALARY.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbSALARY.setBounds(10, 156, 46, 14);
		contentPane.add(lbSALARY);
		
		JLabel ADDRESS = new JLabel("ADDRESS");
		ADDRESS.setFont(new Font("Tahoma", Font.BOLD, 11));
		ADDRESS.setHorizontalAlignment(SwingConstants.CENTER);
		ADDRESS.setBounds(10, 193, 61, 14);
		contentPane.add(ADDRESS);
		
		JLabel lbPHONENO = new JLabel("PHONE NO");
		lbPHONENO.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbPHONENO.setHorizontalAlignment(SwingConstants.CENTER);
		lbPHONENO.setBounds(10, 231, 61, 14);
		contentPane.add(lbPHONENO);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				JFrame frmLoginSystem = new JFrame("exit");
				if(JOptionPane.showConfirmDialog(frmLoginSystem,"confirm if you want to exit","login systems",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
					System.exit(0);
			
			
			}
			}
		});
		btnexit.setBounds(235, 344, 112, 23);
		contentPane.add(btnexit);
		
		TXTempname = new JTextField();
		TXTempname.setText(e.getEmployeeName());
		TXTempname.setBounds(107, 74, 419, 20);
		contentPane.add(TXTempname);
		TXTempname.setColumns(10);
		
		txtempid = new JTextField();
		txtempid.setText(e.getEmployeeId());
		txtempid.setBounds(107, 116, 419, 20);
		contentPane.add(txtempid);
		txtempid.setColumns(10);
		
		txtsalary = new JTextField();
		txtsalary.setText(e.getSalary());
		txtsalary.setBounds(107, 153, 419, 20);
		contentPane.add(txtsalary);
		txtsalary.setColumns(10);
		
		txtaddress = new JTextField();
		txtaddress.setText(e.getAddress());
		txtaddress.setBounds(107, 190, 419, 20);
		contentPane.add(txtaddress);
		txtaddress.setColumns(10);
		
		txtphoneno = new JTextField();
		txtphoneno.setText(e.getPhoneNumber());
		txtphoneno.setBounds(107, 228, 419, 20);
		contentPane.add(txtphoneno);
		txtphoneno.setColumns(10);
		
		JLabel ibdoj = new JLabel("DOJ");
		ibdoj.setFont(new Font("Tahoma", Font.BOLD, 11));
		ibdoj.setHorizontalAlignment(SwingConstants.TRAILING);
		ibdoj.setBounds(-28, 270, 76, 14);
		contentPane.add(ibdoj);
		
		dateOfJoining = new JTextField();
		dateOfJoining.setBounds(106, 267, 420, 20);
		dateOfJoining.setText(e.getDateOfJoining());
		contentPane.add(dateOfJoining);
		dateOfJoining.setColumns(10);
		
		JLabel DBPAYMEANTDATE = new JLabel("PAYMENT DATE");
		DBPAYMEANTDATE.setFont(new Font("Tahoma", Font.BOLD, 11));
		DBPAYMEANTDATE.setBounds(10, 305, 84, 14);
		contentPane.add(DBPAYMEANTDATE);
		
		paymentType = new JTextField();
		paymentType.setBounds(107, 299, 419, 20);
		paymentType.setText(e.getPaymentType());
		contentPane.add(paymentType);
		paymentType.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\corporateadvisory.jpg"));
		label.setBounds(2, 0, 1358, 740);
		contentPane.add(label);
		this.setVisible(visible);
	}
	


}
