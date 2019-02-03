package pokerikadet;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


/**
 *
 * @author Auvo Häkkinen, 2.2.2013
 */

public class KorttiTest {
	
	@BeforeClass
	public static void vihje() {
        System.out.println("--- KorttiTest: Konstuktorit, getterit ja setterit\n"
                + "eivät tarvitse yleensä erikseen omia testimetodeja.\n"
                + "Ne tulevat lähes aina testattua muiden metodien testien "
                + "yhteydessä.");
	}

    @Test
    public void testGetMaa() {
        System.out.print("--- KorttiTest: getMaa()");
        Kortti instance = new Kortti(Kortti.HERTTA, 12);
        int maa = instance.getMaa();
        assertEquals("getMaa() palautti väärän maan - ", Kortti.HERTTA, maa);
        System.out.println(" -- OK");
    }

    @Test
    public void testGetArvo() {
        Kortti instance = new Kortti(Kortti.HERTTA, 12);
        int arvo = instance.getArvo();
        assertEquals("getArvo() palautti väärän arvon - ",12, arvo);
        System.out.println("--- KorttiTest: getArvo() -- OK");
    }

    @Test
    public void testToString() {
        Kortti instance = new Kortti(Kortti.HERTTA, 12); // Herttanen rouva
        String result = instance.toString();
        assertEquals("toString() palautti väärän arvon - ", "Hertta 12", result);
        System.out.println("--- KorttiTest: toString() -- OK");
    }
}
