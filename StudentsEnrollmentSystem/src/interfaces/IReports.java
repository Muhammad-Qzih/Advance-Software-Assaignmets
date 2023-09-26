package interfaces;

import java.util.List;

public interface IReports {
     void   allAvailableCoursesReport(List<ICourse> allCourses);
     void  coursesForSpecificStudentReport(IStudent student);
     void  studentsEnrolledSpecificCourse(ICourse course);

}
