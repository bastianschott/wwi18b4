package funktProgrammierung.blatt03.aufgabe02;

import java.util.List;

public class Personen {

	public static void main(String[] args) {
		List<Person> list = TestPersonen.erzeuge();

		list.forEach(System.out::println);
		System.out.println("\n");
		list.stream().filter(p -> p.geschlecht == 'w').forEach(System.out::println);
		System.out.println("\n");
		list.stream().filter(p -> p.geschlecht == 'm').filter(p -> p.gebJahr > 2300).forEach(System.out::println);
		System.out.println("\n");
		list.stream().filter(p -> p.vorname.charAt(0) == p.nachname.charAt(0)).forEach(System.out::println);
		System.out.println("\n" + 
		list.stream().filter(p -> p.geschlecht == 'w').count());
		System.out.println("\n" + 
		list.stream().mapToInt(p -> 2400 - p.gebJahr).average().getAsDouble());
		System.out.println("\n" + 
		list.stream().mapToInt(p -> p.gebJahr).max().getAsInt());
		System.out.println("\n");
		int i = list.stream().mapToInt(a -> a.gebJahr).min().getAsInt();
		list.stream().filter(p -> i == p.gebJahr).forEach(System.out::print);
		

	}
}
