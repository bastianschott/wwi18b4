public class ListeF<T extends Comparable<T>> {
	private T[] element;
	private int lastIndex;
	public int n=0;

	public ListeF(int len) {
		element = (T[]) new Comparable[len];
		lastIndex = -1; // leere Liste
	}

	public void insert(T o) { // am Ende einfügen
		if (lastIndex == element.length - 1)
			throw new RuntimeException("Liste ist bereits voll!");
		lastIndex++;
		element[lastIndex] = o;
	}

	public void insert(T o, int k) { // bei k einfügen
		if (lastIndex == element.length - 1)
			throw new RuntimeException("Liste ist bereits voll!");
		if (k < 0 || k >= element.length)
			throw new RuntimeException("Unzulaessige Position: " + k);
		if (k > lastIndex)
			insert(o); // am Ende einfügen
		else {
			lastIndex++;
			// Platz schaffen für das neue Element
			for (int i = lastIndex; i > k; i--)
				element[i] = element[i - 1];
			// einfügen
			element[k] = o;
		}
	}

	public void remove(int k) {
		if (k < 0 || k >= element.length)
			throw new RuntimeException("Unzulaessige Position: " + k);
		if (k <= lastIndex) {
			for (int i = k; i < lastIndex; i++) // Aufrücken der nach-
				element[i] = element[i + 1]; // folgenden Elemente
			element[lastIndex--] = null;
		}
	}

	public String toString() {
		String s = "(";
		for (int i = 0; i < lastIndex; i++)
			s = s + element[i] + ", ";
		if (lastIndex != -1)
			s = s + element[lastIndex];
		return s + ")";
	}

	public int find1(T gesucht) { // Sequentielle Suche
		for (int i = 0; i <= lastIndex; i++)
			if (element[i].equals(gesucht))
				return i; // Index des ersten Auftretens
		return -1; // 'gesucht' nicht enthalten
	}

	public int find2(T gesucht) { // Binäre Suche
		// Voraussetzung: Liste ist aufsteigend sortiert!
		int links = 0, rechts = lastIndex;
		while (links <= rechts) {
			
			int mitte = (links + rechts) / 2;
			int vgl = gesucht.compareTo(element[mitte]);
			if (vgl == 0)
				return mitte; // Index des ?. Auftretens
			else if (vgl < 0)
				rechts = mitte - 1; // weiter vorne suchen
			else
				links = mitte + 1; // weiter hinten suchen
		}
		return -1; // 'gesucht' nicht enthalten
	}

	public void sort1() {
		for (int i = 1; i <= lastIndex; i++) {
			T x = element[i];
			int j = i - 1;
			while (j >= 0 && x.compareTo(element[j]) < 0) {
				++n;
				element[j + 1] = element[j];
				j--;
			}
			element[j + 1] = x;
		}
	}

	public void sort2() {
		for (int i = 0; i <= lastIndex; i++) {
			int iMin = i;
			for (int j = i + 1; j <= lastIndex; j++) {
				++n;
				if (element[iMin].compareTo(element[j]) > 0)
					iMin = j; // kleinstes Element suchen
			}
			if (iMin != i) { // kleinstes El. mit i. vertauschen
				T x = element[iMin];
				element[iMin] = element[i];
				element[i] = x;
			}
		}
	}

	public void sort3() {
		for (int i = 0; i < lastIndex; i++) { // wiederhole
			for (int j = lastIndex; j > i; j--) { // gehe Liste durch
				++n;
				if (element[j].compareTo(element[j - 1]) < 0) {
					T x = element[j]; // vertausche
					element[j] = element[j - 1];
					element[j - 1] = x;
				}
			}
		}
	}

	public void sort4() {
		quickSort(0, lastIndex); // Aufruf von Quicksort
	}

	private void quickSort(int links, int rechts) {
		T x = element[(links + rechts) / 2];
		int i = links, j = rechts;
		do {
			while (element[i].compareTo(x) < 0)
				++n;
				i++; // suche Element >= x links
			while (element[j].compareTo(x) > 0)
				++n;
				j--; // suche Element <= x rechts
			if (i < j) { // vertausche Elemente i und j
				T help = element[i];
				element[i] = element[j];
				element[j] = help;
			}
			if (i <= j) {
				i++;
				j--;
			}
		} while (i <= j);
		if (links < j)
			quickSort(links, j); // rekursiver Aufruf
		if (i < rechts)
			quickSort(i, rechts); // rekursiver Aufruf
	}

	public ListeF<T> sort5() {
		return mergeSort(this); // Aufruf von Mergesort
	}

	public ListeF<T> mergeSort(ListeF<T> l) {
		if (l.lastIndex > 0) { // mehr als ein Element vorhanden
			int mitte = (l.lastIndex + 1) / 2;
			ListeF<T> links = new ListeF<T>(mitte);
			for (int i = 0; i < mitte; i++) {
				++n;
				links.insert(l.element[i]);
			}
			ListeF<T> rechts = new ListeF<T>(l.lastIndex + 1 - mitte);
			for (int i = mitte; i <= l.lastIndex; i++) {
				++n;
				rechts.insert(l.element[i]);
			}
			links = mergeSort(links);
			rechts = mergeSort(rechts);
			l = merge(links, rechts);
		}
		return l;
	}

	private ListeF<T> merge(ListeF<T> links, ListeF<T> rechts) {
		ListeF<T> erg = new ListeF<T>(links.lastIndex + rechts.lastIndex + 2);
		int indexLinks = 0;
		int indexRechts = 0;
		while (indexLinks <= links.lastIndex && indexRechts <= rechts.lastIndex) {
			if (links.element[indexLinks].compareTo(rechts.element[indexRechts]) < 0) {
				erg.insert(links.element[indexLinks]);
				indexLinks++;
			} else {
				erg.insert(rechts.element[indexRechts]);
				indexRechts++;
			}
		}
		while (indexLinks <= links.lastIndex) {
			erg.insert(links.element[indexLinks]);
			indexLinks++;
		}
		while (indexRechts <= rechts.lastIndex) {
			erg.insert(rechts.element[indexRechts]);
			indexRechts++;
		}
		return erg;
	}
}