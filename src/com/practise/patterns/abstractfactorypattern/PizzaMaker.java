// Source HeadFirstDesignPatterns Book
package com.practise.patterns.abstractfactorypattern;

public class PizzaMaker {
    public static void main(String[] args){
        PizzaStore nystore = new NYPizzaStore();

        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println(pizza.getName());

    }
}
