package programmierung2.blatt05.aufgabe16;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Prog1Tools.IOTools;

public class Stoppuhr extends Thread {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("EE MM dd HH:mm:ss zz yyyy");
	private static boolean running = true;

	@Override
	public void run() {
		while (running) {
			System.out.print("\n" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}

		}
	}

	public static void main(String[] args) {
		System.out.print("Stoppuhr starten mit Eingabetaste!");
		Scanner keyIn = new Scanner(System.in);
		keyIn.nextLine();
		keyIn.close();
		Date start = new Date();

		// Format: Fri Jan 11 14:02:40 CET 2019
		System.out.println("Startzeitpunkt: " + dateFormat.format(start));

		System.out.print("Stoppuhr anhalten mit Eingabetaste!");
		Stoppuhr anzeige = new Stoppuhr();
		anzeige.start();

		keyIn.nextLine();
		running = false;
		Date stop = new Date();
		System.out.print("Stoppzeitpunkt: " + dateFormat.format(stop));
		System.out.print("\nGesamtlaufzeit: " + (stop.getTime() - start.getTime()) + " ms");
	}
}
