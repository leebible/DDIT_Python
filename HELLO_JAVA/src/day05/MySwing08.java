package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing08 {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing08 window = new MySwing08();
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
	public MySwing08() {
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
		
		tf1 = new JTextField();
		tf1.setBounds(49, 41, 45, 21);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(163, 41, 45, 21);
		frame.getContentPane().add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(317, 41, 75, 21);
		frame.getContentPane().add(tf3);
		
		JLabel lblNewLabel = new JLabel("에서");
		lblNewLabel.setBounds(106, 44, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn = new JButton("까지 합은");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(220, 40, 85, 23);
		frame.getContentPane().add(btn);
	}
	
	void myclick() {
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		int sum = a;
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		
		tf3.setText(Integer.toString(sum));
//		tf3.setText(String.valueOf(sum));
//		tf3.setText(sum+"");
		
	}
}
