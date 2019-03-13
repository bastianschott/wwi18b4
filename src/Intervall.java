
public class Intervall {
	private double links, rechts;

	public double getLinks() {
		return links;
	}

	public double getRechts() {
		return rechts;
	}
	
	public void move(double r) {
		links +=r;
		rechts +=r;
	}
	
	public double durchmesser() {
		return rechts-links;
	}
	
	public Intervall(double l, double r) {
		this.links = l;
		this.rechts = r;
	}
}
