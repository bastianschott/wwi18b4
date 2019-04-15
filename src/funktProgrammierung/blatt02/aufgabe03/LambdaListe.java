package funktProgrammierung.blatt02.aufgabe03;

import java.util.Arrays;
import java.util.List;

public class LambdaListe {
	public static void main(String[] args) {
		List<Integer> liste = Arrays.asList(11, 21, 24, 36, 41, 55, 62, 66);
		
		System.out.println(liste);
		
		liste.sort((a,b) -> (a%8 - b%8));
		System.out.println(liste);
	}
}