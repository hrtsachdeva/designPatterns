package com.example.dp.creational.singleton;
/*The Singleton method or Singleton Design pattern is one of the simplest design patterns.
It ensures a class only has one instance, and provides a global point of access to it.
Support creating the instance either when needed (lazy) or when the class is loaded (eager).
Thread Safety: Implement mechanisms to prevent multiple threads from creating separate instances simultaneously.
Restrict direct instantiation by making the constructor private, forcing the use of the access point
Provide a global point of access to that instance.
*/

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton()
    {
        // Initialization code here
    }

    public static LazySingleton getInstance()
    {
        // Check if an instance exists
        if (instance == null) {
            // If no instance exists, create one
            instance = new LazySingleton();
        }
        // Return the existing instance
        return instance;
    }

    public void doSomething()
    {
        System.out.println("Somethong is Done.");
    }
}
