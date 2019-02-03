import java.util.Scanner;

/**
* @author Timo Keskiniemi 31.8.2018
*/

public class Poikkeus {

	public static void main(String[] args) {

	    System.out.println("Tehtävä 1: Poikkeuksen testaaminen");
	    	
		// Esittele tarvittavat muuttujat
	    
	    Scanner lukija = new Scanner(System.in);
	    
	    String merkkijono;
	    int luku;
	    
	 // Kysy ikä ja lue se merkkijonomuuttujaan
	    do {
	    	System.out.println("Anna ikäsi.");
	    	merkkijono = lukija.next();

	    	// Ohjelmoi try-catch-lohko
	    	try {
	    		// Tee muunnos  
	    		luku = Integer.parseInt(merkkijono);
	    	
	    		// - jos muunnos onnistuu, näytä tulos ja lopeta
	    		System.out.println("Vuoden päästä olet jo " + (luku + 1) + "-vuotias.");
	    		break;
	    	}
	    	catch (NumberFormatException nfe){
	    		// - jos syntyy poikkeus, anna virheilmoitus
	    		System.out.println("Antamasi ikä " + merkkijono + " ei ole kelvollinen.");
	    	}
	    } while (true);
		
		// Poikkeustilanteessa ikää on kysyttävä vielä uudelleen, 
		// joten tarvitset kaiken ympärille vielä toistorakenteen
	    
	}
}
