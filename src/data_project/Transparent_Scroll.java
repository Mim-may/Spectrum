package data_project;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Transparent_Scroll extends JPanel {
public Transparent_Scroll() {
     setOpaque(false); // Make JScrollPane transparent
    // getViewport().setOpaque(false); // Make the viewport transparent
 }
 
 @Override
 protected void paintComponent(Graphics g) {
     super.paintComponent(g);
     g.setColor(new Color(0, 0, 0, 50)); // 128 is the alpha value (50% opacity)
     g.fillRect(0, 0, getWidth(), getHeight());
     setOpaque(false); // Ensure the JScrollPane remains transparent
 }
}

