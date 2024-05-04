package data_project;

import javax.swing.*;
import java.awt.*;

public class InsetsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Insets Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton button = new JButton("Button");
        button.setFocusable(false);
       // button.setBorder(null);
        panel.add(button, BorderLayout.CENTER);

        // Set insets to provide padding around the button
        Insets insets = new Insets(10, 20, 10, 20); // top, left, bottom, right
        panel.setBorder(BorderFactory.createEmptyBorder(insets.top, insets.left, insets.bottom, insets.right));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

