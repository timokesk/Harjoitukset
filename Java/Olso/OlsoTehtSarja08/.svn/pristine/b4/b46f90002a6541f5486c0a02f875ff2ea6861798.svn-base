package controller;

import model.KolikkoModel_IF;
import view.KolikkoGUI_IF;

public class KolikkoKontrolleri implements KolikkoKontrolleri_IF {
	
	KolikkoModel_IF model;
	KolikkoGUI_IF gui;
	
	public KolikkoKontrolleri(KolikkoGUI_IF gui, KolikkoModel_IF model) {
		this.gui = gui;
		this.model = model;
	}
	
	@Override
	public void kolikonheitto() {
		
		int tulos = model.arvoTulos();
		
		gui.setTulos(tulos);
	}

}
