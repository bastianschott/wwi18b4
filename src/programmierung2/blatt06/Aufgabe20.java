package programmierung2.blatt06;

import java.io.*;

public class Aufgabe20 {
	public static void main(String[] args) {
		try {

			File f = new File(args[0]);
			FileReader fr = new FileReader(f);
			StreamTokenizer st = new StreamTokenizer(fr);
			int tokenType;
			while ((tokenType = st.nextToken()) != StreamTokenizer.TT_EOF) {
				if (tokenType == StreamTokenizer.TT_NUMBER) {
					System.out.println("Vorsicht! Der Text enthält die Zahl" + st.nval);
					return;
				}
			}

			System.out.println("Der Text ist sauber!");

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
