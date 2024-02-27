package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing09 {

	private JFrame frame;
	private JTextField tf_first;
	private JTextField tf_last;
	JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing09 window = new MySwing09();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MySwing09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 270, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_first = new JLabel("첫별수");
		lbl_first.setBounds(34, 47, 57, 15);
		frame.getContentPane().add(lbl_first);
		
		JLabel lbl_last = new JLabel("끝별수");
		lbl_last.setBounds(36, 88, 57, 15);
		frame.getContentPane().add(lbl_last);
		
		tf_first = new JTextField();
		tf_first.setBounds(133, 38, 83, 29);
		frame.getContentPane().add(tf_first);
		tf_first.setColumns(10);
		
		tf_last = new JTextField();
		tf_last.setColumns(10);
		tf_last.setBounds(133, 81, 83, 29);
		frame.getContentPane().add(tf_last);
		
		JButton btn = new JButton("별그리기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(36, 132, 180, 29);
		frame.getContentPane().add(btn);
		
		ta = new JTextArea();
		ta.setBounds(36, 184, 185, 280);
		frame.getContentPane().add(ta);
	}
	
	String getStar(int cnt) {
		String ret = "";
		for(int i=0; i<cnt; i++) {
			ret += "*";
		}
		ret += "\n";
		return ret;
	}
	
	void myclick() {
		int a = Integer.parseInt(tf_first.getText());
		int b = Integer.parseInt(tf_last.getText());

		String txt = "";
		
		for(int i=a; i<=b; i++) {
			txt += getStar(i);
		}
		
		ta.setText(txt);
	}
}
