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
public class Prosessori implements Laiteosa {
    double hinta;
    String nimi;
    
    public Prosessori(double dTemp, String sTemp) {
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
        System.out.println("Prosessori: " + nimi + " hinta " + hinta);
    }
    public double kokonaisHinta() {
        //Prosessorin kokonaishinta on vain osan hinta
        return this.hinta;
    }
}
