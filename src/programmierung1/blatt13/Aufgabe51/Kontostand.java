package programmierung1.blatt13.Aufgabe51;

public class Kontostand extends Zahl {
	private double wert;

	public Kontostand(double wert) {
		this.wert = wert;
	}

	@Override
	public Zahl neg() {
		return new Kontostand(-wert);
	}

	@Override
	public Zahl add(Zahl zahl) {
		Kontostand zahlKonto = (Kontostand) zahl;
		return new Kontostand(wert + zahlKonto.wert);
	}

	@Override
	public String toString() {
		return "Der Kontostand beträgt " + wert + "€";
	}

//	@Override
//	public boolean equals(Object konto) {
//		Kontostand help = (Kontostand) konto;
//		return this.wert == help.wert;
//	}
	
	public boolean gleich(Kontostand konto) {
		return this.wert == konto.wert;
	}
}
