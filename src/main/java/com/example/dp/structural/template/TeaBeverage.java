package com.example.dp.structural.template;

public class TeaBeverage extends BeverageMaker {


    @Override
    void brew() {
        System.out.println("Brewing Sugar Free Black Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
