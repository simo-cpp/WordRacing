package APP;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tfUser;
	private JPasswordField pfPass;
	
	private JButton btLogIn;
	private JButton btSignUp;
	
	private String User,Pass;
	private final JLabel lblNewLabel_4 = new JLabel("");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/APP/Image/keyboard_key_w (1).png")));
		setTitle("WordRacing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Login Page");
		lblNewLabel_3.setBounds(10, 10, 100, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("User or Mail : ");
		lblNewLabel.setBounds(10, 63, 85, 13);
		contentPane.add(lblNewLabel);
		
		tfUser = new JTextField();
		tfUser.setBounds(121, 60, 305, 19);
		contentPane.add(tfUser);
		tfUser.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setBounds(10, 114, 85, 13);
		contentPane.add(lblNewLabel_1);
		
		btLogIn = new JButton("LogIn");
		btLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User = tfUser.getText();
				Pass = pfPass.getText();
				
				/*if(User.equals("") || Pass.equals("")) {
					JOptionPane.showMessageDialog(btLogIn,"Remplissez les champs SVP", "Authentification", JOptionPane.WARNING_MESSAGE);
				}
				else if(User.equals("Admin") && Pass.equals("1234")) {
					JOptionPane.showMessageDialog(btLogIn,"Authentification Réussite", "Authentification", JOptionPane.PLAIN_MESSAGE);
					dispose();//close login page
				        	HomePage hpage = new HomePage();
				        	hpage.show();
				}
				else {
					JOptionPane.showMessageDialog(btLogIn,"Authentification Echoué", "Authentification", JOptionPane.ERROR_MESSAGE);
				}*/
				
		        /*if(User.equals("") || Pass.equals("")) {
					JOptionPane.showMessageDialog(btLogIn,"Remplissez les champs SVP", "Authentification", JOptionPane.WARNING_MESSAGE);
					} else*/
				
		       
				
				try {
					 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","MOHAmed1234");
					 
					 	User = tfUser.getText();
					 	Pass = pfPass.getText();
						
						
					 Statement st = con.createStatement();

					 
					 String sql = "Select Username, Mail, Password from Player where (Username = '"+User+"' or Mail = '"+User+"') and Password = '"+Pass+"'";
				        ResultSet rs = st.executeQuery(sql);

				        if(rs.next()) {
							JOptionPane.showMessageDialog(btLogIn,"Authentification Réussite", "Authentification", JOptionPane.PLAIN_MESSAGE);

				        	//if username and password is true than go to Homepage
				        	
				        	dispose();//close login page
				        	HomePage hpage = new HomePage();
				        	hpage.show();
				        
				        }

				        else if (User.equals("") || Pass.equals("") ) {//User = null && Pass = null
							JOptionPane.showMessageDialog(btLogIn,"Remplissez les champs SVP", "Authentification", JOptionPane.WARNING_MESSAGE);

				        	//if username and password is wrong show message
							
				        } else {
				        	JOptionPane.showMessageDialog(pfPass,"user or password wrong...", "Authentification", JOptionPane.ERROR_MESSAGE);
							tfUser.setText("");
							pfPass.setText("");
				        }
				    

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
			}
		});
		btLogIn.setBounds(121, 184, 106, 26);
		contentPane.add(btLogIn);
		
		btSignUp = new JButton("SignUp!");
		btSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();//close login page
				Inscri In = new Inscri();
				In.show();
			}
		});
		btSignUp.setBounds(280, 242, 85, 21);
		contentPane.add(btSignUp);
		
		JLabel lblNewLabel_2 = new JLabel("First time at WordRacing!");
		lblNewLabel_2.setBounds(121, 244, 146, 17);
		contentPane.add(lblNewLabel_2);
		
		pfPass = new JPasswordField();
		pfPass.setBounds(121, 111, 305, 19);
		contentPane.add(pfPass);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfUser.setText("");
				pfPass.setText("");
			}
		});
		btnReset.setBounds(259, 184, 106, 26);
		contentPane.add(btnReset);
		lblNewLabel_4.setIcon(new ImageIcon(Login.class.getResource("/APP/Image/original.jpg")));
		lblNewLabel_4.setBounds(0, 0, 436, 273);
		contentPane.add(lblNewLabel_4);
	}
}
