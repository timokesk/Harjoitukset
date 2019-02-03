package valtiot;

/**
* @author laita tähän nimesi ja päiväys
*/

import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Valtiotesti {

	public static void main(String[] args) {

		// ArrayList-muuttuja valtio-olioiden tallettamiseksi
	    List<Valtio> valtiot = new ArrayList<>();
		Valtio valtio;
		String nimi;
		String paakaupunki;
		String asukaslukuStr;
		int asukasluku;

		// Kysy valtioita, kunnes syötteenä annetaan tyhjä
		
		nimi = JOptionPane.showInputDialog("Anna valtion nimi: ");
		while (nimi.compareTo("") != 0) {

			paakaupunki = JOptionPane.showInputDialog("Anna valtion " + nimi + " pääkaupunki ");
			do {
				asukaslukuStr = JOptionPane.showInputDialog("Anna valtion " + nimi + " asukasluku");
				try {
					asukasluku = Integer.parseInt(asukaslukuStr); // Tarvitsisi poikkeukseen varautumisen
					break;
				}
				catch (NumberFormatException nfe) {
					
				}
			} while (true);

			// Luo uusi Valtio-olio ja vie se listaan
			Valtio uusiValtio = new Valtio(nimi, paakaupunki, asukasluku);
			valtiot.add(uusiValtio);

			nimi = JOptionPane.showInputDialog("Anna valtion nimi: ");
		}

		// Tulosta valtiot listasta, käytä for/each-rakennetta
		for (Valtio v : valtiot) {
			System.out.println(v.toString());
		}

		// Kirjoita lista tiedostoon
		// TiedostonKasittely.kirjoitaTiedostoon("valtiot.dat", valtiot);
				
		// Lue lista tiedostosta
		// List<Valtio> luetut =  TiedostonKasittely.lueTiedostosta("valtiot.dat");		
		
		// Tulosta saatu lista
		// System.out.println(luetut);
	}

}
