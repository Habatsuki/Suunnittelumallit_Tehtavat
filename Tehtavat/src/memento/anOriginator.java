/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.Random;

/**
 *
 * @author hannu.korhonen
 */
public class anOriginator {
    
    private static anOriginator INSTANCE = null;
    
    public anOriginator(){    
    }
    
    public static synchronized anOriginator getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new anOriginator();
        }
        return INSTANCE;
    }
    
    public Memento liityPeliin() {
        Random rand = new Random();
        return new Memento(rand.nextInt(10) + 1);
    }
    
    public boolean arvaus(int arvaus, Object memento) {
        Memento arvuuttaja = (Memento) memento;
        return arvuuttaja.onnistuikoArvaus(arvaus);
    }
    
    private class Memento{
        private int numero;
        
        public Memento(int arvaus){
            this.numero = arvaus;
        }
        
        public boolean onnistuikoArvaus(int arvausYritys) {
            if (arvausYritys == numero) {
                return true;
            } else {
                return false;
            }
        }
    }
}
