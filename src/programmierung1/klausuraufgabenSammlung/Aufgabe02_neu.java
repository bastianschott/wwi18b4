package programmierung1.klausuraufgabenSammlung;

public class Aufgabe02_neu {
	public static double newton(double k0, double epsilon) {
		int k=1, kmax=50;
		double xalt=k0, xneu=k0;
		do {
			xalt=xneu;
			xneu = xalt - (Math.sin(xalt) / Math.cos(xalt));
			if(k == kmax) return -1;
		} while(Math.abs(xneu-xalt) > Math.abs(xneu));
		return xneu;
	}
	
	public static void main(String[] args) {
		System.out.println(args);
		
		System.out.println(newton(2, 3));
	}
}
