package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        Subject subject1 = new Subject("Programing", true, 100, true, Subject.OKR.master);
        Subject subject2 = new Subject("Math", true, 90, true, Subject.OKR.bachelor);

        Student student1 = new Student("Roman", "Romanovich", "Sklepovyy", 19, 2, subject2);
        Student student2 = new Student("Yurii", "Ruslanovich", "Gulei", 18, 2, subject1);

       //1
        System.out.println(student1);

        System.out.println(student2);

        System.out.println(subject1);

        System.out.println(subject2);
        System.out.println("2");

        //2

        System.out.println("3");

        //3

        Student student3 = (Student) student1.clone();
        student3.setFirstname("Андрій");
        System.out.println(student3);

        Subject subject3 = (Subject) subject1.clone();
        subject3.setName("OOP");
        System.out.println(subject3);


        System.out.println("4.1");
        //4
        if(subject1.compareTo(subject2)< 0 ){
            System.out.println(subject1 + " is better");
        } else if(subject1.compareTo(subject2) > 0){
            System.out.println(subject2 + " is better");
        } else System.out.println("They are similar");
        System.out.println("4.2");


        if(student1.compareTo(student2) < 0){
            System.out.println(student1 + " is better");
        }else if(student1.compareTo(student2) > 0){
            System.out.println(student2 + " is better");
        } else System.out.println("They are similar");
        System.out.println("5");
        //5

        System.out.println(Arrays.toString(Subject.OKR.values()));
    }
}
