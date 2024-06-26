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

public class Q1_Screen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q1_Screen frame = new Q1_Screen();
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
	public Q1_Screen() {
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 951, 652);
		contentPane = new ImageExample(Image_Paths.default1);
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
        		Q_Screen2 sp = new Q_Screen2();
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
        		TE welcome = new TE();
			dispose();
        	}
        });

        
        B_Button nb = new B_Button("",Image_Paths.s_disagree,110,105,(110-20),(105-20));
        nb.setBounds(23, 136, 110, 105);
        nb.setFocusable(false);
        nb.setContentAreaFilled(false);
        nb.setOpaque(false);
        nb.setBorderPainted(false);


     ButtonGroup group1 = new ButtonGroup();
     ButtonGroup group2 = new ButtonGroup();
     ButtonGroup group3 = new ButtonGroup();
     ButtonGroup group4 = new ButtonGroup();

		
        ActionListener buttonActionListener = e -> {
            B_Button sourceButton = (B_Button) e.getSource();
            // Deselect all buttons
            for (B_Button button : group1.getButtons()) {
                if (button != sourceButton) {
                    button.setSelected(false);
                }
            }
        };

         ActionListener buttonActionListener1 = e -> {
            B_Button sourceButton = (B_Button) e.getSource();
            // Deselect all buttons
            for (B_Button button : group2.getButtons()) {
                if (button != sourceButton) {
                    button.setSelected(false);
                }
            }
        };

          ActionListener buttonActionListener2 = e -> {
            B_Button sourceButton = (B_Button) e.getSource();
            // Deselect all buttons
            for (B_Button button : group3.getButtons()) {
                if (button != sourceButton) {
                    button.setSelected(false);
                }
            }
        };
       ActionListener buttonActionListener3 = e -> {
            B_Button sourceButton = (B_Button) e.getSource();
            // Deselect all buttons
            for (B_Button button : group4.getButtons()) {
                if (button != sourceButton) {
                    button.setSelected(false);
                }
            }
        };		
        nb.addActionListener(buttonActionListener);
        nb1.addActionListener(buttonActionListener);
        nb2.addActionListener(buttonActionListener);
        nb3.addActionListener(buttonActionListener);
        nb4.addActionListener(buttonActionListener);
		
        nb5.addActionListener(buttonActionListener1);
        nb6.addActionListener(buttonActionListener1);
	nb7.addActionListener(buttonActionListener1);
	nb8.addActionListener(buttonActionListener1);
	nb9.addActionListener(buttonActionListener1);
		
	nb10.addActionListener(buttonActionListener2);
	nb11.addActionListener(buttonActionListener2);
	nb12.addActionListener(buttonActionListener2);
	nb13.addActionListener(buttonActionListener2);
	nb14.addActionListener(buttonActionListener2);
		
	nb15.addActionListener(buttonActionListener3);
	nb16.addActionListener(buttonActionListener3);
	nb17.addActionListener(buttonActionListener3);
	nb18.addActionListener(buttonActionListener3);
	nb19.addActionListener(buttonActionListener3);

        // Add buttons to the button group
        group1.add(nb);
        group1.add(nb1);
        group1.add(nb2);
	group1.add(nb3);
        group1.add(nb4);

	group2.add(nb5);
	group2.add(nb6);
	group2.add(nb7);
	group2.add(nb8);
	group2.add(nb9);

	group3.add(nb10);
	group3.add(nb11);
	group3.add(nb12);
	group3.add(nb13);
	group3.add(nb14);

	group4.add(nb15);
	group4.add(nb16);
	group4.add(nb17);
	group4.add(nb18);
	group4.add(nb19);
		
        

        
        
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

		  addComponentListener(new ComponentAdapter() {
	            @Override
	            public void componentResized(ComponentEvent e) {
	            	resizeAction(10, 500, nb21);
	            	resizeAction(1082, 500, nb20);
	            	resizeAction(714, 133, nb10);
                   	resizeAction(20, 131, nb);
	            	resizeAction(141, 142, nb1);
	            	resizeAction(243, 147, nb2);
                	resizeAction(337, 138, nb3);
//	            	resizeAction(714, 133, nb4);
//	            	resizeAction(714, 133, nb5);
//	            	resizeAction(714, 133, nb6);
//	            	resizeAction(714, 133, nb7);
//	            	resizeAction(714, 133, nb8);
//	            	resizeAction(714, 133, nb9);
//	            	resizeAction(714, 133, nb11);
//	            	resizeAction(714, 133, nb12);
//	            	resizeAction(714, 133, nb13);
//	            	resizeAction(714, 133, nb14);
//	            	resizeAction(714, 133, nb15);
//	            	resizeAction(714, 133, nb16);
//	            	resizeAction(714, 133, nb17);
//	            	resizeAction(714, 133, nb18);
//	            	resizeAction(714, 133, nb19);
	            	
	            }
	        });

	}
	
	public void scaleImage(T_label label, String path, int width, int height) {
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
	   public void scaleImageIcon(ImageIcon icon, T_label lbl) {
		    if (icon == null) {
		        System.out.println("Error: ImageIcon is null");
		        return;
		    }

		    if (getWidth() == 0 || getHeight() == 0) {
		        System.out.println("Error: Label size is zero");
		        return;
		    }

		    Image image = icon.getImage();
		    int iconWidth = icon.getIconWidth();
		    int iconHeight = icon.getIconHeight();

		    double labelWidth = lbl.getWidth() - getInsets().left - getInsets().right;
		    double labelHeight = lbl.getHeight() - getInsets().top - getInsets().bottom;

		    if (labelWidth <= 0 || labelHeight <= 0) {
		        System.out.println("Error: Label size is invalid");
		        return;
		    }

		    double scaleFactor = Math.min(labelWidth / iconWidth, labelHeight / iconHeight);
		    int scaledWidth = (int) (iconWidth * scaleFactor);
		    int scaledHeight = (int) (iconHeight * scaleFactor);

		    Image scaledImage = image.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
		    lbl.setIcon(new ImageIcon(scaledImage));

		    System.out.println("Icon scaled successfully");
		}

	   private void resizeAction(int init_x, int init_y,B_Button button) {
		   int initialx = init_x;
		   int initialy = init_y;
           int frameWidth = getWidth();
           int frameHeight = getHeight();

           // Get the maximized frame size
           GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
           Rectangle bounds = env.getMaximumWindowBounds();
           int maxWidth = bounds.width;
           int maxHeight = bounds.height;

           // Calculate the ratio of the current size to the maximized size
           double widthRatio = (double) frameWidth / maxWidth;
           double heightRatio = (double) frameHeight / maxHeight;

           // Calculate the new position of the button based on the ratio
           int buttonX = (int) (initialx * widthRatio);
           int buttonY = (int) (initialy * heightRatio);

           // Set the new position of the button
            button.setBounds(buttonX, buttonY, button.getWidth(),button.getHeight());

           // Repaint the content pane
           contentPane.repaint();
		   
	   }  

}
