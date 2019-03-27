import java.awt.*;
import javax.swing.*;
public class ColorRunButton extends JButton implements Runnable {

  private boolean running = false;       // Thread läuft zu Beginn nicht

  private boolean zeigtBuchstabe = true; // Anzeige zeigt zu Beginn Buchstaben

  public ColorRunButton () {
    setBackground(Color.white);
    setFont(new Font("Arial",Font.BOLD,50));
    setText("  ");
  }

  public void change (boolean zeigtBuchstabe) {
    this.zeigtBuchstabe = zeigtBuchstabe;
    // Falls der Thread läuft, beende ihn mittels des running-Flags,
    // andernfalls, setze running-Flag, erzeuge neuen Thread und starte ihn



  }

  public void run() {
    String text;
    while (running) {
      // Berechne Zufalls-Ziffer oder Zufalls-Buchstabe
      // und setze das Zeichen als Beschriftung des Buttons



    }
  }
}
