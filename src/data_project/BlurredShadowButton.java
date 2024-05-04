package data_project;

import javax.swing.*;
import java.awt.*;

public class BlurredShadowButton extends JButton {

    private Color shadowColor = new Color(9, 87, 200, 50); // Semi-transparent blue color for shadow

    public BlurredShadowButton(String text) {
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
        for (int i = 10; i >= 1; i--) { // Draw 10 layers of shadow, decreasing in opacity
            float opacity = i * 0.1f; // Adjust opacity as needed

            // Use shadow color with the same opacity degree for each layer
            g2d.setColor(new Color(shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), (int) (shadowColor.getAlpha() * opacity)));
            g2d.fillOval(-i, -i, getWidth() + 2 * i, getHeight() + 2 * i); // Draw larger circles for each layer
        }

        // Draw the circular button
        g2d.setColor(getBackground());
        g2d.fillOval(0, 0, getWidth(), getHeight());

        // Draw the text
        super.paintComponent(g2d);

        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100); // Adjust size as needed
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Blurred Shadow Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            BlurredShadowButton button = new BlurredShadowButton("Click me!");
            button.setBackground(Color.cyan); // Set the background color of the button
            button.setForeground(Color.white);

            JPanel panel = new JPanel(new FlowLayout());
            Insets insets = new Insets(10, 20, 10, 20); // top, left, bottom, right
            panel.setBorder(BorderFactory.createEmptyBorder(insets.top, insets.left, insets.bottom, insets.right));
            panel.setBackground(Color.DARK_GRAY);
            panel.add(button);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
