/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositemethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hannu.korhonen
 */
public class Emolevy implements Laiteosa {
    double hinta;
    String nimi;
    
    List<Laiteosa> emolevyOsat = new ArrayList<Laiteosa>();
    
    public Emolevy(double dTemp, String sTemp) {
        hinta = dTemp;
        nimi = sTemp;
    }
    
    @Override
    public void addOsa(Laiteosa laiteosa) {
        emolevyOsat.add(laiteosa);
    }
    public Laiteosa getOsa(int iTemp) {
        return emolevyOsat.get(iTemp);
    }
    public String getNimi() {
        return nimi;
    }
    public double getHinta() {
        return hinta;
    }
    public void print(){
        System.out.println("Emolevy: " + getNimi() +" hinta " + getHinta());
        
        for (Laiteosa tempOsa : emolevyOsat) {
            System.out.print("    ");
            tempOsa.print();
        }
    }
    public double kokonaisHinta() {
        double dOsatHinta = 0;
        
        //Emolevyn osien summa
        for (Laiteosa tempOsa : emolevyOsat) {
            dOsatHinta = dOsatHinta + tempOsa.kokonaisHinta();
        }
        //Lisää osien hinta emolevyn hintaan
        return dOsatHinta + this.hinta;
    }
}
