package data_project;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircularPanel extends JPanel {

    /** Stroke size. it is recommended to set it to 1 for better view */
    protected int strokeSize = 1;
    /** Color of shadow */
    protected Color shadowColor = Color.black;
    /** Sets if it drops shadow */
    protected boolean shady = true;
    /** Sets if it has an High Quality view */
    protected boolean highQuality = true;
    /** Distance between shadow border and opaque panel border */
    protected int shadowGap = 5;
    /** The offset of shadow.  */
    protected int shadowOffset = 4;
    /** The transparency value of shadow. (0 - 255) */
    protected int shadowAlpha = 150;

    public CircularPanel() {
        super();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int shadowGap = this.shadowGap;
        Color shadowColorA = new Color(shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), shadowAlpha);
        Graphics2D graphics = (Graphics2D) g;

        // Sets antialiasing if HQ.
        if (highQuality) {
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }

        // Draws shadow borders if any.
        if (shady) {
            graphics.setColor(shadowColorA);
            graphics.fillOval(shadowOffset, shadowOffset, width - strokeSize - shadowOffset, height - strokeSize - shadowOffset);
        } else {
            shadowGap = 1;
        }

        // Draws the circular opaque panel with borders.
        graphics.setColor(getBackground());
        graphics.fillOval(0, 0, width - shadowGap, height - shadowGap);
        graphics.setColor(getForeground());
        graphics.setStroke(new BasicStroke(strokeSize));
        graphics.drawOval(0, 0, width - shadowGap, height - shadowGap);

        // Sets strokes to default, is better.
        graphics.setStroke(new BasicStroke());
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Circular Panel Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            CircularPanel circularPanel = new CircularPanel();
            circularPanel.setBackground(Color.WHITE);
            circularPanel.setForeground(Color.BLACK);

            JPanel panel = new JPanel(new BorderLayout());
            panel.setBackground(Color.DARK_GRAY);
            panel.add(circularPanel, BorderLayout.CENTER);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
