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
public class Waiter {
    private Builder burgerBuilder;
    
    public void setBurgerBuilder(Builder b) { burgerBuilder = b; }
    public Burger getPizza() { return burgerBuilder.getBurger(); }
    
    public void constructPizza() {
        burgerBuilder.createNewBurgerProduct();
        burgerBuilder.buildBun();
        burgerBuilder.buildMeat();
        burgerBuilder.buildSalad();
    }
}
