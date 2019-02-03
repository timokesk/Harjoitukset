package model;

public class Valuuttakone implements Valuuttakone_IF {
	
	ValuuttaAccessObject vao = new ValuuttaAccessObject();
	
	@Override
	public String[] getVaihtoehdot() {
		Valuutta[] valuutat = vao.readValuutat();
		String[] vaihtoehdot = new String[valuutat.length];
		for (int i = 0; i < valuutat.length; i++) {
			vaihtoehdot[i] = valuutat[i].getNimi();
		}
		return vaihtoehdot;
	}
	
	@Override
	public double muunna(int lahto, int kohde, double maara) {
		Valuutta[] valuutat = vao.readValuutat();
		double tulos;
		double euroina;
		euroina = maara / valuutat[lahto].getVaihtokurssi();
		tulos = euroina * valuutat[kohde].getVaihtokurssi();
		return tulos;
	}

}