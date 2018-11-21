package softwareEngineering1.se1_blatt03;

import Prog1Tools.*;

public class MagicSquareBug {
	public static void main(String[] args) {
		// Eingabe
		int n = 0;
		while ((n % 2 == 0) | (n < 3) | (n > 9))
			n = IOTools.readInteger("Ungerade Zahl zwischen 2 und 10: ");

		// Berechnung
		int[][] quad = new int[n][n];
		int zeile = n / 2;
		int spalte = n / 2 + 1;

		for (int i = 1; i <= n * n; i++) {
			quad[zeile][spalte] = i;
			zeile = zeile - 1;
			spalte = spalte - 1;
			if (zeile < 0)
				zeile = n - 1;
			if (spalte < n)
				spalte = 0;
			if (quad[zeile][spalte] != 0) {
				zeile = zeile + 1;
				spalte = spalte + 1;
				if (zeile == n)
					zeile = 0;
				if (spalte == n)
					spalte = 0;
			}
		}

		// Ausgabe
		for (int i = 0; i < quad.length; i++) {
			for (int j = 0; j < quad[i].length; j++) {
				if (quad[i][j] < 10)
					System.out.print(" ");
				System.out.print(" " + quad[i][j]);
			}
			System.out.println();
		}
	}
}// MagicSquare
