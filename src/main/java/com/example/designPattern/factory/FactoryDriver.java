package com.example.designPattern.factory;

public class FactoryDriver {

    public void execute(){
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle twoWheeler = vehicleFactory.getInstance("twoWheeler");
        twoWheeler.display();
    }
}
