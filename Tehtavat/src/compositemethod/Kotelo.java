/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositemethod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hannu.korhonen
 */
public class Kotelo implements Laiteosa {
    double hinta;
    String nimi;
    
    List<Laiteosa> koteloOsat = new ArrayList<Laiteosa>();
    
    public Kotelo(double dTemp, String sTemp) {
        hinta = dTemp;
        nimi = sTemp;
    }
    
    @Override
    public void addOsa(Laiteosa laiteosa) {
        koteloOsat.add(laiteosa);
    }
    public Laiteosa getOsa(int iTemp) {
        return koteloOsat.get(iTemp);
    }
    public String getNimi() {
        return nimi;
    }
    public double getHinta() {
        return hinta;
    }
    public void print(){
        System.out.println("Kotelo: " + getNimi() +" hinta " + getHinta());
        
        for (Laiteosa tempOsa : koteloOsat) {
            System.out.print("    ");
            tempOsa.print();
        }
    }
    public double kokonaisHinta() {
        double dOsatHinta = 0;
        
        //Kopan osien summa
        for (Laiteosa tempOsa : koteloOsat) {
            dOsatHinta = dOsatHinta + tempOsa.kokonaisHinta();
        }
        //Lisää osien hinta kopan hintaan
        return dOsatHinta + this.hinta;
    }
}
