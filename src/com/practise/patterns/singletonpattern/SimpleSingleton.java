// Source HeadFirstDesignPatterns Book
package com.practise.patterns.singletonpattern;

public class SimpleSingleton {
    private static SimpleSingleton instance = new SimpleSingleton();
    private SimpleSingleton(){ }
    public static SimpleSingleton GetInstance(){
        return instance;
    }
}
