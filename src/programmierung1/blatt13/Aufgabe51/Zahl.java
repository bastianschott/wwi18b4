package programmierung1.blatt13.Aufgabe51;

public abstract class Zahl {
     /**
     * führt eine Negation durch und liefert den negierten Wert der Zahl als 
     * neues Objekt zurück
     */
    public abstract Zahl neg();

    /**
     * führt eine Addition durch und liefert die Summe 
     * (ausführendes Objekt + Parameter-Objekt) als neues Objekt zurück
     */
    public abstract Zahl add(Zahl zahl);

    /**
     * führt eine Subtraktion durch (unter Verwendung von add und neg)
     * und liefert die Differenz (ausführendes Objekt - Parameter-Objekt) 
     * als neues Objekt zurück
     */
    public Zahl sub(Zahl zahl) {  // Methode ist ausprogrammiert, muss daher in
      return add(zahl.neg());     // Tochterklassen nicht implementiert werden!
    }
}
