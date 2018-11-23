package programmierung1.blatt12.Aufgabe50;

public class CDRohling extends Medium implements Rohling {
	private String titel;

	public CDRohling(double spieldauer, double preis, String titel) {
		// TODO Auto-generated constructor stub
		this.preis = preis;
		this.spieldauer = spieldauer;
		this.titel = titel;
	}

	@Override
	public void brenne(byte[] datenTrack) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSpieldauer(double zeit) {
		// TODO Auto-generated method stub
		this.spieldauer = zeit;
	}

	@Override
	public void setBezeichnung(String titel) {
		// TODO Auto-generated method stub
		this.titel = titel;
	}

	@Override
	public double getSpieldauer() {
		// TODO Auto-generated method stub
		return spieldauer;
	}

	@Override
	protected double getPreis() {
		// TODO Auto-generated method stub
		return preis;
	}
	
	@Override
	public String toString() {
		return titel + ": " + spieldauer + " min, " + preis + "€";
	}
	
	public static void main(String[] args) {
		CDRohling cd = new CDRohling(60, 11.99, "Alice im Wunderland");
		System.out.println(cd.toString());
	}
}
