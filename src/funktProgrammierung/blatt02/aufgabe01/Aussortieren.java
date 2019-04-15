package funktProgrammierung.blatt02.aufgabe01;

import java.util.Arrays;
import java.util.List;

public class Aussortieren {

	public static int[] reduziertesArray(int[] ia, Pruefung prfg) {
		int n = 0;
		for (int i : ia)
			n += prfg.istErfolgreichFuer(i) ? 1 : 0;

		int[] neuesArray = new int[n];

		int j = 0;
		for (int i = 0; i < ia.length; i++) {
			if (prfg.istErfolgreichFuer(ia[i])) {
				neuesArray[j] = ia[i];
				j++;
			}
		}

		return neuesArray;
	}

	public static void ausgabe(String text, int[] ia) {
		String s = text + ": ";
		for (int i : ia) {
			s += i + " | ";
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		int [] zahlen = new int[30];
		for(int i=0; i < zahlen.length; i++) {
			zahlen[i] = (int) (Math.random()*201-100);
		}
		
		ausgabe("",zahlen);
		ausgabe("negativ", reduziertesArray(zahlen,z -> z<0));
		ausgabe("gerade", reduziertesArray(zahlen, z -> z%2==0));
		ausgabe("vielfache von 7", reduziertesArray(zahlen, z -> z%7==0));
		ausgabe("Quadratzahlen", reduziertesArray(zahlen, z -> Math.sqrt(z) %1 == 0));
		
		
	}
}
