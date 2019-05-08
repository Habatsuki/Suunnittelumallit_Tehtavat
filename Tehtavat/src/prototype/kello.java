/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author hannu.korhonen
 */
public class kello implements Cloneable {
    sekuntiViisari sek;
    minuuttiViisari min;
    tuntiViisari tun;
    
    public kello() {
        sek = new sekuntiViisari();
        min = new minuuttiViisari();
        tun = new tuntiViisari();
    }
    
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
}
