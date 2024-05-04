package data_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

public class Y extends JFrame {

	private static final long serialVersionUID = 1L;
	private ImageExample contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Y frame = new Y();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Y() {
	 
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		T_label tsp = new T_label(255,255,255,128);
		tsp.setBounds(27, 11, 518, 126);
        tsp.setRadius(100);
     //  tsp.ScaleImage(tsp, "C:\\\\Users\\\\mimim\\\\Downloads\\\\q.png", 471 - 30, 126 - 30);
        
        
        ImageIcon icon = new ImageIcon("C:\\Users\\mimim\\Downloads\\q_.png");
        
        // Resize the icon to fit the JLabel
        Image image = icon.getImage(); // transform it
        Image newimg = image.getScaledInstance(tsp.getWidth() - 30, tsp.getHeight() - 30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        icon = new ImageIcon(newimg);  // transform it back
        
        
         
         JButton nb = new JButton();
         nb.setBounds(25, 142, 113, 112);
         nb.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         	}
         });
         nb.setFocusable(false);
         nb.setContentAreaFilled(false);
         nb.setOpaque(false);
         nb.setBorderPainted(false);
         
         ImageIcon icon_ = new ImageIcon("\"C:\\Users\\mimim\\Downloads\\StAg.png\"");
         
         // Resize the icon to fit the JLabel
         Image im = icon_.getImage(); // transform it
         Image newimag = im.getScaledInstance(nb.getWidth() - 30, nb.getHeight() - 30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
         icon_ = new ImageIcon(newimag); 
         
//         // Resize the icon to fit the JLabel
//         Image im = icon1.getImage(); // transform it
//         Image nim = im.getScaledInstance(nb.getWidth()  , nb.getHeight() ,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
//         icon1 = new ImageIcon(nim);  // transform it back
//         
              
 
	    contentPane = new ImageExample("C:\\Users\\mimim\\Downloads\\BB.png");
		contentPane.setSize(new Dimension(1920, 1055));
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.add(tsp);
		contentPane.add(nb);
	    tsp.setIcon(icon);
		nb.setIcon(icon_);
	    // Set frame properties
		getContentPane().add(contentPane);
	    setSize(1360, 736);
	    setLocationRelativeTo(null);
	    setVisible(true);
	}


}
