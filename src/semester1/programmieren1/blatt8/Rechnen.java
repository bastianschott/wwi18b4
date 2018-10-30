package semester1.programmieren1.blatt8;

public class Rechnen {
	public int ggt(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;
		
		int x = Math.abs(a);
		int y = Math.abs(b);
		while (x != y) {
			if (x > y) {
				x -= y;
			} else {
				y -= x;
			}
		}
		
		return x;
	}
	
}