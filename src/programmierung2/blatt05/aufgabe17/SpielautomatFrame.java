package programmierung2.blatt05.aufgabe17;

import java.awt.*;
import javax.swing.*;

public class SpielautomatFrame extends JFrame {

	Container c;
	ColorRunLabel[] label = new ColorRunLabel[3];
	StartStopButton[] button = new StartStopButton[3];
	Thread[] thread = new Thread[3];
	
	public SpielautomatFrame() {
		c = getContentPane();
		c.setLayout(new GridLayout(2,3));
		for (int i = 0; i < label.length; i++) {
			label[i] = new ColorRunLabel(Color.RED);
			button[i] = new StartStopButton(Color.RED);
		}
		label[0].setBackground(Color.RED);
		c.add(label[0]).setBackground(Color.RED);
		c.add(label[1]).setBackground(Color.YELLOW);
		c.add(label[2]).setBackground(Color.GREEN);
		c.add(button[0]).setBackground(Color.RED);
		c.add(button[1]).setBackground(Color.YELLOW);
		c.add(button[2]).setBackground(Color.GREEN);
	}
	
	public static void main(String[] args) {
		SpielautomatFrame frame = new SpielautomatFrame();
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
