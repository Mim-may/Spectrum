package data_project;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class B_Button extends JButton {
	int width, height, dwidth, dheight;
	String path1;
	String path2;
	private boolean over;
	public B_Button(String path1_,String path2_, int w, int h, int dw, int dh) {
		 {
		     setOpaque(false); 
	         setContentAreaFilled(false);
	         setBorder(null);
	         setFocusable(false);
	         width = w;
	         dwidth = dw;
	         dheight = dh;
	         height = h;
	        // boolean over;
	         path1 = path1_;
	         path2 = path2_;
	         
	         addMouseListener(new MouseAdapter() {
	    		 
	     		public void mouseEntered(MouseEvent e) {
	     			 ImageIcon icon = new ImageIcon(path2);
	     	        Image im = icon.getImage(); // transform it
	     	        Image newimage = im.getScaledInstance(dwidth , dheight ,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
	     	        icon = new ImageIcon(newimage);
	     	        setIcon(icon);
	     			over = true;
	     		}
	     		 
	     		public void mouseExited(MouseEvent e) {
	     			over = false;
	     			ImageIcon icon1 = new ImageIcon(path1);
	     	        Image im1 = icon1.getImage(); // transform it
	     	        Image newimage1 = im1.getScaledInstance(width , height ,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
	     	        icon1 = new ImageIcon(newimage1);
	     	        setIcon(icon1);
	     			
	     		}
	     		 
	     		public void mousePressed(MouseEvent e) {
	     			ImageIcon icon2 = new ImageIcon(path2);
	     	        Image im2 = icon2.getImage(); // transform it
	     	        Image newimage2 = im2.getScaledInstance(dwidth , dheight ,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
	     	        icon2 = new ImageIcon(newimage2);
	     	        setIcon(icon2);
	     			
	     		}
	     		 @Override
	     		public void mouseReleased(MouseEvent e) {
	     			if (over) {
	     				ImageIcon icon3 = new ImageIcon(path2);
		     	        Image im3 = icon3.getImage(); // transform it
		     	        Image newimage3 = im3.getScaledInstance(dwidth , dheight,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		     	        icon3 = new ImageIcon(newimage3);
		     	        setIcon(icon3);
	     			}
	     			else {
	     				ImageIcon icon4 = new ImageIcon(path1);
		     	        Image im4 = icon4.getImage(); // transform it
		     	        Image newimage4 = im4.getScaledInstance(width , height ,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		     	        icon4 = new ImageIcon(newimage4);
		     	        setIcon(icon4);
	     				
	     			}
	     		}
	     	
		 });
	}

	}

}
