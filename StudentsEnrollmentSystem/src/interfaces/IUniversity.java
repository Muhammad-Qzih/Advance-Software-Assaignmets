package interfaces;

import java.util.List;

public interface IUniversity {
    void generateReports( IStudent student,ICourse course);
    void addStudent(IStudent student);
    void addCourse(ICourse course);
    void  enrollStudentToCourse(IStudent student,ICourse course);
    void dropStudentFromCourse(IStudent student,ICourse course);
    void  dropCourse(ICourse course);
    void dropMultipleStudentsFromSpecificCourse(List<IStudent> students, ICourse course);
    List<ICourse>  getAvailableCoursesInCUniversity();
}
