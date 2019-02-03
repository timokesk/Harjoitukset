package controller;

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

	}

	@Override
	public String[] getValuutat() {
		String[] valuutat = model.getVaihtoehdot();
		return valuutat;
	}

}
