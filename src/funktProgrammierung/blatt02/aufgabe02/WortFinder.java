package funktProgrammierung.blatt02.aufgabe02;

public class WortFinder {
	public static String erstesWort(String[] str, Bedingung bedingung) {
		for (String s : str)
			if (bedingung.trifftZuAuf(s))
				return s;
		return "";
	}

	public static void main(String[] args) {
		String[] woerter = TestDaten.erzeuge();
		System.out.println(
				erstesWort(woerter, s -> s.startsWith("A")) + "\n" + 
				erstesWort(woerter, s -> s.contains("au")) + "\n" + 
				erstesWort(woerter, s -> s.endsWith("suppe")) + "\n" + 
				erstesWort(woerter, s -> s.length() == 8) + "\n" 
				);
		
	}
}
