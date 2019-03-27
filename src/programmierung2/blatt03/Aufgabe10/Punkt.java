package programmierung2.blatt03.Aufgabe10;

public class Punkt {
	private double x, y;

	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void drehen(double phi) {
		double xneu = x * Math.cos(phi) - y * Math.sin(phi);
		y = x * Math.sin(phi) + y * Math.cos(phi);
		x = xneu;
	}
}
