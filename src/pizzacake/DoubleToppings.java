/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzacake;

/**
 *
 * @author dbell17
 */
public class DoubleToppings extends ToppingsDecorator{
    
        private Pizza pizza; 
        
    public DoubleToppings(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        // combined descrition
        return pizza.getDescription() + ", Extra Toppings Combo";
    }

    @Override 
    public double cost () {
        // combined cost
        return 2.0 + pizza.cost();
    }

}

