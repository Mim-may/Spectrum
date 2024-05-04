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

public class Sp_Screen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sp_Screen frame = new Sp_Screen();
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
	public Sp_Screen() {
		
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 951, 652);
			contentPane = new ImageExample(Image_Paths.specific1);
			contentPane.setSize(new Dimension(1920, 1055));
			contentPane.setBackground(new Color(240, 240, 240));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(null);
			setContentPane(contentPane);
		    setSize(1360, 736);
		    setLocationRelativeTo(null);
		    setVisible(true);
			
//			T_label tsp = new T_label(255,255,255,128);
//			tsp.setBounds(765, 250, 518, 126);
//	        tsp.setRadius(100);
//	        scaleImage(tsp, "C:\\\\Users\\\\mimim\\\\Downloads\\\\q1_e.png", tsp.getWidth() , tsp.getHeight());
	        
	        
//	        T_label tsp2 = new T_label(255,255,255,128);
//	        tsp2.setBounds(27, 250, 518, 127);
//	        tsp2.setRadius(100);
//	        scaleImage(tsp2,"C:\\\\Users\\\\mimim\\\\Downloads\\\\qq_.png" , tsp2.getWidth() - 20 , tsp2.getHeight() );
//	        
//	        T_label tsp3 = new T_label(255,255,255,128);
//	        tsp3.setBounds(765, 11, 518, 127);
//	        tsp3.setRadius(100);
//	        scaleImage(tsp3,"C:\\\\Users\\\\mimim\\\\Downloads\\\\q1_e.png" , tsp3.getWidth() - 20, tsp3.getHeight() - 10);
//	        
//	       
//	        
//	        T_label tsp4 = new T_label(255,255,255,128);
//	        tsp4.setBounds(27, 11, 518, 127);
//	        tsp4.setRadius(100);
//	        scaleImage(tsp4, "C:\\\\\\\\Users\\\\\\\\mimim\\\\\\\\Downloads\\\\\\\\cq1.png", tsp4.getWidth() - 20, tsp4.getHeight()- 10);
	        

	        
		    B_Button nb4 = new B_Button("","C:\\Users\\mimim\\Downloads\\StAg.png",120,110,100,90);
	        nb4.setBounds(315, 143, 120, 110);
	        nb4.setFocusable(false);
	        nb4.setContentAreaFilled(false);
	        nb4.setOpaque(false);
	        nb4.setBorderPainted(false);
	       
	        
	        B_Button nb5 = new B_Button("","C:\\Users\\mimim\\Downloads\\SDIS.png",120,110,100,90);
	        nb5.setBounds(122, 390, 120, 110);
	        nb5.setFocusable(false);
	        nb5.setContentAreaFilled(false);
	        nb5.setOpaque(false);
	        nb5.setBorderPainted(false);
	      
	        
	        
	        B_Button nb9 = new B_Button("","C:\\Users\\mimim\\Downloads\\StAg.png",120,110,100,90);
	        nb9.setBounds(315, 390, 120, 110);
	        nb9.setFocusable(false);
	        nb9.setContentAreaFilled(false);
	        nb9.setOpaque(false);
	        nb9.setBorderPainted(false);
	      
	        
	        
	        B_Button nb10 = new B_Button("","C:\\Users\\mimim\\Downloads\\SDIS.png",120,110,100,90);
	        nb10.setBounds(826, 150, 117, 109);
	        nb10.setFocusable(false);
	        nb10.setContentAreaFilled(false);
	        nb10.setOpaque(false);
	        nb10.setBorderPainted(false);
	        
	       
	        
	        
	        
	        
	        B_Button nb14 = new B_Button("","C:\\Users\\mimim\\Downloads\\StAg.png",120,110,100,90);
	        nb14.setBounds(1022, 148, 120, 110);
	        nb14.setFocusable(false);
	        nb14.setContentAreaFilled(false);
	        nb14.setOpaque(false);
	        nb14.setBorderPainted(false);
	        
	        
	        B_Button nb15 = new B_Button("","C:\\Users\\mimim\\Downloads\\SDIS.png",120,110,100,90);
	        nb15.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        nb15.setBounds(826, 390, 120, 110);
	        nb15.setFocusable(false);
	        nb15.setContentAreaFilled(false);
	        nb15.setOpaque(false);
	        nb15.setBorderPainted(false);
	        
	        
	        
	        
	        
	        B_Button nb19 = new B_Button("","C:\\Users\\mimim\\Downloads\\StAg.png",120,110,100,90);
	        nb19.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        nb19.setBounds(1022, 390, 120, 110);
	        nb19.setFocusable(false);
	        nb19.setContentAreaFilled(false);
	        nb19.setOpaque(false);
	        nb19.setBorderPainted(false);
	       
	        
	        B_Button nb20 = new B_Button("C:\\Users\\mimim\\Downloads\\Right_.png","C:\\Users\\mimim\\Downloads\\BRight.png",184,119,200,130);
	        nb20.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Sp_Screen2 p2 = new Sp_Screen2();
	        	}
	        });
	        nb20.setBounds(1082, 529, 184, 119);
	        nb20.setFocusable(false);
	        nb20.setContentAreaFilled(false);
	        nb20.setOpaque(false);
	        nb20.setBorderPainted(false);
	        ImageIcon icon20 = new ImageIcon("C:\\\\Users\\\\mimim\\\\Downloads\\\\Right_.png");
	        Image im20 = icon20.getImage(); // transform it
	        Image newimage20 = im20.getScaledInstance(nb20.getWidth()  , nb20.getHeight()  ,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
	        icon20 = new ImageIcon(newimage20);
	        nb20.setIcon(icon20);
	        
	        
	        B_Button nb21 = new B_Button("C:\\Users\\mimim\\Downloads\\Left_.png","C:\\Users\\mimim\\Downloads\\BLeft.png",184,119,200,130);
	        nb21.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Q_Screen5 q5 = new Q_Screen5();
	        	}
	        });
	        nb21.setBounds(10, 529, 184, 119);
	        nb21.setFocusable(false);
	        nb21.setContentAreaFilled(false);
	        nb21.setOpaque(false);
	        nb21.setBorderPainted(false);
	        resizeIcon(nb21, "C:\\Users\\mimim\\Downloads\\Left_.png", nb21.getWidth(), nb21.getHeight());
	        
	        B_Button nb = new B_Button("","C:\\Users\\mimim\\Downloads\\SDIS.png",120,110,100,90);
	        nb.setBounds(122, 143, 120, 110);
	        nb.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        nb.setFocusable(false);
	        nb.setContentAreaFilled(false);
	        nb.setOpaque(false);
	        nb.setBorderPainted(false);
	       
	        
			
//			contentPane.add(tsp);
//			contentPane.add(tsp2);
//			contentPane.add(tsp3);
//			contentPane.add(tsp4);
	        
	        
			contentPane.add(nb);
			contentPane.add(nb4);
			contentPane.add(nb5);
			contentPane.add(nb9);
			contentPane.add(nb10);
			contentPane.add(nb14);
			contentPane.add(nb15);
			contentPane.add(nb19);
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
