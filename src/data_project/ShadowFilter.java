package data_project;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class ShadowFilter {

    private int radius = 5;
    private int xOffset = 5;
    private int yOffset = 5;
    private float opacity = 0.5f;
    private Color shadowColor = new Color(0, 0, 0, 128);

    public ShadowFilter() {
    }

    public ShadowFilter(int radius, int xOffset, int yOffset, float opacity, Color shadowColor) {
        this.radius = radius;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.opacity = opacity;
        this.shadowColor = shadowColor;
    }

    public void applyShadow(JButton button) {
        Dimension size = button.getPreferredSize();
        Insets insets = button.getInsets();

        // Adjust button size to accommodate the shadow
        int width = size.width + 2 * radius + Math.abs(xOffset);
        int height = size.height + 2 * radius + Math.abs(yOffset);

        button.setSize(width, height);

        // Create a shadow effect by setting the button's border
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(radius - yOffset, radius - xOffset, radius + yOffset, radius + xOffset),
                BorderFactory.createLineBorder(shadowColor, radius)
        ));

        // Set opacity of the shadow
        button.setBackground(new Color(255, 255, 255, (int) (opacity * 255)));
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getXOffset() {
        return xOffset;
    }

    public void setXOffset(int xOffset) {
        this.xOffset = xOffset;
    }

    public int getYOffset() {
        return yOffset;
    }

    public void setYOffset(int yOffset) {
        this.yOffset = yOffset;
    }

    public float getOpacity() {
        return opacity;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

    public Color getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Button with Shadow");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton button = new JButton("Click Me");
            button.setFocusable(false);
            button.setFocusPainted(false);
            ShadowFilter shadowFilter = new ShadowFilter(10, 5, 5, 0.5f, new Color(0, 0, 0, 128));
            shadowFilter.applyShadow(button);

            JPanel panel = new JPanel(new FlowLayout());
            panel.add(button);
            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

