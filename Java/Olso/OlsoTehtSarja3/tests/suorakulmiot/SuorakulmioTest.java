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

/* Kun luokka on olemassa, voit luoda sille JUnit-testiluokan Eclipsessä klikaamalla
 *  testattavan Java-tiedoston nimeä hiiren oikealla  ja valitsemlla New | JUnit Test Case
 */
public class SuorakulmioTest {

    /* @BeforeClass -annotaatiolla merkitty metodi suoritetaan kerran alussa,
     * ennen kuin JUnit suorittaa yhtäkään varsinaisia testejä sisältävää metodia.
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("SuorakulmioTest: @BeforeClass");
    }

    /* @AfterClass -annotaatiolla merkitty metodi suoritetaan kerran lopussa,
     * kun JUnit on suorittanut kaikki testejä sisältävät metodit.
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("SuorakulmioTest: @AfterClass");
        System.out.println("============================");
    }

    /* @Before -annotaatiolla merkitty metodi suoritetaan aluksi, ennen kuin
     * JUnit suorittaa yksittäisen testimetodin.
     */
    @Before
    public void setUp() {
        System.out.println("SuorakulmioTest: @Before");
    }

    /* @After -annotaatiolla merkitty metodi suoritetaan lopuksi, kun JUnit on
     * suorittanut yksittäisen testimetodin.
     */
    @After
    public void tearDown() {
        System.out.println("Suorakulmiotest: @After");
        System.out.println("------------------------");
    }

    /**
     * Test of setKorkeus method, of class Suorakulmio.
     * Test of getKorkeus method, of class Suorakulmio.
     */
    @Test
    public void testKorkeus() {
        System.out.println("setKorkeus / getKorkeus");
        int korkeus = 100;
        Suorakulmio instance = new Suorakulmio();
        instance.setKorkeus(korkeus);
        int result = instance.getKorkeus();
        assertEquals("setKorkeus/getKorkeus, ", korkeus, result);
    }

    /**
     * Test of setLeveys method, of class Suorakulmio.
     * Test of getLeveys method of class Suorakulmio.
     */
    @Test
    public void testLeveys() {
        System.out.println("setLeveys/getLeveys");
        int leveys = 0;
        Suorakulmio instance = new Suorakulmio();
        instance.setLeveys(leveys);
        int result = instance.getLeveys();
        assertEquals("setLeveys/getLeveys, ", leveys, result);
    }

    /**
     * Test of ala method, of class Suorakulmio.
     */
    @Test
    public void testAla() {
        System.out.println("ala");
        Suorakulmio instance = new Suorakulmio(10, 5);
        int expResult = 50;
        int result = instance.ala();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Suorakulmio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Suorakulmio instance = new Suorakulmio(99, 10);
        String expResult = "leveys=99, korkeus=10";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
