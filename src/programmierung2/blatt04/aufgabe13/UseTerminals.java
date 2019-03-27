package programmierung2.blatt04.aufgabe13;

class KonzertDaten {
	private static int sitzPlatz = 0;

	synchronized int freierPlatz() {
		int n = sitzPlatz;
		long t = System.currentTimeMillis() + 50, s = t + 50;
		while (System.currentTimeMillis() < t)
			/* simuliere einen Datenbankzugriff */ ;
		Thread.yield(); // erlaube Aktivit¨aten anderer Threads
		while (System.currentTimeMillis() < s)
			/* simuliere einen Datenbankzugriff */ ;
		return sitzPlatz = n + 1;
	}
}

class KartenTerminal extends Thread {
	static int i = 0;
	private KonzertDaten daten;

	KartenTerminal(String name, KonzertDaten daten) {
		super(name);
		this.daten = daten;
	}

	public void run() {
		for (; i < 100; i++)
			System.out.println(getName() + ": Sitzplatz " + daten.freierPlatz() + " verkauft");
	}
}

public class UseTerminals {
	public static void main(String[] args) {
		KonzertDaten daten = new KonzertDaten();
		KartenTerminal t1 = new KartenTerminal("Karten-Terminal 1", daten),
				t2 = new KartenTerminal("Karten-Terminal 2", daten);
		t1.start();
		t2.start();
	}
}