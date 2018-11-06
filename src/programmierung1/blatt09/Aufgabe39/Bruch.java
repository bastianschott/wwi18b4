package programmierung1.blatt09.Aufgabe39;

public class Bruch {
	private int zaehler, nenner;
	
	public int ggt() {
		if(zaehler == 0) return nenner;
		if(nenner == 0) return zaehler;
		int x = Math.abs(zaehler);
		int y = Math.abs(nenner);
		while (x != y) {
			if(x > y) x -= y;
			else y -= x;
		}
		return x;
	}
	
	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	public Bruch() {
	}
	
	public String toString() {
		return zaehler + "/" + nenner;
	}
	
	public Bruch kuerze() {
		return new Bruch(
				zaehler/ggt(),
				nenner / ggt());
		
	}
	
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
