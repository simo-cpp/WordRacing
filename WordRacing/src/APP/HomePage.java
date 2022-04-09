package APP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
					
					Login log = new Login(); //can't access to this page is we don't login
					log.show();
					
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setTitle("WordRacing");
		setIconImage(Toolkit.getDefaultToolkit().getImage(HomePage.class.getResource("/APP/Image/keyboard_key_w (1).png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Word Racing");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(147, 0, 140, 83);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();//close login page
				Test Te = new Test();
				Te.show();
			}
		});
		btnNewButton.setBounds(171, 204, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Profile");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();//close login page
				Profile Pe = new Profile();
				Pe.show();
			}
		});
		btnNewButton_1.setBounds(171, 254, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Levels");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();//close login page
				Levels Le = new Levels();
				Le.show();
			}
		});
		btnNewButton_2.setBounds(171, 301, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Ranking");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();//close login page
				Rank Ra = new Rank();
				Ra.show();
			}
		});
		btnNewButton_4.setBounds(171, 349, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("LogOut");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();//close login page
				Login lo = new Login();
				lo.show();
			}
		});
		btnNewButton_3.setBounds(10, 437, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/APP/Image/original.jpg")));
		lblNewLabel_1.setBounds(10, 10, 416, 448);
		contentPane.add(lblNewLabel_1);
	}
}
