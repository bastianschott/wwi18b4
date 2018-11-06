package programmierung1.blatt09;

public class CD {
	private String titel;
	private int spieldauer;
	private boolean ausgeliehen;
	
	public CD() {
		this.titel = "";
		this.spieldauer = 0;
		this.ausgeliehen = false;
	}
	
	public CD(String titel, int spieldauer, boolean ausgeliehen) {
		this.titel = titel;
		this.spieldauer = spieldauer;
		this.ausgeliehen = ausgeliehen;
	}
	
	public String toString() {
		return titel + " (" + spieldauer + ")";
	}
	
	public static void einlesen(CD[] cdf) {
		CD[] cd = cdf;
		for (int i=0; i<cdf.length; i++) {
			//CD cd + i = new CD();
		}
	}
	
	public static void sortieren(CD[] cdf) {
		CD cache = new CD();
		for (int i=0; i<cdf.length;i++) {
			for (int o=0; o+i<cdf.length;o++) {
				if(cdf[i].spieldauer<cdf[o+i].spieldauer) {
					cache = cdf[o+i];
					cdf[o+i] = cdf[i];
					cdf[i] = cache;
				}
			}
		}
	}
	
	public static void vorhandeneAusgeben(CD[] cdf) {
		for (int i=0; i<cdf.length; i++) {
			if(cdf[i].ausgeliehen==false) System.out.println(cdf[i]);
		}
	}
}
