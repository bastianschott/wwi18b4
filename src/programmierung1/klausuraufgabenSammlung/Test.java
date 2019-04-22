package programmierung1.klausuraufgabenSammlung;

public class Test {
	public static void main(String[] args) {
		double[][] array = new double[3][3];
		//System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = (int) (Math.random()*99+1);
			}
		}
		System.out.println(maxFor(array));
		System.out.println(maxDo(array));
		
		double[] feld = {1,2,3,4,5,6,7,8};
		feld = delete(3,feld);
		for (int i = 0; i < feld.length; i++) {
			System.out.print(feld[i] + " ");
		}
	}

	public static double maxFor(double[][] matrix) {
		double max = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				max = max > matrix[i][j] ? max : matrix[i][j];
			}
		}
		return max;
	}

	public static double maxDo(double[][] matrix) {
		double max = 0;
		int i = 0, j = 0;
		do {

			do {
				max = max > matrix[i][j] ? max : matrix[i][j];
				j++;
			} while (j < matrix[0].length);

			j = 0;
			i++;
		} while (i < matrix.length);
		return max;
	}
	
	public static double[] delete(int k, double[] dFeld) {
		double[] neu = new double[dFeld.length - 1];
		k = k < 0 ? 0 : k;
		k = k > dFeld.length - 1 ? dFeld.length - 1 : k;
		for (int i = 0; i < k; i++) {
			neu[i] = dFeld[i];
		}
		for (int i = k; i < dFeld.length - 1; i++) {
			neu[i] = dFeld[i + 1];
		}
		return neu;
	}
}
