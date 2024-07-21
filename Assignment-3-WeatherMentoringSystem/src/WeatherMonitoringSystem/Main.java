package WeatherMonitoringSystem;


import WeatherMonitoringSystem.DecoratorSystem.BigInterface.IWeatherSystemInterface;
import WeatherMonitoringSystem.DecoratorSystem.Decorators.PrecipitationDecorator;
import WeatherMonitoringSystem.DecoratorSystem.Decorators.TemperatureUnitsDecorator;
import WeatherMonitoringSystem.DecoratorSystem.Decorators.WindSpeedDecorator;
import WeatherMonitoringSystem.ObserverSystem.implementation.WeatherDataSubject;
import WeatherMonitoringSystem.ObserverSystem.implementation.observers.CurrentConditionsDisplay;
import WeatherMonitoringSystem.ObserverSystem.implementation.observers.StatisticsDisplay;
import WeatherMonitoringSystem.TemperatureStrategySystem.Strategies.CelsiusStrategy;
import WeatherMonitoringSystem.TemperatureStrategySystem.Strategies.FahrenheitStrategy;


public class Main {
    public static void main(String[] args) {

        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataSubject);
        StatisticsDisplay newStatisticsDisplay = new StatisticsDisplay(weatherDataSubject);

        weatherDataSubject.register(currentConditionsDisplay);
        weatherDataSubject.register(statisticsDisplay);
        weatherDataSubject.remove(newStatisticsDisplay);

        weatherDataSubject.setTemperature(55);
        weatherDataSubject.setHumidity(15);
        weatherDataSubject.setPressure(414);
        weatherDataSubject.remove(newStatisticsDisplay);

        IWeatherSystemInterface system;

        System.out.println("-----------------------------------------");
        system = new CurrentConditionsDisplay();
        printInformation(system);

        System.out.println("-----------------------------------------");
        system = new StatisticsDisplay(weatherDataSubject);
        printInformation(system);

        System.out.println("-----------------------------------------");
        system = new PrecipitationDecorator(currentConditionsDisplay, "Rain");
        printInformation(system);

        System.out.println("-----------------------------------------");
        system = new PrecipitationDecorator(currentConditionsDisplay, "Snow");
        printInformation(system);


        System.out.println("-----------------------------------------");
        system = new PrecipitationDecorator(statisticsDisplay, "Rain");
        printInformation(system);

        System.out.println("-----------------------------------------!");
        system = new WindSpeedDecorator(statisticsDisplay, 90);
        printInformation(system);

        System.out.println("-----------------------------------------!");
        system = new WindSpeedDecorator(currentConditionsDisplay, 90);
        printInformation(system);

        System.out.println("-----------------------------------------");
        system = new TemperatureUnitsDecorator(statisticsDisplay, new FahrenheitStrategy(), 77);
        printInformation(system);

        System.out.println("-----------------------------------------");
        system = new TemperatureUnitsDecorator(statisticsDisplay, new CelsiusStrategy(), 170.6);
        printInformation(system);

        System.out.println("-----------------------------------------");
        system = new TemperatureUnitsDecorator(statisticsDisplay, new FahrenheitStrategy(), 77);
        printInformation(system);

    }
    public static void printInformation(IWeatherSystemInterface system){
        System.out.println(system.getInformation());
    }
}
