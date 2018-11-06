package programmierung1.alt;

public class Aufgabe6{
	public static void main(String[] args){
		long x1=(long)(1e20), x2=1223, x3=(long)(1e18), x4=(long)(1e15), x5=3, x6=(long)(-1e12),
		y1=(long)(1e20), y2=2, y3=(long)(-1e22), y4=(long)(1e13), y5=2111, y6=(long)(1e16);
		long cache = x1*y1 + x2*y2 + x3*y3 + x4*y4 + x5*y5 + x6*y6;
		System.out.println(cache);

		long x = 192119201,y = 35675640;
		cache = ((1/107751)*(1682*x*y*y*y*y + (3*x*x*x + 29*x*y*y - 2*x*x*x*x*x) + 832));
		System.out.println(cache);
		//System.out.println(1682*x*y*y*y*y + " + " + 3*x*x*x + " + " + 29*x*y*y + " - " + 2*x*x*x*x*x + " + " + 832);

		cache = (x*y*y/107751)*(1682*y*y + 29) + (x*x*x/107751)*3 - (x*x*x/107751)*(2*x*x) + 832/107751;
		System.out.println(cache);
	}	
}