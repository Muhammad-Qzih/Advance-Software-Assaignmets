package WeatherMonitoringSystem.ObserverSystem.interfaces;

import java.util.List;

public interface IWeatherDataSubject {
    void notifyAllObservers();
    void register(IWeatherDataObserver observer);

    void remove(IWeatherDataObserver observer);

    List<IWeatherDataObserver> getObservers();

}
