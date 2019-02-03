package saikeet;

/**
* @author Simo Silander
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class KilpajuoksijaTest {

	@Test
	public void testRealistisuus() {
		Kilpajuoksija k = new Kilpajuoksija();
		k.start();
		try {
			k.join();
		} catch (InterruptedException e) {
			System.out.println("Tuli poikkeus join()-rutiinissa");
		}
		double aika = k.getAika();
		assertTrue("Epärealistinen loppuaika", aika>=43 && aika <=55);
	}

}
