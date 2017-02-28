// Source HeadFirstDesignPatterns Book
package com.practise.patterns.factorymethodpattern;

public class ChicagoStylePizzaStore extends PizzaStore{
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
