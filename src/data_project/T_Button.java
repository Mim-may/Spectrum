package data_project;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class T_Button  extends JButton{
	 boolean over;
	public T_Button() {
	 {
	     setOpaque(false); 
         setContentAreaFilled(false);
         setBorder(null);
         setFocusable(false);
        // boolean over;
         
         addMouseListener(new MouseAdapter() {
    		 
     		public void mouseEntered(MouseEvent e) {
     			setIcon(new ImageIcon("C:\\\\Users\\\\mimim\\\\Downloads\\\\S1_.png"));
     			over = true;
     		}
     		 
     		public void mouseExited(MouseEvent e) {
     			over = false;
     			setIcon(new ImageIcon("C:\\\\Users\\\\mimim\\\\Downloads\\\\T__.png"));
     		}
     		 
     		public void mousePressed(MouseEvent e) {
     			setIcon(new ImageIcon("C:\\\\Users\\\\mimim\\\\Downloads\\\\S1_.png"));
     		}
     		 @Override
     		public void mouseReleased(MouseEvent e) {
     			if (over) {
     				setIcon(new ImageIcon("C:\\Users\\mimim\\Downloads\\S1_.png"));
     			}
     			else {
     				setIcon(new ImageIcon("C:\\Users\\mimim\\Downloads\\T__.png"));
     			}
     		}
     	
	 });
}

}
}