package data_project;

import java.awt.Color;

public class Ambivert1 extends First_Result {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ambivert1 frame = new Ambivert1();
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
	public Ambivert1() {
		super(Image_Paths.ambivert1,Amigo.class);
	}

}

