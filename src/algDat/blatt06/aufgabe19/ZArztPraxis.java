package algDat.blatt06.aufgabe19;

import Prog1Tools.IOTools;

public class ZArztPraxis {
	public static void warteZimmer(WarteSchlange wl) {
		int aktion = 0;
		int jahr;
		String name;
		ZPatient p;
		do {
			System.out.println("Moegliche Aktionen:");
			System.out.println(" Patient anmelden (1)," + " Patient drannehmen (2)," + " Programmende (0)");
			aktion = IOTools.readInteger("Ihre Wahl: ");
			if (aktion == 1) {
				System.out.print("Patienten-Aufnahme:");
				name = IOTools.readLine("  Name des Patienten: ");
				System.out.print("                   ");
				jahr = 1; // IOTools.readInteger(" Geburtsjahr: ");
				p = new ZPatient(name, jahr);
				wl.anmelden(p);
			} else if (aktion == 2) {
				p = wl.derNaechsteBitte();
				if (p == null)
					System.out.println("Keine Patienten mehr im Wartezimmer!");
				else {
					System.out.print("Es kommt dran:  ");
					System.out.println(p);
				}
			}
		} while (aktion != 0);
	}
}
