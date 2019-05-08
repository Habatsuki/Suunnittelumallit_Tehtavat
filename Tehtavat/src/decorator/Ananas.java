/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author hannu.korhonen
 */
public class Ananas extends PizzaDecorator{
    
// Decorator WithMilk mixes milk into coffee.
// Note it extends CoffeeDecorator.
    public Ananas(Pizza c) {
        super(c);
    }

    @Override
    public double getCost() { // Overriding methods defined in the abstract superclass
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Ananas";
    }
}
