package day05;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing01 extends JFrame { //생성

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing01 frame = new MySwing01();
					frame.setVisible(true); //visible
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MySwing01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 354); //사이즈
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));//사이즈

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("Good Morning");
		lbl.setBounds(148, 45, 217, 84);
		contentPane.add(lbl);
		
		JButton btn = new JButton("Click");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("myclick");
				lbl.setText("Good Evening");
			}
		});
		btn.setBounds(337, 76, 135, 34);
		contentPane.add(btn);
		
		/*
		 * btn.addActionListener(new ActionListener(){ //익명클래스로 리스너 작성 public void
		 * actionPerformed(ActionEvent e){ lbl.setText("Good Evening"); } });
		 */
	}
}
