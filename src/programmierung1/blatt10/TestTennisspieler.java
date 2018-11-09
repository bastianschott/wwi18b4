package programmierung1.blatt10;

public class TestTennisspieler {

	public static void main(String[] args) {

		TennisSpieler maier = new TennisSpieler("H. Maier", 68);
		TennisSpieler schmid = new TennisSpieler("G. Schmid", 45, maier);
		TennisSpieler berger = new TennisSpieler("I. Berger", 36, schmid);

		System.out.println(maier.toString());
		System.out.println(schmid.toString());
		System.out.println(berger.toString());
		
	}
}
