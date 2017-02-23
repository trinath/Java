// Source HeadFirstDesignPatterns Book
package com.practise.patterns.observerpattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float pressure, float humidity){
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Display Elements are: "+ temperature + " and " + humidity);
    }
}
