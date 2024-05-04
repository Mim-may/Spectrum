package data_project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;

public class ElongatedButton extends JButton {
	   private int arcWidth;
	   private int arcHeight;

	    public ElongatedButton(String label) {
	        super(label);
	        setContentAreaFilled(false); // Disable default fill behavior
	        this.arcWidth = 20; // Default arc width
	        this.arcHeight = 40; // Default arc height
	    }

	    public void setArcWidth(int arcWidth) {
	        this.arcWidth = arcWidth;
	        repaint(); // Repaint the button when arc width changes
	    }

	    public void setArcHeight(int arcHeight) {
	        this.arcHeight = arcHeight;
	        repaint(); // Repaint the button when arc height changes
	    }

	    protected void paintComponent(Graphics g) {
	        Graphics2D g2d = (Graphics2D) g.create();
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	        // Calculate the width and height for the elongated ellipse
	        int width = getWidth();
	        int height = getHeight();
	        int diameter = Math.min(width, height);
	        int radius = diameter / 2;

	        // Fill the elongated ellipse background within borders
	        if (getModel().isArmed()) {
	            g2d.setColor(Color.gray); // Change color when button is pressed
	        } else {
	            g2d.setColor(getBackground());
	        }
	        g2d.fillRoundRect((width - diameter) / 2, 0, diameter, height, arcWidth, arcHeight);

	        super.paintComponent(g2d);
	        g2d.dispose();
	    }

	    protected void paintBorder(Graphics g) {
	        // Draw the border
	        g.setColor(getForeground());
	        int width = getWidth();
	        int height = getHeight();
	        int diameter = Math.min(width, height);
	        g.drawRoundRect((width - diameter) / 2, 0, diameter - 1, height - 1, arcWidth, arcHeight);
	    }
	}
