package data_project;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Question_Screen extends JFrame {
 JLabel label = new JLabel("Hi");
 
 public Question_Screen() {
	 setTitle("Welcome");
     setSize(1920,1055);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setLocationRelativeTo(null); // Center the window
     setResizable(true);
     getContentPane().setLayout(new BorderLayout());
     label.setSize(new Dimension(50, 50));
     add(label);
     }
}
