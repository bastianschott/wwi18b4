package softwareEngineering1.se1_blatt04;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromPrueferTest {

	@Test
	public void testIstPalindrom() {
		assertTrue("PalindromPruefer.istPalindrom(\"anna\")", PalindromPruefer.istPalindrom("anna"));
		assertTrue("PalindromPruefer.istPalindrom(\"qwertzuioppoiuztrewq\")",PalindromPruefer.istPalindrom("12421"));
		assertTrue("PalindromPruefer.istPalindrom(\"aaa\")", PalindromPruefer.istPalindrom("asa"));
		//assertTrue("PalindromPruefer.istPalindrom(\"Anna\")", PalindromPruefer.istPalindrom("Anna"));
		assertTrue("PalindromPruefer.istPalindrom(\"Anna\")", PalindromPruefer.istPalindrom(""));

		assertTrue("PalindromPruefer.istPalindrom(\"Anna\")", PalindromPruefer.istPalindrom("a"));
	}

}
