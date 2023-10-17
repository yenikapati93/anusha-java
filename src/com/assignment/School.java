package com.assignment;

import java.util.*;

public class School {
    //Assignement:1
    public static void main(String[] args){
        //Assignement:2
        Student s1= new Student(1, "Anusha");
        Student s2= new Student(2, "Venkat");
        Student s3= new Student(3, "Thanvik", "Thanvik@gmail.com");
        Student s4= new Student(4,"Srujana");
        Student s5= new Student(5, "Sateesh","Sateesh@gmail.com");

        //Assignement:3
        List<Student> list= new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println("Assainment:4");
        int size = list.size();
        System.out.println("List Size " + size);

        System.out.println("Assainment:5");
       System.out.println(list.get(0));
       System.out.println(list.get(1));
       System.out.println(list.get(2));
       System.out.println(list.get(3));
       System.out.println(list.get(4));



        //Assignement:7
        System.out.println("Assainment:7");
        Collections.sort(list, new CompareStudentByName());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        //Assignement:9
        Student s6 = new Student(5, "Sateesh","Sateesh@gmail.com");
        list.add(s6);

        System.out.println("Assainment:10");
        System.out.println(list.get(5));
        list.remove(s6);
        // Assignment: 11 tried to print out removed object but got java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 5
        //System.out.println(list.get(5));

        System.out.println("Assainment:12");
        System.out.println(list.get(0));
        System.out.println(list.get(size-1));

        //Assignement:13
        List<Student> list2 = new ArrayList<>();

        //Assignement:14
        Student s7= new Student(7, "Suresh");
        Student s8= new Student(8, "Ramesh", "Ramesh@gmail.com");

        //Assignement:15
        list2.add(s7);
        list2.add(s8);

        //Assignement:16
        list.addAll(1,list2);

        System.out.println("Assainment:16");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));

        //Assignement:17
        list.clear();
        list2.clear();
        System.out.println("Assainment:18");
        System.out.println("Size of the list1 and list2: "+list.size() +", "+ list2.size());

        //Assignment:19
       Set<Student> set = new HashSet<>();

        //Assignment:20
        Student s11= new Student(1, "Anusha");
        Student s22= new Student(1, "Anusha");

        //Assignment:21
        set.add(s11);
        set.add(s22);
        System.out.println("Assainment:21");
        System.out.println("Size of the set: "+set.size());

        //Assignment:22
        Set<Student> treeSet = new TreeSet<>();

        //Assignment:23
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        //Assignment:24
        Set<Student> sortedSet = new TreeSet<>();
        sortedSet.add(new Student(5, "Student1"));
        sortedSet.add(new Student(7, "Student2"));
        sortedSet.add(new Student(2, "Student3"));
        sortedSet.add(new Student(1, "Student4"));
        System.out.println("Assignment:24");
        System.out.println(sortedSet);

    }

}
