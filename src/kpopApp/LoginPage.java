package kpopApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JPasswordField;

public class LoginPage {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField passField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(72, 209, 204));
		panel.setBounds(0, 0, 432, 253);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign in");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 14));
		lblNewLabel.setBounds(159, 35, 53, 27);
		panel.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Cambria Math", Font.BOLD, 14));
		lblUsername.setBounds(97, 79, 88, 27);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Cambria Math", Font.BOLD, 14));
		lblPassword.setBounds(97, 115, 82, 27);
		panel.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(189, 80, 141, 22);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign in!");
		btnNewButton.setBackground(new Color(127, 255, 212));
		btnNewButton.setBounds(159, 166, 97, 25);
		panel.add(btnNewButton);
		
		passField = new JPasswordField();
		passField.setBounds(189, 116, 141, 22);
		panel.add(passField);
	}
}
