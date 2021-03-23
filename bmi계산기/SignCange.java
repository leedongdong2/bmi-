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
import java.awt.Color;
import javax.swing.ImageIcon;

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
		setBackground(Color.WHITE);
		
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC815\uBCF4\uC218\uC815");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 17));
		lblNewLabel.setBounds(204, 3, 81, 34);
		add(lblNewLabel);
		
		setid = new JTextField();
		setid.setEditable(false);
		setid.setBounds(316, 47, 106, 21);
		add(setid);
		setid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_1.setBounds(214, 47, 52, 21);
		add(lblNewLabel_1);
		
		setPassword = new JTextField();
		setPassword.setEditable(false);
		setPassword.setBounds(316, 78, 106, 21);
		add(setPassword);
		setPassword.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uAE30\uC874\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_2.setBounds(214, 78, 72, 21);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC0C8\uB85C\uC6B4 \uBE44\uBC00\uBC88\uD638");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_3.setBounds(214, 109, 95, 21);
		add(lblNewLabel_3);
		
		newPassword = new JTextField();
		newPassword.setBounds(316, 109, 106, 21);
		add(newPassword);
		newPassword.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uBE44\uBC00\uBC88\uD638\uCCB4\uD06C");
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_4.setBounds(214, 190, 95, 21);
		add(lblNewLabel_4);
		
		ckNewPassword = new JTextField();
		ckNewPassword.setBounds(316, 190, 106, 21);
		add(ckNewPassword);
		ckNewPassword.setColumns(10);
		
		setsex = new JTextField();
		setsex.setBounds(316, 221, 106, 21);
		add(setsex);
		setsex.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\uC131\uBCC4(\uB0A8,\uC5EC)");
		lblNewLabel_5.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_5.setBounds(214, 221, 72, 21);
		add(lblNewLabel_5);
		
		setAge = new JTextField();
		setAge.setBounds(316, 252, 106, 21);
		add(setAge);
		setAge.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\uB098\uC774");
		lblNewLabel_6.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_6.setBounds(214, 252, 52, 21);
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
	
		btnNewButton.setBounds(327, 332, 95, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_7.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_7.setBounds(214, 283, 52, 21);
		add(lblNewLabel_7);
		
		setEmail = new JTextField();
		setEmail.setBounds(316, 283, 106, 21);
		add(setEmail);
		setEmail.setColumns(10);
		add(getBtndelete());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 195, 365);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon(SignCange.class.getResource("/BMI/33333.jpg")));
		lblNewLabel_10.setBounds(-30, -48, 238, 453);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_8 = new JLabel("\uB300\uBB38\uC790, \uC18C\uBB38\uC790, \uD2B9\uC218\uBB38\uC790\uB97C \uBC18\uB4DC\uC2DC");
		lblNewLabel_8.setBounds(214, 140, 208, 15);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\uD3EC\uD568\uD55C (8~12)\uC790\uB9AC");
		lblNewLabel_9.setBounds(214, 165, 208, 15);
		add(lblNewLabel_9);
		
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
					int result =  JOptionPane.showConfirmDialog(SignCange.this,"¸ðµç Á¤º¸°¡ Áö¿öÁý´Ï´Ù!Á¤¸»·Î »èÁ¦ÇÏ½Ã°Ú½À´Ï°¡?","»èÁ¦Ã¢", JOptionPane.YES_NO_OPTION);
					if(result==JOptionPane.YES_OPTION) {
						bm.bmiDelet();
						msg = mc.delete();
						JOptionPane.showMessageDialog(SignCange.this,msg);
					}
				}
			});
			btndelete.setBounds(204, 332, 95, 23);
		}
		return btndelete;
	}
}
