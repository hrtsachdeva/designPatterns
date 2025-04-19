package com.example.designPattern.strategy;

public class StrategyDriverClass {

    public void execute(){
        Vehicle suv = new Suv(new SuvDriveStrategy());
        suv.drive();

        Vehicle  sedan = new Sedan(new SedanDriveStrategy());
        sedan.drive();

        Vehicle pickUp = new PickupTruck(new SuvDriveStrategy());
        pickUp.drive();
    }
}
