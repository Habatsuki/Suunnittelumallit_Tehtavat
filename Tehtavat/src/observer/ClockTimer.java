/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hannu.korhonen
 */
public class ClockTimer extends Observable implements Runnable {
    
    Calendar calendar;
    
    public ClockTimer() {
        calendar = new GregorianCalendar();
    }
    
    public void run() {
        while (true) {
            tick();
            
            setChanged();
            this.notifyObservers(calendar);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClockTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void tick() {
        calendar = new GregorianCalendar();
    }
}
