package kahvila;

/**
 *
 * @author Timo Keskiniemi 29.8.2018
 */
public class Tilausrivi {

    // Esittele instanssimuuttujat
	private Tuote tuote;
	private int määrä;
    
    // Ohjelmoi kolmen parametrin konstruktori
	public Tilausrivi(Valikoima valikoima, int tuotenumero, int määrä) {
		this.tuote = valikoima.getTuote(tuotenumero);
		this.määrä = määrä;
	}

    // Ohjelmoi tulosta()
	public void tulosta() {
		System.out.println(tuote.toString() + ", " + määrä + " kpl");
	}
         
    // Ohjelmoi annaSumma()
	public double annaSumma() {
		double hinta = tuote.getHinta() * määrä;
		return hinta;
	}
}
