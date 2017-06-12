package com.practise.patterns.decoratorpattern;

/**
 * Created by trinath on 11/06/17.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
