package semester1.programmieren1.alt;

import Prog1Tools.IOTools;

public class Aufgabe5 {
	public static void main(String[] args){
		double u = IOTools.readDouble("Geben Sie die Länge der Dose ein: ");
		double h = IOTools.readDouble("Geben Sie die Breite der Dose ein: ");
		double l_diag = Math.sqrt(u*u + h*h);
		System.out.println("Die Länge der Diagonalen des Blechstücks: " + Math.round(100.0*l_diag)/100.0);
		double d_boden = u / Math.PI;
		System.out.println("Der Durchmesser des Dosenbodens: " + Math.round(100.0*d_boden)/100.0);
		double f_boden = Math.PI * ((d_boden / 2)*(d_boden / 2));
		System.out.println("Die Fläche des Dosenbodens: " + Math.round(100.0*f_boden)/100.0);
		double f_mantel = u*h;
		System.out.println("die Mantelfläche der Dose: " + Math.round(100.0*f_mantel)/100.0);
		double f_gesamt = 2 * f_boden * f_mantel;
		System.out.println("Die Gesamtfläche der Dose: " + Math.round(100.0*f_gesamt)/100.0);
		double v = f_boden * h;
		System.out.println("Das Volumen der Dose: " + Math.round(100.0*v)/100.0);




		
	}
}
