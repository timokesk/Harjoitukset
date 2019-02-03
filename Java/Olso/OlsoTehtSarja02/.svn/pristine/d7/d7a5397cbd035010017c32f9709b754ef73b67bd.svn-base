package kahvila;

/**
 *
 * @author Timo Keskiniemi 27.8.2018
 */
public class Tuote {

    // Esittele instanssimuuttujat
	private int tuotenumero;
	private String nimi;
	private double hinta;

    // Esittele staattinen muuttuja seuraavan vapaan tuotenumeron ylläpitämiseksi
	private static int seuraavaVapaaTuotenumero = 1;

    // Ohjelmoi staattinen metodi alustaSeuraavaVapaaTuotenumero()
	public static void alustaSeuraavaVapaaTuotenumero() {
		seuraavaVapaaTuotenumero = 1;
	}

    // Ohjelmoi kahden parametrin konstruktori
	public Tuote(String nimi, double hinta) {
		this.nimi = nimi;
		this.hinta = hinta;
		this.tuotenumero = seuraavaVapaaTuotenumero;
		seuraavaVapaaTuotenumero++;
	}

    // Ohjelmoi getHinta()
	public double getHinta() {
		return hinta;
	}

    // Ohjelmoi getTuotenumero()
	public int getTuotenumero() {
		return tuotenumero;
	}

    // Ohjelmoi tosString()
	@Override
	public String toString() {
		String merkkijono = tuotenumero + " " + nimi + ", " + hinta + " euroa";
		return merkkijono;
	}
}
