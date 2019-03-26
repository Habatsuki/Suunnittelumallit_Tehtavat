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
public class Main {
    public static void main(String[] args) {
        Laiteosa emolevy = new Emolevy(1000, "SUPERLEVY3000");
        Laiteosa muistipiiri = new Muistipiiri(300,"SUPERAM");    
        Laiteosa prosessori = new Prosessori(500, "SUPERPROCESSOR3");
        emolevy.addOsa(muistipiiri);
        emolevy.addOsa(prosessori);
        emolevy.print();
        
        System.out.print("Emolevyn kokonaishinta: ");
        System.out.println(emolevy.kokonaisHinta());
        System.out.println("");
        
        //Luo koppa
        Laiteosa koppa = new Kotelo(50, "Normikoppa");
        //Lisää emolevy koppaan
        koppa.addOsa(emolevy);
        //Lisää verkkokortti emolevyyn joka on kopan sisällä
        Laiteosa verkkokortti = new Verkkokortti(140, "DNA verkko");
        emolevy.addOsa(verkkokortti);
        //Enään näytönohjain puuttuu
        Laiteosa naytonohjain = new Naytonohjain(300, "N4Y70N paikka");
        emolevy.addOsa(naytonohjain);
        
        //Näytä Koppa ja sen sisältö
        koppa.print();
        //Kopan kokonaishinta
        System.out.print("Kopan ja sen sisällön kokonaishinta:");
        System.out.println(koppa.kokonaisHinta());
        System.out.println("");
        
    }
}
