package com.tom.stud;

public class Tester {
    public static void main(String[] args) {
        Student stu = new Student("1005", "Jack", 80, 90);
        GraduateStudent gast = new GraduateStudent("5001", "Hank", 70, 80, 90);
        stu.print();
        gast.print();
    }
}
