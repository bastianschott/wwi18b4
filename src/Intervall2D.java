
public class Intervall2D {
	private Intervall x,y;
	public Intervall2D(Intervall x, Intervall y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public double area() {
		return x.durchmesser() * y.durchmesser();
	}
	
	public void move(double s, double t) {
		x.move(s);
		y.move(t);
	}
}
