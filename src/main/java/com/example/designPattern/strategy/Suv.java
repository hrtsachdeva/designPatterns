package com.example.designPattern.strategy;

public class Suv extends Vehicle {
    public Suv(DriveStrategy ds) {
        super(ds);
    }

    @Override
    public void drive() {
        super.drive();
    }
}
