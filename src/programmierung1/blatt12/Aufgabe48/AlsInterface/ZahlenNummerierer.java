package programmierung1.blatt12.Aufgabe48.AlsInterface;

public class ZahlenNummerierer implements Nummerierer {
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