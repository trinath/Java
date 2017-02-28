// Source HeadFirstDesignPatterns Book
package com.practise.patterns.factorymethodpattern;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Cheese and Sauce Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Shredded Mozarella Cheese");
    }
    public void cut(){
        System.out.println("Cut the pizza into square slices");
    }
}
