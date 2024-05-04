package data_project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class H_label extends JLabel {
	   int radius = 0;
	   int red, green,blue, alpha;
	   
	   H_label(int red,int green, int blue, int alpha) {
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.alpha = alpha;
	    setBorder(null);
	    setOpaque(false); // Make the label opaque
	
     setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
     
	   }
	   
	   protected void paintComponent(Graphics g) {
	        // Cast Graphics object to Graphics2D
	        Graphics2D g2d = (Graphics2D) g.create();

	        // Set rendering hints for better quality
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	        // Get the width and height of the label
	        int width = getWidth();
	        int height = getHeight();

	        // Paint the background
	        g2d.setColor(new Color(red, green, blue, alpha));
	        g2d.fillRoundRect(0, 0, width, height, radius, radius);


	        // Paint the text
	        super.paintComponent(g2d);

	        // Dispose of the Graphics2D object
	        g2d.dispose(); 
	        }
	   
	   public void scale(ImageIcon icon) {
		   Image img = icon.getImage();
		   Image newim = img.getScaledInstance(getWidth() , getHeight() ,  java.awt.Image.SCALE_SMOOTH);
		   setIcon(new ImageIcon(newim));
	   }

public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
}
