package data_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tester extends JFrame {

	private static final long serialVersionUID = 1L;
	private ImageExample contentPane;

	
	   public void resizeIcon(P_Button button,String path, int width, int height) {
		    ImageIcon icon = new ImageIcon(path);
	        Image image = icon.getImage();
	        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	       button.setIcon(new ImageIcon(resizedImage));
	    }
	   public void scaleImage(P_Button label, String path, int width, int height) {
			ImageIcon icon = new ImageIcon(path);
			Image img = icon.getImage();
			 BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		        Graphics2D g2d = bufferedImage.createGraphics();
		        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		        g2d.drawImage(img, 0, 0, width, height, null);
		        g2d.dispose();
//			Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon scaledIcon = new ImageIcon(bufferedImage);
			label.setIcon(scaledIcon);
		}
	   
	   

	public Tester() {
		setSize(new Dimension(908, 738));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 527);
		contentPane = new ImageExample("C:\\Users\\mimim\\Downloads\\mixed.png");
		contentPane.setSize(new Dimension(1920, 1055));
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
        P_Button btnNewButton = new P_Button(255, 255, 255,255,255,255);
        btnNewButton.setRadius(100);
        btnNewButton.setBounds(420, 322, 357, 107);
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\mimim\\Downloads\\S1.png"));
       // scaleImage(btnNewButton,"C:\\\\Users\\\\mimim\\\\Downloads\\\\S_.png", btnNewButton.getWidth(), btnNewButton.getHeight());
     //  resizeIcon(btnNewButton,"C:\\Users\\mimim\\Downloads\\S_.png", btnNewButton.getWidth(), btnNewButton.getHeight());
		btnNewButton.addActionListener(new ActionListener() {
			
			 public void actionPerformed(ActionEvent e) {
	            if (e.getSource() == btnNewButton) {
	            	 dispose();
	            	 Question_Screen screen = new Question_Screen();
	            	 screen.setVisible(true);
	            }
	         }
		});
		contentPane.add(btnNewButton);
		
	}
}
