import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LaufFrame extends JFrame {
  ColorRunButton knopf1, knopf2;
  JComboBox farbenWahl;
  JCheckBox buchstabenWahl;
  public LaufFrame() {
    // Swing-Komponenten erzeugen und einfügen




    add(knopf1);
    add(knopf2);
    add(farbenWahl);
    add(buchstabenWahl);
  }

  class KnopfListener implements ActionListener {
    ColorRunButton crb;
    KnopfListener (ColorRunButton crb) {
      this.crb = crb;
    }
    public void actionPerformed (ActionEvent e) {
      // Auswahl-Index des ComboBox-Objekts bestimmen und Schrift setzen





      //  Zustand der Checkbox bestimmen und Button-Zustand ändern




    }
  }

  // main-Methode
  public static void main(String[] args) {
    LaufFrame fenster = new LaufFrame();
    fenster.setTitle("LaufFrame");
    fenster.setSize(350,300);
    fenster.setVisible(true);
    fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
