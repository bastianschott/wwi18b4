package semester1.softwareEngineering1.se1_blatt1;

public class Kreiszylinder {
	public int r, h;
	
	
	public static void mantelflaecheAusgeben(double radius, double hoehe) {
		System.out.print("\nDie Mantelflaeche eines Kreiszylinders mit Radius " + radius + " und Hoehe " + hoehe + " betraegt ");
		System.out.println(2 * Math.PI * radius * hoehe);
	}
	public static void grundflaecheAusgeben(double radius, double hoehe) {
		System.out.print("\nDie Grundflaeche eines Kreiszylinders mit Radius " + radius + " und Hoehe " + hoehe + " betraegt ");
		System.out.println(Math.PI * radius * radius);
	}
	public static void volumenAusgeben(double radius, double hoehe) {
		System.out.print("\nDas Volumen eines Kreiszylinders mit Radius " + radius + " und Hoehe " + hoehe + " betraegt ");
		System.out.println(((Math.PI * radius * radius) * (2 * Math.PI * radius * hoehe)));
	}
}
