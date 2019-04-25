package algDat.blatt06.aufgabe20;

public class Wert {
	Wert next;
	private int value;

	public Wert(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value + "";
	}
}
