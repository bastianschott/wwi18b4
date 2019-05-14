package programmierung2.blatt07.aufgabe22;

import java.io.*;

import Prog1Tools.IOTools;

public class AusgabeInDate2 {
	public static void main(String[] args) {
		String name = IOTools.readLine("Dateiname: ");
		int n = IOTools.readInt("Zeilennummer: ");
		String textzeile = IOTools.readLine("Neue Textzeile: ");

		try {
			File hilf = new File("./src/programmierung2/blatt07/aufgabe22/BlaBla.txt");
			BufferedReader br = new BufferedReader(
					new FileReader("./src/programmierung2/blatt07/aufgabe22/" + name + ".txt"));

			PrintWriter pw = new PrintWriter("BlaBla.txt");

			String s = br.readLine();
			int i = 1;
			while (i < n && s != null) {
				pw.println(s);
				s = br.readLine();
				i++;
			}
			pw.print(textzeile);

			while (s != null) {
				pw.println(s);
				s = br.readLine();
			}
			pw.close();
			br.close();
			

		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
