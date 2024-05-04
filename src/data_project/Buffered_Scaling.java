package data_project;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class I_Panel extends JPanel {
    private BufferedImage backgroundImage;

    public I_Panel(String imagePath) {
        try {
            backgroundImage = ImageIO.read(new File(imagePath));
            Image image = backgroundImage.getScaledInstance(1920, 1055, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    Image image = backgroundImage.getScaledInstance(1920, 1055, Image.SCALE_DEFAULT);
}

public class Buffered_Scaling {
	 public static void main(String[] args) {
	        JFrame frame = new JFrame("Background Image Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        I_Panel panel = new I_Panel("C:\\Users\\mimim\\Downloads\\Background_Two.jpeg"); // Replace "background.jpg" with your image path
	        panel.setLayout(new BorderLayout()); // Use BorderLayout to fill the frame
	        // Add other components to the panel
	        JLabel label = new JLabel("Hello, World!");
	        panel.add(label, BorderLayout.CENTER);
	        
	        frame.getContentPane().add(panel);
	        frame.setSize(800, 600); // Set the frame size
	        frame.setVisible(true);
}
}
