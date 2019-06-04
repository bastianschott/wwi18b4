package algDat.vorbereitung;

public class Interval {
	private Value l, r; // linke und rechte Grenze des Intervalls

	public Interval(Value l, Value r) { // Konstruktor
		this.l = l;
		this.r = r;
	}

	public void shift(Value s) {
		l = l.plus(s);
		r = r.plus(s);
	}

	public Value comb(Interval y) {
		Value sum1 = l.plus(y.l);
		Value sum2 = r.plus(y.r);
		return sum1.times(sum2);
	}

	public Value comb2(Interval y) {
		return l.plus(y.l).times(r.plus(y.r));
	}

}