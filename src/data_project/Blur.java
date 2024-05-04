package data_project;

import javax.swing.*;
import java.awt.*;

public class Blur extends JButton {

    private final int shadowSize = 10; // Size of the shadow
    private final int radius = 100; // Radius of the circular button
    private JButton shadowButton; // Separate JButton for shadow layers

    public Blur(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(false);
        setBorder(null); // Remove the border of the button

        // Create the shadow button
        shadowButton = new JButton();
        shadowButton.setContentAreaFilled(false);
        shadowButton.setFocusPainted(false);
        shadowButton.setBorderPainted(false);
        shadowButton.setOpaque(false);
        shadowButton.setBorder(null);
        shadowButton.setEnabled(false); // Disable the shadow button
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
        return new Dimension(2 * radius + 2 * shadowSize, 2 * radius + 2 * shadowSize); // Adjust size as needed
    }

    public void addShadowLayer(Color color, float opacity) {
    	SH shadowButton = new SH(new Color(9, 48, 112), 0.5f);
        shadowButton.setBounds(shadowSize, shadowSize, getWidth() - 2 * shadowSize, getHeight() - 2 * shadowSize);
        add(shadowButton);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Blurred Shadow Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Blur button = new Blur("Click me!");
            button.setBackground(Color.black); // Set the background color of the button
            button.setForeground(Color.BLACK);

            // Add shadow layers to the button
            button.addShadowLayer(new Color(0, 49, 255), 0.5f);
            button.addShadowLayer(new Color(0, 49, 255), 0.3f);

            JPanel panel = new JPanel(new FlowLayout());
            panel.setBackground(Color.white);
            panel.add(button);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
