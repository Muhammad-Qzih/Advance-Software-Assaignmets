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

### How did I solve the report template problem?
- Here are simply a lot of solutions, especially factory design patterns and strategy! In particular, they move forward with many SOLID principles Especially open closed! Simply put, how can you make creating or adding a report easy and flexible! I decided to use something close to the strategy design pattern! Look at this diagram:


![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/e4e75b45-9fd4-40ea-9d02-4cb61f6bd0e9)

-  There is also a very important class! and is it TemplateReportGenerator It contains generateTemplateReport methode Where he creates a template containing the reports he wants for the user! For example, the user can create a template that contains two reports or one report! Or any number of reports he wants! According to the types of reports we have!!! Look at the following codes:


![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/ceab59cb-a6ea-4c2e-997b-014f4928dd08) , ![image](https://github.com/Muhammad-Qzih/Advance-Software-Assaignmets/assets/116916960/f6ac30e0-b7d3-47c0-9fa9-01a1f67f11f2)

### ----------------------------------------------------------------------------------------------------------------------------

### How did I solve the DabaseClass problem?

- Well, it is clear that we do not need more than object in order to operate the database, so I used the singleton design pattern, which helped me with with that.

- The databse on the following methdes: addUser, connect, disConnect Add user to database or connect user to the database or disconnect!, so that the user cannot do anything unless he is connected to the database!, and so on.



