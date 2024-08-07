package com.samsung;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private static List<Student> lstStudent = new ArrayList<>();

    public void Add(Student student) {
        lstStudent.add(student);
    }

    public void Remove(Student student) {
        lstStudent.remove(student);
    }

    public void Search(String name){

    }

    public static void Print(){
        //lstStudent.forEach(System.out::println);
        for(Student student : lstStudent){
            student.GetInfo();
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Linh";
        s1.Place = "HN";
        s1.DOB = "2001";
        s1.isPass = true;

        lstStudent.add(s1);
        Print();
    }
}
