package com.practise.patterns.commandpattern;

/**
 * Created by trinath on 12/06/17.
 */
public class Light {
    String description;
    public Light(String description){
        this.description = description;
    }
    public void on(){
        System.out.println("On");
    }
    public void off(){
        System.out.println("Off");
    }
}
