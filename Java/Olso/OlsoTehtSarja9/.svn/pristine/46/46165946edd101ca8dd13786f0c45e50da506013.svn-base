package model;

public class Valuuttakone implements Valuuttakone_IF {
	
	Valuutta euro = new Valuutta("Euroopan euro", 1.0);
	Valuutta rkruunu = new Valuutta("Ruotsin kruunu", 9.4780);
	Valuutta nkruunu = new Valuutta("Norjan kruunu", 8.9018);
	Valuutta dollari = new Valuutta("Yhdysvaltain dollari", 1.0629);
	Valuutta[] valuutat = {euro, rkruunu, nkruunu, dollari};

	@Override
	public String[] getVaihtoehdot() {
		String[] vaihtoehdot = new String[valuutat.length];
		for (int i = 0; i < valuutat.length; i++) {
			vaihtoehdot[i] = valuutat[i].getNimi();
		}
		return vaihtoehdot;
	}

	@Override
	public double muunna(int mistäIndeksi, int mihinIndeksi, double määrä) {
		double euroina;
		double tulos;
		euroina = määrä / valuutat[mistäIndeksi].getVaihtokurssi();
		tulos = euroina * valuutat[mihinIndeksi].getVaihtokurssi();
		return tulos;
	}

}
