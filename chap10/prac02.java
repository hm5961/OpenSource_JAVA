package chap10;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
 
public class prac02 extends JFrame{
    public prac02(){
        super("µå·¡±ëµ¿¾È YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Container c = getContentPane();
        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                Component c = (Component)e.getSource();
                c.setBackground(Color.GREEN);
            }
        });
        c.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                Component c = (Component)e.getSource();
                c.setBackground(Color.yellow);
            }
        });
        c.setBackground(Color.GREEN);
 
        setSize(300, 150);
        setVisible(true);
    }
    public static void main(String[] args){
        new prac02();
    }
}

