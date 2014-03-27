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
public class Pineapple extends ToppingsDecorator{
        
    Pizza pizza;

    public Pineapple(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        // combined descrition
        return pizza.getDescription() + ", Extra Cheese";
    }

    @Override
    public double cost () {
        // combined cost
        return .5 + pizza.cost();
    }

}



