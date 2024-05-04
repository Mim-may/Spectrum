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

public class Saboteur2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saboteur2 frame = new Saboteur2();
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
	public Saboteur2() {
		
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 951, 652);
			contentPane = new ImageExample(Image_Paths.shadow2);
			contentPane.setSize(new Dimension(1920, 1055));
			contentPane.setBackground(new Color(240, 240, 240));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(null);
			setContentPane(contentPane);
		    setSize(1360, 736);
		    setLocationRelativeTo(null);
		    setVisible(true);
	       
		    B_Button nb20 = new B_Button(Image_Paths.right1,Image_Paths.right2,184,119,(184+20),(119+20));
	        nb20.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Shad s = new Shad();
	        	}
	        });
	        nb20.setBounds(1089, 514, 184, 119);
	        nb20.setFocusable(false);
	        nb20.setContentAreaFilled(false);
	        nb20.setOpaque(false);
	        nb20.setBorderPainted(false);
	        resizeIcon(nb20, Image_Paths.right1, 184, 119);
	        
	        
	        B_Button nb21 = new B_Button(Image_Paths.left1, Image_Paths.left2,184,119, (184+20), (119+20));
	        nb21.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        nb21.setBounds(10, 529, 184, 119);
	        nb21.setFocusable(false);
	        nb21.setContentAreaFilled(false);
	        nb21.setOpaque(false);
	        nb21.setBorderPainted(false);
	        resizeIcon(nb21, Image_Paths.left1, nb21.getWidth(), nb21.getHeight());
	        
			
			contentPane.add(nb20);
			contentPane.add(nb21);
			
	}
	
	public void scaleImage(JLabel label, String path, int width, int height) {
		ImageIcon icon = new ImageIcon(path);
		Image img = icon.getImage();
		 BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	        Graphics2D g2d = bufferedImage.createGraphics();
	        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
	        g2d.drawImage(img, 0, 0, width, height, null);
	        g2d.dispose();

		ImageIcon scaledIcon = new ImageIcon(bufferedImage);
		label.setIcon(scaledIcon);
	}
	   public void resizeIcon(JButton button,String path, int width, int height) {
		    ImageIcon icon = new ImageIcon(path);
	        Image image = icon.getImage();
	        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	       button.setIcon(new ImageIcon(resizedImage));
	    }

}
