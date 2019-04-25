package programmierung1.klausuraufgabenSammlung;

public class Kehrwert {
	public static int count = 0;

	public static double q(double x, int y) {
		System.out.println(++count + ": " + "q(d,i)");
		return x / y;
	}

	public static double q(double x, double y) {
		System.out.println(++count + ": " + "q(d,d)");
		return x / y;
	}

	public static double kw(double x) {
		System.out.println(++count + ": " + "kw(d)");
		return q(1, x);
	}

	public static double[] kw(double[] x) {
		System.out.println(++count + ": " + "kw(d[])");
		double[] kx = new double[x.length];
		for (int i = 0; i < x.length; i++)
			kx[i] = kw(x[i]);
		return kx;
	}

	public static void main(String[] args) {
		int i;
		double d = 0.25;
		double[] kdF, dF = { 0.2 };
		System.out.println(++count + ": " + "q(2.0,2) = " + q(2.0, 2));
		System.out.println(++count + ": " + "q(4,2.0) = " + q(4, 2.0));
		System.out.println(++count + ": " + "q(6,2) = " + q(6, 2));
		System.out.println(++count + ": " + "kw(d) = " + kw(d));
		kdF = kw(dF);
		System.out.println(++count + ": " + "kw(dF) = ");
		for (i = 0; i < dF.length; i++)
			System.out.println(++count + ": " + "Komp. " + i + ": " + kdF[i]);
	}
}