package PracticeProblems.Chap14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C2FConverterTset extends JFrame {
    C2FConverterTset() {
        setLayout(new BorderLayout());
        setTitle("섭씨 -> 화씨 변환");
        JPanel p = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JLabel l1 = new JLabel("섭씨");
        JTextField cTemp = new JTextField(10);
        JLabel l2 = new JLabel("화씨");
        JTextField fTemp = new JTextField(10);
        // Added a JTextField to display Fahrenheit
        JButton b = new JButton("변환");

        // Add ActionListener to the button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the Celsius temperature from the text field
                double celsius = Double.parseDouble(cTemp.getText());

                // Convert Celsius to Fahrenheit
                double fahrenheit = celsiusToFahrenheit(celsius);

                // Display the result in the Fahrenheit text field
                fTemp.setText(String.valueOf(fahrenheit));
            }
        });

        p.add(l1);
        p.add(cTemp);
        p1.add(b);
        p2.add(l2);
        p2.add(fTemp);

        add("North",p);
        add("South",p1);
        add("Center",p2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 140);
        setVisible(true);
    }

    // Celsius to Fahrenheit conversion method
    private double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        new C2FConverterTset();
    }
}
