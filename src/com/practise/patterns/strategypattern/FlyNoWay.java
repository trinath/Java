package com.practise.patterns.strategypattern;

/**
 * Created by trinath on 11/06/17.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println(" I can't fly ");
    }
}
