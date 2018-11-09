package programmierung1.blatt10;

public class JugendSpieler extends TennisSpieler {
	private int groesse;
	
	public JugendSpieler(String name, int alter, int groesse) {
		super(name, alter);
		this.groesse = groesse;
	}
}
