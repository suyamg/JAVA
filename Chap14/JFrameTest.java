package PracticeProblems.Chap14;

import javax.swing.*;

class JFrameTest extends JFrame{
    JFrameTest(){
        JPanel p = new JPanel();
        JLabel l = new JLabel("테스트 문자1");
        JLabel l2 = new JLabel("테스트 문자2");
        JButton b = new JButton("버튼1");
        JButton b2 = new JButton("버튼2");
        p.add(l);
        p.add(b);
        p.add(l2);
        p.add(b2);
        add(p);
        setTitle("JFrameTest");
        setSize(200,120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameTest();
    }
}
