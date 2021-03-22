package BMI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class BMFrame extends JPanel {
	private JTextField setage;
	private JTextField tfHeight;
	private JTextField tfWeight;
	private JTextField bmiresult2;
	private JTextField bmiResult;
	private JTextField setsex;
   MemberController mc;
   BmiController bc = new BmiController();
   BmiS b = new BmiS();
	/**
	 * Create the panel.
	 */
	public BMFrame() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uACC4\uC0B0\uD558\uAE30");
		lblNewLabel.setFont(new Font("±º∏≤", Font.PLAIN, 17));
		lblNewLabel.setBounds(198, 48, 74, 36);
		add(lblNewLabel);
		
		setage = new JTextField();
		setage.setBounds(246, 124, 106, 21);
		add(setage);
		setage.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uB098\uC774");
		lblNewLabel_1.setBounds(188, 127, 67, 15);
		add(lblNewLabel_1);
		
		tfHeight = new JTextField();
		tfHeight.setBounds(246, 157, 106, 21);
		add(tfHeight);
		tfHeight.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uD0A4");
		lblNewLabel_2.setBounds(198, 160, 52, 15);
		add(lblNewLabel_2);
		
		tfWeight = new JTextField();
		tfWeight.setBounds(246, 188, 106, 21);
		add(tfWeight);
		tfWeight.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uBAB8\uBB34\uAC8C");
		lblNewLabel_3.setBounds(182, 191, 52, 15);
		add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("\uC800\uC7A5\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				 SimpleDateFormat sf = new SimpleDateFormat("yy≥‚MMø˘dd¿œ");
				    String dateFormat = sf.format(date);
				    
		         b.setId(mc.target.getId());
		         b.setAge(setage.getText());
		         b.setSex(setsex.getText());
		         b.setHeight(tfHeight.getText());
		         b.setWeight(tfWeight.getText());
		         b.setBmi(bmiResult.getText());
		         b.setBmick(bmiresult2.getText());
		         b.setDate(dateFormat);
		         
		         String msg = bc.append(b);
		         JOptionPane.showMessageDialog(BMFrame.this,msg);
			}
		});
		btnNewButton.setBounds(209, 344, 95, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uACC4\uC0B0\uD558\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 b.setHeight(tfHeight.getText());
				 b.setWeight(tfWeight.getText());
				String msg = bc.BmiCalculation(b);
				 bmiResult.setText(msg);
				String msgsave = bmiResult.getText();
				String ckbmi = bc.bmick(msgsave);
				 bmiresult2.setText(ckbmi);
			}
		});
		btnNewButton_1.setBounds(209, 219, 95, 23);
		add(btnNewButton_1);
		
		bmiresult2 = new JTextField();
		bmiresult2.setEditable(false);
		bmiresult2.setBounds(246, 308, 106, 21);
		add(bmiresult2);
		bmiresult2.setColumns(10);
		
		bmiResult = new JTextField();
		bmiResult.setEditable(false);
		bmiResult.setBounds(246, 277, 106, 21);
		add(bmiResult);
		bmiResult.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("BMI");
		lblNewLabel_4.setBounds(167, 280, 52, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uBE44\uB9CC\uC5EC\uBD80");
		lblNewLabel_5.setBounds(167, 311, 52, 15);
		add(lblNewLabel_5);
		
		setsex = new JTextField();
		setsex.setBounds(246, 94, 106, 21);
		add(setsex);
		setsex.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\uC131\uBCC4(\uB0A8,\uC5EC)");
		lblNewLabel_6.setBounds(152, 94, 67, 15);
		add(lblNewLabel_6);
		if(mc.log==true) {
			setsex.setText(mc.target.getSex());
			setage.setText(mc.target.getAge());
		}
       
	}

}
