package com.practise.patterns.decoratorpattern;

/**
 * Created by trinath on 12/06/17.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }
}
