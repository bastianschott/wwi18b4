package programmierung2.blatt01.Aufgabe05;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EuroConverterWindow extends JFrame {
	Container c;
	static JLabel labelEuro = new JLabel("Euro");
	static JTextField textfieldEuro, textfieldSonst;
	static JComboBox<String> box = new JComboBox<>(EuroConverter.getBezeichnung());

	public EuroConverterWindow() {
		c = getContentPane();
		c.setLayout(new GridLayout(0, 1));
		textfieldEuro = new JTextField();
		textfieldSonst = new JTextField();
		c.add(labelEuro);

		c.add(textfieldEuro);
		textfieldEuro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textfieldSonst.setText("" + EuroConverter.convertFromEuro(Double.parseDouble(textfieldEuro.getText()),
						box.getSelectedIndex()));
			}
		});

		c.add(box);
		box.addActionListener(textfieldEuro.getActionListeners()[0]);

		c.add(textfieldSonst);
		textfieldSonst.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textfieldEuro.setText("" + EuroConverter.convertToEuro(Double.parseDouble(textfieldSonst.getText()),
						box.getSelectedIndex()));
			}
		});

	}

	public static void main(String[] args) {
		EuroConverterWindow window = new EuroConverterWindow();
		initWindow(window);

	}

	private static void initWindow(EuroConverterWindow w) {
		w.setTitle("EuroConverter");
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.pack();
	}

	class AlTextfieldEuro implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	class AlTextFieldSonst implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	class AlComboBox implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}
}
