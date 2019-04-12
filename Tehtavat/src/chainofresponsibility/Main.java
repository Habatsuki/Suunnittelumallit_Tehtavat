/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author hannu.korhonen
 */
class Main {
    public static void main(String[] args) {
        LahiEsimiesKorotus lahiesimies = new LahiEsimiesKorotus();
        YksikonPaallikkoKorotus yksikonpaallikko = new YksikonPaallikkoKorotus();
        ToimitusjohtajaKorotus tj = new ToimitusjohtajaKorotus();
        
        lahiesimies.setSuccessor(yksikonpaallikko);
        yksikonpaallikko.setSuccessor(tj);
        
        // Press Ctrl+C to end
        try {
            while (true) {
                System.out.println("Hyvää päivää. Tule peremmälle.");
                System.out.println("Halusit pyytää palkankorotusta.");
                System.out.println("Kuinka suuresta palkankorotuksesta puhutaan?");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new
                InputStreamReader(System.in)).readLine());
                lahiesimies.processRequest(new PalkankorotusPyynto(d, "General"));
            }
        } catch(Exception e) {
            System.exit(1);
        }
    }
}

