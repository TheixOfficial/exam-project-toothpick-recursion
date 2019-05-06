package uk.co.theix.A160120.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JButton step = new JButton();

	public GUI(int WIDTH, int HEIGHT) {
		components();
	}
	
	public void components() {
		Paint p = new Paint();
		step.setText("Step");
		step.setBounds(10, 10, 80, 25);
		step.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.update();
				p.repaint();
			}
		});
		add(step);
		add(p);
		pack();
	}
	
}
