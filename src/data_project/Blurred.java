package data_project;

import javax.swing.*;
import java.awt.*;

public class Blurred extends JButton {

    private Color shadowColor = new Color(0, 49, 255, 50); // Semi-transparent blue color for shadow
    private int shadowSize = 10; // Size of the shadow
    private int radius = 100; // Radius of the circular button

    public Blurred(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(false);
        setBorder(null); // Remove the border of the button
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Draw the blurred shadow effect
        for (int i = shadowSize; i >= 1; i--) { // Draw layers of shadow, decreasing in size
            float opacity = i * 0.1f; // Adjust opacity as needed

            // Use shadow color with the same opacity degree for each layer
            g2d.setColor(new Color(shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), (int) (shadowColor.getAlpha() * opacity)));
            g2d.fillOval(-i, -i, getWidth() + 2 * i, getHeight() + 2 * i); // Draw larger circles for each layer
        }

        // Draw the circular button
        g2d.setColor(getBackground());
        g2d.fillOval(shadowSize, shadowSize, getWidth() - 2 * shadowSize, getHeight() - 2 * shadowSize);

        // Draw the text
        super.paintComponent(g2d);

        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(2 * radius + 2 * shadowSize, 2 * radius + 2 * shadowSize); // Adjust size as needed
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Blurred Shadow Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Blurred button = new Blurred("Click me!");
            button.setBackground(Color.WHITE); // Set the background color of the button
            button.setForeground(Color.BLACK);

            JPanel panel = new JPanel(new FlowLayout());
            panel.setBackground(Color.white);
            panel.add(button);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
