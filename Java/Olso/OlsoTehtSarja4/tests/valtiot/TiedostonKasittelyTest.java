package valtiot;

/**
* @author hakka
*/

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TiedostonKasittelyTest {

	private static List<Valtio> valtioLista = new ArrayList<>();

	// Suoritetaan ennen kaikkia testejä
	@BeforeClass
	public static void luoLista() {
		valtioLista.add(new Valtio("Suomi", "Helsinki", 634940));
		valtioLista.add(new Valtio("Viro", "Tallinna", 440112));
	}

	// Suoritetaan kaikkien testien jälkeen
	@AfterClass
	public static void poistaTiedosto() {
		File f = new File("testi.dat");
		f.delete();
	}

	@Test
	public void testKirjoitaTiedosto() {
		TiedostonKasittely.kirjoitaTiedosto("testi.dat", valtioLista);
		File f = new File("testi.dat");
		assertTrue("Tiedostoa ei löydy", f.exists());
	}

	@Test
	public void testLueTiedosto() {
		TiedostonKasittely.kirjoitaTiedosto("testi.dat", valtioLista);
		List<Valtio> luetut = TiedostonKasittely.lueTiedosto("testi.dat");
		assertEquals("Luettu tiedosto ei vastaa kirjoitettua", valtioLista.toString(), luetut.toString());
	}

}
