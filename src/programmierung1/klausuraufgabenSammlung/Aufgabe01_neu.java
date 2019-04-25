package programmierung1.klausuraufgabenSammlung;

public class Aufgabe01_neu {
	public static void main(String[] args) {
		root(9,3);
	}
	
	public static double root(double a, int n) {
		double xalt=Math.sqrt(a), xneu=Math.sqrt(a);
		do {
			xalt = xneu;
			xneu = ((n-1) * xalt + a/Math.pow(xalt, n-1))/n;
			System.out.println(xneu);
		} while (Math.abs(xneu-xalt) > Math.pow(10,-10) * Math.abs(xneu));
		return xneu;
	}
}
