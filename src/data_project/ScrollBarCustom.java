package data_project;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {
ScrollBarCustom() {
	setUI(new ModernScrollBarUI());
	setPreferredSize(new Dimension(8, 8));
	setForeground(new Color(69, 227, 76));
	setBackground(Color.white);
}
}
