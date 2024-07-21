package WeatherMonitoringSystem.ObserverSystem.implementation;

import WeatherMonitoringSystem.ObserverSystem.ObserverValidator;
import WeatherMonitoringSystem.ObserverSystem.interfaces.IWeatherDataObserver;
import WeatherMonitoringSystem.ObserverSystem.interfaces.IWeatherDataSubject;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements IWeatherDataSubject {
    List<IWeatherDataObserver> observers = null;
    private double pressure;
    private double temperature;
    private double humidity;

    public WeatherDataSubject() {
        this.observers = new ArrayList<>();
    }

    public WeatherDataSubject(double temperature, double humidity, double pressure, String wind) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.observers = new ArrayList<>();
        this.pressure = pressure;
    }

    @Override
    public void notifyAllObservers() {
        for (IWeatherDataObserver observer : this.observers)
            observer.update(
                    this.temperature,
                    this.humidity,
                    this.pressure);
    }

    @Override
    public List<IWeatherDataObserver> getObservers() {
        return this.observers;
    }

    @Override
    public void register(IWeatherDataObserver observer) {
        if (!ObserverValidator.observerCanBeRegistered(observers, observer)) {
            return;
        }
        observers.add(observer);
        notifyAllObservers();
    }

    @Override
    public void remove(IWeatherDataObserver observer) {
        if (!ObserverValidator.observerCanBeRemoved(observers, observer)) {
            return;
        }
        observers.remove(observer);
    }


    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }

    public double getTemperature() {
        return temperature;
    }


    public double getHumidity() {
        return humidity;
    }


    public double getPressure() {
        return pressure;
    }


}


