package programmierung2.blatt07.aufgabe22;

import java.io.*;
import java.nio.file.*;

import Prog1Tools.IOTools;

public class AusgabeInDatei {
	static String dateiname;
	static File ausgabe;
	static File blabla;

	public static void main(String[] args) {
		dateiname = "name"; // IOTools.readString("Datei-Name:\t");
		int n = 4; // IOTools.readInt("Zeilennummer:\t");
		String textzeile = "zeile4"; // IOTools.readString("Textzeile:\t");

		n = n < 1 ? 1 : n;
		try {
			int zeilenanzahl = (int) Files
					.lines(Paths.get("./src/programmierung2/blatt07/aufgabe22/" + dateiname + ".txt")).count();
			n = n > zeilenanzahl ? zeilenanzahl : n;

			ausgabe = new File("./src/programmierung2/blatt07/aufgabe22/" + dateiname + ".txt");
			BufferedReader brAusgabe = new BufferedReader(new FileReader(ausgabe));

			blabla = new File("./src/programmierung2/blatt07/aufgabe22/BlaBla.txt");
			BufferedWriter bwBlabla = new BufferedWriter(new FileWriter(blabla));

			for (int i = 0; i < n - 1; i++) {
				bwBlabla.write(brAusgabe.readLine());
				bwBlabla.newLine();
			}
			bwBlabla.write(textzeile);
			bwBlabla.newLine();
			for (; n <= zeilenanzahl; n++) {
				String s = brAusgabe.readLine();
				System.out.println(s);
				bwBlabla.write(s);
				bwBlabla.newLine();
			}
			brAusgabe.close();
			bwBlabla.close();
			
			
			
			Path datei = Paths.get("./src/programmierung2/blatt07/aufgabe22/" + dateiname + ".txt");
			Path pathBlabla = Paths.get("./src/programmierung2/blatt07/aufgabe22/BlaBla.txt");

			Files.delete(datei);
			Files.copy(pathBlabla, datei);
			//Files.delete(pathBlabla);

		} catch (IOException e) {
			System.out.println(e);
		}
		//writeToInput();
	}

	private static void writeToInput() {
		try {
			Path datei = Paths.get("./src/programmierung2/blatt07/aufgabe22/" + dateiname + ".txt");
			Path pathBlabla = Paths.get("./src/programmierung2/blatt07/aufgabe22/BlaBla.txt");

			Files.delete(datei);
			Files.copy(pathBlabla, datei, StandardCopyOption.REPLACE_EXISTING);
			Files.delete(pathBlabla);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
