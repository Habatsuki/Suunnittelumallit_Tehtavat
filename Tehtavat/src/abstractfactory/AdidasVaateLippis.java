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
public class AdidasVaateLippis implements Vaate {
    @Override
    public void kuvaileVaate() {
        System.out.println("Adidas lippis");
    }
    
    public String toString() {
        return "ADIDAS lippis";
    }
}
