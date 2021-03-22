package BMI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logout extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnLogout;
   MemberController mc = new MemberController();
	/**
	 * Create the panel.
	 */
	public Logout(MainFrame mf) {
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getBtnLogout());

	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uB85C\uADF8\uC778\uC911\uC785\uB2C8\uB2E4");
			lblNewLabel.setBounds(181, 102, 113, 32);
		}
		return lblNewLabel;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uB85C\uADF8\uC544\uC6C3\uD558\uC2DC\uAC9F\uC5B4\uC694?");
			lblNewLabel_1.setBounds(168, 133, 161, 32);
		}
		return lblNewLabel_1;
	}
	public JButton getBtnLogout() {
		if (btnLogout == null) {
			btnLogout = new JButton("\uB85C\uADF8\uC544\uC6C3");
			btnLogout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mc.log = false;
					JOptionPane.showMessageDialog(Logout.this,"로그아웃되셧어오 로그인으로 다시 가세요");
				}
			});
			btnLogout.setBounds(182, 186, 97, 23);
		}
		return btnLogout;
	}
}
