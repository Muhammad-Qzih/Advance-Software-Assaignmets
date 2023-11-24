package WeatherMonitoringSystem.TemperatureStrategySystem;

public class ConvertorContext {
    ITemperatureStrategy strategy;

    public void setStrategy(ITemperatureStrategy strategy) {
        this.strategy = strategy;
    }

    public String convert(double temperature) {
        return strategy.convertorTemperature(temperature);
    }

}
