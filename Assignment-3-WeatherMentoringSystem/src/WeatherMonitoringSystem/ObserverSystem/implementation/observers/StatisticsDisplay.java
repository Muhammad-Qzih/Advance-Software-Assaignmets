package WeatherMonitoringSystem.ObserverSystem.implementation.observers;

import WeatherMonitoringSystem.ObserverSystem.interfaces.IWeatherDataObserver;
import WeatherMonitoringSystem.ObserverSystem.interfaces.IWeatherDataSubject;

public class StatisticsDisplay implements IWeatherDataObserver {
    private double temperature;
    private double humidity;
    private double pressure;
    private IWeatherDataSubject subject;

    public StatisticsDisplay(IWeatherDataSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        this.setPressure(pressure);
        System.out.println("Data updated!, Statistics Display: ");
        System.out.println(this.getInformation());
    }

    @Override
    public String getInformation() {
        double temperatureSum = 0.0, humiditySum = 0.0;

        for (IWeatherDataObserver newSubject : this.subject.getObservers()) {
            temperatureSum += newSubject.getTemperature();
            humiditySum += newSubject.getHumidity();
        }

        return "Average of temperature: " + temperatureSum / subject.getObservers().size() +
                "\n" + "Average of humidity: " + humiditySum / subject.getObservers().size() + "\n";
    }

    private void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    private void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
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


}
