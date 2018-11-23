package programmierung1.blatt13.Aufgabe52;

import Prog1Tools.IOTools;
public class ArztPraxis {  
  public static void warteZimmer (WarteListe wl) {
    int aktion = 0; 
    int jahr;
    String name;
    Patient p;
    do {
      System.out.println("Moegliche Aktionen:");
      System.out.println(" Patient anmelden (1)," +
                         " Patient drannehmen (2)," + 
                         " Programmende (0)");
      aktion = IOTools.readInteger("Ihre Wahl: ");
      if (aktion == 1) {
        System.out.print("Patienten-Aufnahme:");
        name = IOTools.readLine("  Name des Patienten: ");
        System.out.print("                   ");
        jahr = IOTools.readInteger("  Geburtsjahr: ");
        p = new Patient(name,jahr);
        wl.rein(p);
      }
      else if (aktion == 2) {
        p = wl.raus();
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
