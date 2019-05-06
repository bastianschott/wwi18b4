package funktProgrammierung.test;

interface Funktion1p {
	double rechne(double x);
}

public class WerteTabellen {

	public static void tabelliere(String tit, Funktion1p f) {
		System.out.println("Wertetabelle fuer " + tit);
		System.out.println(" x f(x)");
		for (double x = 1.0; x <= 5.0; x++) {
			System.out.printf("% 10.5e % 10.5e\n", x, f.rechne(x));
		}
	}
	
	static int add(int ... i ) {
		int it = 0;
		for(int is : i) {
			it+=is;
		}
		return it;
	}

	public static void main(String[] args) {
		tabelliere("Quadrat", x -> x * x);
		tabelliere("Sinus", x -> Math.sin(x));
		tabelliere("Tangens", x -> Math.tan(x));
		WerteTabellen.add(1);
	}
}