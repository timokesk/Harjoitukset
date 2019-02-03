package model;

import javax.persistence.*;

/**
 * @author Timo Keskiniemi 1.10.2018
 */

@Entity
@Table(name="valuutta")
public class Valuutta {
	
	@Id
	@Column(name="tunnus")
	private String tunnus;
	
	@Column(name="vaihtokurssi")
	private double vaihtokurssi;
	
	@Column(name="nimi")
	private String nimi;
	
	public Valuutta(String tunnus, double vaihtokurssi, String nimi) {
		this.tunnus = tunnus;
		this.vaihtokurssi = vaihtokurssi;
		this.nimi = nimi;
	}
	
	public Valuutta() {
		
	}
	
	public void setTunnus(String tunnus) {
		this.tunnus = tunnus;
	}
	
	public String getTunnus() {
		return tunnus;
	}
	
	public void setVaihtokurssi(double vaihtokurssi) {
		this.vaihtokurssi = vaihtokurssi;
	}
	
	public double getVaihtokurssi() {
		return vaihtokurssi;
	}
	
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public String getNimi() {
		return nimi;
	}
	
}