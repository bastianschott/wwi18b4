import otherProjects.calcPi.TimeMonitor;

public class SortBenchmark {
	public static void main(String[] args) {
		int anzahlElemente = 50000;
		boolean showSteps = false;
		ListeF<Integer> l1 = new ListeF<>(anzahlElemente);
		ListeF<Integer> l2 = new ListeF<>(anzahlElemente);
		ListeF<Integer> l3 = new ListeF<>(anzahlElemente);
		ListeF<Integer> l4 = new ListeF<>(anzahlElemente);
		ListeF<Integer> l5 = new ListeF<>(anzahlElemente);

		for (int i = 0; i < anzahlElemente; i++) {
			int value = (int) (Math.random() * 1000000);
			l1.insert(value);
			l2.insert(value);
			l3.insert(value);
			l4.insert(value);
			l5.insert(value);
		}

		TimeMonitor tm = new TimeMonitor();
		tm.start();
		l1.sort1();
		tm.stop();
		System.out.print("Insertionsort: \t" + tm.getDifference() + " ms");
		System.out.println(showSteps ? "; Steps: \t" + l1.n : "");
		tm.reset();

		tm.start();
		l2.sort2();
		tm.stop();
		System.out.print("Selectionsort: \t" + tm.getDifference() + " ms");
		System.out.println(showSteps ? "; Steps: \t" + l2.n : "");
		tm.reset();

		tm.start();
		l3.sort2();
		tm.stop();
		System.out.print("Bubblesort: \t" + tm.getDifference() + " ms");
		System.out.println(showSteps ? "; Steps: \t" + l3.n : "");
		tm.reset();

		tm.start();
		l4.sort2();
		tm.stop();
		System.out.print("Quicksort: \t" + tm.getDifference() + " ms");
		System.out.println(showSteps ? "; Steps: \t" + l4.n : "");
		tm.reset();

		tm.start();
		l5.sort2();
		tm.stop();
		System.out.print("Mergesort: \t" + tm.getDifference() + " ms");
		System.out.println(showSteps ? "; Steps: \t" + l5.n : "");
		tm.reset();

	}

}