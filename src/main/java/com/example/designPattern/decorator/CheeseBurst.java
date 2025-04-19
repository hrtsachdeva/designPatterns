package com.example.designPattern.decorator;

public class CheeseBurst extends Toppings{

    BasePizza basePizza;

    public CheeseBurst(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
