package emp;

//import java.sql.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class Employee_login extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JTextField textPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_login frame = new Employee_login();
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
	public Employee_login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(204, 39, 165, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(52, 182, 135, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(56, 239, 81, 32);
		contentPane.add(lblNewLabel_2);
		
		textUser = new JTextField();
		textUser.setBounds(204, 198, 96, 19);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		textPass = new JTextField();
		textPass.setBounds(204, 259, 96, 19);
		contentPane.add(textPass);
		textPass.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.driver");
//					Connection con = DriverManager.getConnection("jd 	bc:mysql://localhost/ems","root","");
//					String user=textUser.getText();
//					String pass=textPass.getText();
//					Statement s1= con.createStatement();
//					String sql="select * from login where username='"+user+"' and pass='"+pass+"'";	
//					ResultSet rs= s1.executeQuery(sql);
//					if(rs.next()) {
//						dispose();
//						Employee e1 =new Employee();
//						e1.show();
//					}
//					else {
//						JOptionPane.showInternalMessageDialog(btnNewButton, "Error");
//					}
//					con.close();
				}
				catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnNewButton.setBounds(152, 325, 85, 21);
		contentPane.add(btnNewButton);
	}
}
