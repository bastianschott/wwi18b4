package algDat.vorbereitung;

import Prog1Tools.IOTools;

public class DasMacht {
	static int s = 0;

	public static int dm(int x, int y) {
		System.out.println("dm(" + x + "," + y + ")");
		if ((y < x) && (x % y == 0)) {
			s = s + y;
			System.out.println(s);
			return y + dm(x / y, y);
		} else if ((y < x) && (y == 2))
			return dm(x, y + 1);
		else if ((y < x))
			return dm(x, y + 2);
		else {
			s = s + y;
			System.out.println(s);
			return y;
		}
	}

	public static void main(String[] args) {
		int a = 45, b = 2;
		System.out.println("das macht also " + dm(a, b));
	}
}