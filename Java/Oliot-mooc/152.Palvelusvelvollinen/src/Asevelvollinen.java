/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timok
 */
public class Asevelvollinen implements Palvelusvelvollinen {
    private int tj;
    
    public Asevelvollinen(int tj) {
        this.tj = tj;
    }
    
    public int getTJ() {
        return this.tj;
    }
    
    public void palvele() {
        this.tj -= 1;
        if (this.tj <= 0) {
            this.tj = 0;
        }
    }
    
}
