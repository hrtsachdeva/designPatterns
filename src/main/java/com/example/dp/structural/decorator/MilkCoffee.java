package com.example.dp.structural.decorator;

public class MilkCoffee implements  Coffee{

    private BlackCoffee blackCoffee;

    public MilkCoffee(BlackCoffee blackCoffee) {
        this.blackCoffee = blackCoffee;
    }

        @Override
        public int price() {
            return blackCoffee.price() + 20;
        }

        @Override
        public void description() {
            blackCoffee.description();
            System.out.println("Milk");
        }


}

