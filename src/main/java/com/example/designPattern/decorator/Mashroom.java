package com.example.designPattern.decorator;

public class Mashroom extends Toppings{
    BasePizza basePizza;

    public Mashroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+30;
    }
}
