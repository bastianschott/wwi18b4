package programmierung1.blatt14.Aufgabe54;

import Prog1Tools.IOTools;

public class Verzinsung {

	public static void main(String[] args) {
		double[] v = new double[3];
		v[0] = 100;
		v[1] = 1000001;
		v[2] = 2000;
//		for (int i = 0; i < v.length; i++) {
//			v[i] = IOTools.readDouble(i+1+". Betrag einlesen: ");
//		}
		try {
			verzinsen(v, 5.3);
			System.out.println("Alle Geldanlage-Betraege mit 5.3 Prozent verzinst!\nGeldbeträge jetzt: ");
			for (int i = 0; i < v.length; i++) {
				System.out.println(v[i] + " ");
			}
		} catch (AmountException e) {
			System.out.println(e);
		}
	}

	public static void verzinsen(double[] v, double z) throws AmountException {
		for (int i = 0; i < v.length; i++) {
			if (v[i] > 1000000)
				throw new AmountException("Der " + i + ". Geldanlage-Betrag");
			v[i] = v[i] + v[i] * z / 100;
		}
	}
}
