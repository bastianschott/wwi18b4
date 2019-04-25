package algDat.blatt06.aufgabe19;

public class ZPatient {
	private String name;
	private int geburtsJahr;
	public ZPatient next; // Verweis auf den Nachfolger in einer Warteliste

	public ZPatient(String n, int gj) {
		name = n;
		geburtsJahr = gj;
	}

	public int getGeburtsJahr() {
		return geburtsJahr;
	}

	public String toString() {
		return name + " (geb. " + geburtsJahr + ")";
	}
}
