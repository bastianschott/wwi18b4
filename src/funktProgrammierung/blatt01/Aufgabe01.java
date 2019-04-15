package funktProgrammierung.blatt01;

import java.util.*;

public class Aufgabe01 {
	public static void main(String[] args) {
		List<Double> zahlen = Arrays.asList(1.0, 2.5, 3.5, 1.1, 2.2);
		
		zahlen.replaceAll(s -> Math.random());
		zahlen.sort((a,b) -> a.compareTo(b));
		Arrays.toString(zahlen.toArray());
		System.out.println(zahlen);
	}
}
