package emp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EMS {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EMS window = new EMS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EMS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 661, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMS Login Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(227, 26, 194, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Admin Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_login ad= new Admin_login();
				ad.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.setBounds(91, 156, 181, 76);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEmployeelogin = new JButton("Employee Login");
		btnEmployeelogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee_Login e1= new Employee_Login();
				e1.setVisible(true);
			}
		});
		btnEmployeelogin.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnEmployeelogin.setBounds(373, 156, 181, 76);
		frame.getContentPane().add(btnEmployeelogin);
	}
}
