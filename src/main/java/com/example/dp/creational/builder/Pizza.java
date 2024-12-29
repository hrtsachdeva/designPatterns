package com.example.dp.creational.builder;

public class Pizza {
    private int size;
    private boolean thinCrust;
    private boolean oregano;

    public void setSize(int size) {
        this.size = size;
    }

    public void setThinCrust(boolean thinCrust) {
        this.thinCrust = thinCrust;
    }

    public void setOregano(boolean oregano) {
        this.oregano = oregano;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", thinCrust=" + thinCrust + ", oregano=" + oregano + "]";
    }
}
