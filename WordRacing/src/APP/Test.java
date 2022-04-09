package APP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Test.class.getResource("/APP/Image/keyboard_key_w (1).png")));
		setTitle("WordRacing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(51, 196, 338, 68);
		contentPane.add(textArea);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(51, 155, 338, 24);
		contentPane.add(progressBar);
		
		JTextPane txtpnWhileYouWere = new JTextPane();
		txtpnWhileYouWere.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnWhileYouWere.setText("While you were sleeping, you tossed, you turned. You rolled your eyes as the world burned. The heavens fell, the earth quaked. I thought you must be, but you weren't awake.");
		txtpnWhileYouWere.setBounds(25, 39, 389, 76);
		contentPane.add(txtpnWhileYouWere);
		
		JButton btnNewButton = new JButton("RePlay");
		btnNewButton.setBounds(256, 309, 92, 24);
		contentPane.add(btnNewButton);
		
		JButton btnStart = new JButton("Start!");
		btnStart.setBounds(98, 309, 92, 24);
		contentPane.add(btnStart);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setText(" 00:00:59");
		editorPane.setBounds(191, 10, 56, 19);
		contentPane.add(editorPane);
		
		JButton btnNewButton_1 = new JButton("< ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();//close login page
				HomePage hp = new HomePage();
				hp.show();
			}
		});
		btnNewButton_1.setBounds(25, 10, 48, 21);
		contentPane.add(btnNewButton_1);
	}
}
