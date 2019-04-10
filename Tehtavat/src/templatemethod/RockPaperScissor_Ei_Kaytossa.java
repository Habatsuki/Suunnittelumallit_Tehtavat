/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.util.ArrayList;

/**
 *
 * @author hannu.korhonen
 */

class RockPaperScissor_Ei_Kaytossa extends Game {
    
    /*
    Implementation of necessary concrete methods
    */
    
    final int ROCK = 0;
    final int PAPER = 1;
    final int SCISSOR = 2;
    
    ArrayList<Player> players;
    
    int remainingPlayers = playersCount;
    boolean[] playerEliminated;
    int[] playerPlay;
    
    void initializeGame() {
        Player firstPlayer = new Player(0);
        Player previousPlayer = firstPlayer;
        Player nextPlayer;
        players.add(firstPlayer);
        
        for (int i = 0; i < playersCount; i++) {
            nextPlayer = new Player(i+1, previousPlayer);
            players.add(nextPlayer);
            //Set next player as previousplayers right player
            players.get(i).setRightPlayer(nextPlayer);
            previousPlayer = nextPlayer;
            
            if (i+1 == playersCount) {
                firstPlayer.setLeftPlayer(nextPlayer);
            }
        }
        
    }
    
    void makePlay(int player) {
        eliminatePlayer(player);
        
        players.get(player).throwHand();
        
        if (player == playersCount) {
            showDown();
        }
        
    }
    
    void eliminatePlayer(int player) {
        players.get(player).eliminate();
        
        remainingPlayers = remainingPlayers - 1;
        //Check if all but 1 players are eliminated
        if (remainingPlayers == 1) {
            endOfGame();
        }
    }
    
    boolean endOfGame() {
        return true;
    }
    
    void printWinner() {
        System.out.println("Player number " + players.get(0) + " has won");
    }
    
    /*
    Specific declarations for the rock, paper, scissor game
    */
    
    //A multiple player variation can be played: 
    //Players stand in a circle and all throw at once. 
    //If rock, paper, and scissors are all thrown, it is a stalemate, and they rethrow. 
    //If only two throws are present, all players with the losing throw are eliminated. 
    //Play continues until only the winner remains
    void showDown() {
        
        
        //Rock      0
        //Paper     1 
        //Scissors  2
        int player1, player2, player3;
        
        for (int i = 0; i < playersCount; i++) {
            
        }
    }
    
    int nextPlayer(int player) {
        //Starting from the current player, check next players
        for (int i2 = player; i2 < playersCount; i2++) {
            //On the last check check position 0 instead
            if (playerEliminated[i2] != true) {
                return i2;
            }
            //Check player 0 on the last check
            if (i2 == (playersCount - 1)) {
                if (playerEliminated[0] != true && player != 0) {
                    
                }
            }
        }
        return -1;
    }
    
}
