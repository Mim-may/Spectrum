package data_project;

import javax.swing.*;
import java.awt.*;

public class CircularButton_ extends JButton {

    /** Stroke size. It is recommended to set it to 1 for better view */
    private int strokeSize = 1;
    /** Color of shadow */
    private Color shadowColor = Color.black;
    /** Sets if it drops shadow */
    private boolean shady = true;
    /** Sets if it has a High Quality view */
    private boolean highQuality = true;
    /** Distance between shadow border and opaque button border */
    private int shadowGap = 5;
    /** The offset of shadow */
    private int shadowOffset = 4;
    /** The transparency value of shadow (0 - 255) */
    private int shadowAlpha = 150;

    public CircularButton_(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(getBackground());
        }

        Graphics2D graphics = (Graphics2D) g;

        // Sets antialiasing if HQ.
        if (highQuality) {
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }

        // Draws shadow borders if any.
        if (shady) {
            Color shadowColorA = new Color(shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), shadowAlpha);
            graphics.setColor(shadowColorA);
            graphics.fillOval(shadowOffset, shadowOffset, getWidth() - strokeSize, getHeight() - strokeSize);
        }

        // Draws the circular button.
        graphics.fillOval(0, 0, getWidth() - shadowGap, getHeight() - shadowGap);

        // Draws the text.
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Draws the border of the circular button.
        g.setColor(getForeground());
        g.drawOval(0, 0, getWidth() - shadowGap, getHeight() - shadowGap);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(50, 50); // Adjust size as needed
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Circular Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            CircularButton_ circularButton = new CircularButton_("Click me!");
            circularButton.setBackground(Color.black);
            circularButton.setForeground(Color.BLACK);

            JPanel panel = new JPanel(new FlowLayout());
            panel.setBackground(Color.DARK_GRAY);
            panel.add(circularButton);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

