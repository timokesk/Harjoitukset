import saikeet.Juoksija;

/**
* @author Timo Keskiniemi 7.9.2018
*/

public class JuoksijaMain {
	public static void main(String[] args) {

	// Luo ja käynnistä Juoksija-säie
		Juoksija saie = new Juoksija();
		saie.start();
	
	// Odota jonkun aikaa: Thread.sleep()
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	// Pysäytä säie
		saie.lopeta();
	
	// Hae ja tulosta juostujen kerrosten määrä
		System.out.println("Juostut kierrokset: " + saie.getKierrokset());
	}
}
