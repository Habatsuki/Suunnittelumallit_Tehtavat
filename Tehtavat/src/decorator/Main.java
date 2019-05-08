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
public class Main {
    public static void printInfo(Pizza c) {
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
    }

    public static void main(String[] args) {
        Pizza c1 = new SimplePizza();
        Pizza c2 = new SimplePizza();
        Pizza c3 = new SimplePizza();
        
        c1 = new Tomatosauce(c1);
        c1 = new Mozzarella(c1);
        c1 = new Pepperoni(c1);
        c1 = new Ananas(c1);
        
        c2 = new Tomatosauce(c2);
        c2 = new Kebab(c2);
        c2 = new Bacon(c2);
        c2 = new Pepperoni(c2);
        
        c3 = new Tomatosauce(c3);
        c3 = new Ananas(c3);
        c3 = new Mozzarella(c3);
        c3 = new Mushroom(c3);
        
        printInfo(c1);
        printInfo(c2);
        printInfo(c3);
        
    }
}
