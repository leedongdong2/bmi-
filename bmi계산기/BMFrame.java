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
import java.awt.Color;
import javax.swing.ImageIcon;

public class BMFrame extends JPanel {
	private JTextField setage;
	private JTextField tfHeight;
	private JTextField tfWeight;
	private JTextField bmiresult2;
	private JTextField bmiResult;
	private JTextField setsex;
   MemberController mc = new MemberController();
   BmiController bc = new BmiController();
   BmiS b = new BmiS();
   private JTextField setbasic;
   private JLabel lblNewLabel_8;
 
	/**
	 * Create the panel.
	 */
	public BMFrame() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCE21\uC815");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 0, 67, 28);
		add(lblNewLabel);
		
		setage = new JTextField();
		setage.setBounds(91, 60, 106, 21);
		add(setage);
		setage.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uB098\uC774");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_1.setBounds(12, 61, 67, 18);
		add(lblNewLabel_1);
		
		tfHeight = new JTextField();
		tfHeight.setBounds(91, 91, 106, 21);
		add(tfHeight);
		tfHeight.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uD0A4");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_2.setBounds(12, 92, 52, 18);
		add(lblNewLabel_2);
		
		tfWeight = new JTextField();
		tfWeight.setBounds(91, 122, 106, 21);
		add(tfWeight);
		tfWeight.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uBAB8\uBB34\uAC8C");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_3.setBounds(12, 123, 52, 18);
		add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("\uC800\uC7A5\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				 SimpleDateFormat sf = new SimpleDateFormat("yy년MM월dd일");
				    String dateFormat = sf.format(date);
				    
		         b.setId(mc.target.getId());
		         b.setAge(setage.getText());
		         b.setSex(setsex.getText());
		         b.setHeight(tfHeight.getText());
		         b.setWeight(tfWeight.getText());
		         b.setBmi(bmiResult.getText());
		         b.setBmick(bmiresult2.getText());
		         b.setBasic(setbasic.getText());
		         b.setDate(dateFormat);
		         
		         
		         String msg = bc.append(b);
		         JOptionPane.showMessageDialog(BMFrame.this,msg);
			}
		});
		btnNewButton.setBounds(306, 153, 87, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCE21\uC815");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean agecheck = mc.ageCheck(setage.getText());
				boolean sexcheck = mc.sexCheck(setsex.getText());
				
				
				if(agecheck==false){
					JOptionPane.showMessageDialog(BMFrame.this, "나이는 20세부터 100세까지만 가능하세요~");
				}else if(sexcheck==false) {
					JOptionPane.showMessageDialog(BMFrame.this, "성별은 \"남\"또는\"여\"로만 입력가능합니다~");
				}else {
				 b.setHeight(tfHeight.getText());
				 b.setWeight(tfWeight.getText());
				String msg = bc.BmiCalculation(b);
				 bmiResult.setText(msg);
		 
				String msgsave = bmiResult.getText();
				String ckbmi = bc.bmick(msgsave);
				 bmiresult2.setText(ckbmi);
				 
				 b.setHeight(tfHeight.getText());
				 b.setWeight(tfWeight.getText());
				 b.setAge(setage.getText());
				 b.setSex(setsex.getText());
				 String msg1 = bc.BmiCalculation1(b);
				 setbasic.setText(msg1);
				}
				 
			}
		});
		btnNewButton_1.setBounds(116, 153, 81, 21);
		add(btnNewButton_1);
		
		bmiresult2 = new JTextField();
		bmiresult2.setEditable(false);
		bmiresult2.setBounds(306, 60, 106, 21);
		add(bmiresult2);
		bmiresult2.setColumns(10);
		
		bmiResult = new JTextField();
		bmiResult.setEditable(false);
		bmiResult.setBounds(306, 27, 106, 21);
		add(bmiResult);
		bmiResult.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("BMI");
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_4.setBounds(220, 28, 52, 18);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uBE44\uB9CC\uC5EC\uBD80");
		lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_5.setBounds(220, 61, 52, 18);
		add(lblNewLabel_5);
		
		setsex = new JTextField();
		setsex.setBounds(91, 27, 106, 21);
		add(setsex);
		setsex.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\uC131\uBCC4(\uB0A8,\uC5EC)");
		lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_6.setBounds(12, 27, 67, 21);
		add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 184, 450, 118);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(BMFrame.class.getResource("/BMI/424242.png")));
		lblNewLabel_7.setBounds(25, 0, 438, 118);
		panel.add(lblNewLabel_7);
		add(getSetbasic());
		add(getLblNewLabel_8());
		if(mc.log==true) {
			setsex.setText(mc.target.getSex());
			setage.setText(mc.target.getAge());
		}
       
	}
	public JTextField getSetbasic() {
		if (setbasic == null) {
			setbasic = new JTextField();
			setbasic.setEditable(false);
			setbasic.setBounds(306, 91, 106, 21);
			setbasic.setColumns(10);
		}
		return setbasic;
	}
	public JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("\uAE30\uCD08\uB300\uC0AC\uB7C9");
			lblNewLabel_8.setFont(new Font("굴림", Font.BOLD, 12));
			lblNewLabel_8.setBounds(220, 91, 80, 21);
		}
		return lblNewLabel_8;
	}
}
