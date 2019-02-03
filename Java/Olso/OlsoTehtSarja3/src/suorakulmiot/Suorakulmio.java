
package suorakulmiot;
/**
 *
 * @author Timo Keskiniemi 24.8.2018
 */
 
// Kirjoita tähän yleiskommentit

public class Suorakulmio implements Kuvio {
	
	private int leveys;
	private int korkeus;
	
	public Suorakulmio(int leveys, int korkeus) {
		this.leveys = leveys;
		this.korkeus = korkeus;
	}
	
	public Suorakulmio() {
		
	}
	
	public void setLeveys(int uusiLeveys) {
		leveys = uusiLeveys;
	}
	
	public int getLeveys() {
		return leveys;
	}
	
	public void setKorkeus(int uusiKorkeus) {
		korkeus = uusiKorkeus;
	}
	
	public int getKorkeus() {
		return korkeus;
	}
	
	public int ala() {
		int ala = leveys * korkeus;
		return ala;
	}
	
	@Override
	public String toString() {
		String merkkijono = "leveys=" + leveys + ", korkeus=" + korkeus;
		return merkkijono;
	}
}
