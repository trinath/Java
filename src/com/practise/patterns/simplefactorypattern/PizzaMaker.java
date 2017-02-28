// Source HeadFirstDesignPatterns Book
package com.practise.patterns.simplefactorypattern;

public class PizzaMaker {

    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        Pizza pizza = pizzaStore.orderPizza("cheese");

    }
}
