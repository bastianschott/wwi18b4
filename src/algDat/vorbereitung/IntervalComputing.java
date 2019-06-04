package algDat.vorbereitung;

public class IntervalComputing {
	public static void main(String[] args) {
		ShortValue a = new ShortValue((short) 3);
		ShortValue b = new ShortValue((short) 4);
		ShortValue d = new ShortValue((short) 5);
		Interval m = new Interval(a, b);
		Interval n = new Interval(b, d);
		Value v;

		//v = m.comb(n);
		//System.out.println((ShortValue) v);
		v = m.comb2(n);
		System.out.println((ShortValue) v);

	}
}