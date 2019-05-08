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
// Extension of a simple coffee without any extra ingredients
public class SimplePizza implements Pizza {
    @Override
    public double getCost() {
        return 4;
    }

    @Override
    public String getIngredients() {
        return "Pizza";
    }
}
