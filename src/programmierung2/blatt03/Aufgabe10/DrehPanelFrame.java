package programmierung2.blatt03.Aufgabe10;

import java.awt.*;

import javax.swing.*;

public class DrehPanelFrame extends JFrame {
	Container c;
	public DrehPanelFrame() {
		DrehPanel drehPanel = new DrehPanel();
		add(drehPanel);
	}
	
	public static void main(String[] args) {
		DrehPanelFrame frame = new DrehPanelFrame();
		frame.setSize(350,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
