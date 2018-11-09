package programmierung1.blatt10.becherScheibe;

public class Becher extends Scheibe {
	private int hoehe;

	public Becher(int hoehe, int radius) {
		super(radius);
		this.hoehe = hoehe;
	}
	public void verkleinern(int kleiner) {
		super.verkleinern(kleiner);
		this.hoehe -= kleiner;
	}
}
