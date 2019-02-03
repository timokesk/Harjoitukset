package controller;

import model.Valuutta;
import model.ValuuttaDAO_IF;
import model.Valuuttakone_IF;
import view.ValuuttakoneenGUI_IF;

public class ValuuttakoneenOhjain implements ValuuttakoneenOhjain_IF {
	
	Valuuttakone_IF model;
	ValuuttakoneenGUI_IF gui;
	
	public ValuuttakoneenOhjain(ValuuttakoneenGUI_IF gui, Valuuttakone_IF model) {
		this.gui = gui;
		this.model = model;
	}

	@Override
	public void muunnos() {
		int lahto = gui.getLähtöIndeksi();
		int kohde = gui.getKohdeIndeksi();
		double maara = gui.getMäärä();
		double tulos = model.muunna(lahto, kohde, maara);
		gui.setTulos(tulos);
	}

	@Override
	public String[] getValuutat() {
		String[] valuutat = model.getVaihtoehdot();
		return valuutat;
	}

}