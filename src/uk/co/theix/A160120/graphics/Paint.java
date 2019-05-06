package uk.co.theix.A160120.graphics;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Paint extends Canvas {
	private static final long serialVersionUID = 1L;

	private ArrayList<Toothpick> picks;
	private ArrayList<Toothpick> next = new ArrayList<Toothpick>();

	private boolean setup = true;
	
	boolean test = false;

	public void paint(Graphics g)
	{if (setup) {
		picks = new ArrayList<Toothpick>();
		picks.add(new Toothpick(0, 0));
		setup = false;
	}
		Graphics2D g2d = (Graphics2D) g;

		g2d.translate(getWidth() / 2, getHeight() / 2);
		g2d.scale(0.5, -0.5);

		//g.drawLine(-getWidth(), 0, getWidth(), 0);
		//g.drawLine(0, -getHeight(), 0, getHeight());
		
		for (Toothpick t : picks) {
			t.draw(g);
		}
	}
	
	void update() {
		for (Toothpick t : picks) {
			if (t.newPick) {
				Toothpick nextT = t.createT(picks);
				Toothpick nextR = t.createR(picks);
				Toothpick nextL = t.createL(picks);
				if (nextT != null) {
					next.add(nextT);
				}
				if (nextR != null) {
					next.add(nextR);
				}
				if (nextL != null) {
					next.add(nextL);
				}
				t.newPick = false;
			}
		}

		picks.addAll(next);
		System.out.println(picks.size());
	}

}