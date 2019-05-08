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
public class sekuntiViisari {
    int sekunnit = 0;
    
    public void tick() {
        this.sekunnit += 1;
        
        if (this.sekunnit == 60) {
            this.sekunnit = 0;
        }
    }
}
