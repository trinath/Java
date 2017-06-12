package com.practise.patterns.decoratorpattern;

/**
 * Created by trinath on 12/06/17.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }
    public double cost(){
        return .89;
    }
}
