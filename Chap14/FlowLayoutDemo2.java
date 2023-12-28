package PracticeProblems.Chap14;

import javax.swing.*;
public class FlowLayoutDemo2 extends JFrame{
    FlowLayoutDemo2(){
        setTitle("플로우 레이아웃1");
        JPanel p = new JPanel();

        JButton [] b = { new JButton ("TEST 1"),  new JButton ("TEST 2"), new JButton ("TEST 3"),  new JButton ("TEST 4")};

        for (JButton button : b) {
            p.add(button);
        }

        add(p);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,110); // or pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo2();
    }
}
