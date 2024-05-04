package data_project;

import javax.swing.*;
import java.awt.*;

public class GlowFilter {

    private float amount = 0.5f;

    public GlowFilter() {
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void applyGlow(JComponent component, Color glowColor) {
        Color originalColor = component.getBackground();
        float r = originalColor.getRed() / 255.0f;
        float g = originalColor.getGreen() / 255.0f;
        float b = originalColor.getBlue() / 255.0f;

        float a = 4 * amount;

        int rGlow = (int) (glowColor.getRed() * amount + r * (1 - amount) * 255);
        int gGlow = (int) (glowColor.getGreen() * amount + g * (1 - amount) * 255);
        int bGlow = (int) (glowColor.getBlue() * amount + b * (1 - amount) * 255);

        Color glow = new Color(rGlow, gGlow, bGlow);

        // Apply the glow effect to the component's background
        component.setBackground(glow);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Button with Glow");
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton button = new JButton("Click Me");
            GlowFilter glowFilter = new GlowFilter();
            button.setFocusable(false);
            button.setFocusPainted(false);
            button.setSize(200,200);
            glowFilter.applyGlow(button, Color.RED);

            JPanel panel = new JPanel(new FlowLayout());
            panel.add(button);
            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

