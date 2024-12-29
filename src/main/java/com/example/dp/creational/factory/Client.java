package com.example.dp.creational.factory;

public class Client {

    Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory) {
        vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
