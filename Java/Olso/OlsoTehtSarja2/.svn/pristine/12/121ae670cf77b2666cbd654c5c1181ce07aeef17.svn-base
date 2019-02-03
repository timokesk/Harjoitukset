package kahvila;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Auvo Häkkinen. Metropolia AMK. 10.2.2013.
 */
public class TilausriviTest {

    @After
    public void tearDown() {
        Tuote.alustaSeuraavaVapaaTuotenumero();
    }

    @Test
    public void testTilausrivi_AnnaSumma() {
        System.out.println("--- TilausriviTest: annaSumma() + tulosta()");
        Valikoima valikoima = new Valikoima();
        Tuote[] tuotteita = {
            new Tuote("Ystävänpäivän munkki", 1.0), // tuotenumero = 1
            new Tuote("Runebergin torttu", 2.55), // tuotenumero = 2
            new Tuote("Dallaspulla", 2.25) // tuotenumero = 3
        };

        for (Tuote tuote : tuotteita) {
            valikoima.lisääTuoteValikoimaan(tuote);
        }
        valikoima.tulostaTuotteet();

        // Tilaa 3 kpl tuotetta 1.
        Tilausrivi rivi = new Tilausrivi(valikoima, 1, 3);
        System.out.println("Tilausrivi: ");
        rivi.tulosta();
        double expResult = 3.0;
        double result = rivi.annaSumma();
        System.out.println("Loppusumma = " + result + " €");
        assertEquals("Loppusumma väärin", expResult, result, 0.0);
    }
}
