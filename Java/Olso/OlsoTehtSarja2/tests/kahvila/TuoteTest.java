package kahvila;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Auvo Häkkinen. Metropolia AMK. 10.2.2013.
 */
public class TuoteTest {

    private Tuote tuote = new Tuote("Ystävänpäivän munkki", 2.55);

    @After
    public void tearDown() {
        Tuote.alustaSeuraavaVapaaTuotenumero();
    }

    @Test
    public void testTuoteToString() {
        System.out.println("--- TuoteTest: toString()");
        String expResult = "1 Ystävänpäivän munkki, 2.55 euroa";
        String result = tuote.toString();
        System.out.println(result);
		/*
		if (!result.contains("Ystävänpäivän munkki"))
			fail("Tuotenimi väärin : pitäisi olla " + tuote.getNimi());
		if (!result.contains("1"))
			fail("Tuotenumero väärin : pitäisi olla " + tuote.getTuotenumero());
		if (!result.contains("2.55"))
			fail("Hinta väärin : pitäisi olla 2.55" + tuote.getHinta());
		*/
        assertEquals(expResult, result);
    }

    @Test
    public void testTuoteGetHinta() {
        System.out.println("--- TuoteTest: getHinta()");
        double expResult = 2.55;
        double result = tuote.getHinta();
        System.out.println("Hinta = " + result);
        assertEquals("Ystävänpäivän munkin hinta väärin", expResult, result, 0.0);
        // Kun tulos on liukuluku, on viimeisenä parametrina tarkkuus (delta),
        // joka ilmaisee minkä verran saatu tulos voi poiketa odotetusta.
    }
}
