// Source HeadFirstDesignPatterns Book
package com.practise.patterns.simplefactorypattern;

public class CheesePizza extends Pizza {
    public void prepare(){
        System.out.println("Preparing Cheese Pizza");
    }
    public void bake(){
        System.out.println("Baking Cheese Pizza");
    }
    public void cut(){
        System.out.println("Cutting Cheese Pizza");
    }
    public void box(){
        System.out.println("Adding Cheese Pizza to Box");
    }
}
