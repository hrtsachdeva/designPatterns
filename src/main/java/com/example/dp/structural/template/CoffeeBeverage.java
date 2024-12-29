package com.example.dp.structural.template;

public class CoffeeBeverage extends BeverageMaker {
    @Override
    void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar");
    }
}
