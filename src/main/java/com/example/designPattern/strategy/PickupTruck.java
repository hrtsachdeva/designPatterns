package com.example.designPattern.strategy;

public class PickupTruck extends Vehicle{

    public PickupTruck(DriveStrategy ds){
        super(ds);
    }

    public void drive(){
        super.drive();
    }
}
