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

public class BmiRecord extends JPanel {
	private JTable table;
	BmiController bc = new BmiController();
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<BmiS> list = bc.bmiSearch();
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.setRowCount(0);
				
				for(int i =0;i<list.size();i++) {
					BmiS b = list.get(i);
					String[] data = {b.getDate(),b.getId(),b.getAge(),b.getSex(),b.getBmi(),b.getBmick()};
					model.addRow(data);
				}
				
			}
		});
		btnNewButton.setBounds(390, 318, 95, 23);
		add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 97, 431, 193);
		add(scrollPane);
		
	
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"\uB0A0\uC9DC", "\uC544\uC774\uB514", "\uB098\uC774", "\uC131\uBCC4", "\uBE44\uB9CC\uB3C4", "\uBE44\uB9CC\uC5EC\uBD80"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(130);
		scrollPane.setViewportView(table);

	}
}
