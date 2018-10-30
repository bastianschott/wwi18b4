package semester1.softwareEngineering1.se1_blatt1;

import Prog1Tools.IOTools;

public class UebungsblattX1 {

	public static void main(String[] args) {
		Aufgabe1();
	}
	public static void Aufgabe1(){
		System.out.println("Berechnung von Kreiskoerpern\n");
		
		char auswahl1 = '0';
		while(auswahl1 != 'Z' && auswahl1 != 'K') {
			auswahl1 = IOTools.readChar("Kreiszylinder(Z) oder Kreiskegel(K)? ");
		}
		
		char auswahl2 = '0';
		while(auswahl2 != 'M' && auswahl2 != 'G' && auswahl2 != 'V') {
			auswahl2= IOTools.readChar("Mantelflaeche(M), Grundflaeche(G) oder Volumen(V)? ");
		}
		
		double radius = IOTools.readDouble("Geben Sie bitte den Radius ein:");
		double hoehe = IOTools.readDouble("Geben Sie bitte die Hoehe ein:");
		
		if(auswahl1 == 'Z') {
			switch(auswahl2) {
				case 'M': Kreiszylinder.mantelflaecheAusgeben(radius,hoehe); break;
				case 'G': Kreiszylinder.grundflaecheAusgeben(radius, hoehe); break;
				case 'V': Kreiszylinder.volumenAusgeben(radius, hoehe); break;
			}
		} else {
			switch(auswahl2) {
				case 'M': Kreiskegel.mantelflaecheAusgeben(radius,hoehe); break;
				case 'G': Kreiskegel.grundflaecheAusgeben(radius, hoehe); break;
				case 'V': Kreiskegel.volumenAusgeben(radius, hoehe); break;
			}
		}
	}

}
