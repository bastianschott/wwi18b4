package programmierung2.blatt01.Aufgabe03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ampel extends JFrame {
	private static Container c;
	private JRadioButton[] radio;
	private JButton[] button;
	private ButtonGroup bg;

	public Ampel() {
		c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		bg = new ButtonGroup();
		radio = new JRadioButton[3];
		button = new JButton[3];
		ActionListener cl = new ColorListener();

		for (int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton();
			bg.add(radio[i]);
			radio[i].setActionCommand("" + i);
			radio[i].addActionListener(cl);

			button[i] = new JButton();
			button[i].setBackground(Color.BLACK);

			button[i].setActionCommand("button" + i);
			button[i].addActionListener(cl);

			c.add(radio[i]);
			c.add(button[i]);
		}
		button[0].setActionCommand("asfasfag");
		button[0].addActionListener(cl);

		radio[0].setText("rot");
		radio[1].setText("gelb");
		radio[2].setText("gruen");

		radio[0].setSelected(true);
		button[0].setBackground(Color.RED);

	}

	public static void main(String[] args) {
		Ampel fenster = new Ampel();
		fenster.setSize(250, 150);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class ColorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < button.length; i++) {
				button[i].setBackground(Color.BLACK);
			}

			if (e.getSource() == button[0] || e.getSource() == radio[0]) {
				button[0].setBackground(Color.RED);
				radio[0].setSelected(true);
			}
			if (e.getSource() == button[1] || e.getSource() == radio[1]) {
				button[1].setBackground(Color.YELLOW);
				radio[1].setSelected(true);
			}
			if (e.getSource() == button[2] || e.getSource() == radio[2]) {
				button[2].setBackground(Color.GREEN);
				radio[2].setSelected(true);
			}

		}

	}
}
