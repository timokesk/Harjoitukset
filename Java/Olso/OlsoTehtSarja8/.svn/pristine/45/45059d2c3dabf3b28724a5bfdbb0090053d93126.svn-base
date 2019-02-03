package controller;

import model.VuorokausiModel_IF;
import view.VuorokausiGUI_IF;

public class VuorokausiKontrolleri implements VuorokausiKontrolleri_IF {
	
	VuorokausiModel_IF model;
	VuorokausiGUI_IF gui;
	
	public VuorokausiKontrolleri(VuorokausiGUI_IF gui, VuorokausiModel_IF model) {
		this.gui = gui;
		this.model = model;
	}
	
	@Override
	public void aamu() {
		String tervehdys = model.aamu();
		gui.setTervehdys(tervehdys);
	}
	
	@Override
	public void paiva() {
		String tervehdys = model.paiva();
		gui.setTervehdys(tervehdys);
	}
	
	@Override
	public void ilta() {
		String tervehdys = model.ilta();
		gui.setTervehdys(tervehdys);
	}
	
	@Override
	public void yo() {
		String tervehdys = model.yo();
		gui.setTervehdys(tervehdys);
	}

}
