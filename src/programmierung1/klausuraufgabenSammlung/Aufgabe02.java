package programmierung1.klausuraufgabenSammlung;

public class Aufgabe02 {
	public static double newton(double x0, double epsilon) {
		double[] x = new double[50];
		x[0] = x0;
		int k=0;
		do {
			k++;
			x[k] = x[k-1] - Math.sin(x[k-1])/Math.cos(x[k-1]);
			
		} while(!(x[k] == x[k-1]) && k < 50);
		
		
		
		return k == 50 ? x[k] : -1;
	}
	
	public static void main(String[] args) {
		System.out.println(newton(2, 3));
	}
}
