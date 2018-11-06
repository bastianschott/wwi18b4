package programmierung1.blatt09.Aufgabe39;

import Prog1Tools.IOTools;

public class BruchRechner {
	
	public static void main(String[] args) {
		System.out.println("Bruch 1: ");
		Bruch b1 = new Bruch(
				IOTools.readInt("Zaehler eingeben: "), 
				IOTools.readInt("Nenner eingeben: "));
		System.out.println("Bruch 2: ");
		Bruch b2 = new Bruch(
				IOTools.readInt("Zaehler eingeben: "), 
				IOTools.readInt("Nenner eingeben: "));
		boolean weiter = true;
		while(weiter) {
			System.out.println("\n\n\nAktionen:\n  x: beenden\n  1: Bruch 1 eingeben\n  2: Bruch 2 eingeben\n  b: Brueche kuerzen\n  *,/,+,-: Grundrechenarten\n  n: Bruch 1 negativ\n  k: Kehrwert von Bruch 1\n  d: Double-Wert von Bruch 1\n\n  Eingabe: ");
			
			switch(IOTools.readChar()) {
				case 'x': weiter = false; break;
				case '1': b1.einlesen(IOTools.readInt("Zaehler eingeben: "), IOTools.readInt("Nenner eingeben: ")); break;
				case '2': b2.einlesen(IOTools.readInt("Zaehler eingeben: "), IOTools.readInt("Nenner eingeben: ")); break;
				case 'b': b1 = b1.kuerze(); b2 = b2.kuerze(); System.out.println("Bruch 1: " + b1 + "\nBruch 2: " + b2);break;
				case '*': System.out.println(b1.mul(b2)); break;
				case '/': System.out.println(b1.div(b2)); break;
				case '+': System.out.println(b1.add(b2)); break;
				case '-': System.out.println(b1.sub(b2)); break;
				case 'n': b1 = b1.neg(); System.out.println(b1); break;
				case 'k': b1 = b1.kehrwert(); System.out.println(b1); break;
				case 'd': System.out.println(b1.wert()); break;
				default:  System.out.println("Ungueltige Eingabe.");
			}
		}
			
		
	}
}
