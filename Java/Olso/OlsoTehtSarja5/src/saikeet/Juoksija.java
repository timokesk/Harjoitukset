package saikeet;

/**
* @author Timo Keskiniemi 7.9.2018
*/

public class Juoksija extends Thread {
	volatile boolean jatkuu = true;
	long kierrokset = 0;

	// Kirjoita kierrokset-muuttujan getteri
	public long getKierrokset() {
		return kierrokset;
	}
	
	@Override
	public void run(){
		while(jatkuu) {
			System.out.println(kierrokset++);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// Kun juokseminen halutaan lopettaa, joku toinen säie kutsuu 
	// lopeta()-metodia.
	public void lopeta(){
		 jatkuu = false;
	}
}
