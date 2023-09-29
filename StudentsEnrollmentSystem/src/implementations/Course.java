package implementations;

import interfaces.ICourse;
import interfaces.IStudent;

import java.util.ArrayList;
import java.util.List;

public class Course implements ICourse {
    private String code;
    private String title;
    private String instructor;
    private final int MAX_CAPACITY = 10;
    private int numberOfStudentInTheCourse;
    private List<IStudent> students;

    public Course(String title, String code, String instructor) {
        this.title = title;
        this.code = code;
        this.instructor = instructor;
        this.students = new ArrayList<>();
    }

    public int getNumberOfStudentInTheCourse() {
        return numberOfStudentInTheCourse;
    }

    public void setNumberOfStudentInTheCourse(String action) {
        if (action.equals("Increment"))
            numberOfStudentInTheCourse++;

        else if (action.equals("Decrement")) {
            numberOfStudentInTheCourse--;
        }
    }

    public List<IStudent> getStudents() {
        return students;
    }

    public void setStudents(List<IStudent> students) {
        this.students = students;
    }

    public String getCode() {
        return code;
    }


    @Override
    public String getTitle() {
        return title;
    }

    public String getInstructor() {
        return instructor;
    }

    @Override
    public void addStudent(IStudent student) {
        if (Validator.hasReachedMaximumCapacity(this.getNumberOfStudentInTheCourse(), this.MAX_CAPACITY)) {
            System.out.println("The course is full !");
            return;
        }
        this.students.add(student);
        this.setNumberOfStudentInTheCourse("Increment");
    }

    @Override
    public void deleteStudent(IStudent student) {
        students.remove(student);
        this.setNumberOfStudentInTheCourse("Decrement");
    }

    public String getAllStudents() {
        StringBuilder allStudentsNames = new StringBuilder();
        for (IStudent student : this.students) {
            allStudentsNames.append(student.getName()).append(",");
        }
        return allStudentsNames.toString();
    }

    @Override
    public String toString() {
        return "course Information: Title:" + this.getTitle() + ",Code:" + this.getCode() + ", Course Instructor:" + this.getInstructor() + "students: " + this.getAllStudents();
    }
}

