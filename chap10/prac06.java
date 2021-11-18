package chap10;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class prac06 extends JFrame{
    private JLabel la = new JLabel("C");
    public prac06(){
        super("클릭 연습 용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Container c = getContentPane();
        c.setLayout(null);
 
        c.add(la);
        la.setLocation(100, 100);
        la.setSize(30, 30); // 레이아웃 null일때는 꼭 사이즈를 정해줘야 한다.
 
        la.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int x = (int)(Math.random()*(c.getWidth()-50));
                int y = (int)(Math.random()*(c.getHeight()-50));
                la.setLocation(x, y);
            }
        });
 
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args){
        new prac06();
    }
}