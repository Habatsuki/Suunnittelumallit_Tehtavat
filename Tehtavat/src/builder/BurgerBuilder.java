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
abstract class BurgerBuilder {
    protected Burger burg;
    
    public Burger getBurger() { return burg; }
    public void createNewPizzaProduct() { burg = new Burger(); }
    
    public abstract void buildBun();
    public abstract void buildMeat();
    public abstract void buildSalad();
}
