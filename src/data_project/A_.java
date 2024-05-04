package data_project;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class A_ extends JButton {

    public A_() {
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Clear the previous painting
        g2d.clearRect(0, 0, getWidth(), getHeight());

        // Draw blur effect
        int blurRadius = 20; // Adjust the blur radius as needed
        int shadowOffset = 10; // Adjust the shadow offset as needed
        int steps = blurRadius / 5; // Number of blur steps
        for (int i = 0; i < steps; i++) {
            int alpha = 100 - i * (100 / steps); // Decreasing transparency for each step
            g2d.setColor(new Color(0, 0, 0, alpha));
            int size = getWidth() + i * blurRadius / steps * 2;
            g2d.fillOval(-i * blurRadius / steps + shadowOffset, -i * blurRadius / steps + shadowOffset, size, size);
        }

        // Draw circular shape
        Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, getWidth(), getHeight());
       // g2d.setColor(getBackground());
        g2d.fill(circle);

        // Draw the text centered within the circular shape
        g2d.setColor(getForeground());
        FontMetrics fm = g2d.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(getText())) / 2;
        int y = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();
        g2d.drawString(getText(), x, y);

        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100); // Adjust the size as needed
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Circular Button With Blur Shadow Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a circular button
        A_ circularButton = new A_();
        circularButton.setText("Click Me");
        circularButton.setSize(200,200);

        // Add action listener (just for demonstration)
        circularButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Circular Button Clicked!");
        });

        // Add the circular button to a panel
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.add(circularButton);

        // Add the panel to the frame and display
        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

