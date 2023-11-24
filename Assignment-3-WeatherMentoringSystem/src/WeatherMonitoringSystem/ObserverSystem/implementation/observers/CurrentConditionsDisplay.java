package WeatherMonitoringSystem.ObserverSystem.implementation.observers;

import WeatherMonitoringSystem.ObserverSystem.interfaces.IWeatherDataObserver;

public class CurrentConditionsDisplay implements IWeatherDataObserver {
    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        this.setPressure(pressure);
        System.out.println("Data updated!, Current Conditions Display: ");
        System.out.println(getInformation());
    }

    @Override
    public String getInformation() {
        return
                "CurrentConditionsDisplay: " + " pressure: " + this.getPressure() + "\n"
                        + "temperature: " + this.getTemperature() + "\n" +
                        "humidity : " + this.getHumidity() + "\n";
    }

    private void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    private void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
