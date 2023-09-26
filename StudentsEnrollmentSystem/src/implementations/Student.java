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

    public Student(int ID,String name , String email){
        this.id = ID;
        this.name = name;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getID(){
        return this.id;
    }
    public String getName(){
       return  this.name;
   }
    public String getEmail(){
       return this.email;
   }


    @Override
    public void droppingCourse(ICourse course) {
       //implementation
    }

    @Override
    public void studentEnrollment(ICourse course) {
        //implementation
    }
    @Override
    public String toString() {
        return "Student Information: " +
                ",Name:"+this.name +",Id:"+
                this.id + ",Email:"+this.email ;
    }
}