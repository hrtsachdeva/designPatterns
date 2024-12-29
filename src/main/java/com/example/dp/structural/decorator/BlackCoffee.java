package com.example.dp.structural.decorator;

public class BlackCoffee implements Coffee {

    @Override
    public int price() {
        return 50;
    }

    @Override
    public void description() {
        System.out.println("Black Coffee");
    }
}
