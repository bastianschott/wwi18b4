package softwareEngineering1.se1_blatt04;

import static org.junit.Assert.*;

import org.junit.Test;

public class RechteckTest {

	// Arrange
	Rechteck r1 = new Rechteck(6, 3);
	Rechteck r2 = new Rechteck(5, 5);

	@Test
	public void testFlaeche() {
		// Act
		int erg = r1.getA() * r1.getB();

		// Assert
		assertEquals("Rechteck.flaeche()", erg, r1.flaeche());

		// Act
		erg = r2.getA() * r2.getB();

		// Assert
		assertEquals("Rechteck.flaeche()", erg, r2.flaeche());
	}

	@Test
	public void testIstQuadratisch() {
		assertFalse("Rechteck.istQuadreatisch()", r1.istQuadratisch());
		assertTrue("Rechteck.istQuadreatisch()", r2.istQuadratisch());
	}
}