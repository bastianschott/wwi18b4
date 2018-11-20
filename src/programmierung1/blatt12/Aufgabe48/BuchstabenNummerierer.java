package programmierung1.blatt12.Aufgabe48;

public class BuchstabenNummerierer extends Nummerierer {
	private static char i = 'A';

	@Override
	public void reset() {
		i = 'A';
	}

	@Override
	public String next() {
		return "" + i++;
	}

	@Override
	public boolean available() {
		return i <= 'Z';
	}
}