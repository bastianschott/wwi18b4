package programmierung1.blatt12.Aufgabe48;

public abstract class Nummerierer {

	// Methode zur Herstellung des Anfangszustandes
	// (Nummerierung beginnt wieder von vorne)
	public abstract void reset();

	// Methode, die die jeweils n¨achste "Nummer" in Form
	// einer Zeichenkette liefert
	public abstract String next();

	// Methode, die anzeigt, ob noch weitere "Nummern"
	// verf¨ugbar sind (true) oder nicht (false)
	public abstract boolean available();
}