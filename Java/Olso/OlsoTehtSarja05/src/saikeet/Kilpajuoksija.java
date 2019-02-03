package saikeet;

/**
* @author Timo Keskiniemi 7.9.2018
*/

public class Kilpajuoksija extends Thread {
	private int numero; 				// juoksijan numero
	public static int seuraavaNumero=1;	// luokkamuuttuja juoksijoiden numeroimiseksi
	
	private final int MATKA = 400; 		// juostava matka, tässä vakio
	private double aika; 				// sekunteina
	
	public Kilpajuoksija() {
		this.numero = seuraavaNumero;
		this.setPriority(seuraavaNumero);
		seuraavaNumero++;
	}

	@Override
	public void run(){
		int vali;

	// Ohjelmoi toisto, jossa
	// - tulostat väliaikatieto 50 metrin välein
		for (int i = 0; i < 40; i ++) {
			// - käytät satunnaislukugenerattoria 10 metrin juoksuajan saamiseksi
			int paras = 0;
			Thread.yield();
			if (Thread.currentThread().getPriority() == 8) {
				vali = 1075 + (int) (Math.random() * (1375-1075+1));
				paras = vali;
			} else {
				vali = paras + (int) (Math.random() * (100+1));
			}
			
			// - odotat ko. ajan
			try {
				Thread.sleep(vali);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			aika = aika + (double) vali/1000;
			aika = aika*100;
			aika = (int)aika;
			aika = aika/100;
			
			if ((i+1)%5 == 0) {
				System.out.println(this.numero + " " + (i+1)*10 + "m " + aika + "s " + Thread.currentThread().getPriority());
			}
		}
	
	}

	public double getAika(){
		return aika; 
	}
}
