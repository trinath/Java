package com.practise.patterns.strategypattern;

/**
 * Created by trinath on 11/06/17.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println(" Squeak ");
    }
}
