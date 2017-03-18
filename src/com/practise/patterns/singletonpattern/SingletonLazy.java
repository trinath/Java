// Source HeadFirstDesignPatterns Book
package com.practise.patterns.singletonpattern;
// Double checked locking
public class SingletonLazy {
    private static volatile SingletonLazy instance;
    private SingletonLazy(){ }
    public static SingletonLazy GetInstance(){
        if(instance == null){
            synchronized (SingletonLazy.class){
                if(instance == null){
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

}
