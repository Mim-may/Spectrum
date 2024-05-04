package data_project;

import javax.swing.*;
import java.awt.*;

public class B extends JButton {

    private Color shadowColor = new Color(0, 49, 255, 50); // Semi-transparent blue color for shadow
    private int shadowSize = 10; // Size of the shadow

    public B(String text) {
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

        // Get insets to avoid cropping the shadow
        Insets insets = getInsets();

        // Draw the blurred shadow effect
        for (int i = shadowSize; i >= 1; i--) { // Draw layers of shadow, decreasing in size
            float opacity = i * 0.1f; // Adjust opacity as needed

            // Use shadow color with the same opacity degree for each layer
            g2d.setColor(new Color(shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), (int) (shadowColor.getAlpha() * opacity)));
            g2d.fillRoundRect(-i + insets.left, -i + insets.top, getWidth() + 2 * i, getHeight() + 2 * i, 200, 200); // Draw larger rounded rectangles for each layer
        }

        // Draw the circular button
        g2d.setColor(getBackground());
        g2d.fillOval(insets.left, insets.top, getWidth() - 2 * insets.left, getHeight() - 2 * insets.top);

        // Draw the text
        super.paintComponent(g2d);

        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(50, 50); // Adjust size as needed
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Blurred Shadow Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            B button = new B("Click me!");
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

