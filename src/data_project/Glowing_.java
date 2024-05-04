package data_project;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class Glowing_ extends JComponent {
    private int shadowSize = 20;
    private int borderSize = 2;
    private Color g1 = new Color(255, 0, 0);
    private Color g2_ = new Color(0, 49, 255);
    private Color backgroundLight = new Color(35, 35, 35);
    private BufferedImage imageRender;

    public Glowing_() {
        setBorder(new EmptyBorder(shadowSize, shadowSize, shadowSize, shadowSize));
        setBackground(new Color(20, 20, 20));
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (imageRender != null) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.drawImage(imageRender, 0, 0, null);
            g2.dispose();
        }
        super.paintComponent(g);
    }

    private void createImageRender() {
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            Insets inset = getInsets();
            imageRender = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = imageRender.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Draw shadows
            drawShadow(g2, width, height, inset, g1, true);
            drawShadow(g2, width, height, inset, g2_, false);

            // Fill background
            Area area = new Area(new Rectangle2D.Double(inset.left, inset.top, width - inset.left - inset.right, height - inset.top - inset.bottom));
            g2.setColor(getBackground());
            g2.fill(area);

            // Fill light area
            area.subtract(new Area(new Rectangle2D.Double(width / 2, 0, width / 2, height)));
            g2.setColor(backgroundLight);
            g2.fill(area);

            // Draw border
            g2.drawImage(createBorder(width, height, inset), 0, 0, null);

            g2.dispose();
        }
    }

    private void drawShadow(Graphics2D g2, int width, int height, Insets inset, Color color, boolean leftShadow) {
        int shadowOffset = 5; // Adjust the shadow offset as needed
        g2.setColor(color);
        int shadowWidth = shadowSize - shadowOffset;
        int shadowHeight = height - shadowOffset;
        int x = leftShadow ? inset.left - shadowWidth : width - inset.right;
        g2.fillOval(x, inset.top + shadowOffset, shadowWidth, shadowHeight);
    }

    private BufferedImage createBorder(int width, int height, Insets inset) {
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();

        double w = width - inset.left - inset.right;
        double h = height - inset.top - inset.bottom;

        // Draw border
        // Left border
        g2.setPaint(new GradientPaint(0, (float) (h * 0.1f), g1, 0, (float) (h * 0.1f), toTranslucentColor(g2_)));
        g2.fill(new Rectangle2D.Double(inset.left, inset.top, borderSize, h));

        // Bottom border
        g2.setPaint(new GradientPaint(0, 0, g1, (float) (w * 0.9f), 0, toTranslucentColor(g2_)));
        g2.fill(new Rectangle2D.Double(inset.left, height - inset.bottom - borderSize, w, borderSize));

        // Top border
        g2.setPaint(new GradientPaint((float) (w * 0.1f), 0, toTranslucentColor(g2_), (float) w, 0, g2_));
        g2.fill(new Rectangle2D.Double(inset.left, inset.top, w, borderSize));

        // Right border
        g2.setPaint(new GradientPaint(0, 0, g2_, 0, (float) (h * 0.9f), toTranslucentColor(g2_)));
        g2.fill(new Rectangle2D.Double(width - inset.right - borderSize, inset.top, borderSize, h));

        g2.dispose();
        return img;
    }

    private Color toTranslucentColor(Color color) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), 0);
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        createImageRender();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Glowing Component Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Glowing glowingComponent = new Glowing();
            glowingComponent.setPreferredSize(new Dimension(200, 500));

            JPanel panel = new JPanel(new FlowLayout());
            panel.setBackground(Color.WHITE);
            panel.add(glowingComponent);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

