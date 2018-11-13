package programmierung1.blatt11.Aufgabe47;

public class FarbFernseher extends Fernseher {
	private int farbe;
	
	public FarbFernseher(String ra, int vo, int pr, int farbe) {
		super(ra, vo, pr);
		this.farbe = Math.max(0, Math.min(farbe, 50));
	}
	
	public void change(String einstell, int wert) {
		farbe = einstell.equals("color") ? farbe+wert : farbe;
		super.change(einstell, wert);
	}
	
	public int getFarbe() {
		return farbe;
	}
	
	public boolean istAngenehmerAls(FarbFernseher f) {
		return this.getVolume() <= f.getVolume() && 
				this.getFarbe() <= 40 && 
				this.getFarbe() >= f.getFarbe();
	}
	
	public String toString() {
		return super.toString() + ", f=" + farbe;
	}
	
}
