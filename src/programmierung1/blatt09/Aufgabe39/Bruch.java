package programmierung1.blatt09.Aufgabe39;

public class Bruch {
	// Instanzvariablen
	private int zaehler, nenner;
	
	// Methode "ggt()"
	// Diese Methode gibt einen int-Wert zurück. Daher ist in der Methode auch ein "return" notwendig
	public int ggt() {
		if(zaehler == 0) return nenner;
		if(nenner == 0) return zaehler;
		int x = Math.abs(zaehler);
		int y = Math.abs(nenner); // x und y sind lokale Variablen, welche nur innerhalb der Methode deklariert sind
		while (x != y) {
			if(x > y) x -= y;
			else y -= x;
		}
		return x;
	}
	
	// Konstruktor mit 2 Parametern
	// In diesem Konstruktor werden 2 formale Variablen eingegeben und direkt den beiden Instanzvariablen zugewiesen
	public Bruch(int zaehler, int nenner) { // int ... = formale Variable, welche beim Aufruf des Konstruktors initialisiert werden müssen
		this.zaehler = zaehler;
		this.nenner = nenner;
		// this. = Instanzvariablen, die am Anfang der Klasse deklariert werden
	}

	// Standardkonstruktor
	// Hier: Standardkonstruktor ist leer. Theoretisch können jedoch auch hier diverse Operationen vorgenommen werden.
	public Bruch() {
	}

	// Überladene Methode:
	// Methode toString() gibt es bereits in der Klasse "Object", von welcher diese Klasse erbt. Daher ist die Methode hier überladen.
	public String toString() {
		return zaehler + "/" + nenner;
	}
	
	// Methode "kuerze()"
	// Hier wird ein neuer Bruch zurückgegeben
	public Bruch kuerze() {
		return new Bruch(zaehler / ggt(), nenner / ggt());
	}
	
	// Methode "einlesen(x, y)"
	// Hier mmüssen beim Aufruf 2 int-Werte eingegeben werden, Bsp: "nameDesBruchs.einlesen(5, 3);"
	// Da die Methode mit "void" gekennzeichnet ist, gibt es hier keinen Rückgabewert. Trotzdem werden hier die beiden Instanzvariablen überschrieben
	public void einlesen(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	 
	public Bruch kehrwert() {
		return new Bruch(nenner, zaehler);
	}
	
	public Bruch neg() {
		return new Bruch(-zaehler, nenner);
	}
	
	public double wert() {
		return (double) zaehler/nenner;
	}
	
	public Bruch mul(Bruch b) {
		return new Bruch(
				this.zaehler*b.zaehler, 
				this.nenner*b.nenner).kuerze();
	}
	
	public Bruch div(Bruch b) {
		return this.mul(b.kehrwert()).kuerze();
	}
	
	public Bruch add(Bruch b) {
		return new Bruch(
				this.zaehler*b.nenner + b.zaehler*this.nenner,
				this.nenner*b.nenner).kuerze();
	}
	
	public Bruch sub(Bruch b) {
		return this.add(b.neg()).kuerze();
	}
	
}
