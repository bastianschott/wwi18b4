package softwareEngineering1.se1_blatt03;

public class BruchTest {
	public static void main(String[] args) {
		Bruch b1 = new Bruch();
		b1.einlesen();
		Bruch b2 = new Bruch();
		b2.einlesen();
		System.out.println("b1*b2 = " + b1.mul(b2));
	}
}