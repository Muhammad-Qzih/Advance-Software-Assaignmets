package implementations;
import interfaces.ICourse;
import interfaces.IStudent;
import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
    private int id;
    private String name;
    private String email;
    private List<ICourse> courses;

    public Student(int ID, String name, String email) {
        this.id = ID;
        this.name = name;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    @Override
    public List<ICourse> getCourses() {
        return courses;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAllCourses() {
        StringBuilder allCoursesTitles = new StringBuilder();

        for (ICourse course : this.courses) {
            allCoursesTitles.append(course.getTitle()).append(",");
        }
        return allCoursesTitles.toString();
    }

    @Override
    public void droppingCourse(ICourse course) {
        courses.remove(course);
    }

    @Override
    public void studentEnrollment(ICourse course) {
        this.courses.add(course);
    }

    @Override
    public String toString() {
        return "Student Information:" +
                "Name:" + this.getName() + ",Id:" +
                this.getID() + ",Email:" + this.getEmail() + "\nCourses Student:" + this.getAllCourses();

    }
}