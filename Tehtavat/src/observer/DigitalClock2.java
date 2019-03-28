/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author hannu.korhonen
 */
public class DigitalClock2 implements Observer {
    private ClockTimer timer;
    
    public DigitalClock2(ClockTimer ct) {
        timer = ct;
        timer.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        //Muuta vastaanotettu kalenteri halutunmuotoiseksi ajaksi
        if (arg.getClass() == GregorianCalendar.class) {
            //Muoto hh:mm:ss am/pm
            Calendar calendar = (GregorianCalendar) arg;
            String sTime;
            sTime = String.valueOf(calendar.get(Calendar.HOUR));
            sTime = sTime + ":" + String.valueOf(calendar.get(Calendar.MINUTE));
            sTime = sTime + ":" + String.valueOf(calendar.get(Calendar.SECOND));
            if (calendar.get(Calendar.HOUR_OF_DAY) < 10) {
                sTime = sTime + " AM";
            } else {
                sTime = sTime + " PM";
            }
            System.out.println("Kellonaika: " + sTime);            
        }
        
    }
    
}
