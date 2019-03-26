/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositemethod;

/**
 *
 * @author hannu.korhonen
 */
public class Muistipiiri implements Laiteosa {
    double hinta;
    String nimi;
    
    public Muistipiiri(double dTemp, String sTemp) {
        hinta = dTemp;
        nimi = sTemp;
    }
    
    @Override
    public void addOsa(Laiteosa laiteosa) {
        //Laiteosaan ei voi lisätä osia
    }

    @Override
    public String getNimi() {
        return nimi;
    }

    @Override
    public double getHinta() {
        return hinta;
    }

    @Override
    public Laiteosa getOsa(int iTemp) {
        return null;
    }

    @Override
    public void print() {
        System.out.println("Muistipiiri: " + nimi + " hinta " + hinta);
    }
    public double kokonaisHinta() {
        //Muistipiirin kokonaishinta on vain osan hinta
        return this.hinta;
    }
}
