package data_project;

import javax.swing.*;
import java.awt.*;

public class RoundedButton extends JButton {

    public RoundedButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(false);
        setLayout(new BorderLayout());

        // Create the RoundedPanel
        RoundedPanel roundedPanel = new RoundedPanel();
        roundedPanel.setBackground(Color.WHITE);
        roundedPanel.setPreferredSize(new Dimension(100, 50));

        // Add the RoundedPanel to the JButton
        add(roundedPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Rounded Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            RoundedButton roundedButton = new RoundedButton("Click me!");
            roundedButton.setPreferredSize(new Dimension(150, 70));

            JPanel panel = new JPanel(new FlowLayout());
            panel.setBackground(Color.DARK_GRAY);
            panel.add(roundedButton);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

