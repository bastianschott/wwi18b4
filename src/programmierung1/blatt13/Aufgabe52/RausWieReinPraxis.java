package programmierung1.blatt13.Aufgabe52;

public class RausWieReinPraxis {
  public static void main (String[] args) {
    WarteListe wl = new RausWieReinListe();
    ArztPraxis.warteZimmer(wl);
  }
}
