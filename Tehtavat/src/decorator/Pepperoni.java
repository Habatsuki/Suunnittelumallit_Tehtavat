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
public class Pepperoni extends PizzaDecorator{
    
// Decorator WithMilk mixes milk into coffee.
// Note it extends CoffeeDecorator.
    public Pepperoni(Pizza c) {
        super(c);
    }

    @Override
    public double getCost() { // Overriding methods defined in the abstract superclass
        return super.getCost() + 1.0;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Pepperoni";
    }
}
