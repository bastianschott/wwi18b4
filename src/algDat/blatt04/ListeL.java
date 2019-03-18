package algDat.blatt04;

public class ListeL<I extends Comparable<I>> {

	static class ElementL<K> {
		private K inhalt; // Inhalt des Listenelements
		private ElementL<K> next; // Verweis auf den Nachfolger

		public ElementL(K o) {
			inhalt = o;
			next = null;
		}
	}

	private ElementL<I> head; // Referenz auf den Anfang der Liste

	public ListeL() {
		head = null;
	}

	public ListeL(I o) {
		head = new ElementL<I>(o);
	}

	public ElementL<I> insert(I o) { // am Anfang einfügen
		ElementL<I> newEl = new ElementL<I>(o);
		if (head == null) { // Liste ist noch leer
			head = newEl;
		} else {
			newEl.next = head;
			head = newEl;
		}
		return newEl;
	}

	public ElementL<I> insert(I o, int pos) {
		ElementL<I> neu = new ElementL<I>(o);
		if (head == null) { // Liste ist noch leer
			head = neu;
		} else if (pos == 0) {
			neu.next = head.next;
			head = neu;
		} else {
			ElementL<I> help = head;
			for (int i = 1; i < pos; i++) {
				if (help.next == null)
					break;
				help = help.next;
			}
			neu.next = help.next;
			help.next = neu;
		}
		return neu;
	}

	public ElementL<I> insertElement(I o) {
		ElementL<I> neu = new ElementL<I>(o);
		if (head == null) {
			head = neu;
		} else {
			ElementL<I> help = head;
			while (help.next == head) {
				help = help.next; // auf das nächste Element setzen
			}
			help.next = neu; // in die Liste am Ende einfügen

		}
		return neu;
	}

	public ElementL<I> insert(I o, ElementL<I> pred) { // nach pred (Vorgänger) einfügen
		ElementL<I> newEl = new ElementL<I>(o);
		if (pred == null) { // am Anfang einfügen
			newEl.next = head;
			head = newEl;
		} else { // nach pred (Vorgänger) einfügen
			newEl.next = pred.next;
			pred.next = newEl;
		}
		return newEl;
	}

	public void remove(ElementL<I> pred) { // Element nach pred (Vorgänger) löschen
		if (pred == null) // erstes Element löschen
			head = head.next;
		else if (pred.next != null) // Element nach pred (Vorgänger) löschen
			pred.next = pred.next.next;
	}

	public void removeElement(ElementL<I> element) {
		if (head == null)
			throw new RuntimeException("removeElement: List is empty");

		if (element == head) {
			head = head.next;
		} else {
			ElementL<I> help = head;
			while (element != help.next && help != null) {
				help = help.next;
			}
			if (help.next == element) {
				help.next = element.next;
			} else {
				throw new RuntimeException("removeElement: Element not found");
			}
		}
	}

	public String toString() {
		String s = "(";
		ElementL<I> help = head;
		while (help != null && help.next != null) {
			s = s + help.inhalt + ", ";
			help = help.next;
		}
		if (help != null)
			s = s + help.inhalt;
		return s + ")";
	}

	// Test

	public static void main(String[] args) {
		ListeL<Integer> l = new ListeL<Integer>();
		l.insert(0);
		ElementL<Integer> eins = l.insert(new Integer(1));
		l.insert(3);
		System.out.println(l);
		l.insert(2, eins); // nach eins einfügen
		System.out.println(l);
		l.insert(6, 0);
		System.out.println(l);
		// l.remove(eins); // Nachfolger von eins löschen
		System.out.println(l);
	}

}
