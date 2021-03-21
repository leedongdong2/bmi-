package BMI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BmiRecord extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public BmiRecord() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAE30\uB85D\uC870\uD68C");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel.setBounds(206, 55, 75, 19);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uC870\uD68C");
		btnNewButton.setBounds(358, 300, 95, 23);
		add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 99, 292, 181);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
}
