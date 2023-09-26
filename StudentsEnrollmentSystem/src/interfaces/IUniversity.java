package interfaces;

public interface IUniversity {
    void generateReports();
    void addStudent(IStudent student);
    void addCourses(ICourse course);
    void  enrollStudent(IStudent student,ICourse course);

}
