import java.text.DecimalFormat;

public class MyFormats {
	public static final DecimalFormat kurz = new DecimalFormat("0.0"), lang = new DecimalFormat("00000.00000000000"),
			euro = new DecimalFormat("EUR #0.00"), wiss = new DecimalFormat("#.#E000"),
			naja = new DecimalFormat("#,###,##0.00"), proz = new DecimalFormat("Anteilig: 0.0%");

	public static void main(String[] args) {
		double x = 987.654321, y = 0.12345678;
		System.out.println(kurz.format(x));
		System.out.println(lang.format(x));
		System.out.println(euro.format(x));
		System.out.println(wiss.format(x));
		System.out.println(naja.format(x));
		System.out.println(proz.format(x));
		System.out.println(kurz.format(y));
		System.out.println(lang.format(y));
		System.out.println(euro.format(y));
		System.out.println(wiss.format(y));
		System.out.println(naja.format(y));
		System.out.println(proz.format(y));
	}
}