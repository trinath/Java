// Source HeadFirstDesignPatterns Book
package com.practise.patterns.factorymethodpattern;

import java.util.ArrayList;
// Source HeadFirstDesignPatterns Book

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing Pizza: " + name);
        System.out.println("Tossing Dough");
        System.out.println("Adding Sauce");
        System.out.println("Adding Toppings");
        for(Object s : toppings){
            System.out.println((String)s+ " ");
        }
    }

    void bake(){
        System.out.println("Bake for 25 min at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal pieces.");
    }

    void box(){
        System.out.println("Place pizza in official box.");
    }

    public String getName(){
        return name;
    }
}

