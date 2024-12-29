package com.example.dp.creational.singleton;

public class BestSingletonThreadSafe {

    private static BestSingletonThreadSafe instance;

    private BestSingletonThreadSafe()
    {
        // Initialization code here
    }

    public static BestSingletonThreadSafe getInstance()
    {
       synchronized (BestSingletonThreadSafe.class) {
           if (instance == null) {
               instance = new BestSingletonThreadSafe();
           }
       }

       return instance;

    }

    public void doSomething()
    {
        System.out.println("Somethong is Done using best thread safe singleton");
    }
}
