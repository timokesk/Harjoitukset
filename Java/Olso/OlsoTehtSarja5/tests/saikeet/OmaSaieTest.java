package saikeet;

/**
* @author Simo Silander
*/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OmaSaieTest {

	private OmaSaie saie;

	@Before
	public void setUp() throws Exception {
		saie = new OmaSaie(5);
	}

	@After
	public void tearDown() throws Exception {
		saie = null;
	}

	@Test
	public void testRun() {

		int luku = 5; 		// Testissä asetettu luku
		int ajokerrat = 0; 	// Metodia run() ei oel kutsuttu (ei suorittavaa säiettä)

		saie.run();			// sekä luku että ajokerrat kasvavat nyt yhdellä
		assertEquals("Säikeen run ei toimi oikein (luku)", luku+1, saie.luku);
		assertEquals("Säikeen run ei toimi oikein (staticLuku)", ajokerrat+1, OmaSaie.yhteisetAjokerrat);

		OmaSaie saie2 = new OmaSaie(); // luku alustuu 0:ksi
		saie2.run(); 		// sekä luku että ajokerrat kasvavat jälleen  yhdellä
		assertEquals("Säikeen run ei toimi oikein (luku)", 1, saie2.luku);
		assertEquals("Säikeen run ei toimi oikein (staticLuku)", ajokerrat+2, OmaSaie.yhteisetAjokerrat);
	}

	@Test
	public void testOmaSaie() {
		assertEquals("Alustus konstruktorissa ei toimi oikein", 5, saie.luku);
	}

	@Test
	public void testGetLuku() {
		assertEquals("getLuku() ei toimi oikein", saie.luku, saie.getLuku());
		//fail("Not yet implemented");
	}

	@Test
	public void testSetLuku() {
		saie.setLuku(10);
		assertEquals("setLuku() ei toimi oikein", 10, saie.luku);
	}

	@Test
	public void testGetYhteisetAjokerrat() {
		assertEquals("getYhteisetAjokerrat() ei toimi oikein", OmaSaie.yhteisetAjokerrat, OmaSaie.getYhteisetAjokerrat());
	}

	@Test
	public void testSetYhteisetAjokerrat() {
		OmaSaie.setYhteisetAjokerrat(10);
		assertEquals("setYhteisetAjokerrat() ei toimi oikein", 10, OmaSaie.yhteisetAjokerrat);
	}
}
