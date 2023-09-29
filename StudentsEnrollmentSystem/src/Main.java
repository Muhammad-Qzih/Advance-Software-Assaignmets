import implementations.Course;
import implementations.Student;
import implementations.University;
import interfaces.ICourse;
import interfaces.IStudent;
import interfaces.IUniversity;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Course math = new Course("Math", "1102011", "Assaf");
        Course Math2 = new Course("Math2", "122111", "muhammad");
        Course calc1 = new Course("calc1", "231111", "Ahmad");

        Student Muhammad = new Student(12027705, "Muhammad Qzih", "MuhammadQzih@gmail.com");
        Student Ahmad = new Student(12027705, "Ahmad Qzih", "Ahmad@gmail.com");
        Student Momen = new Student(12212311, "Momen Qzih", "Momen@gmail.com");
        Student Sara = new Student(1233112, "Sara Qzih", "Sara@gmail.com");

        IUniversity nnu = new University();
        System.out.println("-----------------------------------------------------------------------------------------");

        nnu.addCourse(Math2);
        nnu.addCourse(Math2);

        System.out.println("-----------------------------------------------------------------------------------------");

        nnu.addStudent(Muhammad);
        nnu.enrollStudentToCourse(Muhammad, Math2);
        nnu.enrollStudentToCourse(Muhammad, calc1);
        System.out.println(Muhammad);

        System.out.println("-----------------------------------------------------------------------------------------");

        nnu.addStudent(Sara);
        nnu.enrollStudentToCourse(Sara, Math2);
        System.out.println(Sara);

        System.out.println("-----------------------------------------------------------------------------------------");

        nnu.dropStudentFromCourse(Muhammad,calc1);
        nnu.dropCourse(Math2);
        System.out.println(Muhammad);

        System.out.println("-----------------------------------------------------------------------------------------");

        nnu.generateReports(Muhammad, calc1 );

        System.out.println("-----------------------------------------------------------------------------------------");

        nnu.addCourse(math);
        nnu.addCourse(Math2);
        nnu.addCourse(calc1);

        nnu.enrollStudentToCourse(Muhammad,Math2);
        nnu.enrollStudentToCourse(Muhammad,math);

        nnu.enrollStudentToCourse(Sara,math);
        nnu.enrollStudentToCourse(Sara,Math2);
        System.out.println("-----------------------------------------------------------------------------------------");

        nnu.generateReports(Muhammad, math);

        System.out.println("-----------------------------------------------------------------------------------------");

        nnu.dropStudentFromCourse(Muhammad,Math2);
        nnu.generateReports(Muhammad, math);

        System.out.println("-----------------------------------------------------------------------------------------");

        nnu.enrollStudentToCourse(Muhammad,Math2);
        System.out.println(Muhammad);
    }
}