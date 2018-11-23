package softwareEngineering1.se1_blatt04;

public class ArraySumme {

	public static int getArraySumme(int[] werte) {
		int summe = 0;
		for (int i = 0; i < werte.length; i++) {
			summe = summe + werte[i];
		}
		return summe;
	}
}
