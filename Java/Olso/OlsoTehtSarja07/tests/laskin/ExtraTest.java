package laskin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExtraTest extends AbstractParent {

    private static Laskin laskin = new Laskin();
    private final double DELTA = 0.001;

    @BeforeAll
    public static void testVirtaON() {
        System.out.println("@BeforeAll Virta ON (ennen ensimm�ist� testi�)");
        laskin.virtaON();
    }

    @AfterAll
    public static void testVirtaOFF() {
        System.out.println("@AfterAll Virta OFF (kaikki testit ajettu).");
        laskin.virtaOFF();
        laskin = null;
    }

    @BeforeEach
    public void testNollaa() {
        System.out.println("  Nollaa laskin.");
        laskin.nollaa();
        assertEquals(0, laskin.annaTulos(), DELTA, "Nollaus ei onnistunut");
    }

    @Test
    public void testNelio2() {
        laskin.nelio(2);
        assertEquals(4, laskin.annaTulos(), DELTA, "Luvun 2 Neli�n korotus v��rin");
    }

    @Test
    public void testNelio4() {
        laskin.nelio(4);
        assertEquals(16, laskin.annaTulos(), DELTA, "Luvun 4 neli�n korotus v��rin");
    }

    @Test
    public void testNelio5() {
        laskin.nelio(5);
        assertEquals(25, laskin.annaTulos(), DELTA,"Luvun 5 neli�n korotus v��rin");
    }
    @Test
    public void testNeliojuuri2() {
        laskin.neliojuuri(2);
		// Tähän assertXXX(), odotetun tuloksen tulee olla (int)Math.sqrt(2)
        assertEquals(Math.sqrt(2), laskin.annaTulos(), DELTA, "Luvun 2 neli�juuri v��rin");
    }
    
    @Test
    public void testNeliojuuri4() {
    	laskin.neliojuuri(4);
    	assertEquals(Math.sqrt(4), laskin.annaTulos(), DELTA, "Luvun 4 neli�juuri v��rin");
    }
    
    @Test
    @DisplayName("Testaa negatiivinen neli�juuri")
    public void testNeliojuuriNegat() {
        //fail("TESTI� EI OLE VIELÄ LAADITTU.");
    	String virhe = "";
    	try {
    		laskin.neliojuuri(-1);
    	}
    	catch (ArithmeticException ae) {
    		virhe = ae.getMessage();
    	}
    	assertEquals("Negatiivisesta luvusta ei voi ottaa neli�juurta", virhe ,"Negatiivisen luvun neli�juuri v��rin");
    }
    
    @Test
    public void jaaNollalla() {
    	String virhe = "";
    	try {
    		laskin.jaa(0);
    	}
    	catch (ArithmeticException ae) {
    		virhe = ae.getMessage();
    	}
    	assertEquals("Nollalla ei voi jakaa", virhe,"Nollalla jakaminen v��rin");
    }
}
