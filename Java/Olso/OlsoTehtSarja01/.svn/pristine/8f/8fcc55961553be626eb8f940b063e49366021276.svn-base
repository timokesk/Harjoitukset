package pokerikadet;
/**
*
* @author Timo Keskiniemi 23.8.2018
*/
public class Pakka {

    final static int KORTTILKM = 52;
	// Näiden näkyvyys: pakkauksen sisällä (ei private, ei public)
    // Viittaus muista luokista Luokka.tunnus, esim. Pakka.KORTTILKM

    // Esittele instanssimuuttujat
    private Kortti kortit[] = new Kortti[53];
    private int vuorossa = 1;

    // Kirjoita konstruktori, joka alustaa pakan Kortti-olioilla
    public Pakka() {
    	int k = 1;
    	for (int i = 0; i < 4 ; i++) {
    		for (int j = 1; j < 14; j++) {
    			kortit[k] = new Kortti(i,j);
    			k++;
    		}
    	}
    }

    // Kirjoita metodi sekoita()
    public void sekoita() {
    	int luku1, luku2;
    	for (int i = 0; i < 100; i++) {
    		luku1 = 1 + (int)(Math.random() * 52);
    		Kortti kortti1 = kortit[luku1];
    		luku2 = 1 + (int)(Math.random() * 52);
    		Kortti kortti2 = kortit[luku2];
    		kortit[luku1] = kortti2;
    		kortit[luku2] = kortti1;
    	}
    }

    // Kirjoita metodi annaKortti()
    public Kortti annaKortti() {
    	Kortti kortti = kortit[vuorossa];
    	vuorossa++;
    	if (vuorossa == 6) {
    		vuorossa = 1;
    	}
    	return kortti;
    }

}
