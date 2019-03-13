package programmierung2.blatt01.Aufgabe02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JLabel;

public class KnopfHorcher implements ActionListener {
	private JLabel label;

	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText(Zeitangabe.gewaehlt.format(new Date()));
	}

	public KnopfHorcher(JLabel label) {
		this.label = label;
	}

}
