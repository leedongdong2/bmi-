package BMI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class MainFrame extends JFrame {

	 JPanel contentPane;
MemberController mc = new MemberController();
Member m;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		
	
		m = new Member();
		m.setId("관리자");
		mc.members.add(m);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 436);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\uBA54\uB274");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\uD68C\uC6D0\uAC00\uC785");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				SignUp signup = new SignUp(MainFrame.this);
				contentPane.add(signup);
				contentPane.updateUI();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\uC815\uBCF4\uC218\uC815");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mc.log==true) {
				contentPane.removeAll();
				SignCange signcange = new SignCange();
				contentPane.add(signcange);
				contentPane.updateUI();
				}else {
					JOptionPane.showMessageDialog(MainFrame.this, "로그인해주셈");
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem logMenu = new JMenuItem("\uB85C\uADF8\uC778");
		logMenu.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(mc.log==true) {logMenu.setText("로그아웃");}
				else {logMenu.setText("로그인");}
			}
		});
		logMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Logi login = new Logi(MainFrame.this);
				Logout logout = new Logout(MainFrame.this);
				

				if(mc.log==false) {
				contentPane.removeAll();
				contentPane.add(login);
				contentPane.updateUI();
				
				} else if(mc.log==true){
					contentPane.removeAll();
					contentPane.add(logout);
					contentPane.updateUI();
				    
					
				}
			}
		});
		mnNewMenu.add(logMenu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\uAE30\uB85D\uC870\uD68C");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mc.log==true) {
				contentPane.removeAll();
				BmiRecord bimrecord = new BmiRecord();
				contentPane.add(bimrecord);
				contentPane.updateUI();
				}else {
					JOptionPane.showMessageDialog(MainFrame.this, "로그인해주셈");
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\uACC4\uC0B0\uAE30");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mc.log==true) {
				contentPane.removeAll();
				BMFrame bmi = new BMFrame();
				contentPane.add(bmi);
			    contentPane.updateUI();
				}else {
					JOptionPane.showMessageDialog(MainFrame.this, "로그인해주셈");
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.removeAll();
		contentPane.setLayout(new BorderLayout(0, 0));
		Logi login = new Logi(MainFrame.this);
		contentPane.add(login);
		contentPane.updateUI();
		
	
	
	}

}
