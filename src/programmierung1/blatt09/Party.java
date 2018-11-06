package programmierung1.blatt09;

import Prog1Tools.IOTools;

public class Party {

	public static void main(String[] args) {
		int anzahl = IOTools.readInt("Geben Sie die Anzahl an einzugebender CDs ein: ");
		CD[] cd = new CD[anzahl];
		CD.einlesen(cd);
		CD.sortieren(cd);
		CD.vorhandeneAusgeben(cd);

		
		
		
		
		//		for (int i=0; i<cd.length; i++) {
//			String titel = IOTools.readString("Titel: ");
//			int spieldauer = IOTools.readInt("Spieldauer: ");
//			boolean ausgeliehen = IOTools.readBoolean("Ausgeliehen:");
//			cd[i] = new CD(titel, spieldauer, ausgeliehen);
//		}
	}
	
//	public static void main(String[] args) {
//		CD[] cd = new CD[6];
//		cd[0] = new CD("Robbie Williams: Swing When You're Winning", 			51, 	false);
//		cd[1] = new CD("Pink Floyd: Echoes - The Best Of Pink Floyd", 			145, 	false);
//		cd[2] = new CD("Sting: All This Time - Live", 							54, 	true);
//		cd[3] = new CD("Sarah Connor: Green Eyed Soul", 						43, 	false);
//		cd[4] = new CD("Paul McCartney: Driving Rain", 							51, 	true);
//		cd[5] = new CD("Lighthouse Family: Whatever Gets You Through The Day", 	59, 	false);
//		
//		CD.sortieren(cd);
//		CD.vorhandeneAusgeben(cd);
//	}
}
