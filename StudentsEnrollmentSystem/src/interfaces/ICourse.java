package interfaces;

import java.util.List;

public interface ICourse {
    void addStudent(IStudent student);

    void deleteStudent(IStudent student);

    String getTitle();

    List<IStudent> getStudents();

}