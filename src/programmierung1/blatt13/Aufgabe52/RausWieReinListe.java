package programmierung1.blatt13.Aufgabe52;

public class RausWieReinListe implements WarteListe{
	
	private Patient[] patientenListe = new Patient[1000];
	private int bisherEingefuegtePatienten=0, indexNaechsterPatient=-1;
	
	public void rein(Patient p) {
		patientenListe[bisherEingefuegtePatienten++] = p;
		
		
	}
	
	public Patient raus() {
		if(indexNaechsterPatient >= 0 && indexNaechsterPatient < bisherEingefuegtePatienten) {
			Patient next = patientenListe[indexNaechsterPatient];
			patientenListe[indexNaechsterPatient++] = null;
			return next;
		} else return null;
		
	}
}
