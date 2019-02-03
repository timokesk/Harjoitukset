package model;

public interface ValuuttaDAO_IF {
	
	public abstract boolean createValuutta(Valuutta valuutta);
	public abstract Valuutta readValuutta(String tunnus);
	public abstract Valuutta[] readValuutat();
	public abstract boolean updateValuutta(Valuutta valuutta);
	public abstract boolean deleteValuutta(String tunnus);
	/*public abstract String[] getVaihtoehdot();
	public abstract double muunna(int lahto, int kohde, double maara);*/

}
