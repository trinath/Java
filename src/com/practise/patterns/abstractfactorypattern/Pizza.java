// Source HeadFirstDesignPatterns Book
package com.practise.patterns.abstractfactorypattern;


import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clam;
    Pepperoni pepperoni;
    Veggies veggies[];
    ArrayList toppings = new ArrayList();

    abstract void prepare();

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

    void setName(String name){ this.name = name;}
}

