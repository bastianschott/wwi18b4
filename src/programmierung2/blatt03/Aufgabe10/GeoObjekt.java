package programmierung2.blatt03.Aufgabe10;

import java.awt.*;
public interface GeoObjekt {
  public void drehen(double phi);
    // dreht das Objekt um den Winkel phi
  
  public void zeichnen(Graphics g, int xNull, int yNull);
    // zeichnet das Objekt auf der Zeichenebene 
    // xNull und yNull sind die Koordinaten des Ursprungs 
    // (Nullpunkts) des verwendeten Koordinatensystems
}
