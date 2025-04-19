package com.example.designPattern.strategy;

public class Sedan extends  Vehicle{

    public Sedan(DriveStrategy ds){
        super(ds);
    }

    public void drive(){
        super.drive();
    }
}
