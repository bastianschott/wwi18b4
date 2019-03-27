package programmierung2.blatt03.Aufgabe10;

import java.awt.Graphics;

public class Strecke implements GeoObjekt {
	private Punkt a, b;

	@Override
	public void drehen(double phi) {
		a.drehen(phi);
		b.drehen(phi);
	}

	@Override
	public void zeichnen(Graphics g, int xNull, int yNull) {
		g.drawLine((int) a.getX() + xNull, (int) a.getY() + yNull, (int) b.getX() + xNull, (int) b.getY() + yNull);
	}

	public Strecke(Punkt a, Punkt b) {
		this.a = a;
		this.b = b;
	}
}
