package data_project;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

public class Q1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q1 frame = new Q1();
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
	public Q1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1351, 732);
		contentPane = new ImageExample("C:\\Users\\mimim\\Downloads\\Green_Background.jpeg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Transparent_Scroll p = new Transparent_Scroll();
		p.setLocation(286, 0);
		p.setSize(770, 700);
		
		P_Button b1 = new P_Button(255,255,255,227, 234, 88);
		P_Button b2 = new P_Button(255,255,255,227, 234, 88);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		P_Button b3 = new P_Button(255,255,255,227, 234, 88);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		P_Button b4 = new P_Button(255,255,255,227, 234, 88);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b4.setRadius(100);
		b4.setSize(68, 66);
		b4.setLocation(448, 135);
		P_Button b5 = new P_Button(255,255,255,227, 234, 88);
		b5.setLocation(531, 124);
		b5.setSize(78, 75);
		b5.setRadius(200);
		P_Button b6 = new P_Button(255,255,255,227, 234, 88);
		b6.setLocation(192, 328);
		b6.setSize(78, 75);
		b6.setRadius(100);
		P_Button b7 = new P_Button(255,255,255,227, 234, 88);
		b7.setLocation(288, 337);
		b7.setSize(68,66);
		b7.setRadius(100);
		P_Button b8 = new P_Button(255,255,255,227, 234, 88);
		b8.setLocation(375, 346);
        b8.setSize(60, 57);
		b8.setRadius(100);
		P_Button b9 = new P_Button(255,255,255,227, 234, 88);
		b9.setLocation(448, 337);
		b9.setSize(68,66);
		b9.setRadius(100);
		P_Button b10 = new P_Button(255,255,255,227, 234, 88);
		b10.setLocation(531, 328);
		b10.setSize(78, 75);
		b10.setRadius(100);
		P_Button b11 = new P_Button(255,255,255,227, 234, 88);
		P_Button b12 = new P_Button(255,255,255,227, 234, 88);
		P_Button b13 = new P_Button(255,255,255,227, 234, 88);
		P_Button b14 = new P_Button(255,255,255,227, 234, 88);
		P_Button b15 = new P_Button(255,255,255,227, 234, 88);
		P_Button b16 = new P_Button(255,255,255,227, 234, 88);
		P_Button b17 = new P_Button(255,255,255,227, 234, 88);
		P_Button b18 = new P_Button(255,255,255,227, 234, 88);
		P_Button b19= new P_Button(255,255,255,227, 234, 88);
		P_Button b20 = new P_Button(255,255,255,227, 234, 88);
		P_Button b21 = new P_Button(255,255,255,227, 234, 88);
		P_Button b22 = new P_Button(255,255,255,227, 234, 88);
		P_Button b23 = new P_Button(255,255,255,227, 234, 88);
		P_Button b24 = new P_Button(255,255,255,227, 234, 88);
		P_Button b25 = new P_Button(255,255,255,227, 234, 88);
		
//		 for (int i = 0; i < 6; i++) {
//	            P_Button button = new P_Button(255,255,255,227, 234, 88);
//	            button.setRadius(100);
//	            button.setBounds(368,142,46,46);
//	            p.add(button); 
//	        }
//		b2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		b3.setRadius(100);
		b3.setBounds(375,145 ,60 ,57 );
		b2.setRadius(100);
		b2.setBounds(288, 135, 68, 66);
		b1.setRadius(200);
		b1.setBounds(192, 124, 78 ,75 );
		
		H_label lbl = new H_label(0, 0, 0, 50);
		JLabel lbl_1 = new JLabel();
		lbl_1.setLocation(192, 215);
		JLabel lbl_2 = new JLabel();
		JLabel lbl_3 = new JLabel();
		JLabel lbl_4 = new JLabel();
		
		lbl_1.setSize(417, 102);
		lbl_2.setSize(417, 102);
		lbl_3.setSize(417, 102);
		lbl_4.setSize(417, 102);
		lbl.setSize(417, 102);
		lbl.setLocation(192, 11);
		contentPane.add(p);
		p.setLayout(null);
		p.add(lbl);
		p.add(lbl_1);
//		p.add(lbl_2);
//		p.add(lbl_3);
//		p.add(lbl_4);
		p.add(b1);
		p.add(b2);	
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		
		scaleImage(lbl,"C:\\Users\\mimim\\Downloads\\Q1_.png", lbl.getWidth(), lbl.getHeight());
		//scaleImage(lbl_1,"C:\\Users\\mimim\\Downloads\\Q2__.png", lbl_1.getWidth(), lbl_1.getHeight());
//		scaleImage(lbl_2,"C:\\Users\\mimim\\Downloads\\Q1_.png");
//		scaleImage(lbl_3,"C:\\Users\\mimim\\Downloads\\Q1_.png");
//		scaleImage(lbl_4,"C:\\Users\\mimim\\Downloads\\Q1_.png");
		
//		ImageIcon originalIcon = new ImageIcon("C:\\Users\\mimim\\Downloads\\Emo_2.png");
//        // Resize the icon to fit inside the button
//        ImageIcon resizedIcon = resizeIcon(originalIcon, b1.getWidth() - 30, b1.getHeight() - 30);
//        // Set the resized icon to the button
//        b1.setIcon(resizedIcon);
		
		resizeIcon(b1,"C:\\Users\\mimim\\Downloads\\Emo_2.png" , b1.getWidth() - 25, b1.getHeight() - 25);
		resizeIcon(b2,"C:\\Users\\mimim\\Downloads\\Emo_1.png" , b2.getWidth() - 15, b2.getHeight() - 20);
		resizeIcon(b3,"C:\\Users\\mimim\\Downloads\\Emo_3.png" , b3.getWidth() - 15, b3.getHeight() - 15);
	    resizeIcon(b4,"C:\\Users\\mimim\\Downloads\\Emo4.png" , b4.getWidth() - 20, b4.getHeight() - 20);
	    resizeIcon(b5,"C:\\Users\\mimim\\Downloads\\Emo_5.png" , b5.getWidth() - 30, b5.getHeight() - 30);
		
	}
	
	public void scaleImage(H_label label, String path, int width, int height) {
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
	   public void resizeIcon(P_Button button,String path, int width, int height) {
		    ImageIcon icon = new ImageIcon(path);
	        Image image = icon.getImage();
	        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	       button.setIcon(new ImageIcon(resizedImage));
	    }

	public Color getScrollPaneBackground() {
		return scrollPane.getBackground();
	}
	public void setScrollPaneBackground(Color background) {
		scrollPane.setBackground(background);
	}
}
