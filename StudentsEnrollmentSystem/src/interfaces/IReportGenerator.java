package interfaces;

import java.util.List;

public interface IReportGenerator {
    void allAvailableCoursesInUniversityReport(List<ICourse> courses);

    void CoursesInWhichSpecificStudentReport(IStudent student);

    void StudentsInSpecificCourseReport(ICourse course);
}
