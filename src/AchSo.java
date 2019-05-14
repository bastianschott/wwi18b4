import java.util.Arrays;

public class AchSo {

	public static void main(String[] args) {
		double[][] matrix = new double[3][24];
		for (int i = 0; i < matrix.length; i++) {
			for (int o = 0; o < matrix[i].length; o++) {
				matrix[i][o] = Math.random() * 90 + 10;
				matrix[i][o] = (int) matrix[i][o];
				System.out.print(matrix[i][o] + "  ");
			}
			System.out.println();
		}
		System.out.println(maxFor(matrix));
		System.out.println(maxFor2(matrix));

	}

	public static double maxFor(double[][] matrix) {
		double max = 0;
//		for (int i = 0; i < matrix.length; i++) {
//			for (int o = 0; o < matrix[i].length; o++) {
//				max = matrix[i][o] > max ? matrix[i][o] : max;
//			}
//		}

		for (double[] ds : matrix) {
			for (double ds2 : ds) {
				max = ds2 > max ? ds2 : max;
			}
		}
		return max;
	}

	public static double maxFor2(double[][] matrix) {
		double max = 0;
		int i = 0, o = 0;
		do {
			o = 0;
			do {
				max = matrix[i][o] > max ? matrix[i][o] : max;
				o++;
			} while (o < matrix[i].length);
			i++;
		} while (i < matrix.length);
		return max;
	}
}
