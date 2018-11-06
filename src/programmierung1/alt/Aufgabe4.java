package programmierung1.alt;

import Prog1Tools.IOTools;

public class Aufgabe4{
	public static void main(String[] args){
		int cache=0, jahre=0, tage=0, stunden=0, minuten=0, sekunden=0;
		cache = IOTools.readInt("Geben Sie die umzurechnenden Sekunden ein: ");
		
		if(cache > 60*60*24*365){
			jahre = cache / (60*60*24*365);
			cache = cache % (60*60*24*365);
			System.out.println(jahre + " Jahre");
		}
		if(cache > 60*60*24){
			tage = cache / (60*60*24);
			cache = cache % (60*60*24);
			System.out.println(tage + " tage");
		}
		if(cache > 60*60){
			stunden = cache / (60*60);
			cache = cache % (60*60);
			System.out.println(stunden + " Stunden");
		}
		if(cache > 60){
			minuten = cache / 60;
			sekunden = cache % 60;
			System.out.println(minuten + " Minuten");
			System.out.println(sekunden + " Sekunden");
		}
	}
}