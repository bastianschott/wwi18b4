package funktProgrammierung.blatt03.aufgabe03;

import java.util.stream.*;

public class Aufg03 {
	public static void main(String[] args) {
		IntStream stream = IntStream.iterate(2, i -> i + 2);
		stream.limit(8).forEach(System.out::println);

		stream = IntStream.iterate(2, i -> i + 2);
		System.out.println("\n" + stream.filter(i -> i % 3 == 0).limit(20).sum());
		System.out.println("\n");
		stream = IntStream.generate(() -> (int) (Math.random() * 6 + 1));
		stream.limit(10).forEach(System.out::println);
		System.out.println("\n");
		stream = IntStream.generate(() -> (int) (Math.random() * 6 + 1));
		System.out.println(stream.limit(100).filter(i -> i <= 4).average().getAsDouble());
	}
}
