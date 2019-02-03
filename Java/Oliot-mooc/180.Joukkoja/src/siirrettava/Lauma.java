/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siirrettava;

import java.util.ArrayList;

/**
 *
 * @author timok
 */
public class Lauma implements Siirrettava {
    
    private ArrayList<Siirrettava> eliolista = new ArrayList<>();
    
    public String toString() {
        String merkkijono = "";
        for (int i = 0; i < eliolista.size(); i++) {
            merkkijono = merkkijono + eliolista.get(i) + "\n";
        }
        return merkkijono;
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        eliolista.add(siirrettava);
    }
    
    public void siirra(int dx, int dy) {
        for (int i = 0; i < eliolista.size(); i++) {
            eliolista.get(i).siirra(dx, dy);
        }
    }
    
}
