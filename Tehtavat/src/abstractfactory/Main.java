/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author hannu.korhonen
 */
public class Main {
    public static void main(String[] args) {
        Jasper jMan = new Jasper(true);
        
        //Kuvaile Jasperin vaatteet
        jMan.kuvaileVaatteet();
        
        //Jasper valmistuu insinööriksi
        System.out.println("Jasper valmistui insinööriksi ja luonnollisesti hänen vaatemakunsa muuttuu");
        jMan.setOpiskelijaStatus(false);
        
        //Kuvaile Jasperin vaatteet
        jMan.kuvaileVaatteet();
   }
}
