package com.example.dp.creational.builder;

public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public PizzaBuilder setSize(int size) {
        pizza.setSize(size);
        return this;
    }

    public PizzaBuilder setThinCrust(boolean thinCrust) {
        pizza.setThinCrust(thinCrust);
        return this;
    }

    public PizzaBuilder setOregano(boolean oregano) {
        pizza.setOregano(oregano);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}
