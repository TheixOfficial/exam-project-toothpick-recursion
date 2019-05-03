package uk.co.theix.A160120.graphics;

import javax.swing.JFrame;

public class GUI extends JFrame{
	private static final long serialVersionUID = 1L;

	public GUI(int WIDTH, int HEIGHT) {
		components();
	}
	
	public void components() {
		Paint p = new Paint();
		add(p);
		pack();
	}
	
}
