package programmierung1.klausuraufgabenSammlung;

public class AhaOho {
	public static void aha(int[] i, int j) {
		i[0] = i[0] + 2;
		j = i[0] * 3;
		System.out.println("aha: " + i[0] + " " + j);
	}

	public static void oho(int[] i, int[] j) {
		i[0] = j[0] + i[0];
		j[0] = i[0] * 2;
		System.out.println("oho: " + i[0] + " " + j[0]);
	}

	public static void main(String[] args) {
		int[] x = { 3 };
		int[] y = { 4 };
		aha(x, y[0]);
		System.out.println("main: " + x[0] + " " + y[0]);
		oho(x, y);
		System.out.println("main: " + x[0] + " " + y[0]);
		aha(y, x[0]);
		System.out.println("main: " + x[0] + " " + y[0]);
	}
}
