package data_project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class P_Button extends JButton {
 public P_Button(int r, int g, int b, int r_, int g_, int b_) {
	 setContentAreaFilled(false);
	 setBorder(null);
	 setFocusable(false);
	 set_Color(r,g,b);
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
			}
			else {
				setBackground(color);
			}
		}
	});
	 
 }
 private boolean over;
 private Color color;
 private Color colorOver;
 private Color colorClick;
 private Color borderColor;
 private int radius = 0;
 
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
public void setBorderClock(Color borderColor) {
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
public void set_Over(int r , int g , int b) {
	colorOver = new Color(r,g,b);
}

//setColor(new Color(236, 179, 156));
//colorOver = new Color(232, 137, 99);
//colorClick = new Color(236, 179, 156);
//borderColor = new Color(236, 179, 156);

 
 @Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		// Paint border
		g2.setColor(borderColor);
		g2.fillRoundRect(0,0,getWidth(), getHeight(), radius, radius);
		g2.setColor(getBackground());
		g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
		super.paintComponent(g);
	}
}
