package programmierung1.blatt11.Aufgabe45;

public class DameFigur extends Spielfigur {
	
	private static String name = "Dame";
	
	public DameFigur(char x, int y, String f) {
		super(x, y, f);
	}

	public void ziehe(char richtung, int anzahl) {
		if(richtung=='-') super.ziehe(anzahl, 0);
		if(richtung=='|') super.ziehe(0, anzahl);
		if(richtung=='/') super.ziehe(anzahl, anzahl);
		if(richtung=='\\') super.ziehe(-anzahl, anzahl);
	}
	
	public boolean trifft(DameFigur d) {
		return this.getXpos()==d.getXpos() && this.getYpos()==d.getYpos();
	}
	
	public String toString() {
		return getFarbe() + "e " + name + " auf dem Feld " + getXpos() +getYpos();
	}
	
	
}
