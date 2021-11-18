package chap10;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
 
public class prac04 extends JFrame{
    private JLabel la = new JLabel("Love Java");
    public prac04(){
        super("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Container c = getContentPane();
        c.add(la);
 
        c.setLayout(new FlowLayout());
 
        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                if(keyCode == KeyEvent.VK_LEFT){
                    String str = la.getText().substring(0, 1);
                    la.setText(la.getText().substring(1) + str);
                }
            }
        });
 
        setSize(300, 150);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    public static void main(String[] args){
        new prac04();
    }
}
