package com.example.designPattern.decorator;

public class DecoratorDriver {

    public void execute(){
        BasePizza basePizza =new CheeseBurst(new FarmHouse());
        System.out.println("Cost of pizza is :"+basePizza.cost());
    }
}
