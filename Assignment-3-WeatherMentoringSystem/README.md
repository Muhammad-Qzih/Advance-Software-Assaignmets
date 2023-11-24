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

### What does the getInformation() method do?
- This method returns the information contained in the cocreteComponent and concreteDecorator!, For example, the user chose to display statisticsDisplay he wanted to add TemperatureUnits to it this method fetches the relevant information in the statisticsDisplay from getDecorators and add the TemperatureUnits inforamtion to it.
Look at the following images for the code:
![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/16b377f1-2d79-436c-a123-89e3d9cb1a9e)
![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/c3adc187-fc07-4ca5-a9aa-9af599993a94)
![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/dccd28be-1ee2-4c07-a35e-a4369f2e8ace)
### ----------------------------------------------------------------------------------------------------------------------------

### Why did i use the strategy pattern for temperature conversion?
- This pattern helped me avoid breaking the open close principle where if we think about it the user wants to convert from celsius to fahrenheit or vice versa , But what if we want to add another unit in the future? it is a good solution to use this pattern! This is the class diagram of the strategy design pattern:
  
![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/04450341-53b3-4bea-819c-1b9ac453057a)

![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/727c979f-e705-45f0-9d25-5b39e97f4635)

In main : 
![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/38e817ea-2cfe-4836-9589-369d8e35b504)
 
### ----------------------------------------------------------------------------------------------------------------------------
How did you apply the observer  design pattern?
- In this pattern, the observers are considered the cocreteComponents for the above decorator pattern!
- In this Pattern we have IWeatherDataSubject interface and his concrete and we have the IWeatherDataObserver also his concrete and we have an observer etc.. i will not say much about it because it is clear and does not require explanation but I will talk about some important points in it.
##  Look at the following class diagram, which illustrates the observer design pattern:
![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/f1f8f21e-4d85-433d-b94f-9d331dbfa540)

### There is a relationship between the StatisticsDisplay and WeatherDataSubject, where I created an object of type WeatherDataSubject in the StatisticsDisplay so that I can access the special obervers in the WeatherDataSubject so that I can calculate the statistics.
