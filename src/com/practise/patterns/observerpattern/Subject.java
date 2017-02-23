// Source HeadFirstDesignPatterns Book
package com.practise.patterns.observerpattern;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
