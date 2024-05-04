package data_project;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class CircularShadowButton extends JButton {

    private int shadowSize = 20; // Size of the shadow

    public CircularShadowButton(String text) {
        super(text);
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Draw the shadow
        BufferedImage shadow = new BufferedImage(getWidth() + shadowSize * 2, getHeight() + shadowSize * 2, BufferedImage.TYPE_INT_ARGB);
        Graphics2D shadowGraphics = shadow.createGraphics();
        shadowGraphics.setColor(new Color(3, 48, 112, 100)); // Adjust transparency as needed
        shadowGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        shadowGraphics.fill(new Ellipse2D.Double(shadowSize, shadowSize, getWidth(), getHeight()));
        shadowGraphics.dispose();

        // Apply blur effect to the shadow
        float[] blurKernel = {
                1/16f, 1/8f, 1/16f,
                1/8f, 1/4f, 1/8f,
                1/16f, 1/8f, 1/16f
        };
        ConvolveOp blur = new ConvolveOp(new Kernel(3, 3, blurKernel), ConvolveOp.EDGE_NO_OP, null);
        BufferedImage blurredShadow = blur.filter(shadow, null);

        // Draw the blurred shadow
        g2d.drawImage(blurredShadow, -shadowSize, -shadowSize, null);

        // Draw the button
        g2d.setColor(new Color(3,48,112));
        g2d.fillOval(0, 0, getWidth(), getHeight());
     //   g2d.setColor(new Color());
        g2d.drawOval(0, 0, getWidth() - 1, getHeight() - 1);

        // Draw the text
        super.paintComponent(g2d);

        g2d.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Do not paint border
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100); // Adjust button size as needed
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circular Shadow Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        CircularShadowButton button = new CircularShadowButton("Click Me");
        frame.add(button);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

