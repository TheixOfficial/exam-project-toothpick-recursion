package uk.co.theix.A160120.graphics;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Paint extends Canvas{
	private static final long serialVersionUID = 1L;
	
	ArrayList<Toothpick> picks;

	int xPoints[] = {0,  3,  3,  36,  37,  33,  0, -33, -37, -36, -3, -3};
	int yPoints[] = {43, 40, 2, -17, -21, -22, -3, -22, -21, -17,  2, 40};
	Graphics g;
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.translate(getWidth()/2, getHeight()/2);
		g2d.scale(1.0, -1.0);
		
		picks = new ArrayList<Toothpick>();
		picks.add(new Toothpick(0,0));
		
		g.drawLine(-getWidth()/2, 0, getWidth()/2, 0);
		g.drawLine(0, -getHeight()/2, 0, getHeight()/2);
		
		for (Toothpick t : picks) {
			t.draw(g);
		}
		//new Toothpick(g);
		//g.fillPolygon(xPoints, yPoints, xPoints.length);
		//addToothpicks();
	}
	
}