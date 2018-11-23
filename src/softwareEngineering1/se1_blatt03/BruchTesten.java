package softwareEngineering1.se1_blatt03;

import static org.junit.Assert.*;
import org.junit.Test;

public class BruchTesten {

	@Test
	public void testMul() {
		Bruch[] a = new Bruch[3];
		a[0] = new Bruch(1,1);
		a[1] = new Bruch(1,1);
		a[2] = new Bruch(1,1);
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				for (int k = 0; k < 20; k++) {
					for (int l = 0; l < 20; l++) {
						a[0].setZaehler(i);
						a[0].setNenner(j);
						a[1].setZaehler(k);
						a[1].setNenner(l);
						
						int ergZaehler = a[1].getZaehler() * a[0].getZaehler();
						int ergNenner = a[1].getNenner() * a[0].getNenner();
						assertEquals("a[0].mul(a[1]).getZaehler()", a[0].mul(a[1]).getZaehler(), ergZaehler);
						assertEquals("a[0].mul(a[1]).getNenner()", a[0].mul(a[1]).getNenner(), ergNenner);
					}
				}
			}
		}
		
		//fail("Not yet implemented");
	}

}
