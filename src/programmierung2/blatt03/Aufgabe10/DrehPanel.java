package programmierung2.blatt03.Aufgabe10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DrehPanel extends JPanel {
	static final double SCHRITTWEITE = Math.PI / 60;
	private GeoObjekt drehObjekt;

	public DrehPanel() {

		drehObjekt = erzeugeStrecke();

		JButton links = new JButton("links");
		links.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				drehObjekt.drehen(-SCHRITTWEITE);
				repaint();
			}
		});
		add(links);

		JButton rechts = new JButton("rechts");
		rechts.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				drehObjekt.drehen(SCHRITTWEITE);
				repaint();
			}
		});
		add(rechts);

		JButton strecke = new JButton("Strecke");
		strecke.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				drehObjekt = erzeugeStrecke();
				repaint();
			}
		});
		add(strecke);

		JButton dreieck = new JButton("Dreieck");
		dreieck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				drehObjekt = erzeugeDreieck();
				repaint();
			}
		});
		add(dreieck);
	}

	private Strecke erzeugeStrecke() {
		return new Strecke(new Punkt(0, 0), new Punkt(100, 0));
	}

	private Dreieck erzeugeDreieck() {
		return new Dreieck(new Punkt(0, 0), new Punkt(100, 0), new Punkt(50, -66));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		drehObjekt.zeichnen(g, getWidth() / 2, getHeight() / 2);
	}
}
