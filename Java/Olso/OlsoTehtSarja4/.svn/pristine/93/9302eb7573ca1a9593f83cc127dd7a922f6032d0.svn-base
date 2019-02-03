import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class PerusTyypitettyIOTest {

    @Test
    public void testKirjoita(){
        String tiedosto = "Testi.bin";

        int luvut[] = { 1, 200, 3, 4, 5 };

        PerusTyypitettyIO.kirjoita(luvut, tiedosto);

        FileInputStream f = null;
        int lkm = 0;
        try {
            f = new FileInputStream(tiedosto);
            lkm = f.available();
        } catch (IOException e) {

            e.printStackTrace();
        }

        assertTrue("Tiedostoon ei mene oikea lukumäärä dataa", 20==lkm);
    }

    @Test
    public void testKerroKoko(){
        String tiedosto = "Testi.bin";

        int luvut[] = { 1, 200, 3, 4, 5 };

        PerusTyypitettyIO.kirjoita(luvut, tiedosto);

        assertTrue("Tiedoston koko ei täsmää", 20 == PerusTyypitettyIO.kerroKoko(tiedosto) );
    }

    @Test
    public void testAnnaTavuina(){
        String tiedosto = "Testi.bin";

        int luvut[] = { 1, 2 };
        byte tavut[] = {0,0,0,1,0,0,0,2};
        byte luetutTavut[] = new byte[8];

        PerusTyypitettyIO.kirjoita(luvut, tiedosto);

        //System.out.println ("Tiedoston sisältö tavuittain:");
        luetutTavut = PerusTyypitettyIO.annaTavuina(tiedosto);

        assertArrayEquals("Tavuina lukemisessa vikaa", tavut, luetutTavut );
    }

    @Test
    public void testAnnaKokonaislukuina(){
        String tiedosto = "Testi.bin";

        int luvut[] = { 1, 200, 3, 4, 5 };
        int luetutLuvut[] = new int[5];

        PerusTyypitettyIO.kirjoita(luvut, tiedosto);

        //System.out.println ("\nTiedoston sisältö kokonaislukuina:");
        luetutLuvut = PerusTyypitettyIO.annaKokonaislukuina(tiedosto);

        assertArrayEquals("Kokonaislukuina lukemisessa vikaa", luvut, luetutLuvut);
    }
}
