package programmierung1.blatt12.Aufgabe50;

public class CD extends Medium implements Beschreibbar {
	private int preis;
	private double spieldauer;
	private String titel;

	@Override
	protected double getPreis() {
		// TODO Auto-generated method stub
		return preis;
	}

	@Override
	public double getSpieldauer() {
		// TODO Auto-generated method stub
		return spieldauer;
	}

	@Override
	public void brenne(byte[] datenTrack) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBezeichnung(String titel) {
		// TODO Auto-generated method stub
		this.titel = titel;
	}

	@Override
	public void setSpieldauer(double zeit) {
		// TODO Auto-generated method stub
		this.spieldauer = zeit;
	}

}
