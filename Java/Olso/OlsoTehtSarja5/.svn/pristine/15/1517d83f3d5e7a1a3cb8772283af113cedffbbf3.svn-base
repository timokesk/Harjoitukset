package saikeet;

/**
* @author Simo Silander
*/

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LuuppaavaSaieTest {

	LuuppaavaSaie saie;

	@Before
	public void setUp() throws Exception {
		saie = new LuuppaavaSaie(10);
	}

	@Test
	public void testRun() throws InterruptedException {
		saie.start();
		saie.join();
		assertEquals("Run ei toimi oikein", saie.pyydetytKierrokset, saie.kierretytKierrokset);
	}

	@Test
	public void testLuuppaavaSaie() {
		assertEquals("Alustus konstruktorissa ei toimi oikein", 10, saie.pyydetytKierrokset);
	}

	@Test
	public void testGetKierretytKierrokset() {
		assertEquals("getKierretytKierrokset ei toimi oikein", saie.kierretytKierrokset, saie.getKierretytKierrokset());
	}
}
