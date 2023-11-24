package WeatherMonitoringSystem.TemperatureStrategySystem.Strategies;

import WeatherMonitoringSystem.TemperatureStrategySystem.ITemperatureStrategy;

public class FahrenheitStrategy implements ITemperatureStrategy {
    @Override
    public String convertorTemperature(double temperature) {
        return ((1.8 * temperature) + 32) + "F";
    }
}
