package uk.co.theix.A160120.graphics;

import java.awt.Graphics;

public class Toothpick extends Paint {
	private static final long serialVersionUID = 1L;

	private int xPoints[];
	private int yPoints[];

	Paint p = new Paint();

	public Toothpick(int x, int y) {
		xPoints = new int[]{x + 0, x + 3, x + 3, x + 36, x + 37, x + 33, x + 0, x - 33, x - 37, x - 36, x - 3, x - 3};
		yPoints = new int[]{y + 43, y + 40, y + 2, y - 17, y - 21, y - 22, y - 3, y - 22, y - 21, y - 17, y + 2, y + 40};

		boolean tLegOverlap = false;
		boolean rLegOverlap = false;
		boolean lLegOverlap = false;
	}

	public void draw(Graphics g) {
		g.fillPolygon(xPoints, yPoints, xPoints.length);
	}

}
