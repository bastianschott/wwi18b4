package programmierung1.blatt08;

public class Bruchzahl {
	private int zaehler;
	private int nenner;
	
	public Bruchzahl(int zaehler, int nenner) {
		if (zaehler < 0 && nenner < 0) {
			zaehler *= -1;
			nenner *= -1;
		}
		this.zaehler = zaehler;
		this.nenner = nenner;
		this.kuerzen();
	}
	
	public String toString() {
		return zaehler + "/" + nenner;
	}
	
	public double wert() {
		return (double)zaehler/nenner;
	}
	
	public Bruchzahl kehrwert() {
		return new Bruchzahl(nenner, zaehler);
	}
	
	public Bruchzahl neg() {
		return new Bruchzahl(zaehler*-1, nenner);
	}
	public Bruchzahl kuerzen() {
		int ggt = 1;
		if (zaehler == 0) ggt = zaehler;
		if (nenner == 0) ggt = nenner;
		int x = Math.abs(zaehler);
		int y = Math.abs(nenner);
		while (x != y) {
			if(x > y) x -= y;
			else y -= x;
		}
		ggt = x;
		return new Bruchzahl(zaehler/ggt, nenner/ggt);
	}
	
	public Bruchzahl mul(Bruchzahl x) {
		return new Bruchzahl(this.zaehler*zaehler, this.nenner*nenner).kuerzen();
	}
	
	public Bruchzahl div(Bruchzahl x) {
		//return new Bruchzahl(this.mul(x.kehrwert()).zaehler, this.mul(x.kehrwert()).nenner);
		return this.mul(x.kehrwert());
	}
	
	public Bruchzahl add(Bruchzahl x) {
		return new Bruchzahl(this.zaehler*nenner + zaehler*this.nenner, this.nenner*nenner).kuerzen();
	}
	
	public Bruchzahl sub(Bruchzahl x) {
		return this.add(x.neg());
	}
}