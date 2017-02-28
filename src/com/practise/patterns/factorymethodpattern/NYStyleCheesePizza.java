// Source HeadFirstDesignPatterns Book
package com.practise.patterns.factorymethodpattern;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Style Cheese and Sauce Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
