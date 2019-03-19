package programmierung2.blatt02.Aufgabe09;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Zeichnung extends JPanel {
	
	private int[] x,y;
	
	public Zeichnung(int[] x, int[] y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawPolyline(x, y, x.length);
	}
}
