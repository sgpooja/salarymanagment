package dbms;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import salary.hhhh;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Point;

public class dbms1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtusername;
	private JPasswordField txtpassword;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dbms1 frame = new dbms1();
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
	public dbms1() {
		setLocation(new Point(1000, 1000));
		setForeground(UIManager.getColor("List.selectionBackground"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 534, 330);
		//setExtendedState(JFrame.MAXIMIZED_BOTH); //frame full screen
		//setUndecorated(true);//frame full screen
		 Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		    setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
		System.out.println("width"+(int)dim.getWidth());
		System.out.println("height "+(int) dim.getHeight());
		
		contentPane = new JPanel();
		contentPane.setLocation(new Point(1000, 1000));
		contentPane.setPreferredSize(dim);
		contentPane.setMinimumSize(dim);
		
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setForeground(new Color(51, 153, 255));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel USERNAME = new JLabel("USER NAME");
		USERNAME.setFont(new Font("Tahoma", Font.BOLD, 11));
		USERNAME.setBounds(56, 73, 78, 14);
		contentPane.add(USERNAME);
		
		JLabel PASSWORD = new JLabel("PASSWORD");
		PASSWORD.setFont(new Font("Tahoma", Font.BOLD, 11));
		PASSWORD.setVerticalAlignment(SwingConstants.BOTTOM);
		PASSWORD.setBounds(56, 124, 72, 14);
		contentPane.add(PASSWORD);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN  SYSTEM");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(163, 11, 150, 23);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String password=txtpassword.getText();
				String username=txtusername.getText();
			if(password.contains("king")&& username.contains("one"))
			{
				txtusername.setText(null);
				txtpassword.setText(null);
			
				
				hhhh info =new hhhh();
				hhhh.main(null);
				
				
				
			}
			else
			{
				JOptionPane.showMessageDialog(null,"invalid login details","login error",JOptionPane.ERROR_MESSAGE);
			}
			}
			
		});
		btnNewButton.setBounds(26, 204, 89, 23);
		contentPane.add(btnNewButton);
		    JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtusername.setText(null);
				txtpassword.setText(null);
				
				
				
			}
		});
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.setBounds(175, 204, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e){
			JFrame frmLoginSystem = new JFrame("exit");
			if(JOptionPane.showConfirmDialog(frmLoginSystem,"confirm if you want to exit","login systems",
					JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
			}
			
			
			}
		});
		btnNewButton_2.setBounds(305, 204, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(200, 191, 1, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(200, 73, 1, 2);
		contentPane.add(separator_1);
		
		txtusername = new JTextField();
		txtusername.setBounds(175, 70, 172, 20);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(175, 121, 172, 20);
		contentPane.add(txtpassword);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(98, 191, 64, -9);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(55, 180, 339, 2);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(98, 60, 1, 2);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(55, 45, 339, 2);
		contentPane.add(separator_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\corpratr-and-business-registration.jpg"));
		lblNewLabel.setBounds(0, 0, 1350, 730);
		contentPane.add(lblNewLabel);
	}
}
