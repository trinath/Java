// Source HeadFirstDesignPatterns Book
package com.practise.patterns.simplefactorypattern;

public class VeggiePizza extends Pizza {
    public void prepare(){
        System.out.println("Preparing Veggie Pizza");
    }
    public void bake(){
        System.out.println("Baking Veggie Pizza");
    }
    public void cut(){
        System.out.println("Cutting Veggie Pizza");
    }
    public void box(){
        System.out.println("Adding Veggie Pizza to Box");
    }
}
