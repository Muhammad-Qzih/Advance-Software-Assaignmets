package WeatherMonitoringSystem.ObserverSystem;

import WeatherMonitoringSystem.ObserverSystem.interfaces.IWeatherDataObserver;

import java.util.List;

public class ObserverValidator {
    public static boolean isNull(IWeatherDataObserver object) {
        return object == null;
    }

    public static boolean observerIsExist(List<IWeatherDataObserver> weatherDataObservers, IWeatherDataObserver observer) {
        return weatherDataObservers.contains(observer);
    }

    public static boolean observerCanBeRegistered(List<IWeatherDataObserver> weatherDataObservers, IWeatherDataObserver observer) {
        if (ObserverValidator.isNull(observer)) {
            System.out.println("null!");
            return false;
        }
        if (ObserverValidator.observerIsExist(weatherDataObservers, observer)) {
            System.out.println("observer is already exist!");
            return false;
        }
        return true;
    }

    public static boolean observerCanBeRemoved(List<IWeatherDataObserver> weatherDataObservers, IWeatherDataObserver observer) {
        if (ObserverValidator.isNull(observer)) {
            System.out.println("null!");
            return false;
        }
        if (!ObserverValidator.observerIsExist(weatherDataObservers, observer)) {
            System.out.println("observer is not exist!");
            return false;
        }
        return true;
    }


}
