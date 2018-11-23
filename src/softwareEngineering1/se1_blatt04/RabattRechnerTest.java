package softwareEngineering1.se1_blatt04;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RabattRechnerTest {

	RabattRechner rr;

	@Before
	public void setUp() throws Exception {
		rr = new RabattRechner(10, 10, 50, 20);
	}

	@Test
	public void testGetRabatt() {
		assertEquals("RabattRechner.getRabatt(1)", 0, rr.getRabatt(1));
		assertEquals("RabattRechner.getRabatt(9)", 0, rr.getRabatt(9));
		assertEquals("RabattRechner.getRabatt(10)", 0, rr.getRabatt(10));
		assertEquals("RabattRechner.getRabatt(11)", 10, rr.getRabatt(11));
		assertEquals("RabattRechner.getRabatt(50)", 10, rr.getRabatt(50));
		assertEquals("RabattRechner.getRabatt(51)", 20, rr.getRabatt(51));
		assertEquals("RabattRechner.getRabatt(300)", 20, rr.getRabatt(300));
	}

}
