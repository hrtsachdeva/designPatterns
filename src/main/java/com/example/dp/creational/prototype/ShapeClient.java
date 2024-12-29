package com.example.dp.creational.prototype;

public class ShapeClient {

    Shape shapePrototype;

    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    public Shape cloneShape() {
        return shapePrototype.clone();
    }

}
