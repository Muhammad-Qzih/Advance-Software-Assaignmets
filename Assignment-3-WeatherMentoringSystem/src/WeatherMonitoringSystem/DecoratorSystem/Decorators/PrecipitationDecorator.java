package WeatherMonitoringSystem.DecoratorSystem.Decorators;

import WeatherMonitoringSystem.DecoratorSystem.BigInterface.IWeatherSystemInterface;
import WeatherMonitoringSystem.DecoratorSystem.absrtact.WeatherDecoratorAbstract;

public class PrecipitationDecorator extends WeatherDecoratorAbstract {

    public String precipitation;

    public PrecipitationDecorator(IWeatherSystemInterface weatherSystemInterface, String precipitation) {
        super(weatherSystemInterface);
        this.precipitation = precipitation;
    }

    @Override
    public String getInformation() {
        return getDecorator().getInformation() + "precipitation: " + getPrecipitation();
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }
}
