package valtiot;

/**
* @author laita tähän nimesi ja päiväys
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class TiedostonKasittely {

    /* Kirjoittaa parametrina annettuun tiedostoon
	 * paremetrina annetun listan (olio), jossa Valtio-olioita
	 */
	static void kirjoitaTiedosto(String tiedostoNimi, List<Valtio> lista){

		FileOutputStream tiedosto = null;
		ObjectOutputStream os = null;
		
		try {
		// Avaa FileOutputStream-virta tiedostoon
			tiedosto = new FileOutputStream(tiedostoNimi);

		// Luo objektivirta tiedostoon kirjoittamista varten
			os = new ObjectOutputStream(tiedosto);

		// Kirjoita objektivirtaan lista
			os.writeObject(lista);

		// Sulje tietovirrat
			os.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	    System.out.println("Tiedot tallennettu tiedostoon " + tiedostoNimi);
	}

	/* Lukee parametrina annetusta tiedostosta listan, jossa Valtio-olioita
     * Palauttaa listan tai null, jos listaa ei pystytä muodostamaan
	 */
	@SuppressWarnings("unchecked")
	static List<Valtio> lueTiedosto(String tiedostoNimi){

		List<Valtio> lista = null;
		FileInputStream tiedosto = null;
		ObjectInputStream is = null;
		
		try {
		// Avaa FileInputStream-virta tiedostoon
			tiedosto = new FileInputStream(tiedostoNimi);

		// Luo objektivirta tiedostosta lukemista varten
			is = new ObjectInputStream(tiedosto);

		// Lue objektivirran sisältö listaan
			lista = (List<Valtio>)is.readObject();

		// Sulje tietovirrat
			is.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Tiedot haettu tiedostosta " + tiedostoNimi);
		return lista;
	}

}
