package implementations;

import interfaces.ICourse;
import interfaces.IStudent;

import java.util.List;

public class Validator {

    public static boolean courseExists(List<ICourse> courses, ICourse course) {
        return courses.contains(course);
    }

    public static boolean hasReachedMaximumCapacity(int numberOfStudent, int maxCapacity) {
        return numberOfStudent >= maxCapacity;
    }

    public static boolean studentExists(List<IStudent> students, IStudent student) {
        return students.contains(student);
    }


    public static boolean isStudentInThsCourse(IStudent student, ICourse course) {
        return course.getStudents().contains(student);
    }

    public static boolean canAddStudentToCourse(List<IStudent> studentsInUniversity, List<ICourse> coursesInUniversity, IStudent student, ICourse course) {
        if (studentAndCourseAreExists(studentsInUniversity, coursesInUniversity, student, course)) {
            return false;
        } else if (isStudentInThsCourse(student, course)) {
            System.out.println("Student is already in the course!!");

            return false;
        }
        return true;
    }
    public static boolean canDropStudentFromCourse(List<IStudent> studentsInUniversity, List<ICourse> coursesInUniversity, IStudent student, ICourse course) {
        if (studentAndCourseAreExists(studentsInUniversity, coursesInUniversity, student, course)) {
            return false;
        } else if (!isStudentInThsCourse(student, course)) {
            System.out.println("Student is already in the course!!");
            return false;
        }

        return true;
    }

    public static boolean studentAndCourseAreExists(List<IStudent> studentsInUniversity, List<ICourse> coursesInUniversity, IStudent student, ICourse course) {
        if (!studentExists(studentsInUniversity, student)) {
            System.out.println("Student does not exist!!");
            return true;
        } else if (!courseExists(coursesInUniversity, course)) {
            System.out.println("Course does not exist!!");
            return true;
        }
        return false;
    }


}
