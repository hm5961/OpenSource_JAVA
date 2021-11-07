package chap9;

import javax.swing.*;

public class ex01 extends JFrame {
	ex01() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		ex01 mf = new ex01();
	}
}
