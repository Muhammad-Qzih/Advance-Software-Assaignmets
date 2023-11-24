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

### ----------------------------------------------------------------------------------------------------------------------------
### After I explained the project structure, I will now move to the important points So I will explain how I solved these points through questions and answers!
### ----------------------------------------------------------------------------------------------------------------------------

## How did you apply the decorator design pattern?
How did you apply the decorator design pattern?
-  In this pattern we know that we have main decorators and extra decorators. In the extra decorators they are PrecipitationDecorator, TemperatureUnitsDecorator,WindSpeedDecorator.All of these decoratos extend the WeatherDecoratorAbstract which contains an important method, which is getDecorator this method returns the main object to which we want to add additional information. There is also a very important interface, which is the IWeatherSystemInterface Which is considered the pillar of our decorator desing pattern! it contains a very important method, which is getInformation() where the extra decorators do the override for it!
## Look at the following class diagram, which illustrates the decoration design pattern:
![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/615fa82c-3797-4e02-96cb-663a90d1d88f)

