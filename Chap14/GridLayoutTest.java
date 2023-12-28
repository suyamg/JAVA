package PracticeProblems.Chap14;

import javax.swing.*;
import java.awt.*;

public class GridLayoutTest extends JFrame {
    GridLayoutTest(){
        setLayout(new GridLayout());
        setTitle("그리드 테스트!");
        setLayout(new GridLayout(2,0));

        JPanel p = new JPanel();
        JPanel p2 = new JPanel();
        JLabel l = new JLabel("테스트1");
        JLabel l2 = new JLabel("테스트2");
        JButton b = new JButton("버튼1");
        JButton b2 = new JButton("버튼2");
        p.add(l);
        p.add(b);
        p2.add(l2);
        p2.add(b2);
        add(p);
        add(p2);

        setSize(200,120);
        setVisible(true);


    }

    public static void main(String[] args) {
        new GridLayoutTest();
    }
}
