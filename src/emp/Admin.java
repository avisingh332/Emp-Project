package emp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnViewEmployee = new JButton("View Employee");
		btnViewEmployee.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnViewEmployee.setBounds(145, 83, 174, 51);
		contentPane.add(btnViewEmployee);
		
		JButton btnInsert = new JButton("Update ");
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnInsert.setBounds(145, 157, 174, 51);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBounds(145, 230, 174, 51);
		contentPane.add(btnDelete);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddEmployee.setBounds(145, 10, 174, 51);
		contentPane.add(btnAddEmployee);
	}

}
