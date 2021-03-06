package softwareEngineering1.se1_blatt03;

import Prog1Tools.IOTools;

public class Bruch {
	private int zaehler;
	private int nenner;

	public Bruch() {
	}

	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	public int getZaehler() {
		return zaehler;
	}
	
	public int getNenner() {
		return nenner;
	}
	
	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}
	
	public void setNenner(int nenner) {
		this.nenner = nenner;
	}

	public void einlesen() {
		this.zaehler = IOTools.readInt("Zaehler = ");
		this.nenner = IOTools.readInt("Nenner = ");
	}

	public Bruch mul(Bruch b) {
		Bruch neu = new Bruch();
	neu.zaehler = this.zaehler * b.zaehler;
		neu.nenner = this.nenner * b.nenner;
		return neu;
	}

	@Override
	public String toString() {
		return zaehler + "/" + nenner;
	}

}