package programmierung1.blatt10.becherScheibe;

public class Scheibe {
	private int radius;
	
	public Scheibe(int radius) {
		this.radius = radius;
	}
	
	public void verkleinern(int kleiner) {
		this.radius -= kleiner;
	}
	
	public double flaeche() {
		return Math.PI * radius * radius;
	}
	
	public double umfang() {
		return 2 * Math.PI * radius;
	}
}
