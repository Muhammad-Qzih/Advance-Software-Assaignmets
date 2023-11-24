package WeatherMonitoringSystem.TemperatureStrategySystem.Strategies;

import WeatherMonitoringSystem.TemperatureStrategySystem.ITemperatureStrategy;

public class CelsiusStrategy implements ITemperatureStrategy {
    @Override
    public String convertorTemperature(double temperature) {
        return ((temperature - 32) * 0.555556) + "C";
    }
}
