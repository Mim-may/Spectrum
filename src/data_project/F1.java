package data_project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class F1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private ImageExample contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F1 frame = new F1();
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
	public F1() {
		setSize(new Dimension(908, 738));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1372, 737);
//		contentPane = new JPanel();
		contentPane = new ImageExample("C:\\Users\\mimim\\Downloads\\mixed.png");
		contentPane.setSize(new Dimension(1920, 1055));
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		StretchIcon i = new StretchIcon(new ImageIcon("C:\\Users\\mimim\\Downloads\\S_.png").getImage());
		
		
        T_Button btnNewButton = new T_Button();
      //  btnNewButton.setRadius(100);
        btnNewButton.setBounds(473, 330, 356, 123);
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\mimim\\Downloads\\T__.png"));
       // scaleImage(btnNewButton,"C:\\\\Users\\\\mimim\\\\Downloads\\\\S_.png", btnNewButton.getWidth(), btnNewButton.getHeight());
     //  resizeIcon(btnNewButton,"C:\\Users\\mimim\\Downloads\\S_.png", btnNewButton.getWidth(), btnNewButton.getHeight());
		btnNewButton.addActionListener(new ActionListener() {
			
			 public void actionPerformed(ActionEvent e) {
	            if (e.getSource() == btnNewButton) {
	            	 dispose();
	            	 Question_Screen screen = new Question_Screen();
	            	 screen.setVisible(true);
	            }
	         }
		});
		contentPane.add(btnNewButton);
	}

}
