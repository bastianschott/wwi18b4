package programmierung1.blatt09.Aufgabe38;

import Prog1Tools.IOTools;

public class Punkt {
	private double x,y;
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void read() {
		this.x = IOTools.readDouble("X eingeben: ");
		this.y = IOTools.readDouble("Y eingeben: ");
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
