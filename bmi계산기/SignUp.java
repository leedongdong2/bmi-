package BMI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JPanel {
	 JTextField newId;
	 JTextField newPassword;
	 JTextField ckPassword;
	 JTextField newAge;
	 JTextField newSex;
	 JTextField newEmail;

	/**
	 * Create the panel.
	 */
	public SignUp(MainFrame mf) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel.setBounds(178, 84, 103, 25);
		add(lblNewLabel);
		
		newId = new JTextField();
		newId.setBounds(211, 128, 106, 21);
		add(newId);
		newId.setColumns(10);
		
		newPassword = new JTextField();
		newPassword.setBounds(211, 159, 106, 21);
		add(newPassword);
		newPassword.setColumns(10);
		
		ckPassword = new JTextField();
		ckPassword.setBounds(211, 190, 106, 21);
		add(ckPassword);
		ckPassword.setColumns(10);
		
		newAge = new JTextField();
		newAge.setBounds(211, 224, 106, 21);
		add(newAge);
		newAge.setColumns(10);
		
		newSex = new JTextField();
		newSex.setBounds(211, 255, 106, 21);
		add(newSex);
		newSex.setColumns(10);
		
		newEmail = new JTextField();
		newEmail.setBounds(211, 286, 106, 21);
		add(newEmail);
		newEmail.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setBounds(131, 131, 52, 15);
		add(lblNewLabel_1);
		
		JButton btnIdCheck = new JButton("\uC544\uC774\uB514\uC911\uBCF5\uD655\uC778");
		btnIdCheck.setBounds(329, 127, 125, 23);
		add(btnIdCheck);
		
		JButton btnSignUp = new JButton("\uAC00\uC785");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Member m = new Member();
			m.setId(newId.getText());
            m.setPassword(newPassword.getText());
            m.setSex(newSex.getText());
            m.setAge(newAge.getText());
            m.setEmail(newEmail.getText());
           MemberController mc = new MemberController();
           String msg = mc.append(m,SignUp.this);
           JOptionPane.showMessageDialog(SignUp.this,msg);
				
			}
		});
		btnSignUp.setBounds(339, 311, 83, 32);
		add(btnSignUp);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_2.setBounds(131, 162, 52, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_3.setBounds(100, 193, 83, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uB098\uC774");
		lblNewLabel_4.setBounds(147, 227, 52, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uC131\uBCC4(\uB0A8,\uB140)");
		lblNewLabel_5.setBounds(114, 258, 69, 15);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_6.setBounds(131, 289, 52, 15);
		add(lblNewLabel_6);

	}

}
