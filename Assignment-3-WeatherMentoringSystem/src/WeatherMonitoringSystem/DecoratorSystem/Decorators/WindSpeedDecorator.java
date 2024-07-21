package WeatherMonitoringSystem.DecoratorSystem.Decorators;

import WeatherMonitoringSystem.DecoratorSystem.BigInterface.IWeatherSystemInterface;
import WeatherMonitoringSystem.DecoratorSystem.absrtact.WeatherDecoratorAbstract;

public class WindSpeedDecorator extends WeatherDecoratorAbstract {
    double windSpeed;

    public WindSpeedDecorator(IWeatherSystemInterface weatherSystemInterface, double windSpeed) {
        super(weatherSystemInterface);
        this.windSpeed = windSpeed;
    }

    @Override
    public String getInformation() {
        return getDecorator().getInformation() + "Wind Speed: " + this.getWindSpeed();
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

}
