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
public class aCaretaker extends Thread {
    private Object obj;
    private anOriginator ori;
    private int arvo;
    private String pelaaja;
    private Random rand;

    public aCaretaker(String pelaaja) {
        this.pelaaja = pelaaja;
    }
    
    public void run() {
        ori = anOriginator.getInstance();
        obj = ori.liityPeliin();
        rand = new Random();
        
        do {
            arvo = rand.nextInt(10) + 1;
            System.out.println("Pelaaja " + pelaaja + ": Arvaan numero: " + arvo);
        } while (!ori.arvaus(arvo, obj));
    }
}
