package data_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageReader;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Glowing extends JComponent {
 private int shadowSize = 20;
 private int borderSize = 2;
 private Color g1 = new Color(255,0,0);
 private Color g2_ = new Color(0, 49, 255);
 private Color backgroundLight = new Color(35,35,35);
 private BufferedImage imageRender;

 
 public Glowing() {
	 setBorder( new EmptyBorder(shadowSize,shadowSize,shadowSize, shadowSize));
	 setBackground(new Color(20,20,20));
 }
 
 @Override
	protected void paintComponent(Graphics g) {
		if (imageRender != null) {
			Graphics2D g2 = (Graphics2D) g.create();
			g2.drawImage(imageRender, 0, 0, null);
			g2.dispose();
		}
		super.paintComponent(g);
	}
  private void createImageRender() {
	  int width = getWidth();
	  int height = getHeight();
	  if (width>0 && height>0) {
		  Insets inset = getInsets();
		  imageRender = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		  Graphics2D g2 = imageRender.createGraphics();
		  g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		  // Draw shadow left
		  g2.drawImage(createShadow(width, height, inset, g1, true),0,0,null);
		  //Draw shadow right
		  g2.drawImage(createShadow(width, height, inset, g2_, false),0,0,null);
	      Area area = new Area(new Rectangle2D.Double(inset.left, inset.top, width - inset.left - inset.right, height - inset.top - inset.bottom));
	      g2.setColor(getBackground());
	      g2.fill(area);
	      area.subtract(new Area(new Rectangle2D.Double(width / 2, 0, width/2, height)));
	      g2.setColor(backgroundLight);
	      g2.fill(area);
	      g2.drawImage(createBorder(width,height,inset),0,0,null);
	      g2.dispose();
	  
	  }
  }
  private Color toTranslucentColor (Color color) {
	  return new Color(color.getRed(), color.getGreen(), color.getBlue(), 0);
  }
  private BufferedImage createShadow(int width, int height, Insets inset, Color color, boolean leftShadow) {
	  BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	  Graphics2D g2 = img.createGraphics();
	  Path2D p =  new Path2D.Double();
	  double w = width - inset.left - inset.right;
	  double h = height  - inset.top - inset.bottom;
	  if (leftShadow) {
		  p.moveTo(0, 0);
		  p.lineTo(w, h);
		  p.lineTo(0, h);
	  } else {
		  p.moveTo(0,0);
		  p.lineTo(w, 0);
		  p.lineTo(w, h);
	  }
	  
	  g2.fill(p);
	  g2.dispose();
	return new ShadowRenderer(shadowSize, 0.45f, color).createShadow(img);
	 // return null;
  }
  
  private BufferedImage createBorder(int width, int height, Insets inset) {
	  BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	  Graphics2D g2 = img.createGraphics();
	  g2.drawImage(createShadow(width, height, inset, g1, true),0,0,null);
	  double w = width - inset.left - inset.right;
	  double h = height  - inset.top - inset.bottom;
	  //Draw left
	  Color traColor = toTranslucentColor(g1);
	  Color traColor2 = toTranslucentColor(g2_);
	  g2.setPaint(new GradientPaint(0, (float)(h * 0.1f), traColor, 0, (float)(h * 0.1f), traColor2));
	  g2.fill(new Rectangle2D.Double(inset.left, inset.top, borderSize, h));
	  g2.setPaint(new GradientPaint(0, 0, g1, (float) (w * 0.9f), 0, traColor2));
	  g2.fill(new Rectangle2D.Double(inset.left, height - inset.bottom - borderSize, w, borderSize));
	  
	  g2.setPaint(new GradientPaint((float)(w*0.1f), 0, traColor2,(float) w, 0, g2_));
	  g2.fill(new Rectangle2D.Double(inset.left, inset.top, w, borderSize));
	  
	  g2.setPaint(new GradientPaint(0, 0, g2_,0 , (float) (h * 0.9f), traColor2));
	  g2.fill(new Rectangle2D.Double(width -inset.right - borderSize, inset.top ,borderSize, h));
	  
	  
	  
	  g2.dispose();
	  return img;
  }
  public void setBounds(int x, int y, int width, int height) {
	  super.setBounds(x, y, width, height);
	  createImageRender();
  }
  public static void main(String[] args) {
	  SwingUtilities.invokeLater(() -> {
          JFrame frame = new JFrame("Glowing Button Example");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setLayout(new BorderLayout());

          Glowing glowing = new Glowing();
          glowing.setPreferredSize(new Dimension(150, 50)); // Set the size of the button
          glowing.setBackground(Color.WHITE); // Set the background color of the button
          glowing.setForeground(Color.BLACK);

          JPanel buttonPanel = new JPanel(); // Create a panel for the button
          buttonPanel.setBackground(Color.DARK_GRAY);
          buttonPanel.add(glowing); // Add the button to the panel

          JPanel contentPane = new JPanel(new BorderLayout()); // Create a content pane for the button panel
          contentPane.setBackground(Color.WHITE);
          contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add padding
          contentPane.add(buttonPanel, BorderLayout.CENTER); // Add the button panel to the content pane

          frame.setContentPane(contentPane); // Set the content pane of the frame

         // frame.pack();
          frame.setLocationRelativeTo(null);
          frame.setVisible(true);
      });
  }
}

