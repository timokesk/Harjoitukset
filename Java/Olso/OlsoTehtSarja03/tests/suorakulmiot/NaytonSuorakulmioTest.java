
package suorakulmiot;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hakka, 20.1.2013
 */
public class NaytonSuorakulmioTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("NaytonSuorakulmioTest: @BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("NaytonSuorakulmioTest: @AfterClass");
        System.out.println("==================================");
    }

    @Before
    public void setUp() {
        System.out.println("NaytonSuorakulmioTest: @Before");
    }

    @After
    public void tearDown() {
        System.out.println("NaytonSuorakulmiotest: @After");
        System.out.println("------------------------------");
    }
    /**
     * Test of mahtuu method, of class NäytönSuorakulmio.
     */
    @Test
    public void testMahtuu() {
        System.out.println("mahtuu");
        int leveys = 1024;
        int korkeus = 768;

        /* Rajakohtien testaaminen tärkeää, sillä of-by-one virheitä on helppo
         * tehdä: ts. kuuluuko vertailussa olla yhtäsuuruusmerkki vai ei?
         */

        // liian leveä, ei mahdu
        NaytonSuorakulmio instance = new NaytonSuorakulmio(225, 120, 800, 30);
        boolean expResult = false;
        boolean result = instance.mahtuu(leveys, korkeus);
        assertEquals(leveys + "x" + korkeus +": (" + instance +") ",expResult, result);

        // suurin leveys, joka vielä mahtuu
        instance = new NaytonSuorakulmio(224, 120, 800, 30);
        expResult = true;
        result = instance.mahtuu(leveys, korkeus);
        assertEquals(leveys + "x" + korkeus +": (" + instance +") ",expResult, result);

        // liian korkea, ei mahdu
        instance = new NaytonSuorakulmio(200, 100, 800, 669);
        expResult = false;
        result = instance.mahtuu(leveys, korkeus);
        assertEquals(leveys + "x" + korkeus +": (" + instance +") ", expResult, result);

        // suurin korkeus joka vielä mahtuu
        instance = new NaytonSuorakulmio(200, 100, 800, 668);
        expResult = true;
        result = instance.mahtuu(leveys, korkeus);
        assertEquals(leveys + "x" + korkeus +": (" + instance + ") ", expResult, result);
     }

    /**
     * Test of toString method, of class NäytönSuorakulmio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NaytonSuorakulmio instance = new NaytonSuorakulmio(225, 120, 800, 30);
        String expResult = "x=225, y=120, leveys=800, korkeus=30";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
