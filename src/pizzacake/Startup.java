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
        
        
        Pizza pizza = new PepperoniPizza();
        
        
        System.out.println(pizza.getDescription()
                + " " + nf.format(pizza.cost()));

        Pizza pizza2 = new SausagePizza();
        
       
        pizza2 = new ExtraCheese(pizza2);
        pizza2 = new DoubleToppings(pizza2); 
        pizza2 = new Onions(pizza2);
        pizza2 = new Mushrooms(pizza2);
        pizza2 = new Pineapple(pizza2);
        
        
        System.out.println(pizza2.getDescription()
                + " " + nf.format(pizza2.cost()));
    }

}
   
