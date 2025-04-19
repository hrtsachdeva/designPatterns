package com.example.designPattern.strategy;

public abstract class Vehicle {

    DriveStrategy driveStrategy ;

    public Vehicle(DriveStrategy ds){
        this.driveStrategy = ds;
    }

    public  void drive(){
        driveStrategy.drive();
    };

}
