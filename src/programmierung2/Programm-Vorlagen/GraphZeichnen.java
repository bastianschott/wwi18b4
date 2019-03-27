import java.awt.*;
import javax.swing.*;

public class GraphZeichnen extends JFrame {
  
  public GraphZeichnen(int[] x, int[] y) {
    Container c = getContentPane();
    Zeichnung z = new Zeichnung(x, y);
    c.add(z);
  }
  
  public static void main(String[] args) {
     
     // Funktion festlegen:    
     String t;      // Bezeichnung der Funktion
     Funktion f;    // Funktions-Objekt
 
     t = "Identitaet";       // fuer 'f(x) = x'
     f = new Identitaet();   // fuer 'f(x) = x'
     
     // Werte-Tabelle berechnen:
     int anzahl = 500;
     // x- und y-Werte
     double[] x = new double[anzahl];
     double[] y = new double[anzahl];
     // x- und y-Werte in Pixel-Koordinaten
     int[] ix = new int[anzahl];
     int[] iy = new int[anzahl];
 
     for (int i=0; i < anzahl; i++) {
       x[i] = i * 0.01;         // X-Wert festlegen
       y[i] = f.rechne(x[i]);   // Funktionswert berechnen
                                // umd in Pixelkoordinaten umrechnen
       ix[i] = i;
       iy[i] = - (int) (100 * y[i] - anzahl);
     }

     // Zeichnen:
     GraphZeichnen fenster = new GraphZeichnen(ix, iy);
     fenster.setTitle(t);
     fenster.setSize(anzahl+15,anzahl+40);
     fenster.setLocation(300,100);
     fenster.setVisible(true);
     fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
