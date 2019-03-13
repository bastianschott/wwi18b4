package programmierung1.blatt15;

public class Gleichung {
	private double a, b, c;

	public Gleichung(String a, String b, String c) {
		this.a = Double.parseDouble(a);
		this.b = Double.parseDouble(b);
		this.c = Double.parseDouble(c);
	}

	public Loesung berechneLoesung() throws Exception {
		System.out.println("a=" + a + "; b=" + b + "; c=" + c);
		if(a==0) throw new NichtquadratischException("A = 0 nicht zulaessig");
		
		double d = b*b - 4*a*c;
		if(d < 0) throw new UnloesbarException("b*b-4*a*c = " + d + " < 0");
		
		double w = Math.sqrt(d);
		return new Loesung((-b + w)/(2*a), (-b - w)/(2*a));
		
		
		
	}
}
