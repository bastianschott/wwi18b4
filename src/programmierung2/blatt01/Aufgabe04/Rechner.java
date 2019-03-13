package programmierung2.blatt01.Aufgabe04;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rechner extends JFrame implements ActionListener {
	private static Container c;

	JTextField[] zahl;
	JLabel operand, gleich, ergebnis;
	JButton[] button;

	private double zahl1, zahl2, sum;

	Rechner() {
		c = getContentPane();
		c.setLayout(new GridLayout(2, 5));
		zahl = new JTextField[2];
		zahl[0] = new JTextField();
		zahl[1] = new JTextField();
		operand = new JLabel("", SwingConstants.CENTER);
		gleich = new JLabel("=", SwingConstants.CENTER);
		ergebnis = new JLabel();
		ergebnis.setOpaque(true);
		ergebnis.setBackground(Color.WHITE);
		button = new JButton[5];

		c.add(zahl[0]);
		c.add(operand);
		c.add(zahl[1]);
		c.add(gleich);
		c.add(ergebnis);
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton();
			button[i].addActionListener(this);
			c.add(button[i]);
		}
		button[0].setText("Addiere");
		button[1].setText("Subtrahiere");
		button[2].setText("Multipliziere");
		button[3].setText("Dividiere");
		button[4].setText("Loesche alles");

	}

	public static void main(String[] args) {
		Rechner fenster = new Rechner();
		fenster.setSize(600, 100);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.button[4]) {
			zahl1 = zahl2 = 0;
			zahl[0].setText("");
			zahl[1].setText("");
			operand.setText("");
			ergebnis.setText("");
		} else {
			readFields();
			if (e.getSource() == this.button[0]) {
				operand.setText("+");
			} else if (e.getSource() == this.button[1]) {
				operand.setText("-");
			} else if (e.getSource() == this.button[2]) {
				operand.setText("*");
			} else if (e.getSource() == this.button[3]) {
				operand.setText("/");
			}
			calc();
		}
	}

	private void readFields() {
		try {
			zahl1 = Double.parseDouble(zahl[0].getText());
			zahl2 = Double.parseDouble(zahl[1].getText());
		} catch (Exception e) {
		}
	}

	private void calc() {
		switch (operand.getText()) {
		case "+":
			sum = zahl1 + zahl2;
			break;
		case "-":
			sum = zahl1 - zahl2;
			break;
		case "*":
			sum = zahl1 * zahl2;
			break;
		case "/":
			try {
			sum = zahl1 / zahl2;
			} catch (Exception e) {
			}
		default:
			break;
		}
		ergebnis.setText("" + sum);
	}
}
