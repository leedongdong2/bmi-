package BMI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class BmiRecord extends JPanel {
	private JTable table;
	BmiController bc = new BmiController();
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	/**
	 * Create the panel.
	 */
	public BmiRecord() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAE30\uB85D\uC870\uD68C");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 26));
		lblNewLabel.setBounds(0, 23, 145, 31);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uC870\uD68C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<BmiS> list = bc.bmiSearch();
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.setRowCount(0);
				
				for(int i =0;i<list.size();i++) {
					BmiS b = list.get(i);
					String[] data = {b.getDate(),b.getId(),b.getAge(),b.getSex(),b.getBmi(),b.getBmick(),b.getBasic()};
					model.addRow(data);
				}
				
			}
		});
		btnNewButton.setBounds(328, 315, 95, 23);
		add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(0, 76, 435, 203);
		add(scrollPane);
		
	
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"\uB0A0\uC9DC", "\uC544\uC774\uB514", "\uB098\uC774", "\uC131\uBCC4", "\uBE44\uB9CC\uB3C4", "\uBE44\uB9CC\uC5EC\uBD80", "\uAE30\uCD08\uB300\uC0AC\uB7C9"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(105);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setPreferredWidth(46);
		table.getColumnModel().getColumn(3).setPreferredWidth(46);
		table.getColumnModel().getColumn(5).setPreferredWidth(70);
		scrollPane.setViewportView(table);
		add(getLblNewLabel_1());
		add(getLblNewLabel_2());

	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setOpaque(true);
			lblNewLabel_1.setBackground(SystemColor.inactiveCaption);
			lblNewLabel_1.setBounds(0, 278, 435, 87);
		}
		return lblNewLabel_1;
	}
	public JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setOpaque(true);
			lblNewLabel_2.setBackground(SystemColor.inactiveCaption);
			lblNewLabel_2.setBounds(0, 0, 435, 77);
		}
		return lblNewLabel_2;
	}
}
