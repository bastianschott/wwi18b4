package programmierung1.blatt12.Aufgabe48.Aufgabe49;

public interface Nummerierer {
	// Methode zur Herstellung des Anfangszustandes
	// (Nummerierung beginnt wieder von vorne)
	void reset();

	// Methode, die die jeweils n¨achste "Nummer" in Form
	// einer Zeichenkette liefert
	String next();

	// Methode, die anzeigt, ob noch weitere "Nummern"
	// verf¨ugbar sind (true) oder nicht (false)
	boolean available();
}