package programmierung2.blatt02.Aufgabe09;

import java.awt.*;
import javax.swing.*;

import Prog1Tools.IOTools;

public class GraphZeichnen extends JFrame {
	public GraphZeichnen(int[] x, int[] y) {
		Container c = getContentPane();
		Zeichnung z = new Zeichnung(x, y);
		c.add(z);
	}

	public static void main(String[] args) {
		// Funktion festlegen:
		String t; // Bezeichnung der Funktion
		Funktion f; // Funktions-Objekt
		int auswahl = IOTools.readInt("0=Gerade, 1=Quadrat, 2=Wurzel");
		switch (auswahl) {
		case 0:
			t = "Identitaet"; // fuer ’f(x) = x’
			f = new Identitaet(); // fuer ’f(x) = x’
			break;
		case 1:
			t = "Quadrat";
			f = new Quadrat();
			break;
		case 2:
			t = "Wurzel";
			f = new Wurzel();
			break;
		default:
			t = "Fehler";
			f = new Identitaet();
		}

		// Werte-Tabelle berechnen:
		int anzahl = 500;
		// x- und y-Werte
		double[] x = new double[anzahl];
		double[] y = new double[anzahl];
		// x- und y-Werte in Pixel-Koordinaten
		int[] ix = new int[anzahl];
		int[] iy = new int[anzahl];
		for (int i = 0; i < anzahl; i++) {
			x[i] = i * 0.01; // X-Wert festlegen
			y[i] = f.rechne(x[i]); // Funktionswert berechnen
			// umd in Pixelkoordinaten umrechnen
			ix[i] = i;
			iy[i] = -(int) (100 * y[i] - anzahl);
		}
		// Zeichnen:
		GraphZeichnen fenster = new GraphZeichnen(ix, iy);
		fenster.setTitle(t);
		fenster.setSize(anzahl + 15, anzahl + 40);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}