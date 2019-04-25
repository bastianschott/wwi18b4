package programmierung1.klausuraufgabenSammlung;

public class ArrayUmkehren {
	public static void main(String[] args) {
		int[] array = { 4, 9, 4, 2, 4, 6, 7 };
		array = umkehren(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static int[] umkehren(int[] array) {
		int[] neu = new int[array.length];
		for (int i = 0; i < neu.length; i++) {
			neu[i] = array[neu.length - 1 - i];
		}
		return neu;
	}
}
