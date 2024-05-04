package data_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Example {
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Panel Example");
            JButton b1 = new JButton("HI");
            b1.setBackground(new Color(150, 59, 230));
            b1.setForeground(Color.white);
            b1.setFocusable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel mainPanel = new JPanel(); // Main content panel
            mainPanel.setLayout(new BorderLayout());

            JPanel upperPanel = new JPanel(); // Upper panel
            upperPanel.setBackground(Color.BLUE);
            upperPanel.setPreferredSize(new Dimension(400, 200));
            upperPanel.add(b1, "w 40% , h 40");

            JPanel lowerPanel = new JPanel(); // Lower panel
            lowerPanel.setBackground(Color.RED);
            lowerPanel.setPreferredSize(new Dimension(400, 200));

            mainPanel.add(upperPanel, BorderLayout.NORTH);
            mainPanel.add(lowerPanel, BorderLayout.SOUTH);

            frame.getContentPane().add(mainPanel);
            
            frame.setSize(400, 400);
            frame.setVisible(true);
        });
    }
}
