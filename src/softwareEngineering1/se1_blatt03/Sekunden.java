package softwareEngineering1.se1_blatt03;

import Prog1Tools.IOTools;

public class Sekunden {
	public static void main(String[] args) {
		int sec = IOTools.readInteger("Sekunden: ");
		System.out.println(sec + " Sekunden entsprechen:");
		int jahre = sec / (365 * 3600 * 24);
		sec = sec % (365 * 3600 * 24);
		int tage = sec / (3600 * 24);
		sec = sec % (3600 * 24);
		int stunden = sec / 3600;
		sec = sec % 3600;
		int minuten = sec / 60;
		sec = sec % 60;
		int sekunden = sec;
		System.out.println(jahre + " Jahren,");
		System.out.println(tage + " Tagen,");
		System.out.println(stunden + " Stunden,");
		System.out.println(minuten + " Minuten und");
		System.out.println(sekunden + " Sekunden.");
	}
}
