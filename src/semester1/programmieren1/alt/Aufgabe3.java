package semester1.programmieren1.alt;

import Prog1Tools.IOTools;

public class Aufgabe3{
	public static void main(String[] args){
		int alter; String name;
		name = IOTools.readString("Geben Sie ihren Namen ein: ");
		alter = IOTools.readInt("Geben Sie ihr Alter ein: ");
		System.out.println("Hallo " + name + "! Sie sind " + alter*365 + " Tage alt.");
	}
}
