package softwareEngineering1.se1_blatt01;

public class Kreiskegel {
	public int r, h;
	
	
	public static void mantelflaecheAusgeben(double radius, double hoehe) {
		System.out.println(Math.PI * radius * Math.sqrt(radius*radius+hoehe*hoehe));
		System.out.print("\nDie Mantelflaeche eines Kreiskegels mit Radius " + radius + " und Hoehe " + hoehe + " betraegt ");
	}
	public static void grundflaecheAusgeben(double radius, double hoehe) {
		System.out.print("\nDie Grundflaeche eines Kreiskegels mit Radius " + radius + " und Hoehe " + hoehe + " betraegt ");
		System.out.println(Math.PI * radius * radius);
	}
	public static void volumenAusgeben(double radius, double hoehe) {
		System.out.print("\nDas Volumen eines Kreiskegels mit Radius " + radius + " und Hoehe " + hoehe + " betraegt ");
		System.out.println(((Math.PI * radius * Math.sqrt(radius*radius+hoehe*hoehe)) * (2 * Math.PI * radius * hoehe))/3);
	}
}
