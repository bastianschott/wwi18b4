package softwareEngineering1.se1_blatt01;

import Prog1Tools.IOTools;

public class Girokonto {
	public int kontonr;
	protected static long blz;
	public String name, vorname;

	public static void main(String[] args) {
		Girokonto giro[] = new Girokonto[2];
		blz = IOTools.readInt("Bankleitzahl:\t");
		for (int i = 0; i < giro.length; i++) {
			giro[i] = new Girokonto();
			System.out.println(i + 1 + ". Konto");
			giro[i].name = IOTools.readString("Name:\t\t");
			giro[i].vorname = IOTools.readString("Vorname:\t");
			giro[i].kontonr = IOTools.readInt("Kontonummer:\t");
			System.out.println("\n");
		}
		for (int i = 0; i < giro.length; i++) {
			System.out.println(i + 1 + ". Konto:\n" + giro[i].name + ", " + giro[i].vorname + "\nKontoNr: " + giro[i].kontonr + "; BLZ: " + blz + "\n");
		}
	}

	public Girokonto() {

	}

	public void setName(String name) {
		this.name = name;
	}
}