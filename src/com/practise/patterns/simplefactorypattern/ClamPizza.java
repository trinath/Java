// Source HeadFirstDesignPatterns Book
package com.practise.patterns.simplefactorypattern;

public class ClamPizza extends Pizza {
    public void prepare(){
        System.out.println("Preparing Clam Pizza");
    }
    public void bake(){
        System.out.println("Baking Clam Pizza");
    }
    public void cut(){
        System.out.println("Cutting Clam Pizza");
    }
    public void box(){
        System.out.println("Adding Clam Pizza to Box");
    }
}