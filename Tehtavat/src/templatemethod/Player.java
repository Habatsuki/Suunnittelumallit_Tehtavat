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
public class Player {
    int thrownHand;
    int playerNumber;
    
    Player leftPlayer;
    Player rightPlayer;
    
    boolean eliminated = false;
    
    public Player(int number) {
        playerNumber = number;
    }
    
    public Player(int number, Player left) {
        playerNumber = number;
        leftPlayer = left;
    }
    
    public void setLeftPlayer(Player left) {
        leftPlayer = left;
    }
    
    public void setRightPlayer(Player right) {
        rightPlayer = right;
    }
    
    public void throwHand() {
        Random rand = new Random();
        thrownHand = rand.nextInt((2) + 1);
    }
    
    public void eliminate() {
        eliminated = true;
        leftPlayer.setRightPlayer(rightPlayer);
        rightPlayer.setLeftPlayer(leftPlayer);
    }
}
