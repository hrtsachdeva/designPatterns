package com.example.designPattern.factory;

public class VehicleFactory{

    public Vehicle getInstance(String instance){

        return switch (instance) {
            case "twoWheeler" -> new TwoWheeler();
            case "fourWheeler" -> new FourWheeler();
            default -> null;
        };

    }
}
