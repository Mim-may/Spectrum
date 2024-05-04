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

public class Q_Screen2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q_Screen2 frame = new Q_Screen2();
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
	public Q_Screen2() {
		
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 951, 652);
			contentPane = new ImageExample(Image_Paths.default2);
			contentPane.setSize(new Dimension(1920, 1055));
			contentPane.setBackground(new Color(240, 240, 240));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(null);
			setContentPane(contentPane);
		    setSize(1360, 736);
		    setLocationRelativeTo(null);
		    setVisible(true);
			
	        
	        
	        
		    B_Button nb1 = new B_Button("",Image_Paths.disagree,93,90,(93-20),(90-20));
	        nb1.setBounds(143, 140, 93, 90);
	        nb1.setFocusable(false);
	        nb1.setContentAreaFilled(false);
	        nb1.setOpaque(false);
	        nb1.setBorderPainted(false);
	       
	        
	        
	        B_Button nb2 = new B_Button("",Image_Paths.neutral,85,79,(85-20),(79-20));
	        nb2.setBounds(247, 150, 85, 79);
	        nb2.setFocusable(false);
	        nb2.setContentAreaFilled(false);
	        nb2.setOpaque(false);
	        nb2.setBorderPainted(false);
	        
	        
	        B_Button nb3 = new B_Button("",Image_Paths.agree,93,90,(93-20),(90-20));
	        nb3.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        nb3.setBounds(340, 141, 93, 90);
	        nb3.setFocusable(false);
	        nb3.setContentAreaFilled(false);
	        nb3.setOpaque(false);
	        nb3.setBorderPainted(false);
	       
	        
	        
	        B_Button nb4 = new B_Button("",Image_Paths.s_agree,110,105,(110-20),(105-20));
	        nb4.setBounds(441, 134, 110, 105);
	        nb4.setFocusable(false);
	        nb4.setContentAreaFilled(false);
	        nb4.setOpaque(false);
	        nb4.setBorderPainted(false);
	        
	        B_Button nb5 = new B_Button("",Image_Paths.s_disagree,110,105,(110-20),(105-20));
	        nb5.setBounds(22, 372, 110, 105);
	        nb5.setFocusable(false);
	        nb5.setContentAreaFilled(false);
	        nb5.setOpaque(false);
	        nb5.setBorderPainted(false);
	       
	        
	        B_Button nb6 = new B_Button("",Image_Paths.disagree,93,90,(93-20),(90-20));
	        nb6.setBounds(143, 387, 93, 90);
	        nb6.setFocusable(false);
	        nb6.setContentAreaFilled(false);
	        nb6.setOpaque(false);
	        nb6.setBorderPainted(false);
	       
	        
	        
	        
	        B_Button nb7 = new B_Button("",Image_Paths.neutral,85,79,(85-20),(79-20));
	        nb7.setBounds(247, 391, 85, 79);
	        nb7.setFocusable(false);
	        nb7.setContentAreaFilled(false);
	        nb7.setOpaque(false);
	        nb7.setBorderPainted(false);
	       
	        
	        B_Button nb8 = new B_Button("",Image_Paths.agree,93,90,(93-20),(90-20));
	        nb8.setBounds(340, 385, 93, 90);
	        nb8.setFocusable(false);
	        nb8.setContentAreaFilled(false);
	        nb8.setOpaque(false);
	        nb8.setBorderPainted(false);
	       
	        
	        
	        B_Button nb9 = new B_Button("",Image_Paths.s_agree,110,105,(110-20),(105-20));
	        nb9.setBounds(441, 374, 110, 105);
	        nb9.setFocusable(false);
	        nb9.setContentAreaFilled(false);
	        nb9.setOpaque(false);
	        nb9.setBorderPainted(false);
	        
	        
	        
	        B_Button nb10 = new B_Button("",Image_Paths.s_disagree,117,109,(117-20),(109-20));
	        nb10.setBounds(718, 135, 117, 109);
	        nb10.setFocusable(false);
	        nb10.setContentAreaFilled(false);
	        nb10.setOpaque(false);
	        nb10.setBorderPainted(false);
	        
	        
	        
	        B_Button nb11 = new B_Button("",Image_Paths.disagree,93,90,(93-20),(90-20));
	        nb11.setBounds(846, 140, 93, 90);
	        nb11.setFocusable(false);
	        nb11.setContentAreaFilled(false);
	        nb11.setOpaque(false);
	        nb11.setBorderPainted(false);
	       
	        
	        
	        B_Button nb12 = new B_Button("",Image_Paths.neutral,85,79,(85-20),(79-20));
	        nb12.setBounds(953, 145, 85, 79);
	        nb12.setFocusable(false);
	        nb12.setContentAreaFilled(false);
	        nb12.setOpaque(false);
	        nb12.setBorderPainted(false);
	        
	        
	        
	        B_Button nb13 = new B_Button("",Image_Paths.agree,93,90,(93-20),(90-20));
	        nb13.setBounds(1046, 140, 93, 90);
	        nb13.setFocusable(false);
	        nb13.setContentAreaFilled(false);
	        nb13.setOpaque(false);
	        nb13.setBorderPainted(false);
	        
	        
	        
	        
	        
	        B_Button nb14 = new B_Button("",Image_Paths.s_agree,110,105,(110-20),(105-20));
	        nb14.setBounds(1156, 135, 110, 105);
	        nb14.setFocusable(false);
	        nb14.setContentAreaFilled(false);
	        nb14.setOpaque(false);
	        nb14.setBorderPainted(false);
	       
	        
	        B_Button nb15 = new B_Button("",Image_Paths.s_disagree,117,109,(117-20),(109-20));
	        nb15.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        nb15.setBounds(723, 372, 117, 109);
	        nb15.setFocusable(false);
	        nb15.setContentAreaFilled(false);
	        nb15.setOpaque(false);
	        nb15.setBorderPainted(false);
	       
	        
	        B_Button nb16 = new B_Button("",Image_Paths.disagree,93,90,(93-20),(90-20));
	        nb16.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        nb16.setBounds(846, 380, 93, 90);
	        nb16.setFocusable(false);
	        nb16.setContentAreaFilled(false);
	        nb16.setOpaque(false);
	        nb16.setBorderPainted(false);
	       
	        
	        B_Button nb17 = new B_Button("",Image_Paths.neutral,85,79,(85-20),(79-20));
	        nb17.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        nb17.setBounds(953, 384, 85, 79);
	        nb17.setFocusable(false);
	        nb17.setContentAreaFilled(false);
	        nb17.setOpaque(false);
	        nb17.setBorderPainted(false);
	       
	        
	        
	        B_Button nb18 = new B_Button("",Image_Paths.agree,93,90,(93-20),(90-20));
	        nb18.setBounds(1046, 380, 93, 90);
	        nb18.setFocusable(false);
	        nb18.setContentAreaFilled(false);
	        nb18.setOpaque(false);
	        nb18.setBorderPainted(false);
	        
	        
	        
	        
	        B_Button nb19 = new B_Button("",Image_Paths.s_agree,110,105,(110-20),(105-20));
	        nb19.setBounds(1154, 372, 110, 105);
	        nb19.setFocusable(false);
	        nb19.setContentAreaFilled(false);
	        nb19.setOpaque(false);
	        nb19.setBorderPainted(false);
	        

	        B_Button nb20 = new B_Button(Image_Paths.right1,Image_Paths.right2,184,119,(184+20),(119+20));
	        nb20.setBounds(1089, 517, 184, 119);
	        nb20.setFocusable(false);
	        nb20.setContentAreaFilled(false);
	        nb20.setOpaque(false);
	        nb20.setBorderPainted(false);
	        resizeIcon(nb20, Image_Paths.right1, nb20.getWidth(), nb20.getHeight());
	        nb20.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Q_Screen3 q3 = new Q_Screen3();
	        	}
	        });
	        
	        
	        
	        B_Button nb21 = new B_Button(Image_Paths.left1,Image_Paths.left2,184,119,(184+20),(119+20));
	        nb21.setBounds(10, 517, 184, 119);
	        nb21.setFocusable(false);
	        nb21.setContentAreaFilled(false);
	        nb21.setOpaque(false);
	        nb21.setBorderPainted(false);
	        resizeIcon(nb21, Image_Paths.left1, nb21.getWidth(), nb21.getHeight());
	        nb21.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Q1_Screen q1 = new Q1_Screen();
	        	}
	        });

	        
	        B_Button nb = new B_Button("",Image_Paths.s_disagree,110,105,(110-20),(105-20));
	        nb.setBounds(23, 136, 110, 105);
	       
	        nb.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        nb.setFocusable(false);
	        nb.setContentAreaFilled(false);
	        nb.setOpaque(false);
	        nb.setBorderPainted(false);
	        

	        
	        
			contentPane.add(nb);
			contentPane.add(nb1);
			contentPane.add(nb2);
			contentPane.add(nb3);
			contentPane.add(nb4);
			contentPane.add(nb5);
			contentPane.add(nb6);
			contentPane.add(nb7);
			contentPane.add(nb8);
			contentPane.add(nb9);
			contentPane.add(nb10);
			contentPane.add(nb11);
			contentPane.add(nb12);
			contentPane.add(nb13);
			contentPane.add(nb14);
			contentPane.add(nb15);
			contentPane.add(nb16);
			contentPane.add(nb17);
			contentPane.add(nb18);
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
