package BMI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class SignCange extends JPanel {
	JTextField setid;
	JTextField setPassword;
	JTextField newPassword;
	JTextField ckNewPassword;
	JTextField setsex;
	JTextField setAge;
    JTextField setEmail;
    MemberController mc = new MemberController();
    Member m = new Member();
    BmiController bm = new BmiController(); 
    private JButton btndelete;
	/**
	 * Create the panel.
	 */
	public SignCange() {
		
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC815\uBCF4\uC218\uC815");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel.setBounds(190, 39, 117, 34);
		add(lblNewLabel);
		
		setid = new JTextField();
		setid.setEditable(false);
		setid.setBounds(200, 92, 106, 21);
		add(setid);
		setid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(170, 95, 52, 15);
		add(lblNewLabel_1);
		
		setPassword = new JTextField();
		setPassword.setEditable(false);
		setPassword.setBounds(201, 123, 106, 21);
		add(setPassword);
		setPassword.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uAE30\uC874\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_2.setBounds(112, 126, 72, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC0C8\uB85C\uC6B4 \uBE44\uBC00\uBC88\uD638");
		lblNewLabel_3.setBounds(89, 153, 95, 15);
		add(lblNewLabel_3);
		
		newPassword = new JTextField();
		newPassword.setBounds(200, 150, 106, 21);
		add(newPassword);
		newPassword.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uBE44\uBC00\uBC88\uD638\uCCB4\uD06C");
		lblNewLabel_4.setBounds(112, 184, 72, 15);
		add(lblNewLabel_4);
		
		ckNewPassword = new JTextField();
		ckNewPassword.setBounds(201, 181, 106, 21);
		add(ckNewPassword);
		ckNewPassword.setColumns(10);
		
		setsex = new JTextField();
		setsex.setBounds(201, 216, 106, 21);
		add(setsex);
		setsex.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\uC131\uBCC4(\uB0A8,\uC5EC)");
		lblNewLabel_5.setBounds(125, 219, 72, 15);
		add(lblNewLabel_5);
		
		setAge = new JTextField();
		setAge.setBounds(201, 247, 106, 21);
		add(setAge);
		setAge.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\uB098\uC774");
		lblNewLabel_6.setBounds(153, 250, 52, 15);
		add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("\uC815\uBCF4\uC218\uC815");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    m.setId(setid.getText());
				m.setPassword(newPassword.getText());
		        m.setSex(setsex.getText());
		        m.setAge(setAge.getText());
		        m.setEmail(setEmail.getText());
	         
				String msg = mc.upDate(m,SignCange.this);
			
				 JOptionPane.showMessageDialog(SignCange.this,msg);				
			}
		});
	
		btnNewButton.setBounds(322, 307, 95, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_7.setBounds(145, 281, 52, 15);
		add(lblNewLabel_7);
		
		setEmail = new JTextField();
		setEmail.setBounds(200, 278, 106, 21);
		add(setEmail);
		setEmail.setColumns(10);
		add(getBtndelete());
		
		if(mc.log==true) {
		    setid.setText(mc.target.getId());
		    setPassword.setText(mc.target.getPassword());
		    setsex.setText(mc.target.getSex());
		    setAge.setText(mc.target.getAge());
		    setEmail.setText(mc.target.getEmail());
			}
	
	}
	public JButton getBtndelete() {
		if (btndelete == null) {
			btndelete = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
			btndelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String msg;
					int result =  JOptionPane.showConfirmDialog(SignCange.this,"모든 정보가 지워집니다!정말로 삭제하시겠습니가?","삭제창", JOptionPane.YES_NO_OPTION);
					if(result==JOptionPane.YES_OPTION) {
						bm.bmiDelet();
						msg = mc.delete();
						JOptionPane.showMessageDialog(SignCange.this,msg);
					}
				}
			});
			btndelete.setBounds(67, 307, 81, 23);
		}
		return btndelete;
	}
}
