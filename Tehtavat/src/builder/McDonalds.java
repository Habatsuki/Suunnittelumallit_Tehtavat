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
public class McDonalds extends Builder {
    //List johon tallennetaan hampurilaisen osat oliona
    public void buildBun() { burg.setBun("pan baked"); }
    public void buildMeat() { burg.setMeat("hot"); }
    public void buildSalad() { burg.setSalad("pepperoni+salami"); }
}
