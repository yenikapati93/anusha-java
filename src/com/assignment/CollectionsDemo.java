package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Anusha");
        Student s2 = new Student(2, "Venkat");
        Student s3 = new Student(3, "Thanvik", "Thanvik@gmail.com");
        Student s4 = new Student(4, "Srujana");
        Student s5 = new Student(5, "Sateesh", "Sateesh@gmail.com");


        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println("for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println("for each loop");
        for (Student student :list) {
            System.out.println(student + " ");

        }
        System.out.println("While loop");
        int index = list.size()-1;
        while (index >=0){
            System.out.println(list.get(index)+" ");
            index--;
        }

    }
}
