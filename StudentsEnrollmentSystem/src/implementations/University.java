package implementations;

import interfaces.ICourse;
import interfaces.IReportGenerator;
import interfaces.IStudent;
import interfaces.IUniversity;

import java.util.ArrayList;
import java.util.List;

public class University implements IUniversity {
    private List<ICourse> coursesInUniversity;

    private List<IStudent> studentsInUniversity;

    public University() {
        this.studentsInUniversity = new ArrayList<>();
        this.coursesInUniversity = new ArrayList<>();
    }

    @Override
    public List<ICourse> getAvailableCoursesInCUniversity() {
        return this.coursesInUniversity;
    }

    public List<IStudent> getAllStudentsInUniversity() {
        return this.studentsInUniversity;
    }

    @Override
    public void addStudent(IStudent student) {

        if (Validator.studentExists(studentsInUniversity, student)) {
            System.out.println("Can not add " + student.getName() + ", student already exists!!");
            return;
        }
        this.studentsInUniversity.add(student);
        System.out.println(student.getName() + " added successfully!");
    }

    @Override
    public void addCourse(ICourse course) {

        if (Validator.courseExists(this.coursesInUniversity, course)) {
            System.out.println("Can not add " + course.getTitle() + " course, course already exists!!");
            return;
        }

        this.coursesInUniversity.add(course);
        System.out.println(course.getTitle() + " added successfully!");
    }

    @Override
    public void dropCourse(ICourse course) {
        if (!Validator.courseExists(this.coursesInUniversity, course)) {
            System.out.println("Can not drop " + course.getTitle() + " course, course does not exists!!");
            return;
        }
        this.coursesInUniversity.remove(course);
        this.dropMultipleStudentsFromSpecificCourse(this.studentsInUniversity, course);
        System.out.println(course.getTitle() + " removed successfully!");
    }

    @Override
    public void enrollStudentToCourse(IStudent student, ICourse course) {
        if (!Validator.canAddStudentToCourse(this.studentsInUniversity, this.coursesInUniversity, student, course)) {
            return;
        }

        student.studentEnrollment(course);
        course.addStudent(student);
        System.out.println(student.getName() + " enrolled to " + course.getTitle() + " successfully!!");
    }

    @Override
    public void dropStudentFromCourse(IStudent student, ICourse course) {
        if (!Validator.canDropStudentFromCourse(this.studentsInUniversity, this.coursesInUniversity, student, course)) {
            return;
        }

        course.deleteStudent(student);
        student.droppingCourse(course);
        System.out.println(student.getName() + " removed from " + course.getTitle() + " successfully!!");
    }

    @Override
    public void dropMultipleStudentsFromSpecificCourse(List<IStudent> students, ICourse course) {
        for (IStudent student : students) {
            if (Validator.courseExists(student.getCourses(), course)) {
                student.droppingCourse(course);
                course.deleteStudent(student);
            }
        }
    }

    @Override
    public void generateReports(IStudent student, ICourse course) {
        System.out.println("Reports:");
        IReportGenerator reportGenerator = new ReportGenerator();

        if (this.getAvailableCoursesInCUniversity().isEmpty()) {
            System.out.println("There is no courses available in the university!!");
        } else {
            reportGenerator.allAvailableCoursesInUniversityReport(this.getAvailableCoursesInCUniversity());
        }

        if (!Validator.studentExists(this.getAllStudentsInUniversity(), student)) {
            System.out.println("this student not exists in the university!!");
        } else {
            reportGenerator.CoursesInWhichSpecificStudentReport(student);
        }

        if (!Validator.courseExists(this.getAvailableCoursesInCUniversity(), course)) {
            System.out.println(course.getTitle() + " course not exists in the university!!");
        } else {
            reportGenerator.StudentsInSpecificCourseReport(course);
        }
    }

    @Override
    public String toString() {
        return "University Information:" + "Number Of Students:"
                + this.studentsInUniversity.size() +
                ", Number Of Courses:" + this.coursesInUniversity.size();
    }
}
