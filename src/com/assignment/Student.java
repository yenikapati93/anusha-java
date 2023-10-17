package com.assignment;
// Assignment:1
public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private String email;

    // constructor for 2 arguments
    public Student(int idNo, String fullName){
        this.id=idNo;
        this.name=fullName;
    }

    //constructor for 3 arguments
    public Student(int idNo, String fullName, String emailId){
        this.id=idNo;
        this.name=fullName;
        this.email=emailId;
    }
    //overriding toString method
    @Override
    public String toString(){
        return "idno: " + id + ", Full Name: " + name ;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Student s) {
        if(name.equals(s.name))
            return 0;
        else if(id > s.id)
            return 1;
        else
            return -1;
    }
}
