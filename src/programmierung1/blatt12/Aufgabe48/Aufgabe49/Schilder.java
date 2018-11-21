package programmierung1.blatt12.Aufgabe48.Aufgabe49;

public class Schilder {
	public static void beschriften(Nummerierer n) {
		// 5 Beschriftungen drucken
		for (int i = 1; i <= 5; i++)
			System.out.println("Naechste Beschriftung: " + n.next());
		// Von vorne beginnen
		n.reset();
		// Alle möglichen Beschriftungen drucken
		while (n.available())
			System.out.println("Naechste Beschriftung: " + n.next());
	}
}