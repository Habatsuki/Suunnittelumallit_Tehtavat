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
    
    int hours;
    int minutes;
    int seconds;
    Calendar calendar;
    
    public ClockTimer() {
        calendar = new GregorianCalendar();
        hours = calendar.get(Calendar.HOUR_OF_DAY);
        minutes = calendar.get(Calendar.MINUTE);
        seconds = calendar.get(Calendar.SECOND);
    }
    
    public void run() {
        while (true) {
            setChanged();
            this.notifyObservers(calendar);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClockTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /*
    public String getTime() {
        if (seconds == 59 && minutes == 59 && hours == 23) {
            seconds = 0;
            minutes = 0;
            hours = 0;
        } else if (seconds == 59 && minutes == 59) {
            hours++;
            minutes = 0;
            seconds = 0; 
        } else if (seconds == 59) {
            minutes++;
            seconds = 0;
        } else {
            seconds++;
        }
        
        return hours + ":" + minutes + ":" + seconds;
    }
    */
    
    public void tick() {
        Calendar calendar = new GregorianCalendar();
        hours = calendar.get(Calendar.HOUR_OF_DAY);
        minutes = calendar.get(Calendar.MINUTE);
        seconds = calendar.get(Calendar.SECOND);
    }
    
}
