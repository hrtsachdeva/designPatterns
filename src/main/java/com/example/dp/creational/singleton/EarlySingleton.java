package com.example.dp.creational.singleton;

public class EarlySingleton {

    private static EarlySingleton instance = new EarlySingleton();

    private EarlySingleton(){

    }

    public static EarlySingleton getInstance() { return instance; }

    public void doSomething() {
        System.out.println("Somethong is Done using earlySingleton.");
    }
}
