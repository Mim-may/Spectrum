package data_project;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class SB extends JButton {

    private static final int SHADOW_SIZE = 50; // Shadow size in pixels
    private static final int BLUR_RADIUS = 10; // Blur radius in pixels

    public SB(String text) {
        super(text);
        setFocusable(false);
        setBorder(null);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Draw the circular shape of the button
        int diameter = Math.min(getWidth(), getHeight());
        Shape circle = new Ellipse2D.Double(0, 0, diameter, diameter);
        g2d.setColor(new Color(3,48,112));
        g2d.fill(circle);

        // Draw the blurred shadow around the button
        BufferedImage shadow = new BufferedImage(diameter + 2 * SHADOW_SIZE, diameter + 2 * SHADOW_SIZE, BufferedImage.TYPE_INT_ARGB);
        Graphics2D shadowGraphics = shadow.createGraphics();
        shadowGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        shadowGraphics.setColor(new Color(3, 48, 112, 255));

        shadowGraphics.fillOval(SHADOW_SIZE, SHADOW_SIZE, diameter, diameter);

        float[] blurKernel = new float[BLUR_RADIUS * 2 + 1];
        for (int i = 0; i < blurKernel.length; i++) {
            blurKernel[i] = 1.0f / blurKernel.length;
        }
        Kernel blur = new Kernel(blurKernel.length, 1, blurKernel);
        ConvolveOp blurOp = new ConvolveOp(blur, ConvolveOp.EDGE_NO_OP, null);
        shadow = blurOp.filter(shadow, null);

        g2d.drawImage(shadow, -SHADOW_SIZE, -SHADOW_SIZE, null);

        // Draw the text
        g2d.setColor(getForeground());
        FontMetrics fm = g2d.getFontMetrics();
        int textX = (diameter - fm.stringWidth(getText())) / 2;
        int textY = ((diameter - fm.getHeight()) / 2) + fm.getAscent();
        g2d.drawString(getText(), textX, textY);

        g2d.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Blur Shadow Button");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);

            JPanel panel = new JPanel(null); // Use null layout for manual positioning
            frame.add(panel);

            SB button = new SB("Button");
            button.setBounds(50, 50, 200, 200); // Set bounds to position the button
            button.setBackground(Color.BLUE);
            button.setForeground(Color.WHITE);
            panel.add(button);

            frame.setVisible(true);
        });
    }
}
