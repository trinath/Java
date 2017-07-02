package com.practise.patterns.strategypattern;

/**
 * Created by trinath on 11/06/17.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println(" Silence ");
    }
}
