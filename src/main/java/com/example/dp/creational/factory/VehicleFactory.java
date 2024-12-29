package com.example.dp.creational.factory;
/*
Has 4 parts
1) Creator = Interface or Abstract class , works as a factory
2) ConcreateCreator = Implements Creator and returns the product
3) Product = Interface or Abstract class
4) ConcreateProduct = Implements Product

 */

// Factory interface defining the factory method
public interface VehicleFactory {
    Vehicle createVehicle();
}
