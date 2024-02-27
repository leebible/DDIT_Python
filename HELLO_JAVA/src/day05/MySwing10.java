package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing10 {

	private JFrame frame;
	private JTextField tf_mine;
	private JTextField tf_com;
	private JTextField tf_res;
	JLabel lbl_mine;
	JLabel lbl_com;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing10 window = new MySwing10();
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
	public MySwing10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 291, 265);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lbl_mine = new JLabel("나 :");
		lbl_mine.setBounds(36, 28, 57, 15);
		frame.getContentPane().add(lbl_mine);
		
		lbl_com = new JLabel("컴 :");
		lbl_com.setBounds(36, 70, 57, 15);
		frame.getContentPane().add(lbl_com);
		
		JLabel lbl_res = new JLabel("결과 :");
		lbl_res.setBounds(36, 115, 57, 15);
		frame.getContentPane().add(lbl_res);
		
		tf_mine = new JTextField();
		tf_mine.setBounds(108, 25, 116, 21);
		frame.getContentPane().add(tf_mine);
		tf_mine.setColumns(10);
		
		tf_com = new JTextField();
		tf_com.setColumns(10);
		tf_com.setBounds(108, 67, 116, 21);
		frame.getContentPane().add(tf_com);
		
		tf_res = new JTextField();
		tf_res.setColumns(10);
		tf_res.setBounds(108, 112, 116, 21);
		frame.getContentPane().add(tf_res);
		
		JButton btn = new JButton("게임하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(36, 159, 188, 44);
		frame.getContentPane().add(btn);
	}
	
	void myclick(){
//		String mine = "";
//		String com = "";
//		String result ="";
//		
//		mine = tf_mine.getText();
//		
//		double rnd = Math.random();
		
		
		
		String user="";
		String com ="";
		String result ="";
		
		user = tf_mine.getText();
		
		int rand = (int) (Math.random()*100);
		if (rand>66) com = "가위";
		else if (rand>33) com = "바위";
		else com = "보";
		
		if (user.equals(com)) result = "비김";
		else if (user.equals("가위") && com.equals("보") || user.equals("바위") && com.equals("가위") 
				|| user.equals("보") && com.equals("바위")) result = "이김";
		else result = "짐";
		
		tf_com.setText(com);
		tf_res.setText(result);
		
		
	}
	

}
