package com.example.dp.creational.prototype;

public class CircleShape implements Shape{

    private String color;

    public CircleShape(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new CircleShape(color);
    }


    @Override
    public void draw() {
        System.out.println("Drawing Circle with color: " + color);
    }
}
