package algDat.blatt06;

import java.util.Iterator;
import java.util.TreeSet;

public class Primzahlen {
	static TreeSet<Integer> set = new TreeSet<>();

	static TreeSet<Integer> berechnePrimzahlen(int n) {
		TreeSet<Integer> t = new TreeSet<>();
		for (int i = 2; i <= n; i++)
			t.add(i);
		TreeSet<Integer> s = new TreeSet<>();
		int p = 2;
		while (p * p <= n) {
			int i = 2;
			while (i * p <= n) {
				s.add(i * p);
				i++;
			}
			if (p == 2)
				p = 3;
			else
				p += 2;
		}

		t.removeAll(s);
		return t;
	}

	public static void main(String[] args) {
		set = berechnePrimzahlen(1000);
		int o = 0;
		Iterator<Integer> it = set.iterator();

		for (int i = 1; it.hasNext(); i++) {
			System.out.print(it.next()+", ");
			if (i % 10 == 0)
				System.out.print("\n");

		}
	}
}
