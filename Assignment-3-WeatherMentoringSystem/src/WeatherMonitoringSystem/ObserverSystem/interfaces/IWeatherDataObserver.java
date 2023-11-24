package WeatherMonitoringSystem.ObserverSystem.interfaces;

import WeatherMonitoringSystem.DecoratorSystem.BigInterface.IWeatherSystemInterface;

public interface IWeatherDataObserver extends IWeatherSystemInterface {
    void update(double temperature, double humidity, double pressure);
    double getHumidity();
    double getTemperature();

}
