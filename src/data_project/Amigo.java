package data_project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Amigo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Amigo frame = new Amigo();
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
	public Amigo() {
		
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 951, 652);
			contentPane = new ImageExample(Image_Paths.amigo);
			contentPane.setSize(new Dimension(1920, 1055));
			contentPane.setBackground(new Color(240, 240, 240));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(null);
			setContentPane(contentPane);
		    setSize(1360, 736);
		    setLocationRelativeTo(null);
		    setVisible(true);
	       
	        
		    B_Button nb20 = new B_Button(Image_Paths.try1, Image_Paths.try2, 184, 119, (184+20), (119+20));
	        nb20.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        nb20.setBounds(555, 538, 184, 119);
	        nb20.setFocusable(false);
	        nb20.setContentAreaFilled(false);
	        nb20.setOpaque(false);
	        nb20.setBorderPainted(false);
	        ImageIcon icon20 = new ImageIcon(Image_Paths.try1);
	        Image im20 = icon20.getImage(); // transform it
	        Image newimage20 = im20.getScaledInstance(nb20.getWidth()  , nb20.getHeight()  ,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
	        icon20 = new ImageIcon(newimage20);
	        nb20.setIcon(icon20);
	     
	        
			
//			contentPane.add(tsp);
//			contentPane.add(tsp2);
//			contentPane.add(tsp3);
//			contentPane.add(tsp4);
	        
			
			contentPane.add(nb20);
			
	}
	
	public void scaleImage(JLabel label, String path, int width, int height) {
		ImageIcon icon = new ImageIcon(path);
		Image img = icon.getImage();
		 BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	        Graphics2D g2d = bufferedImage.createGraphics();
	        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
	        g2d.drawImage(img, 0, 0, width, height, null);
	        g2d.dispose();
//		Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(bufferedImage);
		label.setIcon(scaledIcon);
	}
	   public void resizeIcon(JButton button,String path, int width, int height) {
		    ImageIcon icon = new ImageIcon(path);
	        Image image = icon.getImage();
	        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	    }

}
