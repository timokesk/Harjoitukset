package kahvila;

import java.util.ArrayList;

/**
 *
 * @author Timo Keskiniemi
 */
public class Kahvila {

    // Esittele instanssimuuttuja valikoiman ja tilausten tallettamiseksi (ArrayList)
	Valikoima valikoima;
	ArrayList<Tilaus> tilaukset = new ArrayList(); 

    // Ohjelmoi yhden parametrin konstruktori
	public Kahvila(Valikoima valikoima) {
		this.valikoima = valikoima;
	}

    // Ohjelmoi lisääTilaus()
	public void lisääTilaus(Tilaus tilaus) {
		tilaukset.add(tilaus);
	}

    // Ohjelmoi tulostaTilaukset()
	public void tulostaTilaukset() {
		for (Tilaus tilaus : tilaukset) {
			tilaus.tulostaRivit();
		}
	}

}
