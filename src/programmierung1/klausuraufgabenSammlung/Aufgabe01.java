package programmierung1.klausuraufgabenSammlung;

public class Aufgabe01 {
	public static void main(String[] args) {
		root(9,3);
	}
	public static double root(double a, int n) {
		double xK = Math.sqrt(a), xKminus1 = Math.sqrt(a);

		do {
			xKminus1 = xK;
			xK = ((n-1)*xKminus1 + a/(Math.pow(xKminus1, n-1)))/n;
			System.out.println(xK);
		} while(!(Math.abs(xK-xKminus1) <= Math.pow(10,-10)*Math.abs(xK)));
		return xK;
	}
}
