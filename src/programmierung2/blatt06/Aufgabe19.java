package programmierung2.blatt06;

import java.io.*;

public class Aufgabe19 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(new File("./src/programmierung2/blatt06/Eingabe.txt"));

			BufferedReader br = new BufferedReader(fr);
			new File("./src/programmierung2/blatt06/Ausgabe.txt").createNewFile();
			File f = new File("./src/programmierung2/blatt06/Ausgabe.txt");
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			// BufferedWriter bw = new BufferedWriter(fw);

			pw.println(br.readLine());
			pw.println("Neue Zeile");
			pw.println(br.readLine());

			br.close();
			pw.close();

			br = new BufferedReader(new FileReader(f));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
