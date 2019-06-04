package algDat.vorbereitung;

public abstract class Value {
	// plus f¨uhrt eine Addition durch und liefert die Summe
	// (ausf¨uhrendes Objekt + Parameter-Objekt) als neues Objekt zur¨uck
	public abstract Value plus(Value v);

	// times f¨uhrt eine Multiplikation durch und liefert das Produkt
	// (ausf¨uhrendes Objekt * Parameter-Objekt) als neues Objekt zur¨uck
	public abstract Value times(Value v);
}