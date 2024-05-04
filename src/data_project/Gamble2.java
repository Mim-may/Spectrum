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

public class Gamble2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gamble2 frame = new Gamble2();
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
	public Gamble2() {
		
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 951, 652);
			contentPane = new ImageExample("C:\\Users\\mimim\\Downloads\\CG1.png");
			contentPane.setSize(new Dimension(1920, 1055));
			contentPane.setBackground(new Color(240, 240, 240));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(null);
			setContentPane(contentPane);
		    setSize(1360, 736);
		    setLocationRelativeTo(null);
		    setVisible(true);
	       
	        
		    B_Button nb20 = new B_Button("C:\\Users\\mimim\\Downloads\\Right_.png","C:\\Users\\mimim\\Downloads\\BRight.png",184,119,(184+20),(119+20));
	        nb20.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Pals p = new Pals();
	        	}
	        });
	        nb20.setBounds(1089, 514, 184, 119);
	        nb20.setFocusable(false);
	        nb20.setContentAreaFilled(false);
	        nb20.setOpaque(false);
	        nb20.setBorderPainted(false);
	        resizeIcon(nb20, "C:\\\\Users\\\\mimim\\\\Downloads\\\\Right_.png", 184, 119);
	        
	        
	        B_Button nb21 = new B_Button("C:\\Users\\mimim\\Downloads\\Left_.png", "C:\\Users\\mimim\\Downloads\\BLeft.png",184,119, (184+20), (119+20));
	        nb21.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        nb21.setBounds(10, 529, 184, 119);
	        nb21.setFocusable(false);
	        nb21.setContentAreaFilled(false);
	        nb21.setOpaque(false);
	        nb21.setBorderPainted(false);
	        resizeIcon(nb21, "C:\\Users\\mimim\\Downloads\\Left_.png", nb21.getWidth(), nb21.getHeight());


	     
	        
			
//			contentPane.add(tsp);
//			contentPane.add(tsp2);
//			contentPane.add(tsp3);
//			contentPane.add(tsp4);
	        
			
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
//		Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
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
