package data_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class P extends JButton {
    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;
    private Color shadowColor = new Color(0, 0, 0, 50); // Shadow color with transparency

    public P(int r, int g, int b, int r_, int g_, int b_) {
        setContentAreaFilled(false);
        setBorder(null);
        setFocusable(false);
        set_Color(r, g, b);
        set_Over(r_, g_, b_);

        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                setBackground(colorOver);
                over = true;
            }

            public void mouseExited(MouseEvent e) {
                over = false;
                setBackground(color);
            }

            public void mousePressed(MouseEvent e) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (over) {
                    setBackground(borderColor);
                } else {
                    setBackground(color);
                }
            }
        });

    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void set_Color(int r, int g, int b) {
        setColor(new Color(r, g, b));
        colorClick = new Color(r, g, b);
        borderColor = new Color(r, g, b);
    }

    public void set_Over(int r, int g, int b) {
        colorOver = new Color(r, g, b);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the shadow layers around the borders
        for (int i = 1; i <= 5; i++) {
            float opacity = i * 0.1f;
            g2.setColor(new Color(shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), (int) (shadowColor.getAlpha() * opacity)));

            // Adjust dimensions to avoid cropping of rounded corners
            int x = -i;
            int y = -i;
            int width = getWidth() + 2 * i;
            int height = getHeight() + 2 * i;

            // Draw rounded rectangle
            g2.fillRoundRect(x, y, width, height, radius, radius);
        }

        // Paint border
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        // Fill inner area
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);

        super.paintComponent(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("P_Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            P button = new P(100, 150, 200, 200, 100, 150);
            button.setText("Click me!");
            button.setRadius(50);
            button.setPreferredSize(new Dimension(150, 50));

            JPanel panel = new JPanel();
            panel.setBackground(Color.WHITE);
            panel.add(button);

            frame.getContentPane().add(panel);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}



