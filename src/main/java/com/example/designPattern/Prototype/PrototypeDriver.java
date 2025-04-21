package com.example.designPattern.Prototype;

public class PrototypeDriver {

    public void  execute(){
        Student s1 = new Student("Harshit",1);
        Student s2 = (Student) s1.cloneObj();
        System.out.println(s2.toString());
    }
}
