/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timok
 */
public class Laskuri {
    private int laskuri;
    private boolean tarkistus;
    
    public Laskuri(int alkuarvo, boolean tarkistus) {
        this.laskuri = alkuarvo;
        this.tarkistus = tarkistus;
    }
    
    public Laskuri(int alkuarvo) {
        this(alkuarvo,false);
    }
    
    public Laskuri(boolean tarkistus) {
        this(0,tarkistus);
    }
    
    public Laskuri() {
        this(0,false);
    }
    
    public int arvo() {
        return this.laskuri;
    }
    
    public void lisaa() {
        this.laskuri = this.laskuri + 1;
    }
    
    public void lisaa(int lisays) {
        if (lisays >= 0) {
            this.laskuri = this.laskuri + lisays;
        }
    }
    
    public void vahenna() {
        if (this.tarkistus) {
            if (this.laskuri <= 0) {
                this.laskuri = 0;
            } else {
                this.laskuri = this.laskuri - 1;
            }
        } else {
            this.laskuri = this.laskuri - 1;
        }
    }
    
    public void vahenna(int vahennys) {
        if (vahennys >= 0) {
            if (this.tarkistus) {
                this.laskuri = this.laskuri - vahennys;
                if (this.laskuri <= 0) {
                    this.laskuri = 0;
                }
            } else {
                this.laskuri = this.laskuri - vahennys;
            }
        }
    }
}
