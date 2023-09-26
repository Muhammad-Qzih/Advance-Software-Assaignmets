package implementations;

import interfaces.ICourse;
import interfaces.IStudent;

import java.util.ArrayList;
import java.util.List;

public class Course implements ICourse {
    private  String code;
    private String title;
    private String instructor;
    private static final int MAX_CAPACITY = 10;
    private  List<IStudent> students;

    public Course(String title, String code , String instructor){
        this.title = title;
        this.code = code;
        this.instructor = instructor;
        this.students = new ArrayList<>();

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public void addStudent(IStudent student) {
       //Implementation
    }
    @Override
    public void deleteStudent(int Id) {
        //Implementation
    }

    @Override
    public String toString(){
        return  "course Information: Title:" + this.title + ",Code:" + this.code + ", Course Instructor:" + this.instructor;
    }


}

