package programmierung2.blatt02.Aufgabe06;

import java.awt.*;
import javax.swing.*;

public class NotenEingabe extends JFrame {
	Container c;

	public NotenEingabe() {
		c = getContentPane();
		c.setLayout(new GridLayout(5, 1));
		c.add(new JCheckBox("sehr gut"));
		c.add(new JCheckBox("gut"));
		c.add(new JCheckBox("befriedigend"));
		c.add(new JCheckBox("ausreichend", true));
		//c.add(new JCheckBox("ungenuegend"));
	}

	public static void main(String[] args) {
		NotenEingabe fenster = new NotenEingabe();
		fenster.setSize(150, 200);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}