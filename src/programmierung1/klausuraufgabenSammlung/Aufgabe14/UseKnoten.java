package programmierung1.klausuraufgabenSammlung.Aufgabe14;

public class UseKnoten {
	public static void main(String[] args) {
		int matrNr = 4942467;
		Knoten kopf, p, hilf;
		int i;
		kopf = new Knoten();
		p = kopf;
		p.zahl = matrNr % 10;
		matrNr = matrNr / 10;
		for (i = 2; i <= 4; i++) {
			hilf = new Knoten();
			p.next = hilf;
			p = p.next;
			p.zahl = matrNr % 10;
			matrNr = matrNr / 10;
		}
		p = kopf;
		for (i = 1; i <= 4; i++) {
			System.out.println(p.zahl);
			p = p.next;
		}
	}
}