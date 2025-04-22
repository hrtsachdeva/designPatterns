package com.example.designPattern.visitor;

public class RoomPriceVisitor implements  Visitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        singleRoom.price=100;
        System.out.println("Single Room price: "+100);
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        doubleRoom.price=200;
        System.out.println("Double Room price: "+200);

    }
}
