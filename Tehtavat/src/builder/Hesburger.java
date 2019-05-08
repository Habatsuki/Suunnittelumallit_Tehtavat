/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author hannu.korhonen
 */
public class Hesburger extends Builder {
    //StringBuilder jossa osia edustavat merkkijonot
    public void buildBun() { burg.setBun("cross"); }
    public void buildMeat() { burg.setMeat("mild"); }
    public void buildSalad() { burg.setSalad("ham+pineapple"); }
}
