package algDat.blatt06.aufgabe20;

public class KettenStapel implements Stapel<Wert> {
	Wert head;

	@Override
	public void push(Wert w) {
		if (head != null)
			w.next = head;
		head = w;
	}

	@Override
	public Wert pop() {
		if (head == null)
			return null;
		Wert w = head;
		head = head.next;
		return w;
	}

}
