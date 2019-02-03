
package suorakulmiot;
/**
 *
 * @author Timo Keskiniemi 24.8.2018
 */

// Kirjoita tähän yleiskommentit

public class NaytonSuorakulmio extends Suorakulmio {
	
	private int x;
	private int y;
	
	public NaytonSuorakulmio(int x, int y, int leveys, int korkeus) {
		super(leveys, korkeus);
		this.x = x;
		this.y = y;
	}
	
	public boolean mahtuu(int leveys, int korkeus) {
		boolean mahtuu = false;
		
		if (leveys >= x + getLeveys() && korkeus >= y + getKorkeus()) {
			mahtuu = true;
		}
		
		return mahtuu;
	}
	
	@Override
	public String toString() {
		String merkkijono = "x=" + x + ", y=" + y + ", " + super.toString();
		return merkkijono;
	}

}
