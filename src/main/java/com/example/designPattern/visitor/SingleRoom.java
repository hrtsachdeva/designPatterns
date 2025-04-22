package com.example.designPattern.visitor;

public class SingleRoom implements RoomElement {
    public int price =0;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void getPrice(){
        System.out.println("Price: "+ price);
    }


}
