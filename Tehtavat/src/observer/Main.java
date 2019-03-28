/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author hannu.korhonen
 */
class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        
        DigitalClock1 clock1 = new DigitalClock1(timer);
        DigitalClock2 clock2 = new DigitalClock2(timer);
        
        timer.addObserver(clock1);
        timer.addObserver(clock2);
        
        new Thread(timer).start();
        
    }
}
