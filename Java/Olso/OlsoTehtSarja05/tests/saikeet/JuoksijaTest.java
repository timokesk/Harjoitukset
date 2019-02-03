package saikeet;
/**
* @author Simo Silander
*/
import static org.junit.Assert.*;
import org.junit.Test;

public class JuoksijaTest {
	Juoksija juoksija;

	@Test
	public void testRun() {
		juoksija = new Juoksija();
		long kierrokset = juoksija.getKierrokset();
		assertEquals("Kierrosmäärä alustettu väärin", 0, kierrokset);

		juoksija.start();
		// Anna aikaa 10 kierroksen juoksemiseen, yksi kierros on 100 ms
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Tuli poikkeus System.sleep() rutiinissa");
		}
		juoksija.lopeta();

		long kierroksetNyt = juoksija.getKierrokset();
		assertTrue("Säikeen kierrokset eivät kasva", kierroksetNyt > kierrokset );
	}

	@Test
	public void testLopeta() {
		juoksija = new Juoksija();

		juoksija.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Tuli poikkeus System.sleep() rutiinissa");
		}
		juoksija.lopeta();

		assertTrue("lopeta()-metodi ei muuta lopetusehtoa", juoksija.jatkuu==false);
	}

	@Test
	public void testGetKierrokset() {
		juoksija = new Juoksija();
		assertEquals("getKierrokset() ei toimi oikein", juoksija.kierrokset, juoksija.getKierrokset());
	}
}
