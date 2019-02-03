package model;

import java.util.Random;

public class KolikkoModel implements KolikkoModel_IF {
	
	Random rand = new Random();
	int tulos;	
	
	@Override
	public int arvoTulos() {
		tulos = rand.nextInt(2);
		return tulos;
	}

}
