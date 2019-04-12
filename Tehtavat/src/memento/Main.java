/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author hannu.korhonen
 */
public class Main {
    public static void main(String[] args) {
        aCaretaker care = new aCaretaker("1");
        care.start();

        aCaretaker care2 = new aCaretaker("2");
        care2.start();
    }
}
