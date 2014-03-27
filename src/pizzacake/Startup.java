/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzacake;

import java.text.NumberFormat;

/**
 *
 * @author dbell17
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        // Liskov Substition !!
        Pizza pizza = new PepperoniPizza();
        
        // Espresso has not been decorated here.
        System.out.println(pizza.getDescription()
                + " " + nf.format(pizza.cost()));

        Pizza pizza2 = new SausagePizza();
        
        // Now let's decorate HouseBlend like this...
        pizza2 = new ExtraCheese(pizza2);
        pizza2 = new DoubleToppings(pizza2); // double Mocha
        
        
        // Resulting coffee has combined cost and description.
        System.out.println(pizza2.getDescription()
                + " " + nf.format(pizza2.cost()));
    }

}
   
