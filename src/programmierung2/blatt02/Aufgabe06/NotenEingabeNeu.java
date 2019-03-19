package programmierung2.blatt02.Aufgabe06;

import java.awt.*;
import javax.swing.*;

public class NotenEingabeNeu extends JFrame {
	Container c;

	public NotenEingabeNeu() {
		c = getContentPane();
		c.setLayout(new GridLayout(6, 1));
		ButtonGroup bg = new ButtonGroup();
		JCheckBox cb1 = new JCheckBox("sehr gut");
		bg.add(cb1);
		c.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("gut");
		bg.add(cb2);
		c.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("befriedigend");
		bg.add(cb3);
		c.add(cb3);
		
		JCheckBox cb4 = new JCheckBox("ausreichend", true);
		bg.add(cb4);
		c.add(cb4);
		
		JCheckBox cb5 = new JCheckBox("ungenügend");
		bg.add(cb5);
		c.add(cb5);
		
		JCheckBox cb6 = new JCheckBox("Wiederholungsprüfung");
		c.add(cb6);
	}

	public static void main(String[] args) {
		NotenEingabeNeu fenster = new NotenEingabeNeu();
		fenster.setSize(150, 200);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}