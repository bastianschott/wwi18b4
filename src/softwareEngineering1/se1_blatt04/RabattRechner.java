package softwareEngineering1.se1_blatt04;

public class RabattRechner {

	private final int grenze1;
	private final int rabatt1;
	private final int grenze2;
	private final int rabatt2;

	/**
	 * Erzeugt einen RabattRechner mit den angegebenen Grenzen und Rabatten.
	 * <p>
	 * Grenze 2 muss groesser als Grenze 1 sein.
	 * 
	 * @param grenze1 Anzahl Artikel ab der die erste Rabattstufe gilt
	 * @param rabatt1 Rabattstufe 1 in Prozent
	 * @param grenze2 Anzahl Artikel ab der die zweite Rabattstufe gilt
	 * @param rabatt2 Rabattstufe 2 in Prozent
	 */
	public RabattRechner(int grenze1, int rabatt1, int grenze2, int rabatt2) {
		this.grenze1 = grenze1;
		this.rabatt1 = rabatt1;
		this.grenze2 = grenze2;
		this.rabatt2 = rabatt2;
	}

	/**
	 * Berechnet den Rabatt in Prozent für die angegebene Anzahl Artikel.
	 */
	public int getRabatt(int anzahlArtikel) {
		if (anzahlArtikel > grenze2) {
			return rabatt2;
		}
		if (anzahlArtikel > grenze1) {
			return rabatt1;
		} 

		return 0;
	}
}
