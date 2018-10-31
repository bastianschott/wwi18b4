package semester1.programmieren1.blatt09;

public class CD {
	private String titel;
	private int spieldauer;
	private boolean ausgeliehen;
	
	public CD(String titel, int spieldauer, boolean ausgeliehen) {
		this.titel = titel;
		this.spieldauer = spieldauer;
		this.ausgeliehen = ausgeliehen;
	}
	
	public String toString() {
		return this.titel + " (" + this.spieldauer + ")";
	}
}
