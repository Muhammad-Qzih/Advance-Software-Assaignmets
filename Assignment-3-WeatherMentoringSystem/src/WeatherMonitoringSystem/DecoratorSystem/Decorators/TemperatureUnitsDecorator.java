package WeatherMonitoringSystem.DecoratorSystem.Decorators;

import WeatherMonitoringSystem.DecoratorSystem.BigInterface.IWeatherSystemInterface;
import WeatherMonitoringSystem.DecoratorSystem.absrtact.WeatherDecoratorAbstract;
import WeatherMonitoringSystem.TemperatureStrategySystem.ITemperatureStrategy;

public class TemperatureUnitsDecorator extends WeatherDecoratorAbstract {
    private ITemperatureStrategy strategy;
    private double temperature;

    public TemperatureUnitsDecorator(IWeatherSystemInterface weatherSystemInterface, ITemperatureStrategy strategy, double temperature) {
        super(weatherSystemInterface);
        this.strategy = strategy;
        this.temperature = temperature;
    }

    @Override
    public String getInformation() {
        return getDecorator().getInformation() + "TemperatureUnitsDecorator: " + this.getTemperature();
    }

    public String getTemperature() {
        return strategy.convertorTemperature(this.temperature);
    }

}
