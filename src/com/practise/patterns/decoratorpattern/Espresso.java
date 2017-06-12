package com.practise.patterns.decoratorpattern;

/**
 * Created by trinath on 12/06/17.
 */
public class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
    }

    public double cost(){
        return 1.99;
    }
}
