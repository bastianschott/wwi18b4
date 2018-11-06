package programmierung1.blatt09.Aufgabe38;

public class Strecke {
	private Punkt p,q;
	
	public Strecke(Punkt p, Punkt q) {
		this.p = p;
		this.q = q;
	}
	
	public void read() {
		System.out.println("Punkt p:");
		p.read();
		System.out.println("Punkt q:");
		q.read();
	}
	
	public double getLaenge() {
		//Wurzel( (x_p-x_q)^2 + (y_p-yq)^2 )
		
		return Math.sqrt(
				Math.abs((p.getX() - q.getX()) * (p.getX() - q.getX())) +
				Math.abs((p.getY() - q.getY()) * (p.getY() - q.getY())));
	}
	
	public String toString() {
		return p + "_" + q;
	}
}
