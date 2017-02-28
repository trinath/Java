// Source HeadFirstDesignPatterns Book
package com.practise.patterns.simplefactorypattern;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type){
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;

        }
        return pizza;
    }
}
