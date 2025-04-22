package com.example.designPattern.memento;

public class ConfigurationOriginator {

    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ConfigurationOriginator(int x, int y){
        this.x =x;
        this.y=y;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(x,y);
    }

    public void restoreMemento(ConfigurationMemento configurationMemento){
        this.x = configurationMemento.getX();
        this.y = configurationMemento.getY();
    }



}
