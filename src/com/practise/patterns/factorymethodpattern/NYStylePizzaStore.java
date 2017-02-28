// Source HeadFirstDesignPatterns Book
package com.practise.patterns.factorymethodpattern;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
