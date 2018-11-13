package programmierung1.blatt11.Aufgabe47;

public class Fernseher {        
	  private String raum;   // Raum, in dem der Fernseher steht
	  private int volume;    // Eingestellte Lautstaerke
	  private int program;   // Eingestelltes Programm

	  public Fernseher (String ra, int vo, int pr) {  // Konstruktor
	    raum = ra;
	    volume = Math.max(0,Math.min(vo,50));   // laustaerke im Bereich [0,50]
	    program = Math.max(1,Math.min(pr,99));  // program im Bereich [1,99]
	  }

	  public int getVolume () { // liefert den Wert der Variable volume
	    return volume;
	  }

	  public void change (String einstell, int wert) { // verändert die zu 'einstell'
	    if (einstell.equals("volume")) {               // gehoerende Einstellung
	      volume = volume + wert;                      // um 'wert'
	      volume = Math.max(0,Math.min(volume,50));
	    }
	    else if (einstell.equals("program")) {
	      program = program + wert;
	      program = Math.max(1,Math.min(program,99));
	    }
	  }

	  public String toString() { // liefert String-Darstellung des Fernsehers
	    return "Fernseher im " + raum +
	           ": v=" + volume + 
	           ", p=" + program;
	  }
	}
