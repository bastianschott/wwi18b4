package softwareEngineering1.se1_blatt04;

public class Rechteck {

	private final int a;
	private final int b;

	public Rechteck(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int flaeche() {
		return a * b;
	}

	public boolean istQuadratisch() {
		return a == b;
	}

}
