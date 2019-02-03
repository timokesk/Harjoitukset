/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import mooc.logiikka.Sovelluslogiikka;
import mooc.ui.Kayttoliittyma;
import mooc.ui.Tekstikayttoliittyma;
/**
 *
 * @author timok
 */
public class Main {
    
    public static void main(String[] args) {
        Kayttoliittyma kayttoliittyma = new Tekstikayttoliittyma();
        new Sovelluslogiikka(kayttoliittyma).suorita(3);
    }
}
