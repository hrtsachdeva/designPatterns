package com.example.designPattern.memento;

public class ConfigurationMemento {

    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ConfigurationMemento(int x, int y){
        this.x =  x;
        this.y = y;

    }
}
