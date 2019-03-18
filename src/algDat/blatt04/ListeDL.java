package algDat.blatt04;

import java.util.Arrays;

public class ListeDL<T> {

	private static class ElementDL<E> {
		private E element; // Inhalt des Listenelements
		private ElementDL<E> next; // Verweis auf den Nachfolger
		private ElementDL<E> prev; // Verweis auf den Vorgänger

		public ElementDL(E o) {
			element = o;
			next = null;
			prev = null;
		}

		@Override
		public String toString() {
			return element.toString();
		}
	}

	private ElementDL<T> head; // Referenz auf den Anfang der Liste
	private ElementDL<T> tail; // Referenz auf das Ende der Liste

	public ListeDL() {
		head = null;
		tail = null;
	}

	public ListeDL(T o) {
		head = new ElementDL<T>(o);
		tail = head;
	}

// NOCH NICHT FERTIG!!!

	// Methode, um o am Ende einzufügen
	public ElementDL<T> insert(T o) {
		ElementDL<T> neu = new ElementDL<T>(o);
		if (head == null) {
			head = neu;
			tail = neu;
		} else {
			neu.prev = tail;
			tail.next = neu;
			tail = neu;
		}
		return tail;
	}

	// Methode, um o an der Postion pos einfügen
	public ElementDL<T> insert(T o, ElementDL<T> pos) {
		ElementDL<T> newEl = new ElementDL<T>(o);

		// ...

		return newEl;
	}

	// Element e löschen
	public void remove(ElementDL<T> e) {
		if (head == null) {
			throw new RuntimeException("remove(e): List is empty");
		} else if (head == e) {
			head = head.next;
			head.prev = null;
		} else if (tail == e) {
			tail = tail.prev;
			tail.next = null;
		} else {
			e.prev.next = e.next;
			e.next.prev = e.prev;
		}
	}

	public String toString() {
		String s = "(" + head + ", ";

		ElementDL<T> help = head;
		while (help.next != tail) {
			s += help + ", ";
			help = help.next;
		}
		s += tail;
		return s + ")";
	}

	// Test

	public static void main(String[] args) {
		ListeDL<Integer> l = new ListeDL<Integer>();
		l.insert(new Integer(0));
		// ElementDL<Integer> eins = l.insert(new Integer(1));
		l.insert(new Integer(3));
		System.out.println(l);
		l.insert(new Integer(5));
		l.insert(9);
		l.insert(new Integer(10));
		l.insert(9);
		// l.insert(new Integer(2), eins); // vor eins einfügen
		System.out.println(l);
		// l.remove(eins); // Nachfolger von eins löschen
		System.out.println(l);
	}

}
