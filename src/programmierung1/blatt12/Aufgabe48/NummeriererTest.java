package programmierung1.blatt12.Aufgabe48;

import Prog1Tools.IOTools;

public class NummeriererTest {
	
	public static void main(String[] args) {
		char i = '0';
		while(i != 'b' && i != 'z')
			i = IOTools.readChar("Buchstabe oder Zahl? (b/z): ");
		Nummerierer n;
		
		if (i == 'b')
			n = new BuchstabenNummerierer();
		else
			n = new ZahlenNummerierer();
		
		Schilder.beschriften(n);
	}
}