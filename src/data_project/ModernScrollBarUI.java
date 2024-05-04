package data_project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class ModernScrollBarUI extends BasicScrollBarUI {
	
	private final int THUMB_SIZE = 40;
	
	protected Dimension getMaximumThumbSize() {
	if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
		return new Dimension(0,  THUMB_SIZE);
	} else {
		return new Dimension(THUMB_SIZE, 0);
	}
	}
	
	public Dimension getMinimumSize() {
		if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
			return new Dimension(0,  THUMB_SIZE);
		} else {
			return new Dimension(THUMB_SIZE, 0);
		}
	}

	protected JButton createIncreaseButton(int orientation) {
		return new ScrollBarButton();
	}

	protected JButton createDecreaseButton(int orientation) {
		return new ScrollBarButton();
	}
	
		protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			int x = r.x;
			int y = r.y;
			int width = r.width;
			int height = r.height;
			if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
				y += 8;
				height += 16;
			}
			else {
				x += 8;
				width += 16;
			}
			g2.setColor(scrollbar.getForeground());
			g2.fillRoundRect(x, y, width, height, 10, 10);
		}
		
    protected void paintTrack(Graphics g, JComponent c, Rectangle trc) {
	Graphics2D g2 = (Graphics2D) g;
	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	int orientation = scrollbar.getOrientation();
	int size, x,y,width,height;
	if (orientation == JScrollBar.VERTICAL) {
		size = trc.width/2;
		x = trc.x + ((trc.width - size) / 2);
		y = trc.y;
		width = size;
		height = trc.height;
	} else {
		size = trc.height/2;
		y = trc.y + ((trc.height - size)/2);
		x = 0;
		width = trc.width;
		height = size;
	}
	g2.setColor(new Color(240,240,240));
	g2.fillRect(x, y, width, height);
	
}

private class ScrollBarButton extends JButton {
	public ScrollBarButton() {
		setBorder(BorderFactory.createEmptyBorder());
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}
}
}




