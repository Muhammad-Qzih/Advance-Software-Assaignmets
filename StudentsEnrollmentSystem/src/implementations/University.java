package implementations;
import interfaces.ICourse;
import interfaces.IStudent;
import interfaces.IUniversity;
import java.util.ArrayList;
import java.util.List;


public class University implements IUniversity {

    private List<ICourse> studentsInUniversity;

    private List<IStudent> coursesInUniversity;

    public University(){
        this.studentsInUniversity = new ArrayList<>();
        this.coursesInUniversity = new ArrayList<>();
    }

    @Override
    public void generateReports() {

    }

    @Override
    public void addStudent(IStudent student) {

    }

    @Override
    public void addCourses(ICourse course) {

    }

    @Override
    public void enrollStudent(IStudent student,ICourse course) {

    }

    @Override
    public String toString() {
        return "University Information:" + "Number Of Students:"
                + this.studentsInUniversity.size()  +
                ", Number Of Courses:" + this.coursesInUniversity.size();
    }
}
