package com.example.designPattern.strategy;

public class SuvDriveStrategy implements  DriveStrategy{

    @Override
    public void drive() {
        System.out.println("This is SUV driving");
    }
}
