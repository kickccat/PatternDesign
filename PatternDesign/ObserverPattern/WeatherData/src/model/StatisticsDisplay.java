package model;

import service.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float minTem;
    private float maxTem;
    private float avgTem;
    private int count;
    private float sum;
    Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this::update);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            if (count == 0) {
                minTem = weatherData.getTemperature();
                maxTem = weatherData.getTemperature();
            }
            minTem = Math.min(Math.min(minTem, this.temperature), maxTem);
            maxTem = Math.max(temperature, maxTem);
            sum += temperature;
            count++;
            avgTem = sum / count;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("AVG/Max/Min temperature = " + avgTem + "/" + maxTem +
                "/" + minTem);
    }
}
