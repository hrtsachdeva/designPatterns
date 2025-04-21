package com.example.designPattern.command;

public class Receiver {

    public Receiver(){
    }


    public void turnOn(){
        System.out.println("Receiver is on");
    }

    public void turnOff(){
        System.out.println("Receiver is off");
    }
}
