package com.practise.patterns.decoratorpattern;

/**
 * Created by trinath on 12/06/17.
 */
public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(" Description: " + beverage.getDescription() + " Cost: " + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        System.out.println(" Description: " + beverage1.getDescription() + " Cost: " + beverage1.cost());
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(" Description: " + beverage1.getDescription() + " Cost: " + beverage1.cost());
    }
}
