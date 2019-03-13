package programmierung1.blatt15;

public class Mitternachtsformel {
	public static void main(String[] args) throws Exception {
		String[] s = new String[] { "2", "3" };

		try {
			Gleichung g = new Gleichung(s[0], s[1], s[2]);
			Loesung l = g.berechneLoesung();
			System.out.println("Loesung x1: " + l.getX1() + "     " + "Loesung x2: " + l.getX2());
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Korrekter Aufruf: java Mitternachtsformel a b c");
		} catch (NumberFormatException nfe) {
			System.out.println("Unzulaessiges Argument: " + "a, b oder c kein zulaessiger double-Wert!");
		} catch (NichtquadratischException nqe) {
			System.out.println(nqe);
		} catch (UnloesbarException ue) {
			System.out.println(ue);
		}
	}
}
