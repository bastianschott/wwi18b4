package programmierung1.blatt12.Aufgabe48;

public class ZahlenNummerierer extends Nummerierer {
	private static int i = 1;
	
	@Override
	public void reset() {
		i = 1;
	}
	
	@Override
	public String next() {
		return "" + i++;
	}
	
	@Override
	public boolean available() {
		return i <= 20;
	}
	
}