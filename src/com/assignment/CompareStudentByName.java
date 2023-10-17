package com.assignment;

import java.util.Comparator;

// Assignment:6
public class CompareStudentByName implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getName().compareTo(secondStudent.getName());
    }
}
