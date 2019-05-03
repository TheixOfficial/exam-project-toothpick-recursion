package uk.co.theix.A160120;

import uk.co.theix.A160120.graphics.GUI;

public class Main{
	
	private static int HEIGHT = 900;
	private static int WIDTH = HEIGHT / 9 * 16;
	
	public static void main(String[] args) {
		GUI frame = new GUI(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
		frame.setTitle("A160120 recursion");
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
	}

}
