/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timok
 */
public class Tuote {
    private double hinta;
    private int maara;
    private String nimi;
    
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.nimi = nimiAlussa;
        this.hinta = hintaAlussa;
        this.maara = maaraAlussa;
    }
    
    public void tulostaTuote() {
        System.out.println(this.nimi + ", hinta " + this.hinta + ", " + this.maara + " kpl");
    }
}
