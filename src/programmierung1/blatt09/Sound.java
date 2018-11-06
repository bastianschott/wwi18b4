package programmierung1.blatt09;

public class Sound {
	private String raum;
	private int laut, bass, hoehe;
	
	public Sound(String raum, int laut, int bass, int hoehe) {
		this.raum = raum;
		this.laut = laut;
		this.bass = bass;
		this.hoehe = hoehe;
	}
	
	public int getLautstaerke() {
		return this.laut;
	}
	
	public void verstaerke(String regler, int wert) {
		bass += regler=="baesse"?wert:0;
		hoehe += regler=="hoehen"?wert:0;
	}
	
	public String toString() {
		return "Anlage im Raum " + this.raum + ": la: " + this.laut + ", ba: " + this.bass + ", ho: " + this.hoehe;
	}
}
