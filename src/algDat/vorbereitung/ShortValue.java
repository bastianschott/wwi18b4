package algDat.vorbereitung;

public class ShortValue extends Value {
	private short s; // eigentlicher short-Wert

	public ShortValue(short s) { // Konstruktor
		this.s = s;
	}

	public Value plus(Value v) { // Additions-Methode
		ShortValue sv = (ShortValue) v;
		return new ShortValue((short) (s + sv.s));
	}

	public Value times(Value v) { // Multiplikations-Methode
		ShortValue sv = (ShortValue) v;
		return new ShortValue((short) (s * sv.s));
	}

	public boolean equals(ShortValue zahl) { // Vergleichs-Methode
		return s == zahl.s;
	}

	@Override
	public String toString() {
		return s + "";
	}
}