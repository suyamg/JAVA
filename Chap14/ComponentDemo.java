package PracticeProblems.Chap14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponentDemo extends JFrame {
    ComponentDemo() {
        setTitle("원 넓이 구하기");
        setLayout(new BorderLayout(10, 10));
        showNorth();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200); // Adjusted size for better visibility
        setVisible(true);
    }

    void showNorth() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

        JPanel panel = new JPanel(new GridLayout(4, 0));
        JLabel l1 = new JLabel("원의 반지름");
        JLabel l2 = new JLabel("원의 넓이");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField("이 영역에는 원의 넓이를 계산하는 과정이 나타납니다.", 35);

        JButton b = new JButton("계산");
        String[] color = {"red", "blue", "yellow"};
        JComboBox cb = new JComboBox(color);
        JButton b2 = new JButton("리셋");

        t2.setEnabled(false);
        p1.add(l1);
        p1.add(t1);

        p2.add(l2);
        p2.add(t2);

        p3.add(t3);

        p4.add(b);
        p4.add(cb);
        p4.add(b2);

        panel.add(p1);
        panel.add(p2);
        panel.add(p3);
        panel.add(p4);
        add(panel, BorderLayout.NORTH);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String radiusStr = t1.getText();
                double radius = Double.parseDouble(radiusStr);
                String area = Math.pow(radius, 2) + "π";
                t2.setText(area);
                t3.setText(radius + " x " + radius + " x " + "π = " + area);
            }
        });

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) cb.getSelectedItem();
                Color color;
                switch (selectedColor) {
                    case "red":
                        color = Color.RED;
                        break;
                    case "blue":
                        color = Color.BLUE;
                        break;
                    case "yellow":
                        color = Color.YELLOW;
                        break;
                    default:
                        color = null;
                        break;
                }
                getContentPane().setBackground(color);
                p1.setBackground(color);
                p2.setBackground(color);
                p3.setBackground(color);
                p4.setBackground(color);
                panel.setBackground(color);
            }
        });


        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                t3.setText("이 영역에는 원의 넓이를 계산하는 과정이 나타납니다.");
                getContentPane().setBackground(null);
                p1.setBackground(null);
                p2.setBackground(null);
                p3.setBackground(null);
                p4.setBackground(null);
                panel.setBackground(null);
            }
        });
    }

    public static void main(String[] args) {
        new ComponentDemo();
    }
}
