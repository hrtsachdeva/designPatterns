package com.example.designPattern.strategy;

public class SedanDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is Sedan driving");
    }
}
