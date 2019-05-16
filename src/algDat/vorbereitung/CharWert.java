package algDat.vorbereitung;

import java.util.Collection;

public class CharWert extends Wert {
	private char z; // Zeichen

	public CharWert(char z) { // Konstruktor
		this.z = z;
	}

	public Wert add(Wert w) { // Additions-Methode
		CharWert cw = (CharWert) w;
		return new CharWert((char) (z + cw.z));
	}

	public Wert mul(Wert w) { // Multiplikations-Methode
		CharWert cw = (CharWert) w;
		return new CharWert((char) (z * cw.z));
	}

	public String toString() { // String Darstellung
		return z + "";
	}

	public boolean equals(Object zahl) { // Vergleichs-Methode
		CharWert cw = (CharWert) zahl;
		return cw.z == z;

	}

	public static void main(String[] args) {
		char a = (char) 212343252, b = '?';
		System.out.println(b + " " + a);
		System.out.println(a == b);

	}

}