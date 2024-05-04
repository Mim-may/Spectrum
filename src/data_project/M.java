package data_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class M extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

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

    public M() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 951, 652);

        // JLabel
        T_label tsp = new T_label(255,255,255,128);
        tsp.setBounds(27, 11, 518, 126);
        tsp.setRadius(100);
        ImageIcon ic = new ImageIcon("/data_project/SDIS.png");
        tsp.scaleImageIcon(ic);

        // JButton
        JButton nb = new JButton();
        nb.setBounds(23, 148, 113, 112);
        nb.setFocusable(false);
        nb.setContentAreaFilled(false);
        nb.setOpaque(false);
        nb.setBorderPainted(false);
        ImageIcon icon = new ImageIcon(Q1_Screen.class.getResource("/data_project/SDIS.png"));
        Image scaledImage = icon.getImage().getScaledInstance(nb.getWidth(), nb.getHeight(), Image.SCALE_SMOOTH);
        nb.setIcon(new ImageIcon(scaledImage));

        contentPane = new ImageExample("C:\\Users\\mimim\\Downloads\\BB.png");
        contentPane.setSize(new Dimension(1920, 1055));
        contentPane.setBackground(new Color(240, 240, 240));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        contentPane.add(tsp);
        contentPane.add(nb);

        setContentPane(contentPane);
        setSize(1360, 736);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}


