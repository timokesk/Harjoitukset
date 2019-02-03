import saikeet.LuuppaavaSaie;

/**
* @author Timo Keskiniemi 7.9.2018
*/

public class LuuppaavaSaieMain {
	public static void main(String[] args) {

    // Luo säie
		LuuppaavaSaie saie = new LuuppaavaSaie(10);
	
	// Käynnistä säie
		saie.start();
	
	// Odota säikeen päättymistä
		try {
			saie.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
}
