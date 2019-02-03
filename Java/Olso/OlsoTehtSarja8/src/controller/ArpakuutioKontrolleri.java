package controller;

import model.ArpakuutioModel;
import model.ArpakuutioModel_IF;
import view.ArpakuutioGUI_IF;

public class ArpakuutioKontrolleri implements ArpakuutioKontrolleri_IF {
	
	ArpakuutioModel_IF model1, model2, model3, model4, model5;
	ArpakuutioGUI_IF gui;
	
	public ArpakuutioKontrolleri(ArpakuutioGUI_IF gui, ArpakuutioModel_IF model) {
		this.gui = gui;
		model1 = new ArpakuutioModel();
		model2 = new ArpakuutioModel();
		model3 = new ArpakuutioModel();
		model4 = new ArpakuutioModel();
		model5 = new ArpakuutioModel();
	}
	
	@Override
	public void nopanheitto() {
		
		int tulos1 = model1.annaSilmaluku();
		int tulos2 = model2.annaSilmaluku();
		int tulos3 = model3.annaSilmaluku();
		int tulos4 = model4.annaSilmaluku();
		int tulos5 = model5.annaSilmaluku();
		//model.lisaaHeitto();
		
		gui.setTulos(tulos1, tulos2, tulos3, tulos4, tulos5);
		//gui.setHeitot(ArpakuutioModel.heitot);
	}

}
