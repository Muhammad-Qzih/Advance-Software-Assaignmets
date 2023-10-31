package interfaces;

import java.util.List;

public interface IStudent {
   void studentEnrollment(ICourse course);
   void  droppingCourse(ICourse course);
   String getName();
   List<ICourse> getCourses();
}



