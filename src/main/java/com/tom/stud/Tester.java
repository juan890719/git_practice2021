package com.tom.stud;

public class Tester {
    public static void main(String[] args) {
        Student stu = new Student("011", "J", 80, 90);
        GraduateStudent gast = new GraduateStudent();
        stu.print();
        gast.print();
    }
}