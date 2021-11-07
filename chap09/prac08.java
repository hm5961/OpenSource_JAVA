package chap9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame7 extends JFrame {
	public MyFrame7() {
		setTitle("�������� �г��� ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel top = new JPanel();
		top.setLayout(new FlowLayout());
		top.setBackground(Color.LIGHT_GRAY);
		top.add(new JButton("����"));
		top.add(new JButton("�ݱ�"));
		top.add(new JButton("������"));

		c.add(top, BorderLayout.NORTH);

		JPanel center = new JPanel();
		center.setLayout(null);

		for (int i = 0; i < 10; i++) {
			int x = (int) (Math.random() * 200) + 50;
			int y = (int) (Math.random() * 200) + 50;
			JLabel l = new JLabel("*");
			l.setBounds(x, y, 10, 10);
			l.setOpaque(true);
			l.setBackground(Color.red);
			center.add(l);
		}

		c.add(center, BorderLayout.CENTER);

		JPanel bottom = new JPanel();
		bottom.setLayout(new FlowLayout());
		bottom.setBackground(Color.yellow);
		bottom.add(new JButton("Word Input"));
		bottom.add(new JTextField(" ", 20));
		c.add(bottom, BorderLayout.SOUTH);

		setSize(600, 400);
		setVisible(true);
	}
}

public class prac08 {
	public static void main(String[] args) {
		new MyFrame7();
	}
}
