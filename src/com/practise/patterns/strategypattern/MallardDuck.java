package com.practise.patterns.strategypattern;

/**
 * Created by trinath on 11/06/17.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println(" I am real Mallard Duck");
    }
}
