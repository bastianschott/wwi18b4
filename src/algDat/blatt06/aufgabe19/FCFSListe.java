package algDat.blatt06.aufgabe19;

import java.util.AbstractQueue;

public class FCFSListe implements WarteSchlange {
	private ZPatient first, last;

	@Override
	public void anmelden(ZPatient p) {
		if (last == null && first == null) {
			first = p;
			first.next = last;
			last = first;
		} else {
			last.next = p;
			last = p;
		}
	}

	@Override
	public ZPatient derNaechsteBitte() {
		if (first != null) {
			ZPatient cache = first;
			first = first.next;
			return cache;
		}
		return null;
	}

}
