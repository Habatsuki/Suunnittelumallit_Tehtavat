/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.util.Random;

/**
 *
 * @author hannu.korhonen
 */
class DartGame extends Game {
    
    /*
    Implementation of necessary concrete methods
    */
    private int[] pisteet;
    Random rand;
    private boolean isEnd = false;
    private int voittaja;
    private boolean peliohi = false;
    
    private final int voittoPisteet = 50;
    
    void initializeGame() {
        pisteet = new int[playersCount];
        rand = new Random();
    }
    
    void makePlay(int player) {
        pisteet[player] += rand.nextInt(10) + 1;
        if (pisteet[player] == voittoPisteet) {
            //Ensimmäinen pelaaja jolla on 50 pistettä voittaa
            voittaja = player;
            peliohi = true;
        } else if (pisteet[player] > voittoPisteet) {
            //Jos pisteet menevät yli 50 niin pelaajan pitää aloittaa taas 0:sta pisteestä
            pisteet[player] = 0;
        }
    }
    
    boolean endOfGame() {
        return peliohi;
    }
    
    void printWinner() {
        System.out.println("Voittaja: Pelaaja " + (voittaja + 1)  + ", pisteillä: " + pisteet[voittaja]);
    }
    
    /*
    Specific declarations for the chess game
    */
    
}
