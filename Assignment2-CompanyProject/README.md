#### In this explanation, I will focus on the important points in the solution I made and how I solved the requirements despite the difficulty of understanding the requirements.

#### In the beginning, I will explain through the UML diagram in general, Then I will explain how I applied the SOLID principles in this project

 ![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/e8a5f97f-2259-464f-a91f-5a33282482f2)

####  This image shows the structure of the project
Where I created the:
- Implementation folder, which contains the main classes (User, Manger, Staff) Also, the reports folder contains the classes for creating the template report.

- Helpers folder Which contains classes that help me facilitate the solution in other classes For example Validator class, which contains static methods for validation operations. There are also classes such as the Budget class,which calculates the budget And also the MessagePrinter class and also the UsersDetails Which forms text containing Uses information ,I used these classes to make the method short, understandable, and readable
These classes helped me achieve the SRP (Single Responsibility Principle)  .

- The database folder which contains the Database Class .
### ----------------------------------------------------------------------------------------------------------------------------
  

### After I explained the project structure, I will now move to the important points So I will explain how I solved these points through questions and answers!

## How did I benefit from the power of inheritance?
  - By creating a User class Where I made manger, director and staff classes inherit from this class!, User properties Such as name, id, hourly rate, etc.The following UML diagram explains this .

   ![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/67e60c67-8477-4aa2-8831-809143acab57)

  
  - This diagram shows The User is a  super class for the manager, director and staff class, As we can see, the manger has an array of staff, and the director also has an array of staff and an array of manger 
  
  - Another important thing here is that I have overridden the getDetails method For example, manger has different details from director or staff. And in this methode I used the static method of the Details class, which is getDetailsUsers, which takes an array of users and returns their details! This is to make the getDetails method better in terms of understanding and reading 
### ----------------------------------------------------------------------------------------------------------------------------
