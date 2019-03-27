package programmierung2.blatt03.Aufgabe11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FunktionsFrame extends JFrame {
	Container c;
	private static JCheckBox log = new JCheckBox("LOGARITHMUS");
	private static JTextField eingabe = new JTextField();
	private static JLabel ausgabe = new JLabel();

	public FunktionsFrame() {
		c = getContentPane();
		c.setLayout(new GridLayout(2, 3));

		JCheckBox quad = new JCheckBox("QUADRATWURZEL");

		ButtonGroup bg = new ButtonGroup();
		bg.add(log);
		bg.add(quad);

		JButton berechne = new JButton("Berechne");
		berechne.addActionListener(new ExecuteListener());

		log.setSelected(true);

		ausgabe.setBackground(Color.WHITE);
		ausgabe.setOpaque(true);

		c.add(new JLabel("Argument"));
		c.add(log);
		c.add(berechne);
		c.add(eingabe);
		c.add(quad);
		c.add(ausgabe);
	}

	public static void main(String[] args) {
		FunktionsFrame frame = new FunktionsFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.pack();
	}
	
	class ExecuteListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (log.isSelected()) {
				ausgabe.setText("" + Math.log(Double.parseDouble(eingabe.getText())));
			} else {
				ausgabe.setText("" + Double.parseDouble(
						"" + (Double.parseDouble(eingabe.getText()) * Double.parseDouble(eingabe.getText()))));
			}
		}
	}
}
