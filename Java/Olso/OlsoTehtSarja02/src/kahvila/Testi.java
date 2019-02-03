package kahvila;

import java.util.ArrayList;

/**
 *
 * @author Timo Keskiniemi
 */
public class Testi {

    public static void main(String[] args) {

    // Esittele tarvittavat muuttujat.
    	Valikoima valikoima = new Valikoima();
    	Kahvila kahvila = new Kahvila(valikoima);

    // Luo kolme tuotetta.
    	Tuote kahvi = new Tuote("Kahvi", 1.00);
    	Tuote pulla = new Tuote("Pulla", 1.50);
    	Tuote viineri = new Tuote("Viineri", 2.00);

    // Lisää ne valikoimaan.
    	valikoima.lisääTuoteValikoimaan(kahvi);
    	valikoima.lisääTuoteValikoimaan(pulla);
    	valikoima.lisääTuoteValikoimaan(viineri);

    // Tulosta valikoima.
    	valikoima.tulostaTuotteet();

    // Poista siitä yksi tuote.
    	valikoima.poistaTuoteValikoimasta(2);

    // Tulosta muuttunut valikoima.
    	valikoima.tulostaTuotteet();

    // Luo tilaus.
    	Tilaus tilaus = new Tilaus();

    // Luo kaksi tilausriviä.
    	Tilausrivi tilausrivi1 = new Tilausrivi(valikoima, 1, 2);
    	Tilausrivi tilausrivi2 = new Tilausrivi(valikoima, 3, 1);

    // Lisää tilausrivit tilaukseen.
    	tilaus.lisääRiviTilaukseen(tilausrivi1);
    	tilaus.lisääRiviTilaukseen(tilausrivi2);

    // Lisää tilaus kahvilan tilauslistaan.
    	kahvila.lisääTilaus(tilaus);

    // Luo toinenkin tilaus tilausriveineen.
    	Tilaus tilaus2 = new Tilaus();
    	Tilausrivi tilausrivi3 = new Tilausrivi(valikoima, 1, 1);
    	Tilausrivi tilausrivi4 = new Tilausrivi(valikoima, 3, 3);
    	tilaus2.lisääRiviTilaukseen(tilausrivi3);
    	tilaus2.lisääRiviTilaukseen(tilausrivi4);
    	kahvila.lisääTilaus(tilaus2);

    // Tulosta kaikki kahvilan tilaukset.
    	kahvila.tulostaTilaukset();

    }
}
