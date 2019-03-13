package programmierung1.alt;

import Prog1Tools.IOTools;

public class Blatt08 {
	//private static double summe = 0;
	public static void main(String[] args) {
		System.out.println(quersumme2(163));
		
		
	}
	
	public static void Aufgabe29() {
		int n= IOTools.readInt("Wieviele Werte möchten Sie eingeben? ");
		double zahlen[] = new double[n];
		readWerte(zahlen);
		
		System.out.println("Mittelwert: " + mittelwert(zahlen));
		System.out.println("Varianz: " + varianz(zahlen));
	}
	
	public static void Aufgabe30() {
		long l = IOTools.readLong("Geben Sie eine Zahl ein: ");
		while (l > 9) {
			l = quersumme2(l);
			System.out.println("Quersumme: " + l);
		}
	}
	
	public static void Aufgabe31() {
		//System.out.println(Rechnen.ggT(IOTools.readInt("Geben Sie Zahl a ein: "), IOTools.readInt("Geben Sie Zahl b ein: ")));
	}
	
	
	
	
	
	
	//Methoden fuer Aufgabe 29
	public static void readWerte(double[] werte) {
		
		for(int i=0; i<werte.length; i++) {
			werte[i] = IOTools.readDouble(i+1 + ". Wert: ");
		}
	}
	public static double mittelwert(double[] werte) {
		double mittel=0;
		for (int i = 0; i < werte.length; i++) {
			mittel += werte[i];
		}
		mittel /=werte.length;
		return mittel;
	}
	public static double varianz(double[] werte) {
		double var = 0;
		double mittel = mittelwert(werte);
		for (int i = 0; i < werte.length; i++) {
			var += (werte[i]-mittel) * (werte[i]-mittel);
		}
		return var/werte.length;
	}
	
	//Methoden fuer Aufgabe 30
	public static long quersumme(long l) {
		int quer = 0;
		while (l != 0) {
			quer += l%10;
			l /= 10;
		}
		return quer;
	}
	public static long quersumme2(long l) {
		if (l<10) return l;
		return l%10 + quersumme2(l/10);
	}
	

}
