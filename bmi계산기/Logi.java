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

public class Logi extends JPanel {
	private JTextField inId;
	private JTextField inPassWord;

	/**
	 * Create the panel.
	 */
	public Logi(MainFrame mf) {
		setBackground(new Color(205, 92, 92));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BMI \uACC4\uC0B0\uAE30");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setBounds(156, 64, 127, 41);
		add(lblNewLabel);
		
		inId = new JTextField();
		inId.setBounds(177, 134, 106, 21);
		add(inId);
		inId.setColumns(10);
		
		inPassWord = new JTextField();
		inPassWord.setBounds(177, 165, 106, 21);
		add(inPassWord);
		inPassWord.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(97, 137, 52, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(97, 168, 58, 15);
		add(lblNewLabel_2);
		
		JButton btnLog = new JButton("\uB85C\uADF8\uC778");
		btnLog.setBackground(new Color(255, 255, 0));
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				
				
				
				
				MemberController mc = new MemberController();
				if(mc.login(inId.getText(),inPassWord.getText())) {
				mf.contentPane.removeAll();
				BMFrame bmi = new BMFrame();
				mf.contentPane.add(bmi);
				mf.contentPane.updateUI();
				}else {
					JOptionPane.showMessageDialog(Logi.this,"아이디랑 비밀번호를 다시 확인해주세요");
				}
			
			
			
				
				
				
			}
		});
		btnLog.setBounds(173, 230, 95, 23);
		add(btnLog);
		
		JButton btnSignUp = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnSignUp.setBackground(new Color(0, 128, 0));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mf.contentPane.removeAll();
				SignUp signup = new SignUp(mf);
				mf.contentPane.add(signup);
				mf.contentPane.updateUI();
				
			}
		});
	
		btnSignUp.setBounds(173, 197, 95, 23);
		add(btnSignUp);

	}
}
