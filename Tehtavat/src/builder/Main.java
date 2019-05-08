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
public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        
        Builder hese_burgerbuilder = new Hesburger();
        Builder mc_burgerbuilder = new McDonalds();
        
        waiter.setBurgerBuilder( hese_burgerbuilder );
        waiter.constructPizza();
        
        Burger burg = waiter.getPizza();
    }

}
