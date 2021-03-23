package BMI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Button;
import javax.swing.ImageIcon;

public class Logi extends JPanel {
	private JTextField inId;
	private JTextField inPassWord;

	/**
	 * Create the panel.
	 */
	public Logi(MainFrame mf) {
		setBackground(Color.WHITE);
		setLayout(null);
		
		inId = new JTextField();
		inId.setBounds(222, 55, 167, 21);
		add(inId);
		inId.setColumns(10);
		
		inPassWord = new JTextField();
		inPassWord.setBounds(222, 117, 167, 21);
		add(inPassWord);
		inPassWord.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_1.setBounds(222, 27, 52, 18);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_2.setBounds(222, 87, 58, 18);
		add(lblNewLabel_2);
		
		JButton btnLog = new JButton("LogIn");
		btnLog.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		btnLog.setForeground(Color.WHITE);
		btnLog.setBackground(new Color(241, 57, 83));
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				
				
				
				
				MemberController mc = new MemberController();
				if(mc.login(inId.getText(),inPassWord.getText())) {
				mf.contentPane.removeAll();
				BMFrame bmi = new BMFrame();
				mf.contentPane.add(bmi);
				mf.contentPane.updateUI();
				}else {
					JOptionPane.showMessageDialog(Logi.this,"¾ÆÀÌµð¶û ºñ¹Ð¹øÈ£¸¦ ´Ù½Ã È®ÀÎÇØÁÖ¼¼¿ä");
				}
			
			
			
				
				
				
			}
		});
		btnLog.setBounds(222, 292, 167, 34);
		add(btnLog);
		
		JButton btnSignUp = new JButton("SignUp");
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBackground(SystemColor.textHighlight);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mf.contentPane.removeAll();
				SignUp signup = new SignUp(mf);
				mf.contentPane.add(signup);
				mf.contentPane.updateUI();
				
			}
		});
	
		btnSignUp.setBounds(222, 216, 167, 34);
		add(btnSignUp);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 190, 365);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("BMI Acalculator");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(12, 311, 190, 44);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Logi.class.getResource("/BMI/1111111.jpg")));
		lblNewLabel.setBounds(-22, -18, 271, 373);
		panel.add(lblNewLabel);

	}
}
