package funktProgrammierung.blatt02.aufgabe04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LambdaFrameA extends JFrame {

	public LambdaFrameA() {
		getContentPane();
		setTitle("Lambda-Frame");
		setLayout(new GridLayout());
		int[] text = new int[3];
		text[0] = 0;
		text[1] = 0;
		text[2] = 0;
		JButton b0 = new JButton(text[0] + "");
		JButton b1 = new JButton(text[1] + "");
		JButton b2 = new JButton(text[2] + "");
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

	public static void main(String[] args) {
		LambdaFrameA frame = new LambdaFrameA();
	}
}
