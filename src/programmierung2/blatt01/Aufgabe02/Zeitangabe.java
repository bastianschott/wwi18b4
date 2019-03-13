package programmierung2.blatt01.Aufgabe02;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.*;

public class Zeitangabe extends JFrame {
	static Container c;
	private JLabel beschriftung, datumsAnzeige;
	private JComboBox<String> formatAuswahl;
	private JButton aktualisierung;
	static final SimpleDateFormat kurz = new SimpleDateFormat("d.MM.YYYY '('HH:mm')'", Locale.GERMANY);
	static final SimpleDateFormat mittel = new SimpleDateFormat("EE, d. MMMM, HH:mm", Locale.GERMANY);
	static final SimpleDateFormat lang = new SimpleDateFormat("EE, d. MMMM, HH:mm:ss", Locale.GERMANY);

	public static SimpleDateFormat gewaehlt = lang;

	public Zeitangabe() {
		c = getContentPane();
		c.setLayout(new BorderLayout());

		String[] s = { "Tag, Datum und Uhrzeit", "Datum und Uhrzeit mit Sekunden", "Datum mit Jahr und Uhrzeit" };
		formatAuswahl = new JComboBox<String>(s);
		c.add(formatAuswahl, BorderLayout.NORTH);

		ItemListener il = new AnzeigeListener();
		formatAuswahl.addItemListener(il);

		beschriftung = new JLabel("Datum und Uhrzeit:");
		c.add(beschriftung, BorderLayout.WEST);

		datumsAnzeige = new JLabel(gewaehlt.format(new Date()));
		c.add(datumsAnzeige, BorderLayout.EAST);

		aktualisierung = new JButton("Anzeige aktualisieren");
		c.add(aktualisierung, BorderLayout.SOUTH);

		ActionListener al = new KnopfHorcher(datumsAnzeige);
		aktualisierung.addActionListener(al);

	};

	public static void main(String[] args) {
		Zeitangabe fenster = new Zeitangabe();
		fenster.setTitle("Zeitangabe");
		fenster.setSize(300, 250);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class AnzeigeListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			JComboBox<String> cb = (JComboBox<String>) e.getSource();
			System.out.println(cb.getSelectedIndex());
			switch (cb.getSelectedIndex()) {
			case 0: // mittel
				Zeitangabe.gewaehlt = Zeitangabe.mittel;
				break;
			case 1: // lang
				Zeitangabe.gewaehlt = Zeitangabe.lang;
				break;
			case 2: // kurz
				Zeitangabe.gewaehlt = Zeitangabe.kurz;
				break;
			}

			datumsAnzeige.setText(gewaehlt.format(new Date()));

		}

	}
}