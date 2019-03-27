package programmierung2.blatt01.Aufgabe05;

public class EuroConverter {
	// Waehrungs-Kennungen
	static final int DEM = 0, ATS = 1, FRF = 2, BEF = 3, LUF = 4, NLG = 5, ESP = 6, PTE = 7, ITL = 8, FIM = 9, IEP = 10,
			GDR = 11;
	// Umrechnungsfaktoren
	private static final double[] faktor = new double[] { 1.95583, 13.7603, 6.55957, 40.3399, 40.3399, 2.20371, 166.386,
			200.482, 1936.27, 5.94573, 0.787564, 340.750 };
	// Ausgeschriebene Bezeichnungen der Waehrungen
	private static final String[] bezeichnung = new String[] { "Deutsche Mark", "Oesterreichische Schilling",
			"Franzoesische Franc", "Belgische Franc", "Luxemburgische Franc", "Niederlaendische Gulden",
			"Spanische Peseten", "Portugiesische Escudos", "Italienische Lire", "Finnische Mark", "Irische Pfund",
			"Griechische Drachmen" };

	// liefert die Bezeichnung zur Waehrungs-Kennung 'kennung'
	static String getBezeichnung(int kennung) {
		return bezeichnung[kennung];
	}
	
	static String[] getBezeichnung(){
		return bezeichnung;
	}

	// konvertiert den Euro-Wert 'euro' in die durch die
	// Waehrungs-Kennung 'kennung' spezifizierte Waehrung
	static double convertFromEuro(double euro, int kennung) {
		return faktor[kennung] * euro;
	}

	// konvertiert den Wert 'sonst' der durch die Waehrungs-Kennung
	// 'kennung' spezifizierten Waehrung in den entsprechenden Euro-Wert
	static double convertToEuro(double sonst, int kennung) {
		return sonst / faktor[kennung];
	}
}
