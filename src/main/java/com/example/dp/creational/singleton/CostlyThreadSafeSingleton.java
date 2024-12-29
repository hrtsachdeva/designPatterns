package com.example.dp.creational.singleton;

public class CostlyThreadSafeSingleton {

    private static CostlyThreadSafeSingleton instance;

    private CostlyThreadSafeSingleton()
    {
        // Initialization code here
    }

    public static synchronized CostlyThreadSafeSingleton getInstance()
    {
        // Check if an instance exists
        if (instance == null) {
            // If no instance exists, create one
            instance = new CostlyThreadSafeSingleton();
        }
        // Return the existing instance
        return instance;
    }

    public void doSomething()
    {
        System.out.println("Somethong is Done using costly thread safe singleton");
    }
}
