package uk.co.theix.A160120.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Toothpick extends Paint {
	private static final long serialVersionUID = 1L;

	public int xPoints[], yPoints[];
	public boolean newPick = true;

	Paint p = new Paint();

	public Toothpick(int x, int y) {
		xPoints = new int[]{x + 0, x + 3, x + 3, x + (498079185 / 13781549), x + (145229779 / 3899928), x + (456734538 / 13781549) , x + 0, x - (456734538 / 13781549), x - (145229779 / 3899928), x - (498079185 / 13781549), x - 3, x - 3};
		yPoints = new int[]{y + 43, y + 40, y + (978122 / 564719), y - (14623202 / 840321), y - (43 / 2), y - (18989638 / 840321), y - (3650401 / 1053780), y - (18989638 / 840321), y - (43 / 2), y - (14623202 / 840321), y + (978122 / 564719), y + 40};

		//Moving toothpick up x=0, y=43
		//Moving toothpick down right x=37, y=-21
		//Moving toothpick down left x=-37, y=-21
	}
	
	private boolean intersects(int x, int y) {
		if (xPoints[0] == x && yPoints[0] == y) {
			return true;
		}/* else if ((xPoints[xPoints.length/3*1]-1 > x || xPoints[xPoints.length/3*1]+1 < x) && (yPoints[yPoints.length/3*1]-1 > y || yPoints[yPoints.length/3*1]+1 < y)) {
			return true;
		}*/ else if (xPoints[xPoints.length/3*2] == x && yPoints[yPoints.length/3*2] == y) {
			return true;
		} else {
			return false;
		}
		
	}

	public Toothpick createT(ArrayList<Toothpick> others) {
		boolean available = true;
		for (Toothpick other : others) {
			if (other != this && other.intersects(xPoints[0], yPoints[0])) {
				available = false;
			}
		}
		if (available) {
			return new Toothpick(xPoints[0], yPoints[0]);
		} else {
			return null;
		}
	}
	
	public Toothpick createR(ArrayList<Toothpick> others) {
		boolean available = true;
		for (Toothpick other : others) {
			if (other != this && other.intersects(xPoints[xPoints.length/3], yPoints[yPoints.length/3])) {
				available = false;
			}
		}
		if (available) {
			return new Toothpick(xPoints[xPoints.length/3], yPoints[yPoints.length/3]);
		} else {
			return null;
		}
	}
	
	public Toothpick createL(ArrayList<Toothpick> others) {
		boolean available = true;
		for (Toothpick other : others) {
			if (other != this && other.intersects(xPoints[xPoints.length/3*2], yPoints[yPoints.length/3*2])) {
				available = false;
			}
		}
		if (available) {
			return new Toothpick(xPoints[xPoints.length/3*2], yPoints[yPoints.length/3*2]);
		} else {
			return null;
		}
	}
	
	public void draw(Graphics g) {
		if (newPick) {
			g.setColor(new Color(255, 0, 0));
		}
		g.fillPolygon(xPoints, yPoints, xPoints.length);
	}

}
