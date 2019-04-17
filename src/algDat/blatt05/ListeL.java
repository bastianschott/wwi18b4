package algDat.blatt05;

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

	/**
	 * Searches the list via binary search for the inserted Parameter.
	 * 
	 * @param o Searched Value
	 * @returns the Index of o
	 */
	public int find1(I o) {
		if (head == null)
			return -1;
		int pos = 0;
		ElementL<I> help = head;
		while (help != null) {
			if (help.inhalt.equals(o))
				return pos;
			help = help.next;
			pos++;
		}
		return -1;
	}

	/**
	 * Sorts the List via Selectionsort.
	 */
	public void sort1() {
		if (head == null || head.next == null)
			return;
		ElementL<I> help = head;
		ElementL<I> help2;
		ElementL<I> min;
		while (help.next != null) {
			min = help;
			help2 = min.next;
			while (help2 != null) {
				if (min.inhalt.compareTo(help2.inhalt) > 0) {
					min = help2;
				}
				help2 = help2.next;
			}

			if (min != help) {
				I inhalt = min.inhalt;
				min.inhalt = help.inhalt;
				help.inhalt = inhalt;
			}
			help = help.next;
		}
	}

	/**
	 * Sorts the List via Bubblesort.
	 */
	public void sort2() {
		if (head == null || head.next == null)
			return;
		ElementL<I> help = head;
		boolean getauscht = true;
		while (getauscht) {
			getauscht = false;
			while (help != null && help.next != null) {
				if (help.inhalt.compareTo(help.next.inhalt) > 0) {
					I inhalt = help.inhalt;
					help.inhalt = help.next.inhalt;
					help.next.inhalt = inhalt;
					getauscht = true;
				}
				help = help.next;
			}
			help = head;
		}
	}

	/**
	 * Sorts the List via Insertionsort
	 */
	public void sort3() {
		if (head == null || head.next == null)
			return;

		ElementL<I> lastSorted = head;
		ElementL<I> pos, toInsert;

		while (lastSorted.next != null) {
			toInsert = lastSorted.next;
			if (lastSorted.inhalt.compareTo(toInsert.inhalt) > 0) {
				if (toInsert.inhalt.compareTo(head.inhalt) < 0) {
					remove(lastSorted);
					insert(toInsert.inhalt);
				} else {
					pos = head;
					while (pos != lastSorted) {
						if (pos.next.inhalt.compareTo(toInsert.inhalt) > 0) {
							break;
						}
						pos = pos.next;
					}
					remove(lastSorted);
					insert(toInsert.inhalt, pos);
				}
			} else {
				lastSorted = toInsert;
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
		l.remove(eins); // Nachfolger von eins löschen
		System.out.println(l);
		l.sort3();
		System.out.println(l);

		ListeL<Integer> list = new ListeL<Integer>();

		list.insert(5);
		list.insert(8);
		list.insert(3);
		list.insert(4);
		list.insert(0);
		list.insert(7);
		list.insert(1);
		list.insert(2);
		System.out.println(list);
		list.sort3();

		System.out.println(list);
	}

}
