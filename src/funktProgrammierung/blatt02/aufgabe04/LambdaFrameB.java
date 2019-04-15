package funktProgrammierung.blatt02.aufgabe04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LambdaFrameB extends JFrame implements Runnable {
	private final int maxValue = 100;
	JButton b0, b1, b2;

	public LambdaFrameB() {
		getContentPane();
		setTitle("Lambda-Frame");
		setLayout(new GridLayout());
		int[] text = new int[3];
		text[0] = 0;
		text[1] = 0;
		text[2] = 0;
		b0 = new JButton(text[0] + "");
		b1 = new JButton(text[1] + "");
		b2 = new JButton(text[2] + "");
		add(b0);
		add(b1);
		add(b2);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);

		b0.addActionListener(e -> b0.setText(++text[0] + ""));
		b1.addActionListener(e -> b1.setText(++text[1] + ""));
		b2.addActionListener(e -> b2.setText(++text[2] + ""));
	}

	void erhoehe() {
		while (checkValues()) {
			int i = (int) (Math.random() * 3);
			switch (i) {
			case 0:
				b0.doClick();
				break;
			case 1:
				b1.doClick();
				break;
			case 2:
				b2.doClick();
				break;

			default:
				break;
			}
		}
	}
	
	boolean checkValues() {
		return Integer.parseInt(b0.getText()) < maxValue &&
				Integer.parseInt(b1.getText()) < maxValue &&
				Integer.parseInt(b2.getText()) < maxValue;
	}

	public static void main(String[] args) {
		LambdaFrameB frame = new LambdaFrameB();
		Runnable r1 = () -> frame.erhoehe();
		r1.run();
	}

	@Override
	public void run() {

	}
}
