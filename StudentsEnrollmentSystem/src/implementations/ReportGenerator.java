package implementations;

import interfaces.ICourse;
import interfaces.IReportGenerator;
import interfaces.IStudent;
import java.util.List;

public class ReportGenerator implements IReportGenerator {
    @Override
    public void allAvailableCoursesInUniversityReport(List<ICourse> courses) {
        StringBuilder allCourses = new StringBuilder();
        for (ICourse course : courses) {
            allCourses.append(course.getTitle()).append(", ");
        }
        System.out.println("All available courses in the University: " + allCourses);
    }

    @Override
    public void StudentsInSpecificCourseReport(ICourse course) {
        StringBuilder allStudents = new StringBuilder();
        for (IStudent student : course.getStudents()) {
            allStudents.append(student.getName()).append(", ");
        }
        System.out.println("All Students enrolled in the " + course.getTitle() + " course: " + allStudents);
    }

    @Override
    public void CoursesInWhichSpecificStudentReport(IStudent student) {
        StringBuilder allCoursesForThisStudent = new StringBuilder();
        for (ICourse course : student.getCourses()) {
            allCoursesForThisStudent.append(course.getTitle()).append(", ");
        }
        System.out.println("All courses attended by the student " + student.getName() + ": " + allCoursesForThisStudent );
    }
}