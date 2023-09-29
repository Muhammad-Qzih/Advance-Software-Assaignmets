# StudentEnrollmentSystem


# some notes:
#### I defined the classes and interfaces for each class ,calsses:(Student,Course,        University,ReportGenarato,Validator) ,
#### interfaces:((IStudent,ICourse,IUniversity,IReportGenarato,IValidator)).

#### The classes are placed in a file called implementation and the interfaces are placed in a file called interfaces.
#### I did not use the inheritance relationship in the solution.
#### I added a validator class to apply validation to the methods This is to reduce the complexity within the methods.
#### Any methods I didn't use from getters and setters I deleted it.
        
    
  # How did I achieve the cohesion principle in this project?:
   ### 1) Single Responsibility Principle (SRP): 
   ####  Each class or module should have a single responsibility or reason to changes, 
   #### All classes have only one responsibility, such as the course class, which only focuses on the course, its characteristics, and its methods.

### 2) Keep Methods Focused:
  #### This is done by dividing large methods or those that contain a large implementation into several methodes, such as the validations in the university class methodes.
#### I created a validator class that contains several methods that help me, The same applies to reports methodes .
    

 # How I Achieved Loose Coupling  and avoiding Tight coupling ?

 ####  This is done by avoiding inheritance and using interfaces, so there is no    inheritance relationship in my solution where I used interfaces to define contracts that specify the expected behavior of classes. This allows different implementations to interact with each other without needing to know the details of each other's implementations, and the classes are independent of each other. 


# Changes:

## 1) initial commit:
####  I created classes and inerfacses without implementations of the methods in order to understand the nature of the system and to solve it in the best possible way.

## 1) Final commit code :

#### At this stage, I made the implementation of the methodes add students, add courses, Enroll students in courses, drop students from courses, and generate reports, I added several methods, such as deleting the course from the university and deleting the student from the university.

#### I also noticed that there is a lot of repetition in the code, especially the validation process in the methodes So I created a class validator to use these validatios and this helped me reduce the complexity of the code ! ,I created some methodes that  help me in validations, such as: courseExists, studentExists to check whether the student or course is available at the university or not,Also methodes like: isStudentInThsCourse To check whether the student is in the course? This matters to us in the process of dropping and addition! And other methods that you can check out.


#### I also created a class ReportGenarator to put the methods in reports, I made these methodes static because there is no need to create an object, I used these methodes through the reference!!



