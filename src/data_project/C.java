package data_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class C {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Circular Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a circular button
        JButton circularButton = new JButton();
        circularButton.setPreferredSize(new Dimension(100, 100));
        circularButton.setContentAreaFilled(false);
        circularButton.setBorderPainted(false);
        circularButton.setFocusPainted(false);
        
        // Set the button's icon and resize it to fit
        ImageIcon icon = new ImageIcon("\"C:\\Users\\mimim\\Downloads\\TC1.png\""); // Change this to your image path
        Image img = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(img);
        circularButton.setIcon(resizedIcon);
        
        // Add action listener (just for demonstration)
        circularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Circular Button Clicked!");
            }
        });

        // Add the circular button to a panel
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.add(circularButton);

        // Add the panel to the frame and display
        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

