// Source HeadFirstDesignPatterns Book
package com.practise.patterns.observerpattern;
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(10, 20, 30);
        weatherData.setMeasurements(13, 14, 15);
        weatherData.setMeasurements(16, 24, 35);
    }
}
