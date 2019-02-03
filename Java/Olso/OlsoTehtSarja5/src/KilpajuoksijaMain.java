import saikeet.Kilpajuoksija;

/**
 * 
 * @author Timo Keskiniemi 7.9.2018
 *
 */
public class KilpajuoksijaMain {

	public static void main(String[] args) {
		Kilpajuoksija saie = new Kilpajuoksija();
		
		saie.start();
		
		try {
			saie.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
