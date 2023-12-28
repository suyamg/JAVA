package PracticeProblems.Chap15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListenerMonseEx extends JFrame {
    ListenerMonseEx() {
        setTitle("ListenerMouseEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton btn = new JButton("MouseEvent");
        btn.setBackground(Color.YELLOW);
        btn.setOpaque(true);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JButton b = (JButton)e.getSource();
                b.setBackground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                JButton b = (JButton)e.getSource();
                b.setBackground(Color.YELLOW);
            }
        });

        c.add(btn);
        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListenerMonseEx();
    }
}
