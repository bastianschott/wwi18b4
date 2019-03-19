package programmierung2.blatt02.Aufgabe08;

import java.awt.*;
import javax.swing.*;

public class VierButtonFrame extends JFrame {
	Container c;

	public VierButtonFrame(int i) {
		c = getContentPane();
		if (i == 1)
			c.setLayout(new FlowLayout());
		else if (i == 2)
			c.setLayout(new BorderLayout());
		else if (i == 3)
			c.setLayout(new GridLayout());
		else
			c.setLayout(new GridLayout(0, 1));
		c.add(new ColorButton("A"));
		c.add(new ColorButton("B"));
		c.add(new ColorButton("C"));
		c.add(new ColorButton("D"));
	}

	public static void main(String[] args) {
		VierButtonFrame[] fenster = new VierButtonFrame[4];
		for (int i = 0; i < 4; i++) {
			fenster[i] = new VierButtonFrame(i + 1);
			fenster[i].setTitle("Fenster " + (i + 1));
			fenster[i].setSize(200, 200);
			fenster[i].setLocation(i * 200, 0);
			fenster[i].setVisible(true);
			fenster[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	private class ColorButton extends JButton {
		ColorButton(String text) {
			super(text);
			Color c = new Color((int) (Math.random() * 255),(int) (Math.random() * 256),(int) (Math.random() * 256));
			this.setBackground(c);
			this.setToolTipText(""+c.getRGB());
			this.setForeground(c.WHITE);
			this.setOpaque(true);
		}
	}
}