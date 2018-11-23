package softwareEngineering1.se1_blatt04;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraySummeTest {
	
	@Test
	public void testGetArraySumme() {
		//arrange
		int anzahl = (int)(Math.random()*99)+1;
		int[] array = new int[anzahl];
		int erg = 0;
		for(int i=0; i < array.length; i++) {
			int k = (int)(Math.random()*99)+1;
			array[i] = k;
			erg += k;
		}
		assertEquals("ArraySumme.getArraySumme()", erg, ArraySumme.getArraySumme(array));
		
		
		//ass
	}

}
