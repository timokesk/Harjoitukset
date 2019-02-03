package kahvila;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Auvo Häkkinen. Metropolia AMK. 10.2.2013.
 */
public class ValikoimaTest {

    private Tuote[] tuotteita = {
        new Tuote("Ystävänpäivän munkki", 1.0), // tuotenumero = 1
        new Tuote("Runebergin torttu", 2.55), // tuotenumero = 2
        new Tuote("Dallaspulla", 2.25) // tuotenumero = 3
    };
    private Valikoima valikoima;

    // Kåyttää samoja tuotteita kaikissa testeissä.
    @Before
    public void setUp() {
        valikoima = new Valikoima();
        for (Tuote tuote : tuotteita) {
            valikoima.lisääTuoteValikoimaan(tuote);
        }
    }

    // Kun yksi testimetodi suoritettu, aloita tuotenumerointi taas 1:stä.
    @After
    public void tearDown() {
        Tuote.alustaSeuraavaVapaaTuotenumero();
    }

    @Test
    public void testValikoima_LisääTuoteValikoimaan() {
        System.out.println("--- ValikoimaTest: LisÃ¤ys - tulostus - haku");

        System.out.println("Lisätty tuotteet:");
        valikoima.tulostaTuotteet();

        Tuote tuote = valikoima.getTuote(1);
        System.out.println("Haettu tuote: " + tuote);
        // Tässä verrataan kokonaisia olioita.
        assertEquals("Haku tuotenumerolla ei täsmää.", tuotteita[0], tuote);
    }

    @Test
    public void testValikoima_PoistaTuoteValikoimasta() {
        System.out.println("--- ValikoimaTest: Poisto - tulostus - haku");

        int tuotenumero = 2;
        valikoima.poistaTuoteValikoimasta(tuotenumero);

        System.out.println("Poistettu tuote: " + tuotenumero);
        System.out.println("Valikoimassa on tuotteet: ");
        valikoima.tulostaTuotteet();

        // Kun tuote poistettu haku palauttaa null.
        Tuote result = valikoima.getTuote(tuotenumero);
        assertEquals("Tuote ei ole poistunut.", null, result);
    }
}
