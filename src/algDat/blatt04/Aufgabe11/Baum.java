package algDat.blatt04.Aufgabe11;

import Prog1Tools.IOTools;

public class Baum {
	private int wert; // Inhalt
	private Baum links; // Verweis auf linken Teilbaum
	private Baum rechts; // Verweis auf rechten Teilbaum

	public Baum(int x) {
		wert = x;
	}

	public void insert(int x) {
		if (x < wert) { // im linken Ast einfügen

			if (links == null) {
				links = new Baum(x);
			} else {
				links.insert(x);
			}
		} else { // im rechten Ast einfügen

			if (rechts == null) {
				rechts = new Baum(x);
			} else {
				rechts.insert(x);
			}
		}
	}

	public int maxIt() { // iterativ
		Baum cache = this;
		while (cache.rechts != null) {
			cache = cache.rechts;
		}
		return cache.wert;
	}

	public int max() { // rekursiv
		return rechts == null? wert: rechts.max();
	}

	public int min() {
		if (links == null) {
			return wert;
		} else
			return links.min();
	}

	public String toString() { // Inorder-Traversierung (L-W-R)
		String s = "";
		if (links != null) {
			s = s + links.toString();
			s = s + ", ";
		}
		s = s + wert;
		if (rechts != null) {
			s = s + ", ";
			s = s + rechts.toString();
		}
		return s;
	}

	public String toPostorder() { // Postorder-Traversierung (L-R-W)
		return (links != null ? links.toPostorder()+", ": "") + 
				(rechts != null ? rechts.toPostorder()+", ": "") + 
				wert;
	}

	public static void main(String[] args) {
		System.out.println("Beliebig viele int-Werte " + "eingeben (Wert 0 fuer Abbruch):");

		// int n = IOTools.readInteger();
		Baum b = new Baum(8);

//		while (n != 0) {
//			n = IOTools.readInteger();
//			if (n != 0)
//				b.insert(n);
//		}
		
		b.insert(3);
		b.insert(5);
		b.insert(9);
		b.insert(2);
		b.insert(8);
		b.insert(3);
		b.insert(7);
		b.insert(6);

		System.out.println("Sortierte Liste: " + b);
		System.out.println("Max: " + b.maxIt());
		System.out.println("Max: " + b.max());
		System.out.println("Min: " + b.min());
		System.out.println("Postorder Liste: " + b.toPostorder());
	}
}
