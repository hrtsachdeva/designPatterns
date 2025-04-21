package com.example.designPattern.Prototype;

public class Student implements  Prototype{

    private String name;
    private int rollNo;


    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }


    @Override
    public Prototype cloneObj() {
        return new Student(name, rollNo);
    }
}
