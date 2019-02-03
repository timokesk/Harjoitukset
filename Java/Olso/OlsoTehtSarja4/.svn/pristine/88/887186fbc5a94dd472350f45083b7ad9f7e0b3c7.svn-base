package valtiot;

import java.io.*;

/**
* @author Timo Keskiniemi 3.9.2018
*/

public class Valtio implements Serializable {
	private String nimi;
	private String pääkaupunki;
	private int asukasluku;
	
	public Valtio(String nimi, String pääkaupunki, int asukasluku) {
		this.nimi = nimi;
		this.pääkaupunki = pääkaupunki;
		this.asukasluku = asukasluku;
	}
	
	// Lisää getterit ja setterit
	public void setNimi(String uusiNimi) {
		nimi = uusiNimi;
	}
	
	public String getNimi() {
		return nimi;
	}
	
	public void setPääkaupunki(String uusiPääkaupunki) {
		pääkaupunki = uusiPääkaupunki;
	}
	
	public String getPääkaupunki() {
		return pääkaupunki;
	}
	
	public void setAsukasluku(int uusiAsukasluku) {
		asukasluku = uusiAsukasluku;
	}
	
	public int getAsukasluku() {
		return asukasluku;
	}
	
	// Lisää toString()
	// Saat tiedot sarakkeittain String-luokan staattisella format.metodilla
	// esim. String.format("%-10s %-10s %-10d", nimi, pääkaupunki, asukasluku);
	@Override
	public String toString() {
		String merkkijono = String.format("%-10s %-10s %-10d", nimi, pääkaupunki, asukasluku);
		return merkkijono;
	}
	
}
