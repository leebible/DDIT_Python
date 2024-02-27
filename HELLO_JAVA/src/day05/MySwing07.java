package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing07 {

	private JFrame frame;
	JLabel lbl1;
	JLabel lbl2;
	JLabel lbl3;
	JLabel lbl4;
	JLabel lbl5;
	JLabel lbl6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing07 window = new MySwing07();
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
	public MySwing07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lbl1 = new JLabel("__");
		lbl1.setBounds(44, 46, 19, 15);
		frame.getContentPane().add(lbl1);
		
		lbl2 = new JLabel("__");
		lbl2.setBounds(91, 46, 19, 15);
		frame.getContentPane().add(lbl2);
		
		lbl3 = new JLabel("__");
		lbl3.setBounds(142, 46, 19, 15);
		frame.getContentPane().add(lbl3);
		
		lbl4 = new JLabel("__");
		lbl4.setBounds(194, 46, 19, 15);
		frame.getContentPane().add(lbl4);
		
		lbl5 = new JLabel("__");
		lbl5.setBounds(245, 46, 19, 15);
		frame.getContentPane().add(lbl5);
		
		lbl6 = new JLabel("__");
		lbl6.setBounds(301, 46, 19, 15);
		frame.getContentPane().add(lbl6);
		
		JButton btn = new JButton("로또출력하기");
		btn.setBounds(42, 88, 278, 23);
		frame.getContentPane().add(btn);
		
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
	}
	
	void myclick() {
		int arr[] = new int[6];
		for(int i=0; i<e)
		int rand = (int) (Math.random()*45)+1;
		String random = String.valueOf(rand);
		lbl1.setText(random);
	}
	
}
