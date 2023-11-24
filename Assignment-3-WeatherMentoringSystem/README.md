#### In this explanation, I will focus on the important points in the solution I made and how I solved the requirements .

#### In the beginning, I will explain through the UML diagram in general, Then I will explain how I applied the design patterns.


![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/8e56d89a-032d-4a44-a7dc-12a83777068f)
####  This image shows the structure of the system
Where I created the:
- Decorator Pattern System:   Inside it there are all the classes needed to implement the decorator desing pattern, which are: IWeatherSystemInterface, WeatherDecoratorAbstract, and decorators: PrecipitationDecorator, TemperatureUnitsDecorator, WindSpeedDecorator .
- Observer Pattern System : Inside this folder there are all the classes needed to achieve the observer pattern!  which, implementaion folder, which contains the WeatherDataSubject and also the observers: CurrentConditionsDisplay, StatisticsDisplay and also the interfaces folder that contains IWeatherDataObserver and IWeatherDataSubject Finally, the ObserverValidation class is responsible for the validation in the WeatherDataSubject methodes.like remove, register .   
- TemperatureStrategySystem:  In this folder
It has clasess
Necessary to implement the strategy pattern
This helped me to make the user convert temperature from Celsius to Fahrenheit or vice versa in an easy and flexible way, i chose the strategy method this is to avoid problems such as breaking the open close! assuming that units other than Celsius and Fahrenheit can be added! . 
