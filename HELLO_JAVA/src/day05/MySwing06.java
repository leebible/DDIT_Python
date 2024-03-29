package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class MySwing06 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing06 frame = new MySwing06();
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
	public MySwing06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setBounds(33, 20, 233, 28);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(33, 64, 61, 36);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(116, 64, 61, 36);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(202, 64, 61, 36);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(33, 121, 61, 36);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(116, 121, 61, 36);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(202, 121, 61, 36);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(31, 180, 61, 36);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(115, 180, 61, 36);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(201, 180, 61, 36);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(31, 243, 61, 36);
		contentPane.add(btn0);
		
		JButton btnCall = new JButton("CALL");
		contentPane.add(btnCall);

		btnCall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mycall(e);
			}
		});
		
		btnCall.setBounds(114, 243, 149, 36);
		btn1.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}}); //	appendToTextField("1");
		btn2.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}}); //	appendToTextField("2");
		btn3.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}}); //	appendToTextField("3");
		btn4.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}}); //	appendToTextField("4");
		btn5.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}}); //	appendToTextField("5");
		btn6.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}}); //	appendToTextField("6");
		btn7.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}}); //	appendToTextField("7");
		btn8.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}}); //	appendToTextField("8");
		btn9.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}}); //	appendToTextField("9");
		btn0.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}}); //	appendToTextField("0");
	}
	
	void myclick(MouseEvent e) {
		JButton b = (JButton) e.getSource();
		String str_new = b.getText();
		String str_old = tf.getText();
		tf.setText(str_old+str_new);
	}
	
	void mycall(MouseEvent e) {
		String str_tel = tf.getText();
		JOptionPane.showMessageDialog(null, "calling"+str_tel);
	}
	
	
// 내가 짰던 코드
//	private void appendToTextField(String value) {
//		String current = tf.getText();
//		if(!current.isEmpty()) {
//			tf.setText(current+value);
//		}else {
//			tf.setText(value);
//		}
//	}

	
//	private void callclick() {
//		String number = tf.getText();
//		JOptionPane.showMessageDialog(null,"calling "+number);
//	}
	
	
}
