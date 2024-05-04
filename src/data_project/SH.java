package data_project;

import javax.swing.*;
import java.awt.*;

public class SH extends JButton {

    private int shadowSize = 10; // Size of the shadow

    public SH(Color shadowColor, float opacity) {
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(false);
        setBorder(null); // Remove the border of the button
        setBackground(new Color(shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), (int) (shadowColor.getAlpha() * opacity)));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the circular button
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(getBackground());
        g2d.fillOval(shadowSize, shadowSize, getWidth() - 2 * shadowSize, getHeight() - 2 * shadowSize);
        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        // Adjust size as needed
        return new Dimension(2 * shadowSize, 2 * shadowSize);
    }
}

