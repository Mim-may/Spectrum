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

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TE extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	   public void resizeIcon(B_Button button,String path, int width, int height) {
		    ImageIcon icon = new ImageIcon(path);
	        Image image = icon.getImage();
	        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	       button.setIcon(new ImageIcon(resizedImage));
	    }
	   public void scaleImage(B_Button label, String path, int width, int height) {
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TE frame = new TE();
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

		   	public TE() {
			setSize(new Dimension(1367, 740));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 908, 527);
			contentPane = new ImageExample(Image_Paths.background);
			contentPane.setSize(new Dimension(1920, 1055));
			contentPane.setBackground(new Color(240, 240, 240));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			
			
	        B_Button btnNewButton = new B_Button(Image_Paths.start,Image_Paths.start_,350,117,350,117);
	      btnNewButton.setIcon(new ImageIcon(Image_Paths.start));
	        btnNewButton.setBounds(442, 317, 350, 117);
	        btnNewButton.setOpaque(false);
	        btnNewButton.setContentAreaFilled(false);
	      //  btnNewButton.setIcon(new ImageIcon("C:\\Users\\mimim\\Downloads\\S1_.png"));
			btnNewButton.addActionListener(new ActionListener() {
				
				 public void actionPerformed(ActionEvent e) {
		            if (e.getSource() == btnNewButton) {
		            	 dispose();
		            	 Q1_Screen screen = new Q1_Screen();
		            	 screen.setVisible(true);
		            }
		         }
			});
			contentPane.setLayout(null);
			contentPane.add(btnNewButton);
			
		}
	}


