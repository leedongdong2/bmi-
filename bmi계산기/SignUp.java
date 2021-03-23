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
import javax.swing.ImageIcon;

public class SignUp extends JPanel {
	 JTextField newId;
	 JTextField newPassword;
	 JTextField ckPassword;
	 JTextField newAge;
	 JTextField newSex;
	 JTextField newEmail;
MemberController mc = new MemberController();
Idcheck check = new Idcheck();
private JLabel lblNewLabel_7;
private JLabel lblNewLabel_8;
private JLabel lblNewLabel_9;
	/**
	 * Create the panel.
	 */
	public SignUp(MainFrame mf) {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setFont(new Font("±º∏≤", Font.BOLD, 16));
		lblNewLabel.setBounds(207, 0, 103, 25);
		add(lblNewLabel);
		
		newId = new JTextField();
		newId.setBounds(304, 32, 106, 21);
		add(newId);
		newId.setColumns(10);
		
		newPassword = new JTextField();
		newPassword.setBounds(304, 118, 106, 21);
		add(newPassword);
		newPassword.setColumns(10);
		
		ckPassword = new JTextField();
		ckPassword.setBounds(304, 191, 106, 21);
		add(ckPassword);
		ckPassword.setColumns(10);
		
		newAge = new JTextField();
		newAge.setBounds(304, 222, 106, 21);
		add(newAge);
		newAge.setColumns(10);
		
		newSex = new JTextField();
		newSex.setBounds(304, 253, 106, 21);
		add(newSex);
		newSex.setColumns(10);
		
		newEmail = new JTextField();
		newEmail.setBounds(304, 284, 106, 21);
		add(newEmail);
		newEmail.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.BOLD, 12));
		lblNewLabel_1.setBounds(207, 35, 85, 15);
		add(lblNewLabel_1);
		
		JButton btnIdCheck = new JButton("\uC911\uBCF5\uD655\uC778");
		btnIdCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
				check.setId(newId.getText());
				Idcheck ck = mc.idCheck(check);
				if(ck.check==true) {
					JOptionPane.showMessageDialog(SignUp.this,ck.getMsg());
				}else{
					JOptionPane.showMessageDialog(SignUp.this,ck.getMsg());
				}
				
			}
		});
		
		btnIdCheck.setBounds(304, 85, 106, 23);
		add(btnIdCheck);
		
		JButton btnSignUp = new JButton("SignUp");
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBackground(SystemColor.textHighlight);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if(check.check==true) {
			Member m = new Member();
			m.setId(newId.getText());
            m.setPassword(newPassword.getText());
            m.setSex(newSex.getText());
            m.setAge(newAge.getText());
            m.setEmail(newEmail.getText());
           MemberController mc = new MemberController();
           String msg = mc.append(m,SignUp.this);
           JOptionPane.showMessageDialog(SignUp.this,msg);
			}else {
				 JOptionPane.showMessageDialog(SignUp.this,"æ∆¿Ãµ√º≈©∏¶ ∏’¿˙«ÿ¡÷ººø‰");
			}
          
				
			}
		});
		btnSignUp.setBounds(327, 326, 83, 25);
		add(btnSignUp);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_2.setFont(new Font("±º∏≤", Font.BOLD, 12));
		lblNewLabel_2.setBounds(207, 121, 85, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_3.setFont(new Font("±º∏≤", Font.BOLD, 12));
		lblNewLabel_3.setBounds(207, 194, 83, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uB098\uC774");
		lblNewLabel_4.setFont(new Font("±º∏≤", Font.BOLD, 12));
		lblNewLabel_4.setBounds(207, 225, 69, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uC131\uBCC4(\uB0A8,\uC5EC)");
		lblNewLabel_5.setFont(new Font("±º∏≤", Font.BOLD, 12));
		lblNewLabel_5.setBounds(207, 256, 69, 15);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_6.setFont(new Font("±º∏≤", Font.BOLD, 12));
		lblNewLabel_6.setBounds(207, 287, 69, 15);
		add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 195, 365);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon(SignUp.class.getResource("/BMI/222222.jpg")));
		lblNewLabel_10.setBounds(-93, 0, 288, 365);
		panel.add(lblNewLabel_10);
		add(getLblNewLabel_7());
		add(getLblNewLabel_8());
		add(getLblNewLabel_9());

	}
	public JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uB300\uBB38\uC790, \uC18C\uBB38\uC790, \uD2B9\uC218\uBB38\uC790\uB97C \uBC18\uB4DC\uC2DC");
			lblNewLabel_7.setBounds(207, 146, 203, 15);
		}
		return lblNewLabel_7;
	}
	public JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("\uD3EC\uD568\uD55C (8~12)\uC790\uB9AC");
			lblNewLabel_8.setBounds(207, 166, 203, 15);
		}
		return lblNewLabel_8;
	}
	public JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("\uC601\uC5B4, \uC22B\uC790 (6~12)\uC790\uB9AC");
			lblNewLabel_9.setBounds(207, 60, 203, 15);
		}
		return lblNewLabel_9;
	}
}
