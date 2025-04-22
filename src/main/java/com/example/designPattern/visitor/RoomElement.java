package com.example.designPattern.visitor;

public interface RoomElement {

    void accept(Visitor visitor);

    void getPrice();

}
