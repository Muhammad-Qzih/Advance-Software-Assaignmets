package WeatherMonitoringSystem.DecoratorSystem.absrtact;

import WeatherMonitoringSystem.DecoratorSystem.BigInterface.IWeatherSystemInterface;

public abstract class WeatherDecoratorAbstract implements IWeatherSystemInterface {
    private IWeatherSystemInterface weatherSystemInterface;

    public WeatherDecoratorAbstract(IWeatherSystemInterface weatherSystemInterface) {
        this.weatherSystemInterface = weatherSystemInterface;
    }

    public IWeatherSystemInterface getDecorator() {
        return weatherSystemInterface;
    }
}
