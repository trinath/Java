// Source HeadFirstDesignPatterns Book
package com.practise.patterns.factorymethodpattern;

public class PizzaMaker {
    public static void main(String[] args){
        PizzaStore nystore = new NYStylePizzaStore();
        PizzaStore chicagostore = new ChicagoStylePizzaStore();

        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = chicagostore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
