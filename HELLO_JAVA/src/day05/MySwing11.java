package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing11 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	JTextArea ta;
	int com;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing11 frame = new MySwing11();
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
	public MySwing11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("숫자(1~100)");
		lbl.setBounds(40, 33, 89, 15);
		contentPane.add(lbl);
		
		tf = new JTextField();
		tf.setBounds(141, 30, 69, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btn = new JButton("숫자 맞추기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(40, 58, 170, 33);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(40, 101, 170, 338);
		contentPane.add(ta);
		
		setComByRandom();
	}
	
	
	private void setComByRandom() {
		com = (int) (Math.random()*100)+1;
		System.out.println(com);
		
	}

	void myclick() {
		String str_old = ta.getText();
		String str_mine = tf.getText();
		int user = Integer.parseInt(str_mine);
		String txt="";
			if(user<com) {
				txt += user+"\t"+"UP"+"\n";
			}else if(user>com){
				txt += user+"\t"+"Down"+"\n";
			}else if(user==com){
				txt += user+"\t"+"정답!"+"\n";
			}
			ta.setText(str_old+txt);
			tf.setText("");
		
	}

}
