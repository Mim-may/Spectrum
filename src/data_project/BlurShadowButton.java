package data_project;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class BlurShadowButton extends JButton {

    public BlurShadowButton(String text) {
        super(text);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Draw the circular shape of the button
        int diameter = Math.min(getWidth(), getHeight());
        int radius = diameter / 2;
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;

        g2d.setColor(getBackground());
        g2d.fillOval(x, y, diameter, diameter);

        // Draw the blurred shadow around the button
        BufferedImage shadow = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D shadowGraphics = shadow.createGraphics();
        shadowGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        shadowGraphics.setColor(new Color(9, 87, 200, 100));

        int shadowSize = 50; // Adjust shadow size as needed
        int blurRadius = 10; // Adjust blur radius as needed

        shadowGraphics.fillOval(x - shadowSize, y - shadowSize, diameter + shadowSize * 2, diameter + shadowSize * 2);

        float[] blurKernel = new float[blurRadius * 2 + 1];
        for (int i = 0; i < blurKernel.length; i++) {
            blurKernel[i] = 1.0f / blurKernel.length;
        }
        Kernel blur = new Kernel(blurKernel.length, 1, blurKernel);
        ConvolveOp blurOp = new ConvolveOp(blur, ConvolveOp.EDGE_NO_OP, null);
        shadow = blurOp.filter(shadow, null);

        g2d.drawImage(shadow, 0, 0, null);

        // Draw the text
        g2d.setColor(getForeground());
        FontMetrics fm = g2d.getFontMetrics();
        int textX = (getWidth() - fm.stringWidth(getText())) / 2;
        int textY = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();
        g2d.drawString(getText(), textX, textY);

        g2d.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Blur Shadow Button");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(200, 200);

       
            JPanel panel = new JPanel(null); // Use null layout for manual positioning
            frame.add(panel);

            BlurShadowButton button = new BlurShadowButton("Button");
            button.setBounds(50, 50, 200, 200); // Set bounds to position the button
            button.setBackground(Color.BLUE);
            button.setForeground(Color.WHITE);
            panel.add(button);

            frame.setVisible(true);
        });
    }
}

