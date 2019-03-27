package programmierung2.blatt03.Aufgabe10;

import java.awt.Graphics;

public class Dreieck implements GeoObjekt {
	protected Punkt a, b, c;
	private Strecke ab,bc,ca;

	@Override
	public void drehen(double phi) {
		a.drehen(phi);
		b.drehen(phi);
		c.drehen(phi);
	}

	@Override
	public void zeichnen(Graphics g, int xNull, int yNull) {
		ab.zeichnen(g, xNull, yNull);
		bc.zeichnen(g, xNull, yNull);
		ca.zeichnen(g, xNull, yNull);
	}

	public Dreieck(Punkt a, Punkt b, Punkt c) {
		this.a = a;
		this.b = b;
		this.c = c;
		ab = new Strecke(a, b);
		bc = new Strecke(b, c);
		ca = new Strecke(c, a);
	}
}
