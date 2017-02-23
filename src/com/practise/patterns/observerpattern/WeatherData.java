// Source HeadFirstDesignPatterns Book
package com.practise.patterns.observerpattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList Observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        Observers = new ArrayList();
    }

    public void registerObserver(Observer o){
        Observers.add(o);
    }

    public void removeObserver(Observer o){
        int index = Observers.indexOf(o);
        if(index >= 0){
            Observers.remove(o);
        }
    }

    public void notifyObservers(){
        for(Object o: Observers){
            ((Observer)o).update(temperature, pressure, humidity);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }
}
