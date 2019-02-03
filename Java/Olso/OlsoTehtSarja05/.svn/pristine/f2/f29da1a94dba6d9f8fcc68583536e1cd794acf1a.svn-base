
import saikeet.Kilpajuoksija;

/**
* @author Timo Keskiniemi
*/

public class KilpailuMain {

	public static void main(String[] args) {
		// Luo taulukko
		Kilpajuoksija[] kj = new Kilpajuoksija[8];

		// Luo juoksijasäikeet
		for (int i = 0; i < 8; i++) {
			kj[i] = new Kilpajuoksija();
		}
	
		// Pistä poppoo juoksemaan
		for (int i = 0; i < 8; i++) {
			kj[i].start();
		}

		// Odota, että kaikki juoksijasäikeet lopettavat
		for (int i = 0; i < 8; i++) {
			try {
				kj[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Kilpailu on ohi, onnea voittajalle.");
	}
}
