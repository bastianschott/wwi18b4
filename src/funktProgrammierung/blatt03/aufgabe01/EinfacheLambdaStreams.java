package funktProgrammierung.blatt03.aufgabe01;

import java.util.*;
import java.util.stream.Stream;

public class EinfacheLambdaStreams {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Alfons", "Rocko", "Willhelm", "Henrietta", "Heidrun", "Leonie");
		
		list.stream().filter(s -> s.startsWith("H")).sorted().forEach(System.out::println);
		System.out.println("\n");
		list.stream().filter(s -> s.length()>5).sorted((a,b) -> a.length()-b.length()).forEach(System.out::println);
		System.out.println("\n");
		list.stream().limit(4).map(s -> new StringBuffer(s).reverse()).forEach(System.out::println);
		System.out.println("\n"+
		list.stream().mapToInt(s -> s.length()).distinct().sum());
		
		
	}
}
