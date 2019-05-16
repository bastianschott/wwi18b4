package algDat.vorbereitung;

public abstract class Wert {
	// add f¨uhrt eine Addition durch und liefert die Summe
	// (ausf¨uhrendes Objekt + Parameter-Objekt) als neues Objekt zur¨uck
	public abstract Wert add(Wert w);

	// mul f¨uhrt eine Multiplikation durch und liefert das Produkt
	// (ausf¨uhrendes Objekt * Parameter-Objekt) als neues Objekt zur¨uck
	public abstract Wert mul(Wert w);
}