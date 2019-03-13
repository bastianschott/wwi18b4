public class Lager {
	
	
	public int[] anzahl;
	public double[] preis;
	public static short s = (short)38000;
	public static void main(String[] args) {
		System.out.println(s);
		
//		for(;;) {
//			String s = "Wert =  " +1/4;
//			System.out.println(s);
//		}
		
	}
	
	public static double inventurWert(Lager lg) {
		double cache=0;
		for (int i = 0; i < lg.anzahl.length; i++) {
			cache += lg.anzahl[i] * lg.preis[i];
		}
		return cache;
	}
	
	public static void neuzugang(Lager lg, int[] neu) {
		for( int i : lg.anzahl) {
			lg.anzahl[i] += neu[i];
		}
	}
}
