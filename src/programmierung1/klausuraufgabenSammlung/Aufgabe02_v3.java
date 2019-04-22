package programmierung1.klausuraufgabenSammlung;

public class Aufgabe02_v3 {
	static int k=0;
	public static double newton(double x0, double epsilon) {
		double xalt=x0, xneu;
		k++;
		if(k==50) return -1;
		
		xneu = xalt - Math.sin(xalt) / Math.cos(xalt);
		if(Math.abs(xneu - xalt) <= Math.abs(xneu)) return xneu;
		return newton(xneu, epsilon);

	}
	
	public static void main(String[] args) {
		System.out.println(newton(3,2));
	}
}
