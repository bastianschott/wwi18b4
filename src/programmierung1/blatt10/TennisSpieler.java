package programmierung1.blatt10;

public class TennisSpieler {
	public String name; // Name des Spielers
	public int alter; // Alter in Jahren
	public TennisSpieler verfolger;
	private final int startnummer;
	private static int folgenummer = 1;

	public int altersDifferenz(int alter) {
		return Math.abs(alter - this.alter);
	}

//	public TennisSpieler() {
//		this.name = "";
//		this.alter = 0;
//		this.startnummer = startnummer();
//	}
	
	public TennisSpieler(String name, int alter) {
		this.name = name;
		this.alter = alter;
		this.startnummer = folgenummer++;
		this.verfolger = null;
	}

	public TennisSpieler(String name, int alter, TennisSpieler verfolger) {
		this.name = name;
		this.alter = alter;
		this.startnummer = folgenummer++;
		this.verfolger = verfolger;
	}

	public boolean istLetzter() {
		return verfolger == null;
	}
	
	public String toString() {
		String printText = name + " (" + startnummer + ")";
		if (verfolger != null)
			printText = printText + " liegt vor " + verfolger.toString();
		return printText;
	}
	
	public int getStartnummer() {
		return startnummer;
	}
}